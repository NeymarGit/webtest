package com.test.webauto.pageobject;

import com.test.webauto.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PacsIndexPage extends BasePage {

    // 用户信息
    private By userInfoBy = By.id("userinfo");

    // 左侧菜单
    private By menuBy = By.xpath("//*[@class='content content-closed']");

    // 订单管理
    private By soManageBy = By.xpath("//a[@acode='订单管理']");

    // 线下订单-创建
    private By createSoInitBy = By.xpath("//div[@class='ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active']/ul/li[1]/a");


    // 退出登录
    private By exitBy = By.id("exit");


    public PacsIndexPage(WebDriver driver) {
        super(driver);

    }

    // 判断页面用户信息是否存在
    public Boolean userInfoExist() {
        return isDisplay(userInfoBy);
    }

    public void clickMenu() {
        click(menuBy);
    }

    // 点击订单管理
    public void clickSoManage() {
        click(soManageBy);
    }

    // 点击线下订单创建
    public void clickCreateSo() {
        click(createSoInitBy);
    }

    // 退出登录
    public void clickExit() {
        click(exitBy);
    }

}
