package com.anhtester.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public static void sleep(double second){
        try {
            Thread.sleep((long) (1000*second));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createBrowser(){
        //Khởi tạo Browser
        driver = new ChromeDriver();

        // 2 Hàm chờ đợi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //Thời gian chờ đợi tối đa khi tìm kiếm elemnet
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //Chờ đợi page load xong

        // 2 Hàm để maximize/ minimize cửa sở trình duyệt
        driver.manage().window().maximize();
    }

    public static void createBrowser(String browserName){
        //Khởi tạo Browser
        if(browserName.trim().toLowerCase().equals("chrome")){
            driver = new ChromeDriver();
        }
        if(browserName.trim().toLowerCase().equals("edge")){
            driver = new EdgeDriver();
        }
        if(browserName.trim().toLowerCase().equals("firefox")){
            driver = new FirefoxDriver();
        }
        if(browserName.trim().toLowerCase().equals("safari")){
            driver = new SafariDriver();
        }


        // 2 Hàm chờ đợi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //Thời gian chờ đợi tối đa khi tìm kiếm elemnet
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //Chờ đợi page load xong

        // 2 Hàm để maximize/ minimize cửa sở trình duyệt
        driver.manage().window().maximize();
    }

    public static void closeBrowser(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Thay vì add exception, dùng try/catch để chỉ cần 1 lần
        //Đóng Browser
        driver.quit();
    }

}
