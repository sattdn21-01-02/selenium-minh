package com.logigear;

import helper.Constant;
import helper.web_driver_manage.DriverManageFactory;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class GeneralTest {

    @BeforeTest
    public void setUp() {
        Constant.DRIVER_MANAGER = DriverManageFactory.getDriverManager(DriverManageFactory.DriverType.CHROME);
        Constant.WEBDRIVER = Constant.DRIVER_MANAGER.getWebDriver();
        Constant.WEBDRIVER.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Constant.WEBDRIVER.get(Constant.RAILWAY_URL);
        Constant.WEBDRIVER.manage().window().setSize(new Dimension(1024, 768));
    }

    @AfterTest
    public void tearDown() {
        Constant.WEBDRIVER.manage().deleteAllCookies();
        Constant.DRIVER_MANAGER.quitWebDriver();
    }
}
