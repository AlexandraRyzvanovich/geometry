package observable;

import entity.Point;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import registrator.Observer;
import registrator.Registrator;
import triangleRepository.TriangleRepository;

import java.util.Calendar;
import java.util.List;

public class TriangleObservableTest {
    private List<Observer> observers;
    private TriangleObservable triangleObservable;
    private final Point point = new Point(4.0, 5.0);
    private final long id = 1;

    @BeforeClass
    public void setUp(){
        triangleObservable = new TriangleObservable(id, point, point, point);
    }

    @Test
    public void testAttachObserverShouldReturnObserversListOfSizeOneWhenOneObserverAdded(){
        //given

        observers = triangleObservable.getObservers();
        //when
        triangleObservable.attach(new Registrator());
        //then
        Assert.assertNotNull(observers.size());
        Assert.assertEquals(observers.size(), 1);
    }

}
