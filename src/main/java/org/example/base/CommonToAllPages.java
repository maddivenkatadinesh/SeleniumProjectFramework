package org.example.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.driver.DriverManager.getDriver;

public class CommonToAllPages {

    public void clickElement(By by){
        getDriver().findElement(by).click();
    }
    public void clickElement(WebElement element){
        element.click();
    }
    public void enterInput(By by, String key){
        getDriver().findElement(by).sendKeys(key);
    }
    public void enterInput(WebElement element, String key){
        element.sendKeys(key);
    }
}
