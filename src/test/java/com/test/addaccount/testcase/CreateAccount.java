package com.test.addaccount.testcase;

import com.test.addaccount.common.BaseCase;
import com.test.addaccount.constant.Constant;
import com.test.addaccount.pageobject.*;
import org.testng.annotations.Test;

public class CreateAccount extends BaseCase {
//    public WebDriver driver = null;


    @Test
    public void createAccount() throws InterruptedException {
        // ����UAC��¼ҳ��
        driver.get(Constant.UAC_URL);

        // ��¼
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
        uacAddUserPage.clickAuthor();
        uacAddUserPage.clickToms();
        uacAddUserPage.clickPacs();
        uacAddUserPage.clickSaveAuthor();

        // �л���PAC���û�ҳ��
        driver.get(Constant.PAC_URL);
        UacLoginPage pacLoginPage = new UacLoginPage(driver);
        pacLoginPage.inputLoginName(Constant.DEFAULT_LOGIN_NAME);
        pacLoginPage.inputPassWord(Constant.DEFAULT_PASSWORD);
        pacLoginPage.clickLoginBtn();
        PacsIndexPage pacsIndexPage = new PacsIndexPage(driver);
        pacsIndexPage.clickRole();
        pacsIndexPage.chooseAdmin();
        pacsIndexPage.clickDetermine();
        pacsIndexPage.clickMenu();
        pacsIndexPage.clickSystem();
        pacsIndexPage.clickUserBaseInfoCreate();

        driver.switchTo().frame(1);
        PacUserBaseInfoCreatePage baseInfoCreatePage = new PacUserBaseInfoCreatePage(driver);
        baseInfoCreatePage.inputLoginName(Constant.CREATE_LOGIN_NAME);
        baseInfoCreatePage.inputPassword(Constant.DEFAULT_PASSWORD);
        baseInfoCreatePage.inputUserName(Constant.CREATE_LOGIN_NAME);
        baseInfoCreatePage.inputJobNumber(Constant.CREATE_JOB_NUMBER);
        baseInfoCreatePage.inputEmail(Constant.CREATE_EMAIL);
        baseInfoCreatePage.selectAddOuType("����");
        baseInfoCreatePage.selectOperationUnitId("������̼���");
        baseInfoCreatePage.selectRoleId("Administrator");
        baseInfoCreatePage.clickIsDefault();
        baseInfoCreatePage.clickAddRoleBtn();
        baseInfoCreatePage.clickCreateUserBtn();


    }




}
