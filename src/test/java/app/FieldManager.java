package app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FieldManager extends UiProject{
    private final Integer defaultWaitTime = 60;

    private Field field;

    private Page page;

    public FieldManager waitForVisible(){
        getWebDriverWait(defaultWaitTime).until(x -> x.findElement(By.xpath(field.getXpath())));
        return this;
    }
    public FieldManager waitForVisible(Integer secondsTimeOut){
        getWebDriverWait(secondsTimeOut).until(x -> x.findElement(By.xpath(field.getXpath())));
        return this;
    }
    public void click(){
        getWebDriverWait(defaultWaitTime).until(ExpectedConditions.elementToBeClickable(getWebDriver()
                .findElement(By.xpath(field.getXpath())))).click();
    }
    public Wait<WebDriver> getWebDriverWait(Integer secondsTimeOut){
        return new WebDriverWait(getWebDriver(), secondsTimeOut, 500);
    }
    public FieldManager setValue(String value){
        clearInput().waitForVisible().setValue(value);
        return this;
    }
    public FieldManager clearInput(){
        getWebDriverWait(defaultWaitTime).until(x->x.findElement(By.xpath(field.getXpath()))).clear();
        return this;
    }
    public FieldManager page(Page page){
        this.page = page;
        return this;
    }
}
