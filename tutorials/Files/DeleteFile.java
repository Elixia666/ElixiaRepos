package Files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("text.txt");
        if(file.delete()){
            System.out.println("plik usunieto");

        }
        else
            System.out.println("nie udalo sie usunac");
    }
}
