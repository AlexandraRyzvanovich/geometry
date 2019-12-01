package validator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleDataValidatorTest {
    private TriangleDataValidator validator;

    @BeforeClass
    public void setUp() {
        validator = new TriangleDataValidator();
    }

    @DataProvider
    public Object[][] validLines() {
        return new Object[][]{
                {"15 45 45 45 5 4 7", true},
                {"7 5 8 5 4 1 ", true},
        };
    }

    @Test(dataProvider = "validLines")
    public void testIsValidLineShouldReturnTrueWhenLineIsOfDigits(String line, boolean expectedResult) {
        boolean actualResult = validator.isValidLine(line);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @DataProvider
    public Object[][] invalidLines() {
        return new Object[][]{
                {"de %%%fd fdds dcfdc", false},
                {"5 5 5 ddvdv 5 ", false}
        };
    }

    @Test(dataProvider = "invalidLines")
    public void testIsValidLineShouldReturnFalseWhenLineIsInvalid(String line, boolean expectedResult) {
        boolean actualResult = validator.isValidLine(line);
        Assert.assertEquals(expectedResult, actualResult);

    }
}
