package utils;

import entity.Point;
import entity.Triangle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleCalculatorTest {
    TriangleCalculator calculator = new TriangleCalculator();

    @Test
    public void testCalculatePerimeterShouldReturnPerimeterOfFiftySixWhenCalculate(){
        Triangle triangle
                = new Triangle (new Point(4.0, 5.0), new Point(14.0, 15.0), new Point(24.0, 25.0) );
       double result = calculator.calculatePerimeter(triangle);
       Assert.assertEquals(result, 56.568542494923804);
    }

    @Test
    public void testCalculateSquareShouldReturnSquareOfFiftyThreeWhenCalculate(){
        Triangle triangle
                = new Triangle (new Point(1.0, 2.0), new Point(3.0, 4.0), new Point(5.0, 5.0) );
        double result = calculator.calculateSquare(triangle);
        Assert.assertEquals(result, 53.73443041738443);
    }

    @Test
    public void testIsRectangularShouldReturnFalseWhenTriangleIsNotRectangular(){
        Triangle triangle
                = new Triangle (new Point(10.0, 20.0), new Point(10.0, 40.0), new Point(85.0, 150.0) );
        boolean result = calculator.isRectangular(triangle);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsisEqualSidesShouldReturnFalseWhenTriangleIsNotEqualSide(){
        Triangle triangle
                = new Triangle (new Point(10.0, 20.0), new Point(10.0, 40.0), new Point(85.0, 150.0) );
        boolean result = calculator.isEqualSides(triangle);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsEquilateralShouldReturnFalseWhenTriangleIsNotEquilateral(){
        Triangle triangle
                = new Triangle (new Point(1.0, 5.0), new Point(10.0, 10.0), new Point(20.0, 5.0) );
        boolean result = calculator.isEquilateral(triangle);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsAcuteAngledShouldReturnTrueWhenTriangleIsAcuteAngled(){
        Triangle triangle
                = new Triangle (new Point(1.0, 5.0), new Point(10.0, 10.0), new Point(20.0, 5.0) );
        boolean result = calculator.isAcuteAngled(triangle);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsObtuseAngleShouldReturnFalseWhenTriangleIsNotObtuseAngle(){
        Triangle triangle
                = new Triangle (new Point(1.0, 5.0), new Point(10.0, 10.0), new Point(20.0, 5.0) );
        boolean result = calculator.isObtuseAngle(triangle);
        Assert.assertFalse(result);
    }
}
