package com.test.addaccount.testcase;

import com.test.addaccount.constant.Constant;
import com.test.addaccount.pageobject.*;
import org.openqa.selenium.WebDriver;

/**
 * UAC添加用户权限
 */
public class UacAddUser {

    public void addUacUser(WebDriver driver,String environment) throws InterruptedException {
        // 登录UAC
        if(environment.equalsIgnoreCase("uat")){
            driver.get(Constant.UAC_URL_UAT);
        }else {
            driver.get(Constant.UAC_URL);
        }
        UacLoginPage uacLoginPage = new UacLoginPage(driver);
        uacLoginPage.inputLoginName(Constant.DEFAULT_LOGIN_NAME);
        uacLoginPage.inputPassWord(Constant.DEFAULT_PASSWORD);
        uacLoginPage.clickLoginBtn();

        // UAC首页
        UacIndexPage uacIndexPage = new UacIndexPage(driver);
        uacIndexPage.clickUserManage();
        uacIndexPage.clickSubUserManage();
        uacIndexPage.clickAddUser();

        // 添加用户页面
        UacAddUserPage uacAddUserPage = new UacAddUserPage(driver);
        uacAddUserPage.inputLoginName(Constant.CREATE_LOGIN_NAME);
        uacAddUserPage.inputUserName(Constant.CREATE_LOGIN_NAME);
        uacAddUserPage.inputJobNumber(Constant.CREATE_JOB_NUMBER);
        uacAddUserPage.inputPassword(Constant.DEFAULT_PASSWORD);
        uacAddUserPage.inputRePassword(Constant.DEFAULT_PASSWORD);
        uacAddUserPage.inputEmail(Constant.CREATE_EMAIL);
        uacAddUserPage.clickSaveBtn();
        Thread.sleep(1000);

        // 添加应用权限
        uacAddUserPage.clickAuthor();
        if(environment.equalsIgnoreCase("uat")){
            uacAddUserPage.clickTomsUat();
            uacAddUserPage.clickPacsUat();
        }else {
            uacAddUserPage.clickToms();
            uacAddUserPage.clickPacs();
        }

        uacAddUserPage.clickSaveAuthor();
    }

}
