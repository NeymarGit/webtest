package com.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

// 特殊元素操作
public class SpecialElement02 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = Driver.open("chrom");
//        jsOperation(driver);
        fileUpload(driver);
        Driver.close(driver);

    }

    // js操作
    public static void jsOperation(WebDriver driver){
        driver.get("https://www.12306.cn/index/");
        // 强转类型
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // 通过js移除页面只读属性 方法一
        jsExecutor.executeScript("document.getElementById('train_date').removeAttribute('readonly')");
        // 通过js移除页面只读属性 方法二
        WebElement train_date = driver.findElement(By.id("train_date"));
        jsExecutor.executeScript("argument[0].removeAttribute('readonly')",train_date);
        // 清除默认值
        train_date.clear();
        train_date.sendKeys("2021-01-01");

    }

    // 导入文件
    public static void fileUpload(WebDriver driver) throws Exception {
        driver.get("https://www.layui.com/demo/upload.html");
        driver.findElement(By.id("test1")).click();

        // 方法一：找到元素后直接sendKeys文件的路径
        // 方法二：不能直接上传路径的 要通过AutoIT工具来操作window窗口生成脚本，脚本制作成exe程序，java操作exe程序来操作上传文件

        // java操作exe程序
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("F:\\selenium\\AutoIT\\Script\\Auto.exe");
        Thread.sleep(3000);

    }
}
