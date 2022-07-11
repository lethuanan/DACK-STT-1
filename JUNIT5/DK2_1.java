package testcaseDK;


import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class DK2_1 {
    public static void DK1(){
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://gearvn.com/account/register");
            // Dòng "Tên" không được nhập ký tự đặc biệt
            driver.findElement(By.xpath("//form[1]/div[1]/input[1]")).sendKeys("Lê");
            driver.findElement(By.xpath("//form[1]/div[2]/input[1]")).sendKeys("#@");
            driver.findElement(By.xpath("//div[6]/input[1]")).click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
