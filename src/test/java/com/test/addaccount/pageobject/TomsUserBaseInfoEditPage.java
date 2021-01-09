package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * TOMS用户基本信息-编辑页面
 */
public class TomsUserBaseInfoEditPage extends BasePage {

    WebDriver driver = null;
    // 登入名称
    private By loginNameBy = By.id("loginName");

    // 查询按钮
    private By queryBtnBy = By.id("create");

    // 选择用户
    private By chooseUserBy = By.id("tbl-userlist");

    // 修改按钮
    private By modifyBy = By.id("modifyUser");


    // 组织类型
    private By addOuTypeBy = By.id("addOuType");

    // 组织
    private By OperationUnitIdBy = By.id("OperationUnitId");

    // 角色
    private By roleIdBy = By.xpath("//select[@id='roleId']");

    // 新增角色按钮
    private By addRoleBtnBy = By.xpath("//*[text()='新增角色']");

    // 是否默认单选框
    private By isDefaultBy = By.id("isDefinexxx");


    // 修改用户按钮
    private By modifyUserBy = By.xpath("//*[text()='修改用户']");




    public TomsUserBaseInfoEditPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void inputLoginName(String name){
        input(loginNameBy,name);
    }

    public void clickQueryBtn(){
        click(queryBtnBy);
    }
    public void chooseUser(){
        click(chooseUserBy);
    }
    public void clickModifyBtn(){
        click(modifyBy);
    }

    public void selectAddOuType(String addOuType){
        select(addOuTypeBy,addOuType);
    }
    public void selectOperationUnitId(String OperationUnitId){
        select(OperationUnitIdBy,OperationUnitId);
    }
    public void selectRoleId(String roleId){
        select(roleIdBy,roleId);
    }
    public void clickAddRoleBtn(){
        click(addRoleBtnBy);
    }

    public void clickIsDefault(){
        click(isDefaultBy);
    }

    public void clickModifyUserBtn(){
        click(modifyUserBy);
    }

}
