package com.test.addaccount.testcase;

import com.test.addaccount.constant.Constant;
import com.test.addaccount.pageobject.*;
import com.test.addaccount.util.Driver;
import org.openqa.selenium.WebDriver;

/**
 *PACS����û�Ȩ��
 */
public class TomsAddRole {

    public void addTomsRole(WebDriver driver) throws InterruptedException {
        // ��¼TOMS
        driver.get(Constant.TOMS_URL);
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
        tomsEdit.clickQueryBtn();
        tomsEdit.chooseUser();
        tomsEdit.clickModifyBtn();
        addRole(tomsEdit,"����","�������","Administrator",true);
        addRole(tomsEdit,"����","nike�ٷ��콢��","�곤",false);
        tomsEdit.clickModifyUserBtn();
    }

    public void addRole(TomsUserBaseInfoEditPage tomsEdit,String ouType,String ouId,String roleId,Boolean isDefault){

        tomsEdit.selectAddOuType(ouType);
        tomsEdit.selectOperationUnitId(ouId);
        tomsEdit.selectRoleId(roleId);
        if(isDefault){
            tomsEdit.clickIsDefault();
        }
        tomsEdit.clickAddRoleBtn();
    }

}
