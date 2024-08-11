package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_Locators.XpathTuongDoi.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo3BasicActions {
    public static void main(String[] args) throws InterruptedException {
//Cần 1 WEbDriver để bật được browser lên
        WebDriver driver;
        driver = new ChromeDriver();                                          // khởi tạo  trình duyệt test
        driver.manage().window().maximize();                                  //config để bật browser đó full
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    //chờ đợi tìm phần tử tối đa là 10s, sau đó ko tìm thấy thì báo lỗi

        driver.get("https://crm.anhtester.com/admin/authentication");        //Truy cập vào 1 website

        //Với các web tự động diện email & password, để truyền giá trị mới thì cần clear trường đó
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();

        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");

        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).submit(); //tương ứng với thao tác enter trên keyboard => tiết kiệm 1 element

        //driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        Thread.sleep(3000); //Ngưng 3000 miliseconds, hàm này sẽ yêu cầu add exception để xác thực method

        driver.quit(); //Tắt browser





    }
}
