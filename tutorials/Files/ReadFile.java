package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        Scanner read = new Scanner(file);
        while(read.hasNext()){
            String line = read.nextLine();
            System.out.println(line);
        }
        read.close();
    }
}
