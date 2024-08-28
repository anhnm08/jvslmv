package com.anhtester.Bai8_CheckBox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownStatic extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://formstone.it/components/dropdown/demo/");

        sleep(1); //Hàm gốc ở class BaseTest

        //Khởi tạo đối tượng của class Select

        Select select = new Select(driver.findElement(By.xpath("//select[@id='demo_basic']")));

        //Chọn option theo 3 hàm hỗ trợ
        select.selectByVisibleText("Two");

        sleep(1);
        select.selectByValue("1");

        sleep(1);
        select.selectByIndex(1);

        //Kiểm tra giá trị đã chọn đúng chưa
       System.out.println(select.getFirstSelectedOption().getText());

        closeBrowser();
    }
}
