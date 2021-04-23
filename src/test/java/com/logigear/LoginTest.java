package com.logigear;

import com.logigear.models.Login;
import helper.Constant;
import helper.web_driver_manage.DriverManageFactory;
import helper.web_driver_manage.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.LoginPage;

import java.util.List;

public class LoginTest extends GeneralTest{

    JavascriptExecutor js;
    DriverManager driverManager;
    private HomePage homePage;
    private LoginPage loginPage;
    private List<Login> logins;

    @BeforeMethod
    public void beforeMethod() {
        driverManager = DriverManageFactory.getDriverManager(DriverManageFactory.DriverType.CHROME);
        Constant.WEBDRIVER = driverManager.getWebDriver();
        Constant.WEBDRIVER.get(Constant.RAILWAY_URL);
        Constant.WEBDRIVER.manage().window().maximize();
        js = (JavascriptExecutor) Constant.WEBDRIVER;
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Post-condition");
        Constant.WEBDRIVER.quit();
    }

    @Test
    public void TC01() {
        /*System.out.println("TC01 - User can log into Railway with valid username and password");
        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.gotoLoginPage();
        js.executeScript("window.scrollBy(0,250)", "");
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        String actualMsg = homePage.getWelcomeMessage();
        String expectedMsg = "Welcome " + Constant.USERNAME;
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
        loginPage.gotoLogoutPage();*/
    }

    @Test
    public void TC02() {
        /*System.out.println("TC02 - User can not log into Railway with invalid username and password");

        HomePage homePage = new HomePage();


        LoginPage loginPage = homePage.gotoLoginPage();

        js.executeScript("window.scrollBy(0,250)", "");

        loginPage.login(Constant.failUsernameLogin, Constant.failPasswordLogin);

        String actualMsg = loginPage.getLblLoginErrorMsg().getText();
        String expectedMsg = Constant.INVALID_MSG_LOGIN;

        Assert.assertEquals(actualMsg, expectedMsg);*/
    }

    @Test
    public void TC03() {
        /*System.out.println("TC03 - User can not log into Railway with invalid username or password");

        HomePage homePage = new HomePage();


        LoginPage loginPage = homePage.gotoLoginPage();

        js.executeScript("window.scrollBy(0,500)", "");

        loginPage.login(Constant.failUsernameLogin, Constant.PASSWORD);
        js.executeScript("window.scrollBy(0,500)", "");

        String actualMsg = loginPage.getLblLoginErrorMsg().getText();
        String expectedMsg = Constant.INVALID_MSG_LOGIN;
        Assert.assertEquals(actualMsg, expectedMsg);*/

    }

    @Test
    public void TC04() {
        /*System.out.println("TC03 - User can not log into Railway with blank username or password");

        HomePage homePage = new HomePage();


        LoginPage loginPage = homePage.gotoLoginPage();

        js.executeScript("window.scrollBy(0,500)", "");

        loginPage.login("", "");
        js.executeScript("window.scrollBy(0,500)", "");
        String actualMsgUsername = loginPage.getErrorLoginUsername();
        String expectedMsg2 = Constant.INVALID_MSG_LOGIN_USERNAME;

        Assert.assertEquals(actualMsgUsername, expectedMsg2);
        String actualMsgPassword = loginPage.getErrorLoginPassword();
        String expectedMsgPassword = Constant.INVALID_MSG_LOGIN_PASSWORD;
        Assert.assertEquals(actualMsgPassword, expectedMsgPassword);*/
    }
}
