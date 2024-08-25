package com.anhtester.Bai8_CheckBox_Radio_Dropdown;

import com.anhtester.common.BaseTest;

import static com.anhtester.common.BaseTest.closeBrowser;
import static com.anhtester.common.BaseTest.createBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleMultiCheckBox extends BaseTest {
    public static void main(String[] args){
        createBrowser();

        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
        List<WebElement> listCheckbox = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
        System.out.println(listCheckbox.size()); //Hàm để kiểm tra trong list có bao nhiêu phần tử

        System.out.println("==========Cách 1===========");

        //CÁCH 1: DÙNG DUYỆT LIST ĐỂ LẤY RA ĐƯỢC TỪNG PHẦN TỬ CHECKBOX
        for (int i = 0; i < listCheckbox.size(); i++) {
            System.out.println(listCheckbox.get(i).isSelected());
            //Ở đây .isSelected() được là vì đang in ra từng phần tử của listCheckbox, mà listCheckbox là 1 List<WebElement>, nên từng phần tử của nó cũng là WebElement nên dùng được .isSelected()
        }

        driver.findElement(By.xpath("//label[normalize-space()='Option 1']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Option 2']")).click();

        //Kiểm tra lại sau khi click chọn 2 ô checkbox
        listCheckbox = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));

        for (int i = 0; i < listCheckbox.size(); i++) {
            System.out.println(listCheckbox.get(i).isSelected());
            //Sau này, còn cần phần Xác nhận nó đúng hay chưa? => TCs passes/failed
        }

        System.out.println("===================");
        //Kiểm tra việc tick chọn nhiều checkbox
        if (listCheckbox.get(0).isSelected() == true &&
                listCheckbox.get(1).isSelected() == true &&
                listCheckbox.get(2).isSelected() == true) {
            System.out.println("Passed"); //Sau này dùng hàm trong class Assert của TestNG để xác nhận pass/fail
        } else {
            System.out.println("Failed");
        }

        //CÁCH 2: DÙNG ĐOẠN XPATH CỤ TỂH ĐỂ DUYỆT TỪNG VỊ TRÍ CHECKBOX
        System.out.println("==========Cách 2===========");
        for (int i = 1; i <= listCheckbox.size(); i++) { //Vị trị bắt đầu từ 1 do checkbox có index từ 1
            System.out.println(driver.findElement(By.xpath("(//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox'])[" + i + "]")).isSelected());
        }

        closeBrowser();
    }
}

