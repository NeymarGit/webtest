package com.test.webauto.pageobject;

import com.test.webauto.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PacsIndexPage extends BasePage {

    // �û���Ϣ
    private By userInfoBy = By.id("userinfo");

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

    }

    // �ж�ҳ���û���Ϣ�Ƿ����
    public Boolean userInfoExist() {
        return isDisplay(userInfoBy);
    }

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
