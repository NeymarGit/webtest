package com.test.webauto.testcase;

import com.test.webauto.Util.Driver;
import com.test.webauto.common.BaseCase;
import com.test.webauto.constant.Constant;
import com.test.webauto.pageobject.LoginPage;
import com.test.webauto.pageobject.PacsIndexPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

// ʵ��ҵ������
public class LoginCase extends BaseCase {

    WebDriver driver ;

    @BeforeClass
    public void open() {
        driver = Driver.open(Constant.DEFULT_BROWSE);
    }

    // ÿ����@Test��������ǰ�ص���ҳ
    @BeforeMethod
    public void setupMethod(){
        driver.get(Constant.PAC_URL);
    }


    // ��¼�ɹ���case
    @Test(priority = 1) // �����������ȼ���Ĭ��Ϊ0������
    public void loginSucess() throws InterruptedException {
        // ��¼ҳ��
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputLoginName(Constant.LOGIN_NAME);
        loginPage.inputPwd(Constant.PASSWORD);
        loginPage.clickLoginBtn();

        // ��ҳ��֤�Ƿ��¼�ɹ�
        PacsIndexPage pacsIndexPage = new PacsIndexPage(driver);
        Boolean userInfoExist = pacsIndexPage.userInfoExist();
        Assert.assertTrue(userInfoExist);

        // �л�����Ȩ��
        pacsIndexPage.clickRole();
        pacsIndexPage.chooseShop();
        pacsIndexPage.clickDetermine();
        Thread.sleep(1000);

        // �ҵ��µ�ҳ��
        pacsIndexPage.clickMenu();
        pacsIndexPage.clickSoManage();
        Thread.sleep(1000);
        // ��������
        pacsIndexPage.clickCreateSo();


//        // �˳�
//        pacsIndexPage.clickExit();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();




/*
        // ��¼��ҳ��֤
        IndexPage indexPage = new IndexPage(driver);
        Boolean flag = indexPage.jenkinsImgExist();
        Assert.assertTrue(flag);
        if (flag){
            // �������
            indexPage.clickBuild();
            Thread.sleep(400);
            // ˢ��ҳ��
            indexPage.driverRefresh();
            // ��ȡ����ɹ�ʱ��
            System.out.println("�ϴγɹ�ʱ�䣺" + indexPage.getLastSuccessTime());
            // ע���û�
            indexPage.logOut();
        }
 */

    }

/*    //��¼ʧ�ܵ�case
    @Test(dataProvider = "datas")
    public void loginFail(String name, String pwd) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputLoginName(name);
        loginPage.inputPwd(pwd);
        loginPage.clickLoginBtn();

        String expected = "�û������������";
        // ����ʵ��ֵ
        String actual = loginPage.getErrorMsg();

        Assert.assertEquals(actual, expected);


    }

    @DataProvider
    public Object[][] datas() {
        Object[][] datas = {
                {"liuyanghe", ""},
                {"liuyanghe", "123123"},
                {"liuyanghe1", "123456"}
        };
        return datas;
    }

 */

    @AfterClass
    public void closeDriver() {
        close(driver);
    }


}
