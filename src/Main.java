import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //D:/war_and_peace.txt
        Scanner in = new Scanner(System.in);
        System.out.print("Input file destination: ");
        String fileNameAndPath = in.next();
        File warAndPeace = new File(fileNameAndPath);

        //using bufferedReader
        Parser parser = new Parser();
        System.out.println(parser.parse(warAndPeace));

        //using Scanner
        ParserUsingScanner parserUsingScanner = new ParserUsingScanner();
        System.out.println(parserUsingScanner.parse(warAndPeace));

        //multiplication table
        int[][] multiTable = new int[10][10];
        for (int i = 1; i < 11; i ++) {
            int addedNumber = i;
            for (int j = 0; j < 10; j ++) {
                multiTable[i - 1][j] = addedNumber;
                addedNumber += i;
            }
            System.out.println(Arrays.toString(multiTable[i - 1]));
        }



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