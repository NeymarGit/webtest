package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UacIndexPage extends BasePage {

    // �û�����
    private By userManageBy = By.xpath("//span[text()='�����������']/../../../..");

    // ���û�����
    private By subUserManageBy = By.xpath("//span[text()='�����������']/../../preceding-sibling::li");

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

    public void clickAddUser(){
        click(addUserBy);
    }

}
