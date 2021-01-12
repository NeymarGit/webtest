package com.test.webauto.testcase;

import com.test.webauto.common.BaseCase;
import com.test.webauto.constant.Constant;
import com.test.webauto.pageobject.CreateSoPage;
import com.test.webauto.pageobject.LoginPage;
import com.test.webauto.pageobject.PacsIndexPage;
import org.testng.annotations.Test;

public class CreateSoCase extends BaseCase {


    @Test(priority = 1) // �����������ȼ���Ĭ��Ϊ0������
    public void createSo() throws InterruptedException {

        driver.get(Constant.PAC_URL_UAT);
        driver.manage().window().maximize();

        // ��¼ҳ��
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputLoginName(Constant.LOGIN_NAME);
        loginPage.inputPwd(Constant.PASSWORD);
        loginPage.clickLoginBtn();

        PacsIndexPage pacsIndexPage = new PacsIndexPage(driver);
        // �л�����Ȩ��
        pacsIndexPage.clickRole();
        pacsIndexPage.chooseShop(Constant.SHOP_NAME);
        pacsIndexPage.clickDetermine();
        Thread.sleep(1000);

        // �ҵ��µ�ҳ��
        pacsIndexPage.clickMenu();
        Thread.sleep(1000);
        pacsIndexPage.clickSoManage();
        Thread.sleep(1000);
        pacsIndexPage.clickCreateSo();
        Thread.sleep(1000);

        // �л�iframe
        driver.switchTo().frame(1);

        // ��������������Ϣ
        CreateSoPage createSoPage = new CreateSoPage(driver);
        createSoPage.clickCustome();
//        createSoPage.inputCustome("��Ϊ�������޹�˾");
        createSoPage.inputCustomerCode("CUS000138");
        createSoPage.clickCustomerQuery();
        Thread.sleep(1000);
        createSoPage.chooseCustomer();
        createSoPage.clickConfirm();

        createSoPage.inputReceiver("Neymar");
        createSoPage.inputMobile("18845457878");
        createSoPage.inputZipCode("426100");
        createSoPage.selectProvince("�Ϻ�");
        createSoPage.selectCity("�Ϻ���");
        createSoPage.selectDistrict("�����");
        createSoPage.inputAddress("1268��1003");

        // ����֧���ͷ�Ʊ��Ϣ
        createSoPage.clickPaymentAndInvoice();
        createSoPage.selectOrderType("���𶩵�");
        createSoPage.selectPaymentType("֧����");
        String value = String.valueOf(System.currentTimeMillis());
        createSoPage.inputOocSource(value);
        createSoPage.inputOutOrderCode(value);

        // ������ϸ����Ϣ
        createSoPage.clickOrderLine();
        for (int i = 0; i < Constant.ORDER_LINE; i++) {
            createSoPage.clickAddLine();
            if(i == 0){
                createSoPage.inputSkuCode1(Constant.SKU_CODE1);
                createSoPage.inputActualPrice1(150.00);
                createSoPage.inputRequestQty1(2);
            }else if(i == 1){
                createSoPage.inputSkuCode2(Constant.SKU_CODE2);
                createSoPage.inputActualPrice2(150.00);
                createSoPage.inputRequestQty2(2);
            }else if(i == 2){
                createSoPage.inputSkuCode3(Constant.SKU_CODE3);
                createSoPage.inputActualPrice3(150.00);
                createSoPage.inputRequestQty3(2);
            }
        }

        createSoPage.inputTransFee(0.00);

        createSoPage.clickCreateAndSubmit();

    }

}
