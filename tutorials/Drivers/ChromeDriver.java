package Drivers;

import Drivers.WebDriver;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("znajdujemy element za pomoca Google Chrome");
    }
}
