package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import com.test.addaccount.constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UacAddUserPage extends BasePage {

    // ��¼��
    private By loginNameBy = By.id("loginName");
    // �û�����
    private By userNameBy = By.id("userName");
    // Ա������
    private By jobNumberBy = By.id("jobNumber");
    // ����
    private By passwordBy = By.id("password");
    // ȷ������
    private By rePasswordBy = By.id("repassword");
    // ����
    private By emailBy = By.id("email");
    // ���水ť
    private By saveBtnBy = By.id("saveCommonUserAndApp");

    // ����Ӧ��Ȩ��
    private By authorBy = By.xpath("//*[@class='btn btn-success btn-sm']");
    // ��ѡTOMS��
    private By tomsTestBy = By.xpath("//*[@id='86,OMS-TEST,OMS-TEST,1']//div");
    private By tomsUatBy = By.xpath("//*[@id='297,OMS-ECS-UAT,OMS-ECS-UAT,30']//div");
    // ��ѡPACS��
    private By pacsTestBy = By.xpath("//*[@id='89,PAC-TEST,PAC-TEST,1000']//div");
    private By pacsUatBy = By.xpath("//*[@id='32,PAC-UAT,PAC-UAT,555']//div");
    // ����Ȩ�ް�ť
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
