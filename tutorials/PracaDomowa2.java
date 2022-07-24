import java.util.Scanner;

public class PracaDomowa2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int age = 0;
        while(age < 30) {
            System.out.println("Podaj swoj wiek:");
            age = read.nextInt();
            if (age <0){
                System.out.println("Podany wiek jest nieprawidlowy");
            }else if (age >= 18) {
                System.out.println("Dziekujemy za zakupy");
            } else {
                System.out.println("Nie mozesz kupic alkoholu");
            }
        }
    }
}
