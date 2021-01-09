package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * PACS�û�������Ϣ-�༭ҳ��
 */
public class PacsUserBaseInfoEditPage extends BasePage {

    WebDriver driver = null;
    // ��������
    private By loginNameBy = By.id("loginName");

    // ��ѯ��ť
    private By queryBtnBy = By.id("create");

    // ѡ���û�
    private By checkBoxBy = By.id("tbl-userlist");

    // �޸İ�ť
    private By modifyBy = By.id("modifyUser");


    // ��֯����
    private By addOuTypeBy = By.id("addOuType");

    // ��֯
    private By OperationUnitIdBy = By.id("OperationUnitName");
    // ��֯����
    private By operationNameBy = By.name("shop.ouName");
    // ��֯��ѯ��ť
    private By operationQueryBy = By.id("btnShopQuery");
    // ѡ����֯
    private By chooseOperationBy = By.id("tbl_shop_query_dialog");
    // ȷ����֯��ť
    private By confirmOperationBy = By.id("btnShopQueryConfirm");


    // ��ɫ
    private By roleIdBy = By.xpath("//select[@id='roleId']");

    // ������ɫ��ť
    private By addRoleBtnBy = By.xpath("//*[text()='������ɫ']");

    // �Ƿ�Ĭ�ϵ�ѡ��
    private By isDefaultBy = By.id("isDefinexxx");


    // �޸��û���ť
    private By modifyUserBy = By.xpath("//*[text()='�޸��û�']");


    public PacsUserBaseInfoEditPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void inputLoginName(String name) {
        input(loginNameBy, name);
    }

    public void clickQueryBtn() {
        click(queryBtnBy);
    }

    public void clickCheckBox() {
        click(checkBoxBy);
    }

    public void clickModifyBtn() {
        click(modifyBy);
    }

    public void selectAddOuType(String addOuType) {
        select(addOuTypeBy, addOuType);
    }

    public void clickOperationUnitId() {
        click(OperationUnitIdBy);
    }

    public void inputOperationName(String OperationName) {
        input(operationNameBy, OperationName);
    }

    public void clickOperationQuery() {
        click(operationQueryBy);
    }

    public void chooseOperation() {
        click(chooseOperationBy);
    }

    public void clickConfirmOperation() {
        click(confirmOperationBy);
    }

    public void selectRoleId(String roleId) {
        select(roleIdBy, roleId);
    }

    public void clickAddRoleBtn() {
        click(addRoleBtnBy);
    }

    public void clickIsDefault() {
        click(isDefaultBy);
    }

    public void clickModifyUserBtn() {
        click(modifyUserBy);
    }

}
