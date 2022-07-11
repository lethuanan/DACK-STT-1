package testcaseDK;


import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class DK4_1 {
    public static void DK1(){
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://gearvn.com/account/register");
            // Dòng "Phone" không được nhập ký tự đặc biệt
            driver.findElement(By.xpath("//form[1]/div[1]/input[1]")).sendKeys("Lê");
            driver.findElement(By.xpath("//form[1]/div[2]/input[1]")).sendKeys("An");
            driver.findElement(By.xpath("//form[1]/div[3]/input[1]")).sendKeys("lethuanan@gmail.com");
            driver.findElement(By.xpath("//form[1]/div[4]/input[1]\n")).sendKeys("#@");
            driver.findElement(By.xpath("//div[6]/input[1]")).click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
