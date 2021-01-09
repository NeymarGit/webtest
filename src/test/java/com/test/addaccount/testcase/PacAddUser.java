package com.test.addaccount.testcase;

import com.test.addaccount.constant.Constant;
import com.test.addaccount.pageobject.PacUserBaseInfoCreatePage;
import com.test.addaccount.pageobject.PacsIndexPage;
import com.test.addaccount.pageobject.UacLoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

/**
 *PACS����û�Ȩ��
 */
public class PacAddUser {

    public void addPacRole(WebDriver driver) throws InterruptedException {
        // ��¼PAC
        driver.get(Constant.PAC_URL);
        UacLoginPage pacLoginPage = new UacLoginPage(driver);
        pacLoginPage.inputLoginName(Constant.DEFAULT_LOGIN_NAME);
        pacLoginPage.inputPassWord(Constant.DEFAULT_PASSWORD);
        pacLoginPage.clickLoginBtn();

        // �л���adminȨ�ޣ��ҵ��û�������Ϣ-����ҳ��
        PacsIndexPage pacsIndexPage = new PacsIndexPage(driver);
        pacsIndexPage.clickRole();
        pacsIndexPage.chooseAdmin();
        pacsIndexPage.clickDetermine();
        pacsIndexPage.clickMenu();
        pacsIndexPage.clickSystem();
        pacsIndexPage.clickUserBaseInfoCreate();

        driver.switchTo().frame(1);

        // �û�������Ϣ-����ҳ��
        PacUserBaseInfoCreatePage baseInfoCreatePage = new PacUserBaseInfoCreatePage(driver);
        baseInfoCreatePage.inputLoginName(Constant.CREATE_LOGIN_NAME);
        baseInfoCreatePage.inputPassword(Constant.DEFAULT_PASSWORD);
        baseInfoCreatePage.inputUserName(Constant.CREATE_LOGIN_NAME);
        baseInfoCreatePage.inputJobNumber(Constant.CREATE_JOB_NUMBER);
        baseInfoCreatePage.inputEmail(Constant.CREATE_EMAIL);
        baseInfoCreatePage.selectAddOuType("����");
        baseInfoCreatePage.selectOperationUnitId("������̼���");
        baseInfoCreatePage.selectRoleId("Administrator");
        baseInfoCreatePage.clickAddRoleBtn();
        baseInfoCreatePage.clickIsDefault();
        baseInfoCreatePage.clickCreateUserBtn();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

}
