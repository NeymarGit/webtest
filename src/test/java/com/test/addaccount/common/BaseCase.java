package com.test.addaccount.common;


import com.test.addaccount.constant.Constant;
import com.test.addaccount.util.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Date;

public class BaseCase {
    protected WebDriver driver;

    @BeforeClass
    public void open() {
        driver = Driver.open(Constant.FIREFOX_BROWSE);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeDriver() {
        close(driver);
    }

    public void close(WebDriver driver) {
        Driver.close(driver);
    }
}
