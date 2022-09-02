package pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class dashboardpage {
    Webdrive driver;
     By user = By.xpath("//a[contains(text), #_Women)]");
     By user1 = By.xpath("aria-label");
    public dashboardpage(Webdriver driver){
        this.driver=driver;
    }
    public static verification(String locator,String expected){
        String.actual = driver.findElement(By.xpath(locator)).getText();
        Assert.isTrue(actual.contains(expected)," ");
    }
    public void dashboard(){
        driver.manage.window().maximize();
        driver.findElement(user).click();
        verification(//asset2.cxnmarksandspencer.com/is/image/mands/090822_0421_SB-29992_746X560_01);
    }

}
