package com.test.addaccount.util;

import com.test.addaccount.constant.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * �������������driver
 */
public  class Driver {

    public static WebDriver open(String browserType) {
        // ���������ǹȸ������ ����򿪹ȸ������
        if (browserType.equalsIgnoreCase(Constant.DEFAULT_BROWSE)) {
            System.setProperty(Constant.CHROME_DRIVER_KEY, Constant.CHROME_DRIVER_VALUE);
            return new ChromeDriver();
        }
        if (browserType.equalsIgnoreCase(Constant.FIREFOX_BROWSE)) {
            // ��������δ��װ��C�̣���Ҫָ��·��
            System.setProperty(Constant.FIREFOX_KEY, Constant.FIREFOX_VALUE);
            System.setProperty(Constant.FIREFOX_DRIVER_KEY, Constant.FIREFOX_DRIVER_VALUE);
            return new FirefoxDriver();
        }
        return null;
    }

    // �ر������
    public static void close(WebDriver driver) {
        try {
            Thread.sleep(300000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }


}
