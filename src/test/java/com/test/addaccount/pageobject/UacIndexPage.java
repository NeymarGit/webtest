package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UacIndexPage extends BasePage {

    // �û�����
    private By userManageBy = By.xpath("//span[text()='�����������']/../../../..");

    // ���û�����
    private By subUserManageBy = By.xpath("//span[text()='�����������']/../../preceding-sibling::li");

    // ������¼��
    private By quryLoginNameBy = By.name("q_string_loginName");

    // ������ť
    private By searchBtnBy = By.name("searchBtn");

    // �û��༭������
    private By caretBy = By.xpath("//span[@class='caret']");

    // ������༭ѡ��
    private By editBy = By.xpath("//i[@class='fa icon-edit']");

    // ����û�
    private By addUserBy = By.xpath("//*[@class='btn btn-success']");


    public UacIndexPage(WebDriver driver) {
        super(driver);
    }

    public void clickUserManage(){
        click(userManageBy);
    }

    public void clickSubUserManage(){
        click(subUserManageBy);
    }

    public void inputLoginName(String loginName){
        input(quryLoginNameBy,loginName);
    }

    public void clickSearchBtn(){
        click(searchBtnBy);
    }

    public Boolean isExist(){
        return isDisplay(caretBy);
    }

    public void clickCaret(){
        click(caretBy);
    }

    public void clickEdit(){
        click(editBy);
    }

    public void clickAddUser(){
        click(addUserBy);
    }

}
