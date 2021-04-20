package page_objects;

import helper.Constant;
import helper.web_driver_manage.DriverManageFactory;
import helper.web_driver_manage.DriverManager;
import helper.web_driver_manage.DriverType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralPage {


    //Locator
    private final By tabLogin = By.xpath("//div[@id='menu']//a[@href='/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("//div[@id='menu']//a[@href='/Account/Logout']");
    private final By lblWelcomeMessage = By.xpath("//div[@class='account']");
    private final By tabRegister = By.xpath("//div[@id='menu']//a[@href='/Account/Register.cshtml']");
    private final By lblRegisterConfirmed = By.xpath("//p[contains(text(),'Registration Confirmed! You can now log in to the site.')]");

    //Elements
    protected WebElement getTabLogin() {

        return Constant.WEBDRIVER.findElement(tabLogin);
    }

    protected WebElement getTabLogout() {

        return Constant.WEBDRIVER.findElement(tabLogout);
    }

    protected WebElement getLblWelcomeMessage() {

        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
    }

    protected WebElement getLblRegisterConfirmed() {
        return Constant.WEBDRIVER.findElement(lblRegisterConfirmed);
    }

    protected WebElement getTabRegister() {

        return Constant.WEBDRIVER.findElement(tabRegister);
    }

    //Method
    public String getWelcomeMessage() {

        return this.getLblWelcomeMessage().getText();
    }

    public LoginPage gotoLoginPage() {

        this.getTabLogin().click();
        return new LoginPage();
    }

    public RegisterPage gotoRegisterPage() {
        this.getTabRegister().click();
        return new RegisterPage();
    }

    public void gotoLogoutPage() {
        this.getTabLogout().click();
    }

    public String getMessageRegisterConfirmed() {

        return this.getLblRegisterConfirmed().getText();
    }
}
