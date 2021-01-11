package com.test.addaccount.testcase;

import com.test.addaccount.constant.Constant;
import com.test.addaccount.pageobject.*;
import com.test.addaccount.util.Driver;
import org.openqa.selenium.WebDriver;

/**
 * TOMS����û�Ȩ��
 */
public class TomsAddRole {

    public void addTomsRole(WebDriver driver, String environment) throws InterruptedException {
        // ��¼TOMS
        if (environment.equalsIgnoreCase("uat")) {
            driver.get(Constant.TOMS_URL_UAT);
        } else {
            driver.get(Constant.TOMS_URL);
        }
        UacLoginPage tomsLoginPage = new UacLoginPage(driver);
        tomsLoginPage.inputLoginName(Constant.DEFAULT_LOGIN_NAME);
        tomsLoginPage.inputPassWord(Constant.DEFAULT_PASSWORD);
        tomsLoginPage.clickLoginBtn();

        // �л���adminȨ���ҵ��û�������Ϣ-�༭ҳ��
        TomsIndexPage tomsIndexPage = new TomsIndexPage(driver);
        tomsIndexPage.clickRole();
        tomsIndexPage.chooseAdmin();
        tomsIndexPage.clickDetermine();
        tomsIndexPage.clickMenu();
//        tomsIndexPage.clickSystem();
        tomsIndexPage.clickUserBaseInfoEdit();

        driver.switchTo().frame(0);

        // ���Ȩ��
        TomsUserBaseInfoEditPage tomsEdit = new TomsUserBaseInfoEditPage(driver);
        tomsEdit.inputLoginName(Constant.CREATE_LOGIN_NAME);
        Thread.sleep(1000);
        tomsEdit.clickQueryBtn();
        tomsEdit.chooseUser();
        tomsEdit.clickModifyBtn();
        addRole(tomsEdit, "����", "�������", "Administrator", true);
        addRole(tomsEdit, "����", "nike�ٷ��콢��", "�곤", false);
        tomsEdit.clickModifyUserBtn();
    }

    public void addRole(TomsUserBaseInfoEditPage tomsEdit, String ouType, String ouId, String roleId, Boolean isDefault) throws InterruptedException {

        tomsEdit.selectAddOuType(ouType);
        Thread.sleep(1000);
        tomsEdit.selectOperationUnitId(ouId);
        tomsEdit.selectRoleId(roleId);
        if (isDefault) {
            tomsEdit.clickIsDefault();
        }
        tomsEdit.clickAddRoleBtn();
    }

}
