package triangleRepository;

import comparator.TriangleComparatorById;
import entity.Point;
import entity.TriangleIdentifiable;
import org.testng.Assert;
import org.testng.annotations.Test;
import triangleSpecification.TriangleSpecification;
import triangleSpecification.TriangleSpecificationById;

import java.util.Comparator;
import java.util.List;
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
        TriangleIdentifiable tr = triangleStore.get((long)1);
        Assert.assertEquals(triangleStore.size(), 1);
        Assert.assertTrue(tr.getFirstPoint().equals(new Point(5.0, 6.0)));
    }

    @Test
    public void testQueryShouldReturnOneSizeListWhenSpecificationByIdGiven(){
        //given
        repository = new TriangleRepository();
        triangleStore = repository.store;
        repository.addTriangle(new TriangleIdentifiable(1, new Point(4.0, 5.0), new Point(4.0, 5.0), new Point(4.0, 5.0)));
        repository.addTriangle(new TriangleIdentifiable(2, new Point(5.0, 6.0), new Point(7.0, 8.0), new Point(9.0, 10.0)));
        TriangleSpecification spec = new TriangleSpecificationById(1);
        //When
        List<TriangleIdentifiable> listTr = repository.query(spec);
        //then
        Assert.assertEquals(listTr.size(), 1);
        Assert.assertEquals(listTr.get(0).getId(), 1);
    }

    @Test
    public void testSortedShouldReturnListSortedByIdWhenComparatorByIdGiven(){
        //given
        repository = new TriangleRepository();
        triangleStore = repository.store;
        repository.addTriangle(new TriangleIdentifiable(100, new Point(4.0, 5.0), new Point(4.0, 5.0), new Point(4.0, 5.0)));
        repository.addTriangle(new TriangleIdentifiable(10, new Point(5.0, 6.0), new Point(7.0, 8.0), new Point(9.0, 10.0)));
        repository.addTriangle(new TriangleIdentifiable(1, new Point(5.0, 6.0), new Point(7.0, 8.0), new Point(9.0, 10.0)));
        Comparator<TriangleIdentifiable> comparator = new TriangleComparatorById();
        //when
        List<TriangleIdentifiable> listSorted = repository.sorted(comparator);
        //then
        Assert.assertEquals(listSorted.get(0).getId(), 1);
        Assert.assertEquals(listSorted.get(1).getId(), 10);
        Assert.assertEquals(listSorted.get(2).getId(), 100);
    }
}
