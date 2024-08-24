package com.anhtester.Bai7_WebDriver;

import com.anhtester.Bai5_Locators.XpathTuongDoi.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DemoWebDriverBasic {
    public static void main(String [] args) throws InterruptedException {

        //Khởi tạo Browser
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new SafariDriver();


        // 2 Hàm chờ đợi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //Thời gian chờ đợi tối đa khi tìm kiếm elemnet
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //Chờ đợi page load xong

        // 2 Hàm để maximize/ minimize cửa sở trình duyệt
        driver.manage().window().maximize(); //.fullscreen tương ứng f11

        //Mở website/url
        driver.navigate().to("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        //Get Title
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Url: " + driver.getCurrentUrl());

        Thread.sleep(2000);

        driver.findElement(By.xpath(LocatorsCRM.menuCustomers)).click();
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);

        //Đóng Browser
        driver.quit();

    }
}
