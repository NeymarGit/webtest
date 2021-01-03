package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import com.test.addaccount.constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.PanelUI;

public class AddUserPage extends BasePage {

    // 登录名
    private By loginNameBy = By.id("loginName");
    // 用户姓名
    private By userNameBy = By.id("userName");
    // 员工工号
    private By jobNumberBy = By.id("jobNumber");
    // 密码
    private By passwordBy = By.id("password");
    // 确认密码
    private By rePasswordBy = By.id("repassword");
    // 邮箱
    private By emailBy = By.id("email");
    // 保存按钮
    private By saveBtnBy = By.id("saveCommonUserAndApp");

    // 新增应用权限
    private By authorBy = By.xpath("//*[@class='btn btn-success btn-sm']");
    // 勾选TOMS框
    private By tomsTestBy = By.xpath("//*[@id='86,OMS-TEST,OMS-TEST,1']//div");
    // 勾选PACS框
    private By pacsTestBy = By.xpath("//*[@id='89,PAC-TEST,PAC-TEST,1000']//div");
    // 保存权限按钮
    private By saveAuthorBy = By.id("saveCommonUser");



    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    public void inputLoginName(String loginName){
        input(loginNameBy,loginName);
    }
    public void inputUserName(String userName){
        input(userNameBy,userName);
    }
    public void inputJobNumber(){
        input(jobNumberBy,"5208");
    }

    public void inputPassword(){
        input(passwordBy, Constant.PASSWORD);
    }

    public void inputRePassword(){
        input(rePasswordBy,Constant.PASSWORD);
    }

    public void inputEmail(String email){
        input(emailBy,email);
    }

    public void clickSaveBtn(){
        click(saveBtnBy);
    }

    public void clickAuthor(){
        click(authorBy);
    }

    public void clickToms() {
        rollClick(tomsTestBy);
    }

    public void clickPacs(){
        rollClick(pacsTestBy);
    }

    public void clickSaveAuthor(){
        click(saveAuthorBy);
    }

}
