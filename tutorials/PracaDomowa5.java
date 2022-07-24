import java.util.Scanner;

public class PracaDomowa5 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner read = new Scanner(System.in);
        int x,y;
        String z;

        System.out.println("Podaj pierwsza liczbe:");
        x = Integer.parseInt(read.nextLine());
        System.out.println("Podaj druga liczbe:");
        y = Integer.parseInt(read.nextLine());
        System.out.println("wybierz operacje (+,-,*,/,%):");
        z =  read.nextLine();

        switch(z){
            case "+": {System.out.println("Suma: "+calc.addition(x,y));}; break;
            case "-": {System.out.println("Roznica: "+calc.subtraction(x,y));}break;
            case "*": {System.out.println("Iloczyn: "+calc.multiplication(x,y));}break;
            case "/": {System.out.println("Iloraz: "+calc.division(x,y));}break;
            case "%": {System.out.println("Mod: "+calc.modulo(x,y));}break;

        }
    }
}
