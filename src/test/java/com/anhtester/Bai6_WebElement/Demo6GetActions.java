package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_Locators.XpathTuongDoi.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo6GetActions {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();                                          // khởi tạo  trình duyệt test
        driver.manage().window().maximize();                                  //config để bật browser đó full
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    //chờ đợi tìm phần tử tối đa là 10s, sau đó ko tìm thấy thì báo lỗi

        driver.get("https://crm.anhtester.com/admin/authentication");
        String textOfHeader = driver.findElement(By.xpath(LocatorsCRM.headerLoginPage)).getText();
        System.out.println("Header Login Page: " + textOfHeader);

        String labelEmail = driver.findElement(By.xpath("//label[normalize-space()='Email Address']")).getText();
        System.out.println("Label Email: " + labelEmail);

        String attributeButtonLogin1 = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getAttribute("type");
        System.out.println("Attribute Type: " + attributeButtonLogin1);

        String attributeButtonLogin2 = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getAttribute("class");
        System.out.println("Attribute Class: " + attributeButtonLogin2);

        Thread.sleep(1000);
//Kiểm tra xem giá trị nhập vào là gì? Ô input có chấp nhận đầy đủ giá trị được nhập vào không?
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");

        String emailValue = driver.findElement(By.xpath(LocatorsCRM.inputEmail)).getAttribute("value");
        System.out.println("Email Value: " + emailValue);

        String passwordValue = driver.findElement(By.xpath(LocatorsCRM.inputPassword)).getAttribute("value");
        System.out.println("Password Value: " + passwordValue);

        Thread.sleep(1000);

        driver.get("https://anhtester.com/signup");
        String attributeFullName = driver.findElement(By.xpath("//input[@name='name']")).getAttribute("placeholder");
        System.out.println("FullName attribute: " + attributeFullName);

        // Placeholder: Văn bản giữ chỗ
        Thread.sleep(2000);
//Kiểm thử UI của btn Login
        driver.get("https://crm.anhtester.com/admin/authentication");
        String cssValueBtnLogin1 = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("background-color");
        System.out.println("Background Color: " + cssValueBtnLogin1);

        String cssValueBtnLogin2 = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("color");
        System.out.println("Color: " + cssValueBtnLogin2);

        String cssValueBtnLogin3 = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("font-size");
        System.out.println("Font Size: " + cssValueBtnLogin3);
        Thread.sleep(1000);

        Dimension dimension = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize();
        System.out.println("Height: " + dimension.getHeight());
        System.out.println("Width: " + dimension.getWidth());

        Point point = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation();
        System.out.println("x: " + point.getX());
        System.out.println("y: " + point.getY());

        Thread.sleep(3000); //Ngưng 3000 miliseconds, hàm này sẽ yêu cầu add exception để xác thực method
        driver.quit(); //Tắt browser
    }
}
