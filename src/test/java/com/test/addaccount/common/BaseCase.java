package com.test.addaccount.common;


import com.test.addaccount.constant.Constant;
import com.test.addaccount.util.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseCase {
    protected WebDriver driver;

    @BeforeClass
    public void open() {
        driver = Driver.open(Constant.DEFULT_BROWSE);
    }

    @AfterClass
    public void closeDriver() {
        close(driver);
    }

    public void close(WebDriver driver) {
        Driver.close(driver);
    }
}
