package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_Locators.XpathTuongDoi.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo3CheckActions {
    public static void main  (String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();                                          // khởi tạo  trình duyệt test
        driver.manage().window().maximize();                                  //config để bật browser đó full
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    //chờ đợi tìm phần tử tối đa là 10s, sau đó ko tìm thấy thì báo lỗi

        driver.get("https://anhtester.com/");        //Truy cập vào 1 website
        boolean checkDisplay = driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']")).isDisplayed();
        System.out.println("Check isDisplayed(): " + checkDisplay); //false là đúng
        Thread.sleep(2000);

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        boolean checkEnable1 = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Check isEnabled(): " + checkEnable1); //false là đúng

        //Ctrl + Alt + L để format code trên window hoặc Command + Option + L trên mac
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        boolean checkEnable2 = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Check isEnabled(): " + checkEnable2); //true là đúng
        Thread.sleep(2000);

        driver.get("https://crm.anhtester.com/admin/authentication");
        boolean checkSelected = driver.findElement(By.xpath(LocatorsCRM.checkboxRemember)).isSelected();
        System.out.println("Check isSelected(): " + checkSelected);

        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        boolean checkSelected2 = driver.findElement(By.xpath(LocatorsCRM.checkboxRemember)).isSelected();
        System.out.println("Check isSelected(): " + checkSelected2);

        Thread.sleep(3000); //Ngưng 3000 miliseconds, hàm này sẽ yêu cầu add exception để xác thực method

        driver.quit(); //Tắt browser
    }
}
