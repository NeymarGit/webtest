package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UacIndexPage extends BasePage {

    // 用户管理
    private By userManageBy = By.xpath("//span[text()='密码规则设置']/../../../..");

    // 子用户管理
    private By subUserManageBy = By.xpath("//span[text()='密码规则设置']/../../preceding-sibling::li");

    // 搜索登录名
    private By quryLoginNameBy = By.name("q_string_loginName");

    // 搜索按钮
    private By searchBtnBy = By.name("searchBtn");

    // 用户编辑下拉框
    private By caretBy = By.xpath("//span[@class='caret']");

    // 下拉框编辑选项
    private By editBy = By.xpath("//i[@class='fa icon-edit']");

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
