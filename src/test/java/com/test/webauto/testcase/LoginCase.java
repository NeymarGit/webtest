package com.test.webauto.testcase;

import com.test.webauto.Util.Driver;
import com.test.webauto.common.BaseCase;
import com.test.webauto.constant.Constant;
import com.test.webauto.pageobject.LoginPage;
import com.test.webauto.pageobject.PacsIndexPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

// 实际业务数据
public class LoginCase extends BaseCase {

    WebDriver driver ;

    @BeforeClass
    public void open() {
        driver = Driver.open(Constant.DEFULT_BROWSE);
    }

    // 每次跑@Test用例方法前回到首页
    @BeforeMethod
    public void setupMethod(){
        driver.get(Constant.PAC_URL);
    }


    // 登录成功的case
    @Test(priority = 1) // 设置运行优先级，默认为0优先跑
    public void loginSucess() throws InterruptedException {
        // 登录页面
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputLoginName(Constant.LOGIN_NAME);
        loginPage.inputPwd(Constant.PASSWORD);
        loginPage.clickLoginBtn();

        // 首页验证是否登录成功
        PacsIndexPage pacsIndexPage = new PacsIndexPage(driver);
        Boolean userInfoExist = pacsIndexPage.userInfoExist();
        Assert.assertTrue(userInfoExist);

        // 切换店铺权限
        pacsIndexPage.clickRole();
        pacsIndexPage.chooseShop();
        pacsIndexPage.clickDetermine();
        Thread.sleep(1000);

        // 找到下单页面
        pacsIndexPage.clickMenu();
        pacsIndexPage.clickSoManage();
        Thread.sleep(1000);
        // 创建订单
        pacsIndexPage.clickCreateSo();


//        // 退出
//        pacsIndexPage.clickExit();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();




/*
        // 登录首页验证
        IndexPage indexPage = new IndexPage(driver);
        Boolean flag = indexPage.jenkinsImgExist();
        Assert.assertTrue(flag);
        if (flag){
            // 点击构建
            indexPage.clickBuild();
            Thread.sleep(400);
            // 刷新页面
            indexPage.driverRefresh();
            // 获取最近成功时间
            System.out.println("上次成功时间：" + indexPage.getLastSuccessTime());
            // 注销用户
            indexPage.logOut();
        }
 */

    }

/*    //登录失败的case
    @Test(dataProvider = "datas")
    public void loginFail(String name, String pwd) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputLoginName(name);
        loginPage.inputPwd(pwd);
        loginPage.clickLoginBtn();

        String expected = "用户名或密码错误";
        // 断言实际值
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
