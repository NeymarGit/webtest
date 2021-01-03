package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UacIndexPage extends BasePage {

    // �û�����
    private By userManageBy = By.xpath("//*[@id='sidebar-menu']/ul/li[5]");

    // ���û�����
    private By subUserManageBy = By.xpath("//*[@id='sidebar-menu']/ul/li[5]/ul/li[1]/a");

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
