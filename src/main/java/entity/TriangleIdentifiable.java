package entity;

import java.util.Objects;

public class TriangleIdentifiable extends Triangle{
    private final long id;

    public TriangleIdentifiable(long id, Point firstPoint, Point secondPoint, Point thirdPoint) {
        super(firstPoint, secondPoint, thirdPoint);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if(o == null){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        TriangleIdentifiable triangle = (TriangleIdentifiable) o;
        return getId() == triangle.getId();
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + super.hashCode();
        result = (int)(prime * result + id);
        return result;
    }
}
