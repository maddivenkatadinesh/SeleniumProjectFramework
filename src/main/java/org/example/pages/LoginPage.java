package org.example.pages;


import org.example.base.CommonToAllPages;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import static org.example.driver.DriverManager.driver;

public class LoginPage extends CommonToAllPages {

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "login-username")
    private WebElement username;

    @FindBy(id="login-password")
    private WebElement password;

    @FindBy(id = "js-login-btn")
    private WebElement signButton;

    @FindBy(css = "#js-notification-box-msg")
    private WebElement error_message;

    public String loginToVWOInvalidCreds(){
        driver.get("https://app.vwo.com");
        enterInput(username,"admin@admin.com");
        enterInput(password, "Test@2024");
        clickElement(signButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return error_message.getText();
    }

}
