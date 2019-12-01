package validator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TrianglePointsValidatorTest {
    private final TrianglePointsValidator VALIDATOR = new TrianglePointsValidator();
    List<Double> validList;
    List<Double> invalidList;

    @BeforeClass
    public void setUp(){
       validList = Arrays.asList(1.0, 4.0, 8.0, 6.0, 8.0, 14.0);
       invalidList = Arrays.asList(-1.0, 5.0, 5.0, 0.0, 1.0, 0.0);
    }

    @Test
    public void testIsTriangleValidShouldReturnTrueWhenLineIsValid(){
        boolean result = VALIDATOR.isTriangleValid(validList);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsTriangleValidShouldReturnTrueWhenLineContainsMinusValues(){
        boolean result = VALIDATOR.isTriangleValid(invalidList);
        Assert.assertFalse(result);
    }
}
