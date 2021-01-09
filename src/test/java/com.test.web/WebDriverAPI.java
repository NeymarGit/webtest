package com.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class WebDriverAPI {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.open("chrome");
        // ��ʽ�ȴ����ڳ�ʱʱ����һֱ�ȴ���ֱ���ҵ�Ԫ�ػ��߳�ʱ,findElement��findElements������ϵȴ�ʱ��

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.jd.com/");
        // �����ǰҳ����Ϣ
        System.out.println("URL:" + driver.getCurrentUrl());
        System.out.println("Title:" + driver.getTitle());

        // �л�����һҳ��
        driver.findElement(By.xpath("//a[text()='����']")).click();
        // Ӳ�Եȴ�
        Thread.sleep(1000);
        System.out.println("URL:" + driver.getCurrentUrl());
        System.out.println("Title:" + driver.getTitle());


        // ��ʾ�ȴ�,�޶�ʱ��
        WebDriverWait driverWait = new WebDriverWait(driver, 5);
        // ҳ��Ԫ���Ƿ����,����ʱ���ض���
        WebElement until = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='mobile_static']")));
        // Ԫ���Ƿ�ɼ�
        WebElement unti1 = driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("shelper")));
        // Ԫ���Ƿ�ɵ��
        WebElement until12= driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='mobile_static']")));


        // �رյ�ǰҳ��
        driver.close();

        // �˳�driver
        Driver.close(driver);
    }
}
