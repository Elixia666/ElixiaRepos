package Drivers;

public class WebDriverTest {
    public static void main(String[] args){
        WebDriver driver = getDriver("firefox");
        driver.get();

     /*   ChromeDriver chrome = new ChromeDriver();
        FirefoxDriver mozilla = new FirefoxDriver();
        chrome.get();
        chrome.findElementBy();
        mozilla.get();
        mozilla.findElementBy();
*/
    }

    private static WebDriver getDriver(String name) {
        if(name.equals("chrome")) return new ChromeDriver();
        else if (name.equals("firefox"))  return new FirefoxDriver();
        return null;

    }
}
