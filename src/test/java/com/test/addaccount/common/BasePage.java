package com.test.addaccount.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * ҳ�����ȡ�����ĸ���
 */

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // �ȴ�5sԪ���Ƿ�ɼ�
    public WebElement elementVisibility(By by) {
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception e) {
            System.out.println("Ԫ�ض�λ�쳣" + e.getMessage());
        }
        return element;
    }

    // �ȴ�5sԪ���Ƿ���
    public WebElement elementClickable(By by) {
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            element = wait.until(ExpectedConditions.elementToBeClickable(by));
        } catch (Exception e) {
            System.out.println("Ԫ�ض�λ�쳣" + e.getMessage());
        }
        return element;
    }

    // �����ı�
    public void input(By by, String content) {
        WebElement element = elementVisibility(by);
        if (element != null) {
            element.clear();
            element.sendKeys(content);
        }
    }

    // �����ť
    public void click(By by) {
        WebElement element = elementClickable(by);
        if (element != null) {
            element.click();
        }
    }

    // ������ָ��Ԫ�ص�λ�õ��
    public void rollClick(By by) {
        WebElement element = elementClickable(by);
            // ǿת����
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            // JS������ָ��Ԫ��λ��
            jsExecutor.executeScript("arguments[0].scrollIntoView()", element);
        if (element != null) {
            element.click();
        }
    }

    // ��ȡԪ�ص��ı�
    public String getText(By by) {
        WebElement element = elementVisibility(by);
        if (element != null) {
            return element.getText();
        }
        return "";
    }

    // ��ȡԪ������ֵ
    public String getAttribute(By by, String attribute) {
        WebElement element = elementVisibility(by);
        if (element != null) {
            return element.getAttribute(attribute);
        }
        return "";
    }

    // Ԫ���Ƿ�ɼ�
    public boolean isDisplay(By by) {
        // ��λԪ��ʱ�ж�Ԫ��5s���Ƿ���س���
        WebElement element = elementVisibility(by);
        if (element != null) {
            // �ж��Ƿ�ɼ�
            return element.isDisplayed();
        }
        return false;
    }

    // ѡ���
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
