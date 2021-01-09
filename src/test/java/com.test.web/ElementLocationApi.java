package com.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

// Ԫ�ض�λ
public class ElementLocationApi {
    public static void main(String[] args) {
        // �������
        WebDriver driver = Driver.open("FIREFOX");
        // ���ʰٶ�
        driver.get("http://www.baidu.com");
        // ��λ�������Ԫ��
        WebElement kw = driver.findElement(By.id("kw"));
        // ����ؼ���
        kw.sendKeys("������");
        kw.sendKeys(Keys.F12);
        // ����
        WebElement su = driver.findElement(By.id("su"));
        su.click();

        List<WebElement> input = driver.findElements(By.tagName("input"));
        for (WebElement we : input){
            System.out.println(we.getAttribute("name"));
            System.out.println(we.getAttribute("id"));
        }


        // �ر������
        Driver.close(driver);
    }
}
