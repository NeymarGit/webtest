package com.test.webauto.Util;

import com.test.webauto.constant.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * �������������driver
 */
public  class Driver {
    public static WebDriver open(String browserType) {
        // ���������ǹȸ������ ����򿪹ȸ������
        if (browserType.equalsIgnoreCase(Constant.DEFULT_BROWSE)) {
            System.setProperty(Constant.CHROM_DRIVER_KEY, Constant.CHROM_DRIVER_VALUE);
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
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }


}
