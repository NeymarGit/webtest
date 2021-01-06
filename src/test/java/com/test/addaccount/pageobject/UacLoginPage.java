package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 登录页面的对象
 */

public class UacLoginPage extends BasePage {

    // 页面元素
    // 用户名
    private By loginNameBy = By.id("loginid");
    // 密码
    private By passWordBy = By.id("userpassword");
    // 登录按钮
    private By loginBtnBy = By.id("login");
    // 错误信息
    private By errorMsgBy = By.xpath("//span[@id='for_account_pass_error']");


    // 构造方法传入driver
    public UacLoginPage(WebDriver driver){
        super(driver);
    }

    // 输入用户名
    public void inputLoginName(String name){
        input(loginNameBy,name);
    }

    //输入密码
    public void inputPassWord(String password){
        input(passWordBy,password);
    }

    // 点击登录按钮
    public void clickLoginBtn(){
        click(loginBtnBy);
    }

    // 获取登录错误提示
    public String getErrorMsg(){
        return getText(errorMsgBy);
    }


}
