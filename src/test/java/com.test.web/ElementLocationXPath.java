package com.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// 轴定位：https://blog.csdn.net/huilan_same/article/details/52541680
// XPath 方式定位元素
public class ElementLocationXPath {
    public static void main(String[] args) {
        // 打开浏览器
        WebDriver driver = Driver.open("chrome");

        driver.get("http://localhost:8080/jenkins/login");
        // 绝对路径定位并点击
//         driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/span[4]/a")).click();

        // 相对路径定位
        driver.findElement(By.xpath(("//form/div[2]/input"))).sendKeys("liuyanghe");

        // 属性模糊匹配定位
        driver.findElement(By.xpath("//input[contains(@name,'j_p')]")).sendKeys("123456");

        // 属性定位
        driver.findElement(By.xpath("//*[@name='Submit']")).click();

        // 根据文本定位
//        driver.findElement(By.xpath("//*[text()='Keep me signed in']")).click();

        // 关闭浏览器
        Driver.close(driver);

    }
}
