package com.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

// ����Ԫ�ز���
public class SpecialElement02 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = Driver.open("chrom");
//        jsOperation(driver);
        fileUpload(driver);
        Driver.close(driver);

    }

    // js����
    public static void jsOperation(WebDriver driver){
        driver.get("https://www.12306.cn/index/");
        // ǿת����
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // ͨ��js�Ƴ�ҳ��ֻ������ ����һ
        jsExecutor.executeScript("document.getElementById('train_date').removeAttribute('readonly')");
        // ͨ��js�Ƴ�ҳ��ֻ������ ������
        WebElement train_date = driver.findElement(By.id("train_date"));
        jsExecutor.executeScript("argument[0].removeAttribute('readonly')",train_date);
        // ���Ĭ��ֵ
        train_date.clear();
        train_date.sendKeys("2021-01-01");

    }

    // �����ļ�
    public static void fileUpload(WebDriver driver) throws Exception {
        driver.get("https://www.layui.com/demo/upload.html");
        driver.findElement(By.id("test1")).click();

        // ����һ���ҵ�Ԫ�غ�ֱ��sendKeys�ļ���·��
        // ������������ֱ���ϴ�·���� Ҫͨ��AutoIT����������window�������ɽű����ű�������exe����java����exe�����������ϴ��ļ�

        // java����exe����
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("F:\\selenium\\AutoIT\\Script\\Auto.exe");
        Thread.sleep(3000);

    }
}
