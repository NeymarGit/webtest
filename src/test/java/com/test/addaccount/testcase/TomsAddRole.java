package com.test.addaccount.testcase;

import com.test.addaccount.constant.Constant;
import com.test.addaccount.pageobject.*;
import com.test.addaccount.util.Driver;
import org.openqa.selenium.WebDriver;

/**
 *PACS添加用户权限
 */
public class TomsAddRole {

    public void addTomsRole(WebDriver driver) throws InterruptedException {
        // 登录TOMS
        driver.get(Constant.TOMS_URL);
        UacLoginPage tomsLoginPage = new UacLoginPage(driver);
        tomsLoginPage.inputLoginName(Constant.DEFAULT_LOGIN_NAME);
        tomsLoginPage.inputPassWord(Constant.DEFAULT_PASSWORD);
        tomsLoginPage.clickLoginBtn();

        // 切换到admin权限找到用户基本信息-编辑页面
        TomsIndexPage tomsIndexPage = new TomsIndexPage(driver);
        tomsIndexPage.clickRole();
        tomsIndexPage.chooseAdmin();
        tomsIndexPage.clickDetermine();
        tomsIndexPage.clickMenu();
//        tomsIndexPage.clickSystem();
        tomsIndexPage.clickUserBaseInfoEdit();

        driver.switchTo().frame(0);

        // 添加权限
        TomsUserBaseInfoEditPage tomsEdit = new TomsUserBaseInfoEditPage(driver);
        tomsEdit.inputLoginName(Constant.CREATE_LOGIN_NAME);
        tomsEdit.clickQueryBtn();
        tomsEdit.chooseUser();
        tomsEdit.clickModifyBtn();
        addRole(tomsEdit,"集团","宝尊电商","Administrator",true);
        addRole(tomsEdit,"店铺","nike官方旗舰店","店长",false);
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
