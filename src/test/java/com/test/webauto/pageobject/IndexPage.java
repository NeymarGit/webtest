package com.test.webauto.pageobject;

import com.test.webauto.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 登录后的首页
 */
public class IndexPage extends BasePage {

    // Jenkins图片
    private By imgBy = By.id("jenkins-name-icon");
    // 构建按钮
    private By buildBy = By.xpath("//img[@class='icon-clock icon-md']");
    // 上次成功时间
    private By lastSucessBy = By.xpath("//*[text()='TOMS']/parent::*/following-sibling::td[1]");
    // 注销按钮
    private By logOutBy = By.xpath("//*[text()='注销']//parent::a");


    public IndexPage(WebDriver driver) {
        super(driver);
    }

    // Jenkins图标是否出现，验证是否登录成功
    public Boolean jenkinsImgExist() {
        return isDisplay(imgBy);
    }

    // 点击构建
    public void clickBuild(){
        click(buildBy);
    }

    // 刷新页面
    public void driverRefresh(){
        driver.navigate().refresh();
    }

    // 获取上次成功时间
    public String getLastSuccessTime(){
        String sucessTime = getText(lastSucessBy);
        // 截取有用的时间
        return sucessTime.substring(0,sucessTime.indexOf("-")-1);
    }

    // 点击注销
    public void logOut(){
        click(logOutBy);
    }

}
