package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebdriverAdvanced {
    public static void main(String [] args) throws InterruptedException {
    //Khởi tạo Browser
        WebDriver driver = new ChromeDriver();

    // 2 Hàm chờ đợi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //Thời gian chờ đợi tối đa khi tìm kiếm elemnet
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //Chờ đợi page load xong

    // 2 Hàm để maximize/ minimize cửa sở trình duyệt
        driver.manage().window().maximize();
        driver.navigate().to("https://anhtester.com");

    Thread.sleep(1000);
        String window1= driver.getWindowHandle();
        System.out.println("Mã Window 1: " + driver.getWindowHandle());

    //Mở 1 tab mới và chuyển hướng đến tab đó
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://google.com");
        String window2= driver.getWindowHandle();
        System.out.println("Mã Window 2: " + window2);

    //Mở 1 cửa sổ window mới và chuyển hướng tới window đó
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://github.com");
        System.out.println("Mã Window 3: " + driver.getWindowHandle());
        Thread.sleep(1000);

    //Chuyển về cửa sổ chỉ định
        driver.switchTo().window(window1);
        driver.switchTo().window(window2);

    Thread.sleep(1000);

    //Đóng Browser
        driver.quit();
    }
}
