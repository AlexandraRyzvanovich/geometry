package entity;

import idGenerator.IdGenerator;
import java.util.Objects;

public class TriangleIdentifiable extends Triangle{
    private final long id;
    final IdGenerator idGenerator;

    public TriangleIdentifiable(Point firstPoint, Point secondPoint, Point thirdPoint) {
        super(firstPoint, secondPoint, thirdPoint);
        idGenerator = new IdGenerator();
        this.id = idGenerator.generateId();
    }

    public long getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof TriangleIdentifiable)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        TriangleIdentifiable that = (TriangleIdentifiable) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId());
    }
}
