package Drivers;

public class WebDriverTest {
    public static void main(String[] args){
        ChromeDriver chrome = new ChromeDriver();
        FirefoxDriver mozilla = new FirefoxDriver();
        chrome.get();
        chrome.findElementBy();
        mozilla.get();
        mozilla.findElementBy();

    }
}
