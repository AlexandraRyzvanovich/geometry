package triangleSpecification;

import entity.Point;
import entity.TriangleIdentifiable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleSpecificationByIdTest {
    TriangleSpecification specification;

    @Test
    public void testSpecifiedShouldReturnTrueWhenIdIsOneAndSpecificationIsOne(){
        //given
        specification = new TriangleSpecificationById(1);
        TriangleIdentifiable triangle
                = new TriangleIdentifiable(1, new Point(4.0, 5.0), new Point(4.0, 5.0), new Point(4.0, 5.0) );
        //when
        boolean res = specification.specified(triangle);
        //then
        Assert.assertTrue(res);
    }
    @Test
    public void testSpecifiedShouldReturnFalseWhenIdIsOneAndSpecificationIsTwo() {
        //given
        specification = new TriangleSpecificationById(1);
        TriangleIdentifiable triangle
                = new TriangleIdentifiable(2, new Point(4.0, 5.0), new Point(4.0, 5.0), new Point(4.0, 5.0));
        //when
        boolean res = specification.specified(triangle);
        //then
        Assert.assertFalse(res);
    }
}
