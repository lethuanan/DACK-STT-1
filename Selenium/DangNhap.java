package BaiTh;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class BaiKT2 {
    public static void testBaiKT2(){
        WebDriver driver = driverFactory.getChromeDriver();
        try{
            //Step 1 : Vào trang https://gearvn.com/
            driver.get("https://gearvn.com/");

            //Step 2 : Đăng nhập vào trang web và quay về trang chủ
            driver.findElement(By.xpath("//div[2]/div[2]/div[1]/a[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@name=\"customer[email]\"]")).sendKeys("nag1599@gmail.com");
            driver.findElement(By.xpath("//input[@placeholder=\"Mật khẩu\"]")).sendKeys("123456789");
            driver.findElement(By.xpath("//input[@value=\"Đăng nhập\"]")).click();
            driver.findElement(By.xpath("//div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")).click();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
