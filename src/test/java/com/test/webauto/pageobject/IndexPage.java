package com.test.webauto.pageobject;

import com.test.webauto.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * ��¼�����ҳ
 */
public class IndexPage extends BasePage {

    // JenkinsͼƬ
    private By imgBy = By.id("jenkins-name-icon");
    // ������ť
    private By buildBy = By.xpath("//img[@class='icon-clock icon-md']");
    // �ϴγɹ�ʱ��
    private By lastSucessBy = By.xpath("//*[text()='TOMS']/parent::*/following-sibling::td[1]");
    // ע����ť
    private By logOutBy = By.xpath("//*[text()='ע��']//parent::a");


    public IndexPage(WebDriver driver) {
        super(driver);
    }

    // Jenkinsͼ���Ƿ���֣���֤�Ƿ��¼�ɹ�
    public Boolean jenkinsImgExist() {
        return isDisplay(imgBy);
    }

    // �������
    public void clickBuild(){
        click(buildBy);
    }

    // ˢ��ҳ��
    public void driverRefresh(){
        driver.navigate().refresh();
    }

    // ��ȡ�ϴγɹ�ʱ��
    public String getLastSuccessTime(){
        String sucessTime = getText(lastSucessBy);
        // ��ȡ���õ�ʱ��
        return sucessTime.substring(0,sucessTime.indexOf("-")-1);
    }

    // ���ע��
    public void logOut(){
        click(logOutBy);
    }

}
