package com.test.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

/**
 * 特殊元素定位(下拉框，嵌套iframe,切换窗口)
 */

public class SpecialElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.open("chrome");
//        select(driver);
//        iframe(driver);
        windowsChange(driver);

        Driver.close(driver);

    }

    // 选择下拉框的定位操作
    public static void select(WebDriver driver) throws InterruptedException {
        driver.get("https://item.jd.com/71850466013.html");
        // select框不可见，要先点击才可见
        driver.findElement(By.id("J-cal-baby")).click();
        // 找到select元素
        WebElement element = driver.findElement(By.xpath("//select[1]"));
        // 创建select对象
        Select select = new Select(element);
        // 获取下拉框的所有值
        List<WebElement> options = select.getOptions();
        for (WebElement we : options) {
            System.out.println(we.getTagName());
        }
        // 找到第一个元素
        select.selectByIndex(0);
        Thread.sleep(2000);
        // 找到指定value的元素
        select.selectByValue("2021");
        Thread.sleep(2000);
        // 找打可见值的元素
        select.selectByVisibleText("2013");
    }

    // 嵌套页面的定位
    public static void iframe(WebDriver driver) {
        driver.get("https://www.nike.com/cn/");
        WebElement element = driver.findElement(By.xpath("//*[@role='banner']"));
        System.out.println("外层data-version：" + element.getAttribute("data-version"));

        //切换到第一个子iframe
        driver.switchTo().frame(0);
        WebElement element1 = driver.findElement(By.xpath("//*[@id='sec-overlay']/parent::*/link"));
        System.out.println("内层data-version：" + element1.getAttribute("rel"));

        //切换到父iframe
        driver.switchTo().parentFrame() ;
        System.out.println("外层data-version：" + element.getAttribute("data-version"));

        //通过name或id定位iframe
        driver.switchTo().frame("nike-unite-session");
        System.out.println("内层data-version：" + element1.getAttribute("rel"));

        //切换到最外层的iframe
        driver.switchTo().defaultContent();
        System.out.println("外层data-version：" + element.getAttribute("data-version"));

        // 通过WebElement对象切换,注意这里的WebElement对象是个iframe
        WebElement element2 = driver.findElement(By.id("nike-unite-session"));
        driver.switchTo().frame(element2);
        System.out.println("内层data-version：" + element1.getAttribute("rel"));
    }

    // 切换窗口
    public static void windowsChange(WebDriver driver) throws InterruptedException {
        driver.get("https://www.jd.com/");
        // 获取当前handle
        String handleOne = driver.getWindowHandle();
        System.out.println(handleOne);

        // 点击到第二个窗口
        driver.findElement(By.xpath("//a[text()='京东家电']")).click();
        // 获取所有handle
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

        // 点击到第三个窗口
        driver.findElement(By.xpath("//a[text()='京东国际']")).click();
        Set<String> handles1 = driver.getWindowHandles();
        String handleThree = "";
        for (String handle : handles1) {
            if (!(handle.equals(handleOne)) && !(handle.equals(handleTwo))) {
                handleThree = handle;
                break;
            }
        }
        System.out.println(handleThree);

        // 切换到第三个页面
        driver.switchTo().window(handleThree);
        System.out.println(driver.findElement(By.xpath("//*[text()='自营个护美妆']")).getAttribute("class"));
        Thread.sleep(1000);
        // 关闭第三个窗口
        driver.close();

        // 切换到第二个窗口
        driver.switchTo().window(handleTwo);
        System.out.println(driver.findElement(By.xpath("//*[text()='乡镇专卖店']")).getAttribute("href"));
        Thread.sleep(1000);
        // 关闭第二个窗口
        driver.close();

        // 切换回第一个窗口
        driver.switchTo().window(handleOne);
        System.out.println(driver.findElement(By.xpath("//a[text()='京东超市']")).getAttribute("href"));

    }


}
