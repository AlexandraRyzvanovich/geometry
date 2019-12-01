package triangleRepository;

import entity.Point;
import entity.TriangleIdentifiable;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class TriangleRepositoryTest {
    private final TriangleIdentifiable TRIANGLE
            = new TriangleIdentifiable(1, new Point(4.0, 5.0), new Point(4.0, 5.0), new Point(4.0, 5.0) );
    private TriangleRepository repository;
    Map<Long, TriangleIdentifiable> triangleStore;

    @Test
    public void testAddTriangleShouldReturnMapSizeOneWhenOneTriangleAdded(){
        //given
        repository = new TriangleRepository();
        triangleStore = repository.store;
        //when
        repository.addTriangle(TRIANGLE);
        //then
        Assert.assertEquals(triangleStore.size(), 1);
    }

    @Test
    public void testRemoveTriangleShouldReturnMapSizeZeroWhenOneRemovedFromOneSizeMap(){
        //given
        repository = new TriangleRepository();
        triangleStore = repository.store;
        repository.addTriangle(TRIANGLE);
        //when
        repository.removeTriangle(TRIANGLE);
        //then
        Assert.assertEquals(triangleStore.size(), 0);
    }

    @Test
    public void testUpdateTriangleShouldReturnMapWithNewValuesForTriangleWhenTriangleUpdated(){
        //given
        repository = new TriangleRepository();
        triangleStore = repository.store;
        repository.addTriangle(TRIANGLE);
        TriangleIdentifiable anotherTriangle
                = new TriangleIdentifiable(1, new Point(5.0, 6.0), new Point(7.0, 8.0), new Point(9.0, 10.0) );
        //when
        repository.updateTriangle(anotherTriangle);
        //then
        Assert.assertEquals(triangleStore.size(), 1);
    }




}
