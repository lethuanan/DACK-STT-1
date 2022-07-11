package testcaseDK;


import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class DK1 {
    public static void DK1(){
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //step 1
            driver.get("https://gearvn.com/account/register");
            //Dòng "họ" bỏ trống
            driver.findElement(By.xpath("//div[6]/input[1]")).click();
            Thread.sleep(2000);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        driver.quit();
    }
}
