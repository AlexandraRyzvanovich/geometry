package utils;

import entity.Point;
import entity.Triangle;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import validator.TrianglePointsValidator;
import validator.TriangleValidator;

import java.util.Optional;

public class TriangleCreatorTest {
    private TriangleCreator creator;

    @BeforeClass
    public void setUp(){
        TriangleValidator validator = new TrianglePointsValidator();
        creator = new TriangleCreator(validator);
    }

    @Test
    public void testCreatorShouldReturnIsPresentTriangleWhenValidLineGiven(){
        String line = "1.2 88.5 14 55 89 10";
        Optional<Triangle> triangle = creator.create(line);
        Assert.assertTrue(triangle.isPresent());
        Assert.assertEquals(new Point(1.2, 88.5), triangle.get().getFirstPoint());
    }
    @Test
    public void testCreatorShouldReturnOptionalEmptyTriangleWhenLineInvalid(){
        String line = "1.2 1.2 1.2 1.2 1.2 1.2";
        Optional<Triangle> triangle = creator.create(line);
        Assert.assertFalse(triangle.isPresent());
    }
}
