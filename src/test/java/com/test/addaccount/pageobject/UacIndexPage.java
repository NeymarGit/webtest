package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UacIndexPage extends BasePage {

    // 用户管理
    private By userManageBy = By.xpath("//span[text()='密码规则设置']/../../../..");

    // 子用户管理
    private By subUserManageBy = By.xpath("//span[text()='密码规则设置']/../../preceding-sibling::li");

    // 添加用户
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
