package com.test.webauto.common;

import com.test.webauto.Util.Driver;
import com.test.webauto.constant.Constant;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseCase {
    WebDriver driver;

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
