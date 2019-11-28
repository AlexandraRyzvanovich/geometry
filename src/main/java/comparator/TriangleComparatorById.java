package comparator;

import entity.TriangleIdentifiable;

import java.util.Comparator;

public class TriangleComparatorById implements Comparator<TriangleIdentifiable> {

    @Override
    public int compare(TriangleIdentifiable firstTriangle, TriangleIdentifiable secondTriangle) {
        if(firstTriangle.getId() == secondTriangle.getId()){
            return 0;
        }
        if(firstTriangle.getId() > secondTriangle.getId()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
