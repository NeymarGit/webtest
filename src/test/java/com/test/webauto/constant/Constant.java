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

    public static final String LOGIN_NAME = "liuyanghe";
    public static final String PASSWORD = "qqqq1111";

    // 店铺名称
    public static final String SHOP_NAME = "Gucci官方商城";
    // 订单行数
    public static final int ORDER_LINE = 1;
    // sku_code
    public static final String SKU_CODE1 = "539051_1000_6106";
    public static final String SKU_CODE2 = "539051_1000_6106";
    public static final String SKU_CODE3 = "539051_1000_6106";

}
