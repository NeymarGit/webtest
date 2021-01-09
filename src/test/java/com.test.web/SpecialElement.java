package com.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

/**
 * ����Ԫ�ض�λ(������Ƕ��iframe,�л�����)
 */

public class SpecialElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.open("chrome");
//        select(driver);
//        iframe(driver);
        windowsChange(driver);

        Driver.close(driver);

    }

    // ѡ��������Ķ�λ����
    public static void select(WebDriver driver) throws InterruptedException {
        driver.get("https://item.jd.com/71850466013.html");
        // select�򲻿ɼ���Ҫ�ȵ���ſɼ�
        driver.findElement(By.id("J-cal-baby")).click();
        // �ҵ�selectԪ��
        WebElement element = driver.findElement(By.xpath("//select[1]"));
        // ����select����
        Select select = new Select(element);
        // ��ȡ�����������ֵ
        List<WebElement> options = select.getOptions();
        for (WebElement we : options) {
            System.out.println(we.getTagName());
        }
        // �ҵ���һ��Ԫ��
        select.selectByIndex(0);
        Thread.sleep(2000);
        // �ҵ�ָ��value��Ԫ��
        select.selectByValue("2021");
        Thread.sleep(2000);
        // �Ҵ�ɼ�ֵ��Ԫ��
        select.selectByVisibleText("2013");
    }

    // Ƕ��ҳ��Ķ�λ
    public static void iframe(WebDriver driver) {
        driver.get("https://www.nike.com/cn/");
        WebElement element = driver.findElement(By.xpath("//*[@role='banner']"));
        System.out.println("���data-version��" + element.getAttribute("data-version"));

        //�л�����һ����iframe
        driver.switchTo().frame(0);
        WebElement element1 = driver.findElement(By.xpath("//*[@id='sec-overlay']/parent::*/link"));
        System.out.println("�ڲ�data-version��" + element1.getAttribute("rel"));

        //�л�����iframe
        driver.switchTo().parentFrame() ;
        System.out.println("���data-version��" + element.getAttribute("data-version"));

        //ͨ��name��id��λiframe
        driver.switchTo().frame("nike-unite-session");
        System.out.println("�ڲ�data-version��" + element1.getAttribute("rel"));

        //�л���������iframe
        driver.switchTo().defaultContent();
        System.out.println("���data-version��" + element.getAttribute("data-version"));

        // ͨ��WebElement�����л�,ע�������WebElement�����Ǹ�iframe
        WebElement element2 = driver.findElement(By.id("nike-unite-session"));
        driver.switchTo().frame(element2);
        System.out.println("�ڲ�data-version��" + element1.getAttribute("rel"));
    }

    // �л�����
    public static void windowsChange(WebDriver driver) throws InterruptedException {
        driver.get("https://www.jd.com/");
        // ��ȡ��ǰhandle
        String handleOne = driver.getWindowHandle();
        System.out.println(handleOne);

        // ������ڶ�������
        driver.findElement(By.xpath("//a[text()='�����ҵ�']")).click();
        // ��ȡ����handle
        Set<String> handles = driver.getWindowHandles();
        String handleTwo = "";
        for (String handle : handles) {
            if (!handle.equals(handleOne)) {
                handleTwo = handle;
                break;
            }
        }
        System.out.println(handleTwo);
        Thread.sleep(1000);

        // ���������������
        driver.findElement(By.xpath("//a[text()='��������']")).click();
        Set<String> handles1 = driver.getWindowHandles();
        String handleThree = "";
        for (String handle : handles1) {
            if (!(handle.equals(handleOne)) && !(handle.equals(handleTwo))) {
                handleThree = handle;
                break;
            }
        }
        System.out.println(handleThree);

        // �л���������ҳ��
        driver.switchTo().window(handleThree);
        System.out.println(driver.findElement(By.xpath("//*[text()='��Ӫ������ױ']")).getAttribute("class"));
        Thread.sleep(1000);
        // �رյ���������
        driver.close();

        // �л����ڶ�������
        driver.switchTo().window(handleTwo);
        System.out.println(driver.findElement(By.xpath("//*[text()='����ר����']")).getAttribute("href"));
        Thread.sleep(1000);
        // �رյڶ�������
        driver.close();

        // �л��ص�һ������
        driver.switchTo().window(handleOne);
        System.out.println(driver.findElement(By.xpath("//a[text()='��������']")).getAttribute("href"));

    }


}
