package com.test.addaccount.constant;

/**
 * 常量配置
 */

public class Constant {
    public static final String DEFAULT_BROWSE = "chrome";
    public static final String FIREFOX_BROWSE = "firefox";

    public static final String CHROME_DRIVER_KEY = "webdriver.chrome.driver";
    public static final String CHROME_DRIVER_VALUE = "src/test/resources/chromedriver.exe";

    public static final String FIREFOX_KEY = "webdriver.firefox.bin";
    public static final String FIREFOX_VALUE = "F:/Firefox/firefox.exe";

    public static final String FIREFOX_DRIVER_KEY = "webdriver.gecko.driver";
    public static final String FIREFOX_DRIVER_VALUE = "src/test/resources/geckodriver.exe";


    public static final String UAC_URL = "http://test.account.baozun.cn/person/login?appkey=PC_DEV";
    public static final String BASE_URL = "http://account-test.baozun.cn/person/login?appkey=";
    public static final String PAC_URL = BASE_URL + "PAC-TEST";
    public static final String TOMS_URL = BASE_URL + "OMS-TEST";

    public static final String BASE_URL_UAT = "https://ecs-uat-account.baozun.com/person/login?appkey=";
    public static final String UAC_URL_UAT = BASE_URL_UAT + "platform-console-uat";
    public static final String PAC_URL_UAT = BASE_URL_UAT + "PAC-UAT";
    public static final String TOMS_URL_UAT = BASE_URL_UAT + "OMS-ECS-UAT";

    public static final String DEFAULT_LOGIN_NAME = "liuyanghe";
    public static final String DEFAULT_PASSWORD = "qqqq1111";

    // 需要添加账号的信息
    public static final String CREATE_LOGIN_NAME = "Auto1005";
    public static final String CREATE_JOB_NUMBER = "5208";
    public static final String CREATE_EMAIL = "yanghe.liu@baozun.com";


}
