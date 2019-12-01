package comparator;

import entity.Point;
import entity.TriangleIdentifiable;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TriangleComparatorByIdTest {
    private TriangleComparatorById comparator;
    private final TriangleIdentifiable COMPARABLE_TRIANGLE
            = new TriangleIdentifiable(2, new Point(1, 2), new Point(5, 9), new Point(15, 66));

    @BeforeClass
    public void setUp(){
        comparator = new TriangleComparatorById();
    }

    @Test
    public void testCompareShouldReturnZeroWhenCompareTrianglesWithEqualId(){
        int actualResult = comparator.compare(COMPARABLE_TRIANGLE, COMPARABLE_TRIANGLE);
        Assert.assertEquals(actualResult, 0);
    }

    @Test
    public void testCompareShouldReturnOneWhenCompareTrianglesWithLowerId(){
        TriangleIdentifiable anotherTriangle
                = new TriangleIdentifiable(1, new Point(10, 20), new Point(5, 9), new Point(15, 66));
        int actualResult = comparator.compare(COMPARABLE_TRIANGLE, anotherTriangle);
        Assert.assertEquals(actualResult, 1);
    }

    @Test
    public void testCompareShouldReturnMinusOneWhenCompareTrianglesWithHigherId(){
        TriangleIdentifiable anotherTriangle
                = new TriangleIdentifiable(3, new Point(10, 20), new Point(5, 9), new Point(15, 66));
        int actualResult = comparator.compare(COMPARABLE_TRIANGLE, anotherTriangle);
        Assert.assertEquals(actualResult, -1);
    }
}