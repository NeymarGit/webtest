package com.test.addaccount.testcase;

import com.test.addaccount.common.BaseCase;
import org.testng.annotations.Test;

public class CreateAccount extends BaseCase {


    @Test
    public void createAccount() throws InterruptedException {
        String environment = "sit";
        UacAddUser uacAddUser = new UacAddUser();
        uacAddUser.addUacUser(driver,environment);

        PacAddRole pacAddRole = new PacAddRole();
        pacAddRole.addPacRole(driver,environment);

        TomsAddRole tomsAddRole = new TomsAddRole();
        tomsAddRole.addTomsRole(driver,environment);

    }




}
