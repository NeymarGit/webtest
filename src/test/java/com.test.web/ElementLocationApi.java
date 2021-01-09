package com.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

// 元素定位
public class ElementLocationApi {
    public static void main(String[] args) {
        // 打开浏览器
        WebDriver driver = Driver.open("FIREFOX");
        // 访问百度
        driver.get("http://www.baidu.com");
        // 定位到输入框元素
        WebElement kw = driver.findElement(By.id("kw"));
        // 输入关键字
        kw.sendKeys("新梦想");
        kw.sendKeys(Keys.F12);
        // 搜索
        WebElement su = driver.findElement(By.id("su"));
        su.click();

        List<WebElement> input = driver.findElements(By.tagName("input"));
        for (WebElement we : input){
            System.out.println(we.getAttribute("name"));
            System.out.println(we.getAttribute("id"));
        }


        // 关闭浏览器
        Driver.close(driver);
    }
}
