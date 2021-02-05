package com.test.webauto.constant;

// 常量配置
public class Constant {
    public static final String DEFULT_BROWSE = "chrome";
    public static final String FIREFOX_BROWSE = "firefox";

    public static final String CHROME_DRIVER_KEY = "webdriver.chrome.driver";
    public static final String CHROME_DRIVER_VALUE = "src/test/resources/chromedriver.exe";

    public static final String FIREFOX_KEY = "webdriver.firefox.bin";
    public static final String FIREFOX_VALUE = "F:/Firefox/firefox.exe";


    public static final String FIREFOX_DRIVER_KEY = "webdriver.gecko.driver";
    public static final String FIREFOX_DRIVER_VALUE = "src/test/resources/geckodriver.exe";

    public static final String BASE_URL = "http://account-test.baozun.cn/person/login?appkey=";
    public static final String PAC_URL = BASE_URL + "PAC-TEST";
    public static final String TOMS_URL = BASE_URL + "OMS-TEST";

    public static final String BASE_URL_UAT = "https://ecs-uat-account.baozun.com/person/login?appkey=";
    public static final String UAC_URL_UAT = BASE_URL_UAT + "platform-console-uat";
    public static final String PAC_URL_UAT = BASE_URL_UAT + "PAC-UAT";
    public static final String TOMS_URL_UAT = BASE_URL_UAT + "OMS-ECS-UAT";


    public static final String LOGIN_NAME = "liuyanghe1";
    public static final String PASSWORD = "qqqq1111";

    // 店铺名称
    public static final String SHOP_NAME = "小红书旗舰店";
    // 订单行数
    public static final int ORDER_LINE = 2;
    // sku_code
    public static final String SKU_CODE1 = "170878-NVAQ-7";
    public static final String SKU_CODE2 = "SMAWS18D520-BLAKL";
    public static final String SKU_CODE3 = "539051_1000_6106";

}
