import java.util.UUID;

public class Doge {
    int id;
    int numberOfLegs;
    String uuid = UUID.randomUUID().toString();

    public Doge(int id) {
        this.id = id;
    }

}
