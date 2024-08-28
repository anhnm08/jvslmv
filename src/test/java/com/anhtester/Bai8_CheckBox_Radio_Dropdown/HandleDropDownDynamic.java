package com.anhtester.Bai8_CheckBox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static com.anhtester.common.BaseTest.sleep;

public class HandleDropDownDynamic extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        sleep(2);

        //Click vào dropdown Category
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        //Search giá trị cần chọn
        sleep(1);
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Travel");
        //Click chọn Text đã search (cần chọn)
        sleep(1);
        // driver.findElement(By.xpath("//li[@class='active-result highlighted']")).click(); //Cách 1 dùng click
        //Cách 3: click bằng cách dùng Keys.ENTER bên tring sendKeys
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys(Keys.ENTER);


//        Actions action = new Actions(driver);
//        action.sendKeys(Keys.ENTER).perform(); //Cách 2 ENTER dùng cho TH chỉ hiển thị 1 giá trị lựa chọn

        closeBrowser();

    }
}
