package com.test.addaccount.pageobject;

import com.test.addaccount.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * PACS用户基本信息-编辑页面
 */
public class PacsUserBaseInfoEditPage extends BasePage {

    WebDriver driver = null;
    // 登入名称
    private By loginNameBy = By.id("loginName");

    // 查询按钮
    private By queryBtnBy = By.id("create");

    // 选中用户
    private By checkBoxBy = By.id("tbl-userlist");

    // 修改按钮
    private By modifyBy = By.id("modifyUser");


    // 组织类型
    private By addOuTypeBy = By.id("addOuType");

    // 组织
    private By OperationUnitIdBy = By.id("OperationUnitName");
    // 组织名称
    private By operationNameBy = By.name("shop.ouName");
    // 组织查询按钮
    private By operationQueryBy = By.id("btnShopQuery");
    // 选中组织
    private By chooseOperationBy = By.id("tbl_shop_query_dialog");
    // 确认组织按钮
    private By confirmOperationBy = By.id("btnShopQueryConfirm");


    // 角色
    private By roleIdBy = By.xpath("//select[@id='roleId']");

    // 新增角色按钮
    private By addRoleBtnBy = By.xpath("//*[text()='新增角色']");

    // 是否默认单选框
    private By isDefaultBy = By.id("isDefinexxx");


    // 修改用户按钮
    private By modifyUserBy = By.xpath("//*[text()='修改用户']");


    public PacsUserBaseInfoEditPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void inputLoginName(String name) {
        input(loginNameBy, name);
    }

    public void clickQueryBtn() {
        click(queryBtnBy);
    }

    public void clickCheckBox() {
        click(checkBoxBy);
    }

    public void clickModifyBtn() {
        click(modifyBy);
    }

    public void selectAddOuType(String addOuType) {
        select(addOuTypeBy, addOuType);
    }

    public void clickOperationUnitId() {
        click(OperationUnitIdBy);
    }

    public void inputOperationName(String OperationName) {
        input(operationNameBy, OperationName);
    }

    public void clickOperationQuery() {
        click(operationQueryBy);
    }

    public void chooseOperation() {
        click(chooseOperationBy);
    }

    public void clickConfirmOperation() {
        click(confirmOperationBy);
    }

    public void selectRoleId(String roleId) {
        select(roleIdBy, roleId);
    }

    public void clickAddRoleBtn() {
        click(addRoleBtnBy);
    }

    public void clickIsDefault() {
        click(isDefaultBy);
    }

    public void clickModifyUserBtn() {
        click(modifyUserBy);
    }

}
