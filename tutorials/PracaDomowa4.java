import java.util.Scanner;

public class PracaDomowa4 {


    public static void main(String[] args) {
        int i = 0;
        int nexte = 1;
        Student[] tablica = new Student[100];
        Scanner scan = new Scanner(System.in);
        while(nexte == 1){
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

            System.out.println("Czy podajesz nastepnego? [1-tak/2-nie]:");
            nexte = Integer.parseInt(scan.nextLine());

            if (nexte == 1)
                i++;
        }
        int k=0;
        while (k != 666){
            System.out.println("Wybierz nr studenta:");
            k = scan.nextInt();
            Student.infoUczelnia();
            if(k>=0 && k<=i){
                tablica[k].przedstawSie();
                tablica[k].podajEmail();
                tablica[k].zalogujSie();
                tablica[k].podajNrIndeksu();
            }

        }

    }
}
