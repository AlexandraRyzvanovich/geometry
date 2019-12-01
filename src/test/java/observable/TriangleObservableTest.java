package observable;

import entity.Point;
import org.testng.Assert;
import org.testng.annotations.*;
import registrator.Observer;
import registrator.TriangleRegistrator;
import utils.TriangleCalculator;

import java.util.List;

public class TriangleObservableTest {
    private TriangleRegistrator triangleRegistrator;
    private final Point POINT = new Point(4.0, 5.0);
    private final long TRIANGLE_ID = 1;
    private List<Observer> observers;

    @BeforeClass
    public void setUp(){
        triangleRegistrator = new TriangleRegistrator(new TriangleCalculator());
    }
    @Test
    public void testAttachObserverToEmptyListShouldReturnListLengthOneWhenOneObserverAdded(){
        TriangleObservable triangleObservable = new TriangleObservable(TRIANGLE_ID, POINT, POINT, POINT);
        observers = triangleObservable.getObservers();
        triangleObservable.attachObserver(new TriangleRegistrator(new TriangleCalculator()));
        Assert.assertEquals(observers.size(), 1);
    }


    @Test
    public void testRemoveObserverFromOneSizeListShouldReturnListLengthZeroWhenOneObserverRemoved(){
        TriangleObservable triangleObservable = new TriangleObservable(TRIANGLE_ID, POINT, POINT, POINT);
        triangleObservable.attachObserver(triangleRegistrator);
        observers = triangleObservable.getObservers();
        triangleObservable.removeObserver(triangleRegistrator);
        Assert.assertEquals(observers.size(), 0);
    }

    @Test
    public void testRemoveObserverShouldReturnZeroWhenListLengthZeroWhenTryRemoveOneObserver(){
        TriangleObservable triangleObservable = new TriangleObservable(TRIANGLE_ID, POINT, POINT, POINT);
        observers = triangleObservable.getObservers();
        triangleObservable.removeObserver(triangleRegistrator);
        Assert.assertEquals(observers.size(), 0);
    }
}
