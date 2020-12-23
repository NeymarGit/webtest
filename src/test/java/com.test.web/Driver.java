package com.test.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 打开浏览器，返回driver
 */
public class Driver {
    public static WebDriver open(String browserType) {
        // 如果传入的是谷歌浏览器 ，则打开谷歌浏览器
        if (browserType.equalsIgnoreCase("chrom")) {
            System.setProperty(Constant.CHROM_DRIVER_KEY, Constant.CHROM_DRIVER_VALUE);
            return new ChromeDriver();
        }
        if (browserType.equalsIgnoreCase("firefox")) {
            // 火狐浏览器未安装在C盘，需要指定路径
            System.setProperty(Constant.FIREFOX_KEY, Constant.FIREFOX_VALUE);
            System.setProperty(Constant.FIREFOX_DRIVER_KEY, Constant.FIREFOX_DRIVER_VALUE);
            return new FirefoxDriver();
        }
        return null;
    }

    // 关闭浏览器
    public static void close(WebDriver driver) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }


}
