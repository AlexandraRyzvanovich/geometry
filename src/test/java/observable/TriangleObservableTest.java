package observable;

import entity.Point;
import org.testng.Assert;
import org.testng.annotations.*;
import registrator.Observer;
import registrator.Registrator;
import utils.TriangleCalculator;

import java.util.List;

public class TriangleObservableTest {
    private final Registrator REGISTRATOR = new Registrator(new TriangleCalculator());
    private final Point POINT = new Point(4.0, 5.0);
    private final long TRIANGLE_ID = 1;
    private List<Observer> observers;

    @Test
    public void testAttachObserverToEmptyListShouldReturnListLengthOneWhenOneObserverAdded(){
        //given
        TriangleObservable triangleObservable = new TriangleObservable(TRIANGLE_ID, POINT, POINT, POINT);
        observers = triangleObservable.getObservers();
        //when
        triangleObservable.attachObserver(new Registrator(new TriangleCalculator()));
        //then
        Assert.assertEquals(observers.size(), 1);
    }


    @Test
    public void testRemoveObserverFromOneSizeListShouldReturnListLengthZeroWhenOneObserverRemoved(){
        //given
        TriangleObservable triangleObservable = new TriangleObservable(TRIANGLE_ID, POINT, POINT, POINT);
        triangleObservable.attachObserver(REGISTRATOR);
        observers = triangleObservable.getObservers();
        //when
        triangleObservable.removeObserver(REGISTRATOR);
        //then
        Assert.assertEquals(observers.size(), 0);
    }

    @Test
    public void testRemoveObserverShouldReturnZeroWhenListLengthZeroWhenTryRemoveOneObserver(){
        //given
        TriangleObservable triangleObservable = new TriangleObservable(TRIANGLE_ID, POINT, POINT, POINT);
        observers = triangleObservable.getObservers();
        //when
        triangleObservable.removeObserver(REGISTRATOR);
        //then
        Assert.assertEquals(observers.size(), 0);
    }
}
