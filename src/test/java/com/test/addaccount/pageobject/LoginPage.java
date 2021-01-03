package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import com.test.addaccount.constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 平台管理测试环境登录页
 */
public class LoginPage extends BasePage {

    // 账号
    private By loginBy = By.id("loginid");
    // 密码
    private By passWordBy = By.id("userpassword");
    // 登录按钮
    private By loginBtnBy = By.id("for_login_sunbmit");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputLoginName(){
        input(loginBy, Constant.LOGIN_NAME);
    }
    public void inputPassWord(){
        input(passWordBy, Constant.PASSWORD);
    }

    public void clickLoginBtn(){
        click(loginBtnBy);
    }

}
