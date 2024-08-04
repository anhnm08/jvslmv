package com.anhtester.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {

    public static void main(String[] args) throws InterruptedException {

        //Cấu trúc khởi tạo Browser
        //ChromeDriver, EdgeDriver, FirefoxDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở 1 website
        driver.get("https://cms.anhtester.com/login");

        //Định vị vị trí của các element trên trang login CMS

        //1. Ô email
        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        //2. Ô Password
        driver.findElement(By.name("password")).sendKeys("123456");

        //3. Btn Login
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        Thread.sleep(3000); // Chờ đợi 3 giây
        //Tắt Browser
        driver.quit();

    }
}
