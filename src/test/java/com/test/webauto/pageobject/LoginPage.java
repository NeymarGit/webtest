package com.test.webauto.pageobject;

import com.test.webauto.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * ��¼ҳ��Ķ���
 */

public class LoginPage extends BasePage {

    // ҳ��Ԫ��
    // �û���
    private By loginNameBy = By.id("loginid");
    // ����
    private By passWordBy = By.id("userpassword");
    // ��¼��ť
    private By loginBtnBy = By.id("login");
    // ������Ϣ
    private By errorMsgBy = By.xpath("//span[@id='for_account_pass_error']");


    // ���췽������driver
    public LoginPage(WebDriver driver){
        super(driver);
    }

    // �����û���
    public void inputLoginName(String name){
        input(loginNameBy,name);
    }

    //��������
    public void inputPwd(String password){
        input(passWordBy,password);
    }

    // �����¼��ť
    public void clickLoginBtn(){
        click(loginBtnBy);
    }

    // ��ȡ��¼������ʾ
    public String getErrorMsg(){
        return getText(errorMsgBy);
    }


}
