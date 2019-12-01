package comparator;

import entity.Point;
import entity.TriangleIdentifiable;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TriangleComparatorByFirstPointTest {
    private TriangleComparatorByFirstPoint comparator;
    private final TriangleIdentifiable COMPARABLE_TRIANGLE
            = new TriangleIdentifiable(2, new Point(8, 9), new Point(5, 9), new Point(15, 66));

    @BeforeClass
    public void setUp(){
        comparator = new TriangleComparatorByFirstPoint();
    }

    @Test
    public void testCompareShouldReturnZeroWhenCompareTrianglesWithEqualPoints(){
        int actualResult = comparator.compare(COMPARABLE_TRIANGLE, COMPARABLE_TRIANGLE);
        //then
        Assert.assertEquals(actualResult, 0);
    }

    @Test
    public void testCompareShouldReturnOneWhenCompareTrianglesWithLowerPoints(){
        TriangleIdentifiable anotherTriangle
                = new TriangleIdentifiable(2, new Point(2, 3), new Point(5, 9), new Point(15, 66));
        int actualResult = comparator.compare(COMPARABLE_TRIANGLE, anotherTriangle);
        Assert.assertEquals(actualResult, 1);
    }

    @Test
    public void testCompareShouldReturnMinusOneWhenCompareTrianglesWithHigherPoints(){
        TriangleIdentifiable anotherTriangle
                = new TriangleIdentifiable(2, new Point(12, 13), new Point(5, 9), new Point(15, 66));
        int actualResult = comparator.compare(COMPARABLE_TRIANGLE, anotherTriangle);
        Assert.assertEquals(actualResult, -1);
    }
}
