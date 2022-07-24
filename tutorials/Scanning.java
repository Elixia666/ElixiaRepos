import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Scanning {
    public Scanning() {
    }

    public static void main(String[] args) {
        System.out.println("Podaj swoje imie");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();


        System.out.println("Podaj liczbe");
        Scanner scan2 = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Czesc " + name + " !");
        System.out.println("Koszt: " + number);

    }
}