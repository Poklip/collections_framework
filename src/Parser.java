import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Parser {

    public int parse(File file) {
        int counter = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("страдание")) {
                    counter += 1;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return counter;
    }
}
