package com.test.addaccount.testcase;

import com.test.addaccount.common.BaseCase;
import org.testng.annotations.Test;

public class CreateAccount extends BaseCase {


    @Test
    public void createAccount() throws InterruptedException {

        UacAddUser uacAddUser = new UacAddUser();
        uacAddUser.addUacUser(driver);

        PacAddRole pacAddRole = new PacAddRole();
        pacAddRole.addPacRole(driver);

        TomsAddRole tomsAddRole = new TomsAddRole();
        tomsAddRole.addTomsRole(driver);

    }




}
