public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    public static String nazwaUczelni = "Polibuda";

    public void przedstawSie(){
        System.out.println("Nazywam sie: "+ imie+" " +nazwisko);
    }
    public void zalogujSie(){
        System.out.println("Loguje siue za pomoca: " + nick);
    }
    public void podajNrIndeksu(){
        System.out.println("Moj numer indeksu to: " +numerIndeksu);
    }
    public void podajEmail(){
        System.out.println("Moj email to: "+email);
    }

    public static void infoUczelnia(){
        System.out.println("Moja uczelnia to "+nazwaUczelni);
    }
}
