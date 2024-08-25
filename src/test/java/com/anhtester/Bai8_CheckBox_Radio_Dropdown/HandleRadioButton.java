package com.anhtester.Bai8_CheckBox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;

public class HandleRadioButton extends BaseTest {
    public static void main (String[] args){
        createBrowser();

        driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        boolean checkRadioMale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//label[normalize-space()='Male']/input")).isSelected();
        System.out.println("Radio Male: " + checkRadioMale);
        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//label[normalize-space()='Male']")).click();
        checkRadioMale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//label[normalize-space()='Male']/input")).isSelected();
        //cập nhật giá trị nên không cần boolean ở dòng trên
        System.out.println("Radio Male (After): " + checkRadioMale);

        //Khi đã click Male> click Female thì giá trị của male là false còn female cần là true
        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//label[normalize-space()='Female']")).click();
        checkRadioMale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//label[normalize-space()='Male']/input")).isSelected();
        System.out.println("Radio Male (Change): " + checkRadioMale);
        boolean checkRadioFemale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//label[normalize-space()='Female']/input")).isSelected();
        System.out.println("Radio Female: " + checkRadioFemale);

        /* Rule test radio button
        Kiểm tra chính cái Radio tick chọn
        Kiểm tra các radio còn lại // sau này dùng assert hoặc if-else
        */


        closeBrowser();
    }
}
