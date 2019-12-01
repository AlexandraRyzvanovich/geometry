package utils;

import entity.Point;
import entity.Triangle;
import org.testng.Assert;
import org.testng.annotations.Test;
import validator.TrianglePointsValidator;
import validator.TriangleValidator;

import java.util.Optional;

public class TriangleCreatorTest {
    TriangleValidator validator = new TrianglePointsValidator();
    TriangleCreator creator = new TriangleCreator(validator);

    @Test
    public void testCreatorShouldReturnIsPresentTriangleWhenValidLineGiven(){
        String line = "1.2 88.5 14 55 89 10";
        Optional<Triangle> triangle = creator.create(line);
        Assert.assertTrue(triangle.isPresent());
        Assert.assertTrue(triangle.get().getFirstPoint() == new Point(1.2,88.5));
    }
    @Test
    public void testCreatorShouldReturnOptionalEmptyTriangleWhenLineInvalid(){
        String line = "1.2 1.2 1.2 1.2 1.2";
        Optional<Triangle> triangle = creator.create(line);
        Assert.assertTrue(triangle.isPresent());
    }
}
