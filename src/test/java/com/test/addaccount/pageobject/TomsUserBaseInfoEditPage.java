package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * TOMS�û�������Ϣ-�༭ҳ��
 */
public class TomsUserBaseInfoEditPage extends BasePage {

    WebDriver driver = null;
    // ��������
    private By loginNameBy = By.id("loginName");

    // ��ѯ��ť
    private By queryBtnBy = By.id("create");

    // ѡ���û�
    private By chooseUserBy = By.id("tbl-userlist");

    // �޸İ�ť
    private By modifyBy = By.id("modifyUser");


    // ��֯����
    private By addOuTypeBy = By.id("addOuType");

    // ��֯
    private By OperationUnitIdBy = By.id("OperationUnitId");

    // ��ɫ
    private By roleIdBy = By.xpath("//select[@id='roleId']");

    // ������ɫ��ť
    private By addRoleBtnBy = By.xpath("//*[text()='������ɫ']");

    // �Ƿ�Ĭ�ϵ�ѡ��
    private By isDefaultBy = By.id("isDefinexxx");


    // �޸��û���ť
    private By modifyUserBy = By.xpath("//*[text()='�޸��û�']");




    public TomsUserBaseInfoEditPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void inputLoginName(String name){
        input(loginNameBy,name);
    }

    public void clickQueryBtn(){
        click(queryBtnBy);
    }
    public void chooseUser(){
        click(chooseUserBy);
    }
    public void clickModifyBtn(){
        click(modifyBy);
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

    public void clickModifyUserBtn(){
        click(modifyUserBy);
    }

}
