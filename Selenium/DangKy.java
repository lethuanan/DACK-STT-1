package BaiTh;


import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class BaiKT {
    public static void testBaiKT(){
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1 : Vào trang https://gearvn.com/
            driver.get("https://gearvn.com/");

            //Step 2 : Nhấn vào Đăng kí
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[2]/div[2]/div[1]/a[1]")).click();

            //Step 3 : Điền vào form Đăng kí và nhấn về trang chủ
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder=\"Họ\"]")).sendKeys("Le");
            driver.findElement(By.xpath("//input[@placeholder=\"Tên\"]")).sendKeys("Loi");
            driver.findElement(By.xpath("//input[@placeholder=\"email\"]")).sendKeys("nag1599@gmail.com");
            driver.findElement(By.xpath("//*[@placeholder=\"phone\"]")).sendKeys("0147896355");
            driver.findElement(By.xpath("//input[@placeholder=\"Mật khẩu\"]")).sendKeys("123456789");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@value=\"Đăng ký\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")).click();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
