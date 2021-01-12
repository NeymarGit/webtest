package com.test.webauto.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.math.BigDecimal;

public class CreateSoPage extends PacsIndexPage {

    WebDriver driver;

    // 客户名称
    private By customerNameBy = By.name("salesOrderCommand.k3CustomerName");

    // 客户列表查询的客户编码
    private By customerCodeBy = By.name("k3Customer.customerCode");

    // 客户查询
    private By queryBy = By.id("btnK3CustomerQuery");
    private By chooseCustomerBy = By.id("tbl_k3_customer_query_dialog");
    private By confirmBy = By.id("btnK3CustomerQueryConfirm");

    // 收货人
    private By receiverBy = By.id("receiver");

    // 手机
    private By mobileBy = By.id("mobile");

    // 邮政编码
    private By zipcodeBy = By.id("zipcode");

    // 省/市
    private By provinceBy = By.id("provinceList");

    // 城市
    private By cityBy = By.id("cityList");

    // 区
    private By districtListBy = By.id("districtList");

    // 地址
    private By addressBy = By.id("address");

    // 订单支付和发票信息
    private By payAndInvoiceBy = By.xpath("//a[text()='订单支付和发票信息']/..");

    // 订单类型
    private By orderTypeBy = By.id("salesOrderTypeChoose");

    // 支付方式
    private By paymentTypeBy = By.id("paymentTypeList");

    // 平台原始订单编号
    private By oocSourceBy = By.id("outerOrderCodeSource");

    // 平台订单编号
    private By outerOrderCodeBy = By.id("outerOrderCode");

    // 订单明细信息
    private By soLineBy = By.xpath("//a[text()='订单明细行信息']/..");

    // 新增行按钮
    private By addLineBy = By.xpath("//span[text()='新增行']/..");

    // sku编码
    private By skuCode1By = By.name("addLineList(-1).sku.code");
    private By skuCode2By = By.name("addLineList(-2).sku.code");
    private By skuCode3By = By.name("addLineList(-3).sku.code");

    // 销售价
    private By actualprice1By = By.name("addLineList(-1).platformUnitPrice");
    private By actualprice2By = By.name("addLineList(-2).platformUnitPrice");
    private By actualprice3By = By.name("addLineList(-3).platformUnitPrice");

    // 购买数量
    private By requestQyt1By = By.name("addLineList(-1).requestedQty");
    private By requestQyt2By = By.name("addLineList(-2).requestedQty");
    private By requestQyt3By = By.name("addLineList(-3).requestedQty");

    // 运费
    private By transFeeBy = By.id("actualTransferFee");

    // 创建并提交
    private By createAndSubmitBy = By.id("createAndSubmitBtn");

    public CreateSoPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // 订单基本信息
    public void clickCustome() {
        click(customerNameBy);
    }

    public void inputCustome(String customerName) {
        // 强转类型
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // 通过js移除页面只读属性 方法一
        jsExecutor.executeScript("document.getElementById('k3CustomerName').removeAttribute('readonly')");
        input(customerNameBy, customerName);
    }

    // 输入客户编码
    public void inputCustomerCode(String customerCode) {
        input(customerCodeBy, customerCode);
    }

    // 点击查询按钮
    public void clickCustomerQuery() {
        click(queryBy);
    }

    // 选中客户
    public void chooseCustomer() {
        click(chooseCustomerBy);
    }

    public void clickConfirm() {
        click(confirmBy);
    }

    public void inputReceiver(String receiver) {
        input(receiverBy, receiver);
    }


    public void inputMobile(String mobile) {
        input(mobileBy, mobile);
    }

    public void inputZipCode(String zipCode) {
        input(zipcodeBy, zipCode);
    }

    public void selectProvince(String province) {
        select(provinceBy, province);
    }

    public void selectCity(String city) {
        select(cityBy, city);
    }

    public void selectDistrict(String district) {
        select(districtListBy, district);
    }

    public void inputAddress(String address) {
        input(addressBy, address);
    }

    // 订单支付和发票信息页面
    public void clickPaymentAndInvoice() {
        click(payAndInvoiceBy);
    }

    public void selectOrderType(String orderType) {
        select(orderTypeBy, orderType);
    }
    public void selectOrderType() {
        select(orderTypeBy);
    }


    public void selectPaymentType(String paymentType) {
        select(paymentTypeBy, paymentType);
    }

    public void selectPaymentType() {
        select(paymentTypeBy);
    }

    public void inputOocSource(String oocSource) {
        input(oocSourceBy, oocSource);
    }

    public void inputOutOrderCode(String outOrderCode) {
        input(outerOrderCodeBy, outOrderCode);
    }

    // 订单明细行信息
    public void clickOrderLine() {
        click(soLineBy);
    }

    public void clickAddLine() {
        click(addLineBy);
    }

    public void inputSkuCode1(String skuCode) {
        input(skuCode1By, skuCode);
    }

    public void inputSkuCode2(String skuCode) {
        input(skuCode2By, skuCode);
    }

    public void inputSkuCode3(String skuCode) {
        input(skuCode3By, skuCode);
    }

    public void inputActualPrice1(Double actualPrice) {
        input(actualprice1By, String.valueOf(actualPrice));
    }
    public void inputActualPrice2(Double actualPrice) {
        input(actualprice2By, String.valueOf(actualPrice));
    }
    public void inputActualPrice3(Double actualPrice) {
        input(actualprice3By, String.valueOf(actualPrice));
    }

    public void inputRequestQty1(int requestQty) {
        input(requestQyt1By, String.valueOf(requestQty));
    }

    public void inputRequestQty2(int requestQty) {
        input(requestQyt2By, String.valueOf(requestQty));
    }

    public void inputRequestQty3(int requestQty) {
        input(requestQyt3By, String.valueOf(requestQty));
    }

    public void inputTransFee(Double transFee) {
        input(transFeeBy, String.valueOf(transFee));
    }

    public void clickCreateAndSubmit() {
        click(createAndSubmitBy);
    }

}
