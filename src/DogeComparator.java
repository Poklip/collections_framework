import java.util.Comparator;

public class DogeComparator implements Comparator<Doge> {
    @Override
    public int compare(Doge doge_0, Doge doge_1) {
        return Integer.compare(doge_0.id, doge_1.id);
    }
}
