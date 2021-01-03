package com.test.addaccount.testcase;

import com.test.addaccount.common.BaseCase;
import com.test.addaccount.constant.Constant;
import com.test.addaccount.pageobject.AddUserPage;
import com.test.addaccount.pageobject.LoginPage;
import com.test.addaccount.pageobject.UacIndexPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CreateAccount extends BaseCase {
//    public WebDriver driver = null;


    @Test
    public void createAccount() throws InterruptedException {
        // 访问UAC登录页面
        driver.get(Constant.UAC_URL);

        // 登录
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputLoginName();
        loginPage.inputPassWord();
        loginPage.clickLoginBtn();

        // UAC首页
        UacIndexPage uacIndexPage = new UacIndexPage(driver);
        uacIndexPage.clickUserManage();
        uacIndexPage.clickSubUserManage();
        uacIndexPage.clickAddUser();

        // 添加用户页面
        AddUserPage addUserPage = new AddUserPage(driver);
        addUserPage.inputLoginName("Auto1003");
        addUserPage.inputUserName("Auto1003");
        addUserPage.inputJobNumber();
        addUserPage.inputPassword();
        addUserPage.inputRePassword();
        addUserPage.inputEmail("yanghe.liu@baozun.com");
        addUserPage.clickSaveBtn();
        Thread.sleep(1000);
        addUserPage.clickAuthor();
        addUserPage.clickToms();
        addUserPage.clickPacs();
        addUserPage.clickSaveAuthor();


    }




}
