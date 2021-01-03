package com.test.addaccount.testcase;

import com.test.addaccount.common.BaseCase;
import com.test.addaccount.constant.Constant;
import com.test.addaccount.pageobject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CreateAccount extends BaseCase {
//    public WebDriver driver = null;


    @Test
    public void createAccount(){
        // ·ÃÎÊUACµÇÂ¼Ò³Ãæ
        driver.get(Constant.UAC_URL);

        // µÇÂ¼
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputLoginName();
        loginPage.inputPassWord();
        loginPage.clickLoginBtn();

    }




}
