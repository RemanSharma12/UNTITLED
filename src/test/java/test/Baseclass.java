package  test;

import pages.pagefactory;

public class Baseclass {
    static WebDriver driver;

    protected static pagefactory pagefactory;
    public static void setup(){
        ystem.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.marksandspencer.com/");
        pagefactory = new pagefactory(driver);
    }
    public void close(){
        driver.close;
    }

}
