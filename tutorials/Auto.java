public class Auto {
    public String marka;
    public String model;
    public int rocznik;
    public int przebieg;

    public Auto(){}

    public Auto(String marka,String model, int rocznik, int przebieg){
    this.marka = marka;
    this.model = model;
    this.przebieg = przebieg;
    this.rocznik = rocznik;

    }

    public void jedz(){
        System.out.println("pyr pyr pyr");
    }
    public void hamuj(){
        System.out.println("hamuje");
    }
    public void info(){
        System.out.println("Marka: "+marka);
        System.out.println("Model: "+model);
        System.out.println("Rocznik: "+rocznik);
        System.out.println("Przebieg: "+przebieg);
    }
}
