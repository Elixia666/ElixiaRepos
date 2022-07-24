import java.util.Scanner;

public class PracaDomowa4 {

    public static void main(String[] args) {
        Student[] tablica = new Student[3];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<=2;i++){
            tablica[i] = new Student();
            System.out.println("Podaj imie:");
            tablica[i].imie = scan.nextLine();
            System.out.println("Podaj nazwisko:");
            tablica[i].nazwisko = scan.nextLine();
            System.out.println("Podaj login:");
            tablica[i].nick = scan.nextLine();
            System.out.println("Podaj email:");
            tablica[i].email = scan.nextLine();
            System.out.println("Podaj numer indeksu:");
            tablica[i].numerIndeksu =Integer.parseInt(scan.nextLine());

        }
        int k=0;
        while (k != 5){
            k = scan.nextInt();
            if(k>=0 && k<=2){
                tablica[k].przedstawSie();
                tablica[k].podajEmail();
                tablica[k].zalogujSie();
                tablica[k].podajNrIndeksu();
            }

        }

    }
}
