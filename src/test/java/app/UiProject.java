package app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UiProject  {
    private WebDriver webDriver;

    @BeforeMethod
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @AfterMethod
    public void afterTest(){
        webDriver.close();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

}
