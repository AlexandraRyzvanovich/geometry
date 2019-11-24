package entity;

import java.util.Objects;

public class TriangleIdentifiable extends Triangle {
    private long id;
    public TriangleIdentifiable(Point firstPoint, Point secondPoint, Point thirdPoint, long id) {
        super(firstPoint, secondPoint, thirdPoint);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TriangleIdentifiable)) return false;
        if (!super.equals(o)) return false;
        TriangleIdentifiable that = (TriangleIdentifiable) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId());
    }
}
