package triangleSpecification;

import entity.Point;
import entity.TriangleIdentifiable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleSpecificationByPointsTest {
    TriangleSpecification specification;

    @Test
    public void testSpecifiedShouldReturnTrueWhenPointsInRangeOneToForty(){
        //given
        specification = new TriangleSpecificationByPoints(1, 40);
        TriangleIdentifiable triangle
                = new TriangleIdentifiable(1, new Point(4.0, 5.0), new Point(14.0, 15.0), new Point(8.0, 10.0) );
        //when
        boolean res = specification.specified(triangle);
        //then
        Assert.assertTrue(res);
    }

    @Test
    public void testSpecifiedShouldReturnFalseWhenPointsNotInRangeOneToForty() {
        //given
        specification = new TriangleSpecificationByPoints(1, 40);
        TriangleIdentifiable triangle
                = new TriangleIdentifiable(2, new Point(40.0, 20.0), new Point(40.0, 80.0), new Point(40.0, 60.0));
        //when
        boolean res = specification.specified(triangle);
        //then
        Assert.assertFalse(res);
    }
}

