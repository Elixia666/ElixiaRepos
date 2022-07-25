package Drivers;

import Drivers.WebDriver;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemu element za pomoca Mozilla Firefox");
    }
}
