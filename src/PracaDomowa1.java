import java.util.Scanner;

public class PracaDomowa1 {
    public static void main(String[] args) {

        System.out.println("Podaj pierwsza liczbe:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Podaj druga liczbe:");
        int y = scan.nextInt();

        int suma = x+y;
        int roznica = x-y;
        int iloczyn = x*y;
        int iloraz = x/y;

        System.out.println("Suma: " + suma);
        System.out.println("Roznica: "+roznica);
        System.out.println("Iloczyn: "+iloczyn);
        System.out.println("Iloraz: "+iloraz);
    }
}
