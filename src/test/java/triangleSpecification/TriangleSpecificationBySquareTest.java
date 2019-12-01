package triangleSpecification;

import entity.Point;
import entity.TriangleIdentifiable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleSpecificationBySquareTest {
    TriangleSpecification specification;

    @Test
    public void testSpecifiedShouldReturnTrueWhenSquareInRangeOneToFifty(){
        //given
        specification = new TriangleSpecificationBySquare(1, 50);
        TriangleIdentifiable triangle
                = new TriangleIdentifiable(1, new Point(4.0, 5.0), new Point(3.0, 2.0), new Point(1.0, 4.0) );
        //when
        boolean res = specification.specified(triangle);
        //then
        Assert.assertTrue(res);
    }

    @Test
    public void testSpecifiedShouldReturnFalseWhenSquareNotInRangeOneToForty() {
        //given
        specification = new TriangleSpecificationBySquare(1, 40);
        TriangleIdentifiable triangle
                = new TriangleIdentifiable(2, new Point(40.0, 20.0), new Point(40.0, 80.0), new Point(40.0, 60.0));
        //when
        boolean res = specification.specified(triangle);
        //then
        Assert.assertFalse(res);
    }
}