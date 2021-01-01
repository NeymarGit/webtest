package com.test.webauto.pageobject;

import com.test.webauto.Util.Driver;
import com.test.webauto.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PacsIndexPage extends BasePage {

    WebDriver driver = null;
    // 用户信息
    private By userInfoBy = By.id("userinfo");

    // 角色权限信息
    private By roleInfoBy = By.id("roleinfo");

    // 切换店铺信息
    private By shopBy = By.id("476896");

    // 确认按钮
    private By determineBy = By.xpath("//span[text()='确定']");

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
        this.driver = driver;
    }

    // 判断页面用户信息是否存在
    public Boolean userInfoExist() {
        return isDisplay(userInfoBy);
    }

    // 切换权限
    public void clickRole(){
        click(roleInfoBy);
    }

    //选择店铺
    public void chooseShop(){
        click(shopBy);

    }

    // 点击确认
    public void clickDetermine(){
        click(determineBy);
    }

    // 点击首页左侧菜单
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
