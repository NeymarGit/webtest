package com.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// �ᶨλ��https://blog.csdn.net/huilan_same/article/details/52541680
// XPath ��ʽ��λԪ��
public class ElementLocationXPath {
    public static void main(String[] args) {
        // �������
        WebDriver driver = Driver.open("chrome");

        driver.get("http://localhost:8080/jenkins/login");
        // ����·����λ�����
//         driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/span[4]/a")).click();

        // ���·����λ
        driver.findElement(By.xpath(("//form/div[2]/input"))).sendKeys("liuyanghe");

        // ����ģ��ƥ�䶨λ
        driver.findElement(By.xpath("//input[contains(@name,'j_p')]")).sendKeys("123456");

        // ���Զ�λ
        driver.findElement(By.xpath("//*[@name='Submit']")).click();

        // �����ı���λ
//        driver.findElement(By.xpath("//*[text()='Keep me signed in']")).click();

        // �ر������
        Driver.close(driver);

    }
}
