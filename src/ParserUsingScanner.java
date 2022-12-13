import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ParserUsingScanner {

    public int parse(File file) {
        int counter = 0;
        String line;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                if (line.contains("страдани")) {
                    counter += 1;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return counter;
    }
}
