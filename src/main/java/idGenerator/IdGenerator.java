package idGenerator;

public class IdGenerator {
    private long id = 0;
    public static long idIncremented;

    public IdGenerator() {
        this.id = idIncremented++;
    }

    public long generateId(){
        return this.id;
    }
}
