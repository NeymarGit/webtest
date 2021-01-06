package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PacUserBaseInfoCreatePage extends BasePage {

    WebDriver driver = null;
    // 登入名称
    private By loginNameBy = By.id("loginName");

    // 初始密码
    private By passwordBy = By.id("password");

    // 真实姓名
    private By userNameBy = By.id("userName");

    // 工号
    private By jobNumberBy = By.id("jobNumber");

    // Email
    private By emailBy = By.id("email");

    // 组织类型
    private By addOuTypeBy = By.id("addOuType");

    // 组织
    private By OperationUnitIdBy = By.id("OperationUnitId");

    // 角色
    private By roleIdBy = By.xpath("//select[@id='roleId']");

    // 新增角色按钮
    private By addRoleBtnBy = By.xpath("//*[text()='新增角色']");

    // 是否默认单选框
    private By isDefaultBy = By.xpath("//*[@name='isDefault']");


    // 创建用户按钮
    private By createUserBtnBy = By.xpath("//*[text()='创建用户']");




    public PacUserBaseInfoCreatePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void inputLoginName(String name){
        input(loginNameBy,name);
    }

    public void inputPassword(String password){
        input(passwordBy,password);
    }
    public void inputUserName(String userName){
        input(userNameBy,userName);
    }
    public void inputJobNumber(String jobNumber){
        input(jobNumberBy,jobNumber);
    }
    public void inputEmail(String email){
        input(emailBy,email);
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

    public void clickCreateUserBtn(){
        click(createUserBtnBy);
    }

}
