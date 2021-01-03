package com.test.webauto.testcase;

import com.test.webauto.Util.Driver;
import com.test.webauto.common.BaseCase;
import com.test.webauto.constant.Constant;
import com.test.webauto.pageobject.CreateSoPage;
import com.test.webauto.pageobject.LoginPage;
import com.test.webauto.pageobject.PacsIndexPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateSoCase extends BaseCase {

    WebDriver driver;

    @BeforeClass
    public void open() {
        driver = Driver.open(Constant.DEFULT_BROWSE);
        driver.get(Constant.PAC_URL);

    }

    //
    @Test(priority = 1) // 设置运行优先级，默认为0优先跑
    public void createSo() throws InterruptedException {
        // 登录页面
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputLoginName(Constant.LOGIN_NAME);
        loginPage.inputPwd(Constant.PASSWORD);
        loginPage.clickLoginBtn();

        PacsIndexPage pacsIndexPage = new PacsIndexPage(driver);
        // 切换店铺权限
        pacsIndexPage.clickRole();
        pacsIndexPage.chooseShop();
        pacsIndexPage.clickDetermine();
        Thread.sleep(1000);

        // 找到下单页面
        pacsIndexPage.clickMenu();
        Thread.sleep(1000);
        pacsIndexPage.clickSoManage();
        Thread.sleep(1000);
        pacsIndexPage.clickCreateSo();
        Thread.sleep(1000);

        // 切换iframe
        driver.switchTo().frame(1);

        // 创建订单基本信息
        CreateSoPage createSoPage = new CreateSoPage(driver);
        createSoPage.clickCustome();
//        createSoPage.inputCustome("华为技术有限公司");
        createSoPage.inputCustomerCode("CUS000138");
        createSoPage.clickCustomerQuery();
//        Thread.sleep(2000);
        createSoPage.chooseCustomer();
        createSoPage.clickConfirm();

        createSoPage.inputReceiver("Neymar");
        createSoPage.inputMobile("18845457878");
        createSoPage.inputZipCode("426100");
        createSoPage.selectProvince("上海");
        createSoPage.selectCity("上海市");
        createSoPage.selectDistrict("徐汇区");
        createSoPage.inputAddress("1268号1003");

        // 订单支付和发票信息
        createSoPage.clickPaymentAndInvoice();
        createSoPage.selectOrderType("京东订单");
        createSoPage.selectPaymentType("支付宝");
        String value = String.valueOf(System.currentTimeMillis());
        createSoPage.inputOocSource(value);
        createSoPage.inputOutOrderCode(value);

        // 订单明细行信息
        createSoPage.clickOrderLine();
        for (int i = 0; i < 3; i++) {
            createSoPage.clickAddLine();
            if(i == 0){
                createSoPage.inputSkuCode1("HGCSZYWJ01");
                createSoPage.inputActualPrice1(150.00);
                createSoPage.inputRequestQty1(2);
            }else if(i == 1){
                createSoPage.inputSkuCode2("HGCSZYWJ02");
                createSoPage.inputActualPrice2(150.00);
                createSoPage.inputRequestQty2(2);
            }else if(i == 2){
                createSoPage.inputSkuCode3("HGCSZYTS01");
                createSoPage.inputActualPrice3(150.00);
                createSoPage.inputRequestQty3(2);
            }
        }

        createSoPage.inputTransFee(10.00);
        Thread.sleep(5000);

        createSoPage.clickCreateAndSubmit();

    }

    @AfterClass
    public void closeDriver() {
        close(driver);
    }


}
