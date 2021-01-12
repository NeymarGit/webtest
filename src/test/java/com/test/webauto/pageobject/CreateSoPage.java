package com.test.webauto.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.math.BigDecimal;

public class CreateSoPage extends PacsIndexPage {

    WebDriver driver;

    // �ͻ�����
    private By customerNameBy = By.name("salesOrderCommand.k3CustomerName");

    // �ͻ��б��ѯ�Ŀͻ�����
    private By customerCodeBy = By.name("k3Customer.customerCode");

    // �ͻ���ѯ
    private By queryBy = By.id("btnK3CustomerQuery");
    private By chooseCustomerBy = By.id("tbl_k3_customer_query_dialog");
    private By confirmBy = By.id("btnK3CustomerQueryConfirm");

    // �ջ���
    private By receiverBy = By.id("receiver");

    // �ֻ�
    private By mobileBy = By.id("mobile");

    // ��������
    private By zipcodeBy = By.id("zipcode");

    // ʡ/��
    private By provinceBy = By.id("provinceList");

    // ����
    private By cityBy = By.id("cityList");

    // ��
    private By districtListBy = By.id("districtList");

    // ��ַ
    private By addressBy = By.id("address");

    // ����֧���ͷ�Ʊ��Ϣ
    private By payAndInvoiceBy = By.xpath("//a[text()='����֧���ͷ�Ʊ��Ϣ']/..");

    // ��������
    private By orderTypeBy = By.id("salesOrderTypeChoose");

    // ֧����ʽ
    private By paymentTypeBy = By.id("paymentTypeList");

    // ƽ̨ԭʼ�������
    private By oocSourceBy = By.id("outerOrderCodeSource");

    // ƽ̨�������
    private By outerOrderCodeBy = By.id("outerOrderCode");

    // ������ϸ��Ϣ
    private By soLineBy = By.xpath("//a[text()='������ϸ����Ϣ']/..");

    // �����а�ť
    private By addLineBy = By.xpath("//span[text()='������']/..");

    // sku����
    private By skuCode1By = By.name("addLineList(-1).sku.code");
    private By skuCode2By = By.name("addLineList(-2).sku.code");
    private By skuCode3By = By.name("addLineList(-3).sku.code");

    // ���ۼ�
    private By actualprice1By = By.name("addLineList(-1).platformUnitPrice");
    private By actualprice2By = By.name("addLineList(-2).platformUnitPrice");
    private By actualprice3By = By.name("addLineList(-3).platformUnitPrice");

    // ��������
    private By requestQyt1By = By.name("addLineList(-1).requestedQty");
    private By requestQyt2By = By.name("addLineList(-2).requestedQty");
    private By requestQyt3By = By.name("addLineList(-3).requestedQty");

    // �˷�
    private By transFeeBy = By.id("actualTransferFee");

    // �������ύ
    private By createAndSubmitBy = By.id("createAndSubmitBtn");

    public CreateSoPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // ����������Ϣ
    public void clickCustome() {
        click(customerNameBy);
    }

    public void inputCustome(String customerName) {
        // ǿת����
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // ͨ��js�Ƴ�ҳ��ֻ������ ����һ
        jsExecutor.executeScript("document.getElementById('k3CustomerName').removeAttribute('readonly')");
        input(customerNameBy, customerName);
    }

    // ����ͻ�����
    public void inputCustomerCode(String customerCode) {
        input(customerCodeBy, customerCode);
    }

    // �����ѯ��ť
    public void clickCustomerQuery() {
        click(queryBy);
    }

    // ѡ�пͻ�
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

    // ����֧���ͷ�Ʊ��Ϣҳ��
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

    // ������ϸ����Ϣ
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
