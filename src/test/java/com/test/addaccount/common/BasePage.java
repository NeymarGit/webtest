package com.test.addaccount.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * 页面类抽取出来的父类
 */

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // 等待5s元素是否可见
    public WebElement elementVisibility(By by) {
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception e) {
            System.out.println("元素定位异常" + e.getMessage());
        }
        return element;
    }

    // 等待5s元素是否点击
    public WebElement elementClickable(By by) {
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            element = wait.until(ExpectedConditions.elementToBeClickable(by));
        } catch (Exception e) {
            System.out.println("元素定位异常" + e.getMessage());
        }
        return element;
    }

    // 输入文本
    public void input(By by, String content) {
        WebElement element = elementVisibility(by);
        if (element != null) {
            element.clear();
            element.sendKeys(content);
        }
    }

    // 点击按钮
    public void click(By by) {
        WebElement element = elementClickable(by);
        if (element != null) {
            element.click();
        }
    }

    // 滚动到指定元素的位置点击
    public void rollClick(By by) {
        WebElement element = elementClickable(by);
            // 强转类型
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            // JS滚动到指定元素位置
            jsExecutor.executeScript("arguments[0].scrollIntoView()", element);
        if (element != null) {
            element.click();
        }
    }

    // 获取元素的文本
    public String getText(By by) {
        WebElement element = elementVisibility(by);
        if (element != null) {
            return element.getText();
        }
        return "";
    }

    // 获取元素属性值
    public String getAttribute(By by, String attribute) {
        WebElement element = elementVisibility(by);
        if (element != null) {
            return element.getAttribute(attribute);
        }
        return "";
    }

    // 元素是否可见
    public boolean isDisplay(By by) {
        // 定位元素时判断元素5s内是否加载出来
        WebElement element = elementVisibility(by);
        if (element != null) {
            // 判断是否可见
            return element.isDisplayed();
        }
        return false;
    }

    // 选择框
    public void select(By by,String value) {
        WebElement element = elementClickable(by);
        if (element != null) {
            Select select = new Select(element);
            select.selectByVisibleText(value);
        }
    }

    public void select(By by) {
        WebElement element = elementClickable(by);
        if (element != null) {
            Select select = new Select(element);
            select.selectByIndex(0);
        }
    }

}
