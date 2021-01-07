package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * TOMS��ҳ
 */
public class TomsIndexPage extends BasePage {

    WebDriver driver = null;
    // �û���Ϣ
    private By userInfoBy = By.id("userinfo");

    // ��ɫȨ����Ϣ
    private By roleInfoBy = By.id("roleinfo");

    // �л���adminȨ��
    private By shopBy = By.xpath("//td[text()='Administrator']");

    // ȷ�ϰ�ť
    private By determineBy = By.xpath("//span[text()='ȷ��']");

    // ���˵�
    private By menuBy = By.xpath("//*[@class='content content-closed']");

    // ϵͳ�˵�
    private By systemBy = By.xpath("//a[@acode='ϵͳ']");

    // �û�������Ϣ-�༭
    private By userBaseInfoEditBy = By.xpath("//*[@id='ui-accordion-left-menu-panel-0']/ul/li[3]");


    // �˳���¼
    private By exitBy = By.id("exit");


    public TomsIndexPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // �ж�ҳ���û���Ϣ�Ƿ����
    public Boolean userInfoExist() {
        return isDisplay(userInfoBy);
    }

    // �л�Ȩ��
    public void clickRole() {
        click(roleInfoBy);
    }

    //ѡ�����
    public void chooseAdmin() {
        rollClick(shopBy);
    }

    // ���ȷ��
    public void clickDetermine() {
        click(determineBy);
    }

    // �����ҳ���˵�
    public void clickMenu() {
        click(menuBy);
    }

    // ���ϵͳ�˵�
    public void clickSystem() {
        click(systemBy);
    }

    // ����û�������Ϣ-����
    public void clickUserBaseInfoEdit() {
        click(userBaseInfoEditBy);
    }

    // �˳���¼
    public void clickExit() {
        click(exitBy);
    }

}