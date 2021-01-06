package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PacsIndexPage extends BasePage {

    WebDriver driver = null;
    // 用户信息
    private By userInfoBy = By.id("userinfo");

    // 角色权限信息
    private By roleInfoBy = By.id("roleinfo");

    // 切换到admin权限
    private By shopBy = By.xpath("//td[text()='Administrator']");

    // 确认按钮
    private By determineBy = By.xpath("//span[text()='确定']");

    // 左侧菜单
    private By menuBy = By.xpath("//*[@class='content content-closed']/../..");

    // 系统菜单
    private By systemBy = By.xpath("//a[@acode='系统']");

    // 用户基本信息-创建
    private By userBaseInfoCreateBy = By.xpath("//*[@id='left-menu']/div[2]/ul/li[2]/a");


    // 退出登录
    private By exitBy = By.id("exit");


    public PacsIndexPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // 判断页面用户信息是否存在
    public Boolean userInfoExist() {
        return isDisplay(userInfoBy);
    }

    // 切换权限
    public void clickRole() {
        click(roleInfoBy);
    }

    //选择店铺
    public void chooseAdmin() {
        rollClick(shopBy);
    }

    // 点击确认
    public void clickDetermine() {
        click(determineBy);
    }

    // 点击首页左侧菜单
    public void clickMenu() {
        click(menuBy);
    }

    // 点击系统菜单
    public void clickSystem() {
        click(systemBy);
    }

    // 点击用户基本信息-创建
    public void clickUserBaseInfoCreate() {
        click(userBaseInfoCreateBy);
    }

    // 退出登录
    public void clickExit() {
        click(exitBy);
    }

}
