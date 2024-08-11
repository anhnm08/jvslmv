package com.anhtester.Bai6_WebElement;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

public class DemoScreenshot {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();                                          // khởi tạo  trình duyệt test
        driver.manage().window().maximize();                                  //config để bật browser đó full
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://anhtester.com");

        //Chụp hình 1 phần tử ở Selenium 4
        WebElement logo = driver.findElement(By.xpath("//body//section[@class='slider-area']//div[@class='row']//div[@class='row']//div[1]//div[1]//a[1]"));

        File file = logo.getScreenshotAs(OutputType.FILE);
        File destFile = new File("websitetesting.png");

        try {
            Files.copy(file.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Chụp toàn màn hình
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(source, new File("Fullscreen_Screenshot.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Thread.sleep(3000); //Ngưng 3000 miliseconds, hàm này sẽ yêu cầu add exception để xác thực method
        driver.quit(); //Tắt browser
    }
}
