package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PacUserBaseInfoCreatePage extends BasePage {

    WebDriver driver = null;
    // ��������
    private By loginNameBy = By.id("loginName");

    // ��ʼ����
    private By passwordBy = By.id("password");

    // ��ʵ����
    private By userNameBy = By.id("userName");

    // ����
    private By jobNumberBy = By.id("jobNumber");

    // Email
    private By emailBy = By.id("email");

    // ��֯����
    private By addOuTypeBy = By.id("addOuType");

    // ��֯
    private By OperationUnitIdBy = By.id("OperationUnitId");

    // ��ɫ
    private By roleIdBy = By.xpath("//select[@id='roleId']");

    // ������ɫ��ť
    private By addRoleBtnBy = By.xpath("//*[text()='������ɫ']");

    // �Ƿ�Ĭ�ϵ�ѡ��
    private By isDefaultBy = By.xpath("//*[@name='isDefault']");


    // �����û���ť
    private By createUserBtnBy = By.xpath("//*[text()='�����û�']");




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
