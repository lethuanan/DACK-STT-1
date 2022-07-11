package BaiTh;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class BaiKT3 {
    public static void testBaiKT3(){
        WebDriver driver = driverFactory.getChromeDriver();
        try{
            //Step 1 : Vào trang https://gearvn.com/
            driver.get("https://gearvn.com/");
            
            //Step 2 : Tìm kiếm sản phẩm
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Nhập mã hoặc tên sản phẩm...']")).sendKeys("Acer Predator Triton");
            driver.findElement(By.xpath("//*[@id='searchbox']/button[1]")).click();

            //Step 3 : Nhấn vào sản phầm và đặt hàng Acer Predator Triton
            driver.findElement(By.xpath("//*[@id='layout-page-search']/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]")).click();
            Thread.sleep(2000);
            String NameProduct = driver.findElement(By.xpath("//h1[1]")).getText();
            System.out.println("Tên sản phẩm : "+NameProduct);
            String PriceProduct = driver.findElement(By.xpath("//span[4]")).getText();
            System.out.println("Giá sản phẩm : "+PriceProduct);
            driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[2]/form[1]/div[4]/a[1]")).click();

            //Step 5 : Quay lại trang chủ và tìm kiếm Tai nghe HyperX Cloud II Wireless
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")).click();
            driver.findElement(By.xpath("//input[@placeholder='Nhập mã hoặc tên sản phẩm...']")).sendKeys("Tai nghe HyperX Cloud II Wireless");
            driver.findElement(By.xpath("//*[@id='searchbox']/button[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='layout-page-search']/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();

            //Step 6 : Đặt hàng Tai nghe HyperX Cloud II Wireless
            String Name2Product = driver.findElement(By.xpath("//h1[1]")).getText();
            System.out.println("Tên sản phẩm : "+Name2Product);
            String Price2Product = driver.findElement(By.xpath("//span[4]")).getText();
            System.out.println("Giá sản phẩm : "+Price2Product);
            driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[2]/form[1]/div[4]/a[1]")).click();

            //Step 7 : Quay lại trang chủ và tìm kiếm Chuột Steelseries Prime Mini Wireless
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")).click();
            driver.findElement(By.xpath("//input[@placeholder='Nhập mã hoặc tên sản phẩm...']")).sendKeys("Chuột Steelseries Prime Mini Wireless");
            driver.findElement(By.xpath("//*[@id='searchbox']/button[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='layout-page-search']/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();

            //Step 8 : Đặt hàng Chuột Steelseries Prime Mini Wireless
            String Name3Product = driver.findElement(By.xpath("//h1[1]")).getText();
            System.out.println("Tên sản phẩm : "+Name3Product);
            String Price3Product = driver.findElement(By.xpath("//span[4]")).getText();
            System.out.println("Giá sản phẩm : "+Price3Product);
            driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[2]/form[1]/div[4]/a[1]")).click();

            //Step 9 : Xóa sản phẩm chuột và tăng số lượng tai nghe
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='cartformpage']/table[1]/tbody[1]/tr[3]/td[5]")).click();
            driver.findElement(By.xpath("//input[@id='updates_1068802529']")).sendKeys("2");
            driver.findElement(By.xpath("//button[@id='update-cart']")).click();

            //Step 10 : Thanh toán
            WebElement checkout = driver.findElement(By.xpath("//*[@id='checkout']"));
            Actions action = new Actions(driver);
            action.moveToElement(checkout);
            action.click().build().perform();
            driver.findElement(By.xpath("//*[@id='billing_address_full_name']")).sendKeys("Le Van Teo");
            driver.findElement(By.xpath("//*[@id='checkout_user_email']")).sendKeys("nag1599@gmail.com");
            driver.findElement(By.xpath("//*[@id='billing_address_phone']")).sendKeys("01234567891");
            driver.findElement(By.xpath("//*[@id='billing_address_address1']")).sendKeys("341");
            Thread.sleep(2000);
            Select Province = new Select(driver.findElement(By.xpath("//*[@id='customer_shipping_province']")));
            Province.selectByVisibleText("Hồ Chí Minh");
            Thread.sleep(2000);
            Select District = new Select(driver.findElement(By.xpath("//div[4]/div[1]/select[1]")));
            District.selectByValue("485");
            driver.findElement(By.xpath("//*[@id='form_next_step']/button[1]")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
