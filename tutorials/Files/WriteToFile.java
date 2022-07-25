package Files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("text.txt");
        file.write("new text");
        file.close();
    }
}
