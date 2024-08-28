package com.anhtester.Bai8_CheckBox_Radio_Dropdown;

import com.anhtester.Bai5_Locators.XpathTuongDoi.LocatorsCRM;
import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DemoAddCustomer extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");

        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.menuCustomers)).click();

        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.buttonAddNewCustomer)).click();

        //Chọn Group
        sleep(2);
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroups)).click();

        sleep(2);
        String groupName = "VIP";
        driver.findElement(By.xpath(LocatorsCRM.inputSearchGroup)).sendKeys(groupName);

        //Click chọn item group hoặc nhấn ENTER
        sleep(2);
        //driver.findElement(By.xpath(LocatorsCRM.inputSearchGroup)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//span[normalize-space()='"+ groupName + "']")).click();

        //Thu gọn Dropdown sau khi click
        sleep(2);
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroups)).click();

        closeBrowser();
    }
}

