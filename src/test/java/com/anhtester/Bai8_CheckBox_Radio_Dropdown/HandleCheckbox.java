package com.anhtester.Bai8_CheckBox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.time.Duration;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args){
        createBrowser();

        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(150));

        driver.get("https://demoqa.com/checkbox");

        //Kiểm tra giá trị Home
        boolean checkCheckBox1 = driver.findElement(By.xpath("//input[@id='tree-node-home']")).isSelected();
        System.out.println("Checkbox Home: " + checkCheckBox1);

        driver.findElement(By.xpath("//input[@id='tree-node-home']")).click();
        boolean checkCheckBoxAfter = driver.findElement(By.xpath("//input[@id='tree-node-home']")).isSelected();
        System.out.println("Checkbox Home (after): " + checkCheckBoxAfter);

//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.navigate().to("https://crm.anhtester.com/admin/authentication");
//
//        //Kiểm tra giá trị Home
//        boolean checkCheckBox1 = driver.findElement(By.xpath("//input[@id='remember']")).isSelected();
//
//        System.out.println("Checkbox Home: " + checkCheckBox1);
//
//        driver.findElement(By.xpath("//input[@id='remember']")).click();
//        boolean checkCheckBoxAfter = driver.findElement(By.xpath("//input[@id='remember']")).isSelected();
//
//        System.out.println("Checkbox Home after click: " + checkCheckBoxAfter);

        //Kiểm tra multicheckbox  của https://demo.seleniumeasy.com/


        closeBrowser();
    }
}
