package comparator;

import entity.Point;
import entity.TriangleIdentifiable;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TriangleComparatorBySecondPointTest {
    private TriangleComparatorBySecondPoint comparator;
    private final TriangleIdentifiable COMPARABLE_TRIANGLE
            = new TriangleIdentifiable(2, new Point(8, 9), new Point(5, 9), new Point(15, 66));

    @BeforeClass
    public void setUp(){
        comparator = new TriangleComparatorBySecondPoint();
    }

    @Test
    public void testCompareShouldReturnZeroWhenCompareTrianglesWithEqualSecondPoints(){
        int actualResult = comparator.compare(COMPARABLE_TRIANGLE, COMPARABLE_TRIANGLE);
        Assert.assertEquals(actualResult, 0);
    }

    @Test
    public void testCompareShouldReturnOneWhenCompareTrianglesWithLowerSecondPoints(){
        TriangleIdentifiable anotherTriangle
                = new TriangleIdentifiable(2, new Point(2, 3), new Point(1, 3), new Point(15, 66));
        int actualResult = comparator.compare(COMPARABLE_TRIANGLE, anotherTriangle);
        Assert.assertEquals(actualResult, 1);
    }

    @Test
    public void testCompareShouldReturnMinusOneWhenCompareTrianglesWithHigherSecondPoints(){
        TriangleIdentifiable anotherTriangle
                = new TriangleIdentifiable(2, new Point(12, 13), new Point(15, 19), new Point(15, 66));
        int actualResult = comparator.compare(COMPARABLE_TRIANGLE, anotherTriangle);
        Assert.assertEquals(actualResult, -1);
    }
}

