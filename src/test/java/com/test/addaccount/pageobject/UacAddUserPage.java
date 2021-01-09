package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import com.test.addaccount.constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UacAddUserPage extends BasePage {

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
    private By tomsUatBy = By.xpath("//*[@id='297,OMS-ECS-UAT,OMS-ECS-UAT,30']//div");
    // 勾选PACS框
    private By pacsTestBy = By.xpath("//*[@id='89,PAC-TEST,PAC-TEST,1000']//div");
    private By pacsUatBy = By.xpath("//*[@id='32,PAC-UAT,PAC-UAT,555']//div");
    // 保存权限按钮
    private By saveAuthorBy = By.id("saveCommonUser");


    public UacAddUserPage(WebDriver driver) {
        super(driver);
    }

    public void inputLoginName(String loginName) {
        input(loginNameBy, loginName);
    }

    public void inputUserName(String userName) {
        input(userNameBy, userName);
    }

    public void inputJobNumber(String jobNumber) {
        input(jobNumberBy, jobNumber);
    }

    public void inputPassword(String password) {
        input(passwordBy, password);
    }

    public void inputRePassword(String rePassword) {
        input(rePasswordBy, rePassword);
    }

    public void inputEmail(String email) {
        input(emailBy, email);
    }

    public void clickSaveBtn() {
        click(saveBtnBy);
    }

    public void clickAuthor() {
        click(authorBy);
    }

    public void clickToms() {
        rollClick(tomsTestBy);
    }

    public void clickTomsUat() {
        rollClick(tomsUatBy);
    }

    public void clickPacs() {
        rollClick(pacsTestBy);
    }

    public void clickPacsUat() {
        rollClick(pacsUatBy);
    }

    public void clickSaveAuthor() {
        click(saveAuthorBy);
    }

}
