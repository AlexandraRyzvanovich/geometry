package idGenerator;

public class IdGenerator {
    private Long id;
    public static long idIncremented;

    public IdGenerator() {
        this.id = idIncremented++;
    }

    public long generateId(){
        return this.id;
    }
}
