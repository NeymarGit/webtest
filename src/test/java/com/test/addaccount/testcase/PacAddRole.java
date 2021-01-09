package com.test.addaccount.testcase;

import com.test.addaccount.constant.Constant;
import com.test.addaccount.pageobject.PacsIndexPage;
import com.test.addaccount.pageobject.PacsUserBaseInfoEditPage;
import com.test.addaccount.pageobject.UacLoginPage;
import org.openqa.selenium.WebDriver;

/**
 * PACS添加用户权限
 */
public class PacAddRole {

    public void addPacRole(WebDriver driver,String environment) throws InterruptedException {
        // 登录PAC
        if(environment.equalsIgnoreCase("uat")){
            driver.get(Constant.PAC_URL_UAT);
        }else {
            driver.get(Constant.PAC_URL);
        }
        UacLoginPage pacLoginPage = new UacLoginPage(driver);
        pacLoginPage.inputLoginName(Constant.DEFAULT_LOGIN_NAME);
        pacLoginPage.inputPassWord(Constant.DEFAULT_PASSWORD);
        pacLoginPage.clickLoginBtn();
        // 切换到admin权限，找到用户基本信息-编辑页面
        PacsIndexPage pacsIndexPage = new PacsIndexPage(driver);
        pacsIndexPage.clickRole();
        pacsIndexPage.chooseAdmin();
        pacsIndexPage.clickDetermine();
        Thread.sleep(1000);
        pacsIndexPage.clickMenu();
        pacsIndexPage.clickSystem();
        pacsIndexPage.clickUserBaseInfoEdit();

        driver.switchTo().frame(1);

        // 用户基本信息-编辑页面
        PacsUserBaseInfoEditPage pacsEditPage = new PacsUserBaseInfoEditPage(driver);
        pacsEditPage.inputLoginName(Constant.CREATE_LOGIN_NAME);
        pacsEditPage.clickQueryBtn();
        pacsEditPage.clickCheckBox();
        pacsEditPage.clickModifyBtn();
        addRole(pacsEditPage,"集团","宝尊电商集团","Administrator",true);
        addRole(pacsEditPage,"店铺","Nike-Global Inline官方商城","IT_内部权限_店铺",false);
        // 确认修改用户
        pacsEditPage.clickModifyUserBtn();
    }

    public void addRole(PacsUserBaseInfoEditPage pacsEditPage,String ouType,String ouId,String roleId,Boolean isDefault){

        // 增加集团权限
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
