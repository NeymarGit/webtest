package com.test.addaccount.testcase;

import com.test.addaccount.constant.Constant;
import com.test.addaccount.pageobject.*;
import org.openqa.selenium.WebDriver;

/**
 *PACS����û�Ȩ��
 */
public class UacAddUser {

    public void addUacUser(WebDriver driver) throws InterruptedException {
        // ��¼UAC
        driver.get(Constant.UAC_URL);
        UacLoginPage uacLoginPage = new UacLoginPage(driver);
        uacLoginPage.inputLoginName(Constant.DEFAULT_LOGIN_NAME);
        uacLoginPage.inputPassWord(Constant.DEFAULT_PASSWORD);
        uacLoginPage.clickLoginBtn();

        // UAC��ҳ
        UacIndexPage uacIndexPage = new UacIndexPage(driver);
        uacIndexPage.clickUserManage();
        uacIndexPage.clickSubUserManage();
        uacIndexPage.clickAddUser();

        // ����û�ҳ��
        UacAddUserPage uacAddUserPage = new UacAddUserPage(driver);
        uacAddUserPage.inputLoginName(Constant.CREATE_LOGIN_NAME);
        uacAddUserPage.inputUserName(Constant.CREATE_LOGIN_NAME);
        uacAddUserPage.inputJobNumber(Constant.CREATE_JOB_NUMBER);
        uacAddUserPage.inputPassword(Constant.DEFAULT_PASSWORD);
        uacAddUserPage.inputRePassword(Constant.DEFAULT_PASSWORD);
        uacAddUserPage.inputEmail(Constant.CREATE_EMAIL);
        uacAddUserPage.clickSaveBtn();
        Thread.sleep(1000);

        // ���Ӧ��Ȩ��
        uacAddUserPage.clickAuthor();
        uacAddUserPage.clickToms();
        uacAddUserPage.clickPacs();
        uacAddUserPage.clickSaveAuthor();
    }

}
