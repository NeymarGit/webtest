package com.test.webauto.pageobject;

import com.test.webauto.Util.Driver;
import com.test.webauto.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PacsIndexPage extends BasePage {

    WebDriver driver = null;
    // �û���Ϣ
    private By userInfoBy = By.id("userinfo");

    // ��ɫȨ����Ϣ
    private By roleInfoBy = By.id("roleinfo");

    // �л�������Ϣ
    private By shopBy = By.id("476896");

    // ȷ�ϰ�ť
    private By determineBy = By.xpath("//span[text()='ȷ��']");

    // ���˵�
    private By menuBy = By.xpath("//*[@class='content content-closed']");

    // ��������
    private By soManageBy = By.xpath("//a[@acode='��������']");

    // ���¶���-����
    private By createSoInitBy = By.xpath("//div[@class='ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active']/ul/li[1]/a");


    // �˳���¼
    private By exitBy = By.id("exit");


    public PacsIndexPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // �ж�ҳ���û���Ϣ�Ƿ����
    public Boolean userInfoExist() {
        return isDisplay(userInfoBy);
    }

    // �л�Ȩ��
    public void clickRole(){
        click(roleInfoBy);
    }

    //ѡ�����
    public void chooseShop(){
        click(shopBy);

    }

    // ���ȷ��
    public void clickDetermine(){
        click(determineBy);
    }

    // �����ҳ���˵�
    public void clickMenu() {
        click(menuBy);
    }

    // �����������
    public void clickSoManage() {
        click(soManageBy);
    }

    // ������¶�������
    public void clickCreateSo() {
        click(createSoInitBy);
    }

    // �˳���¼
    public void clickExit() {
        click(exitBy);
    }

}
