import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input file destination: ");
        String fileNameAndPath = in.next();
        File warAndPeace = new File(fileNameAndPath);
        Parser parser = new Parser();
        System.out.println(parser.parse(warAndPeace));





/*      HashMap<String, Doge> dogeMap = new HashMap<>();
        String cachedDogeUUID = "";

        for (int i = 0; i < 50; i++) {
            Doge doge = new Doge(i);
            dogeMap.put(doge.uuid, doge);
            if (i == 13) {
                cachedDogeUUID = doge.uuid;
            }
        }

        Doge cachedDoge = dogeMap.get(cachedDogeUUID);
        System.out.println(cachedDoge.id + "; " + cachedDoge.uuid + "; ");*/

/*        Integer id = 0;

        TreeMap<Doge, Doge> dogesTreeMap = new TreeMap<>(new DogeComparator());
        for (int i = 0; i < 50; i++) {
            Doge doge = new Doge(i);
            dogesTreeMap.put(doge, doge);
        }
        System.out.println(dogesTreeMap.entrySet());
        dogesTreeMap.forEach((key, value) -> {
            System.out.println(value.id);
        });*/




    }
}