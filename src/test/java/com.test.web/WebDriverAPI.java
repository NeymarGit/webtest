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
        // 隐式等待，在超时时间内一直等待，直到找到元素或者超时,findElement和findElements都会加上等待时间

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.jd.com/");
        // 输出当前页面信息
        System.out.println("URL:" + driver.getCurrentUrl());
        System.out.println("Title:" + driver.getTitle());

        // 切换到另一页面
        driver.findElement(By.xpath("//a[text()='电脑']")).click();
        // 硬性等待
        Thread.sleep(1000);
        System.out.println("URL:" + driver.getCurrentUrl());
        System.out.println("Title:" + driver.getTitle());


        // 显示等待,限定时长
        WebDriverWait driverWait = new WebDriverWait(driver, 5);
        // 页面元素是否存在,存在时返回对象
        WebElement until = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='mobile_static']")));
        // 元素是否可见
        WebElement unti1 = driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("shelper")));
        // 元素是否可点击
        WebElement until12= driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='mobile_static']")));


        // 关闭当前页面
        driver.close();

        // 退出driver
        Driver.close(driver);
    }
}
