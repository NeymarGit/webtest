package com.test.webauto.common;

import com.test.webauto.Util.Driver;
import org.openqa.selenium.WebDriver;

public class BaseCase {


    public void close(WebDriver driver) {
        Driver.close(driver);
    }
}
