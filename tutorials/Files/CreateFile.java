package Files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        if(file.createNewFile())
           System.out.println("stworzylem nowy plik");
        else
             System.out.println("plik juz istnieje");
    }
}
