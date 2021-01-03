package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import com.test.addaccount.constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * ƽ̨������Ի�����¼ҳ
 */
public class LoginPage extends BasePage {

    // �˺�
    private By loginBy = By.id("loginid");
    // ����
    private By passWordBy = By.id("userpassword");
    // ��¼��ť
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
