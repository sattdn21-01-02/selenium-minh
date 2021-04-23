package com.logigear;

import helper.Constant;
import helper.web_driver_manage.DriverManageFactory;
import helper.web_driver_manage.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class BookTicketTest {

    JavascriptExecutor js;
    DriverManager driverManager;
    WebDriver driver;

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
        /*System.out.println("TC01 User can book ticket successfully");
        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.gotoLoginPage();
        js.executeScript("window.scrollBy(0,500)", "");
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        BookTicketPage bookTicketPage = loginPage.gotoBookTicketPage();
        js.executeScript("window.scrollBy(0,500)", "");
        bookTicketPage.bookTicket("10", "2", "4", "3", "1");*/


    }

    @Test
    public void TC02() throws IOException {
        /*ReadExcelFile objExcelFile = new ReadExcelFile();

        System.out.println("TC01 User can book ticket successfully");
        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.gotoLoginPage();
        js.executeScript("window.scrollBy(0,500)", "");
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        //Prepare the path of excel file
        BookTicketPage bookTicketPage = loginPage.gotoBookTicketPage();
        String filePath = System.getProperty("user.dir") + "/src/main/resources/";

        //Call read file method of the class to read data
        js.executeScript("window.scrollBy(0,500)", "");
        ArrayList<ArrayList<String>> listBookTicket = objExcelFile.readExcel(filePath, "BookSelenium.xlsx", "Sheet2");
        js.executeScript("window.scrollBy(0,500)", "");
        for (ArrayList<String> listObj : listBookTicket) {
            //System.out.println(listObj);
            BookTicketPage bookTicketPages = new BookTicketPage();
            bookTicketPages.bookTicket(listObj.get(0), listObj.get(1), listObj.get(2), listObj.get(3), listObj.get(4));
        }*/
    }
}
