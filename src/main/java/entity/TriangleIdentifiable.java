package entity;

import java.util.Objects;
import java.util.UUID;

public class TriangleIdentifiable extends Triangle {
    private UUID id;

    public TriangleIdentifiable(Point firstPoint, Point secondPoint, Point thirdPoint) {
        super(firstPoint, secondPoint, thirdPoint);
        id = UUID.randomUUID();
    }

    public UUID getId() {
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
