package org.example.tests;

import org.example.base.CommonToAllTests;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestCase extends CommonToAllTests{

    @Test
    public void logintest(){
        LoginPage loginPage = new LoginPage();
        String error_message = loginPage.loginToVWOInvalidCreds();
        Assert.assertEquals(error_message,"Your email, password, IP address or location did not match");
    }

}
