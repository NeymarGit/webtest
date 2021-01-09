package com.test.addaccount.testcase;

import com.test.addaccount.constant.Constant;
import com.test.addaccount.pageobject.PacsIndexPage;
import com.test.addaccount.pageobject.PacsUserBaseInfoEditPage;
import com.test.addaccount.pageobject.UacLoginPage;
import org.openqa.selenium.WebDriver;

/**
 * PACS����û�Ȩ��
 */
public class PacAddRole {

    public void addPacRole(WebDriver driver,String environment) throws InterruptedException {
        // ��¼PAC
        if(environment.equalsIgnoreCase("uat")){
            driver.get(Constant.PAC_URL_UAT);
        }else {
            driver.get(Constant.PAC_URL);
        }
        UacLoginPage pacLoginPage = new UacLoginPage(driver);
        pacLoginPage.inputLoginName(Constant.DEFAULT_LOGIN_NAME);
        pacLoginPage.inputPassWord(Constant.DEFAULT_PASSWORD);
        pacLoginPage.clickLoginBtn();
        // �л���adminȨ�ޣ��ҵ��û�������Ϣ-�༭ҳ��
        PacsIndexPage pacsIndexPage = new PacsIndexPage(driver);
        pacsIndexPage.clickRole();
        pacsIndexPage.chooseAdmin();
        pacsIndexPage.clickDetermine();
        Thread.sleep(1000);
        pacsIndexPage.clickMenu();
        pacsIndexPage.clickSystem();
        pacsIndexPage.clickUserBaseInfoEdit();

        driver.switchTo().frame(1);

        // �û�������Ϣ-�༭ҳ��
        PacsUserBaseInfoEditPage pacsEditPage = new PacsUserBaseInfoEditPage(driver);
        pacsEditPage.inputLoginName(Constant.CREATE_LOGIN_NAME);
        pacsEditPage.clickQueryBtn();
        pacsEditPage.clickCheckBox();
        pacsEditPage.clickModifyBtn();
        addRole(pacsEditPage,"����","������̼���","Administrator",true);
        addRole(pacsEditPage,"����","Nike-Global Inline�ٷ��̳�","IT_�ڲ�Ȩ��_����",false);
        // ȷ���޸��û�
        pacsEditPage.clickModifyUserBtn();
    }

    public void addRole(PacsUserBaseInfoEditPage pacsEditPage,String ouType,String ouId,String roleId,Boolean isDefault){

        // ���Ӽ���Ȩ��
        pacsEditPage.selectAddOuType(ouType);
        pacsEditPage.clickOperationUnitId();
        pacsEditPage.inputOperationName(ouId);
        pacsEditPage.clickOperationQuery();
        pacsEditPage.chooseOperation();
        pacsEditPage.clickConfirmOperation();
        pacsEditPage.selectRoleId(roleId);
        if(isDefault){
            pacsEditPage.clickIsDefault();
        }
        pacsEditPage.clickAddRoleBtn();

    }

}
