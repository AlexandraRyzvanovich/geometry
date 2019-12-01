package registrator;

import entity.Point;
import entity.TriangleParams;
import observable.TriangleObservable;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.TriangleCalculator;

import java.util.Map;

public class TriangleRegistratorTest {
    private Map<Long, TriangleParams> triangleParamsMap;
    TriangleRegistrator triangleRegistrator;

    @BeforeClass
    public void setUp(){
        TriangleCalculator calculator = new TriangleCalculator();
        triangleRegistrator = new TriangleRegistrator(calculator);
        triangleParamsMap = triangleRegistrator.triangleParamsMap;
        TriangleParams params = new TriangleParams(8, 88);
        triangleParamsMap.put((long) 10000, params);
    }

    @Test
    public void testUpdateShouldReturnNewValuesForKeyWhenMapUpdated(){
        //given
        TriangleObservable triangle = new TriangleObservable(10000, new Point(1, 3), new Point(5,7), new Point(8, 10));
        //when
        triangleRegistrator.update(triangle);
        //then
        TriangleParams newParams = triangleParamsMap.get((long)10000);
        Assert.assertEquals(newParams.getPerimeter(), 19.79898987322333);
        Assert.assertEquals( newParams.getSquare(), 207.6535576386786);
    }


}
