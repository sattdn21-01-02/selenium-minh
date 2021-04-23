package page_objects;

import helper.Constant;
import helper.element.Label;
import helper.element.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class GeneralPage {

    //Locator
    private final By lblWelcomeMessage = By.xpath("//div[@class='account']");
    private final By lblRegisterConfirmed = By.xpath("//p[contains(text(),'Registration Confirmed! You can now log in to the site.')]");
    //
    private final Tab tabHome = new Tab(By.cssSelector(".account strong"));
    private final Tab tabFaq = new Tab(By.cssSelector("a[href='/Page/FAQ.cshtml']"));
    private final Tab tabContact = new Tab(By.cssSelector("a[href='/Page/Contact.cshtml']"));
    private final Tab tabTimetable = new Tab(By.cssSelector("a[href='TrainTimeListPage.cshtml']"));
    private final Tab tabTicketPrice = new Tab(By.cssSelector("a[href='/Page/TrainPriceListPage.cshtml']"));
    private final Tab tabBookTicket = new Tab(By.cssSelector("a[href='/Page/BookTicketPage.cshtml']"));
    private final Tab tabMyTicket = new Tab(By.cssSelector("a[href='/Page/ManageTicket.cshtml']"));
    private final Tab tabChangePassword = new Tab(By.cssSelector("a[href='/Account/ChangePassword.cshtml']"));
    private final Tab tabRegister = new Tab(By.cssSelector("a[href='/Account/Register.cshtml']"));
    private final Tab tabLogin = new Tab(By.cssSelector("a[href='/Account/Login.cshtml']"));
    private final Tab tabLogout = new Tab(By.cssSelector("a[href='/Account/Logout']"));
    private final Label lblFooterBanner = new Label(By.cssSelector("[style^='opacity: 0.9']"));
    private final Label lblFooter = new Label(By.cssSelector("[onmouseover='S_ssac();']"));


    public void goToHomePage() {
        this.tabHome.click();
    }

    public void goToFAQPage() {
        this.tabFaq.click();
    }

    public void goToContactPage() {
        this.tabContact.click();
    }

    public void goToTimetablePage() {
        this.tabTimetable.click();
    }

    public void goToTicketPricePage() {
        this.tabTicketPrice.click();
    }

    public void goToBookTicketPage() {
        this.tabBookTicket.click();
    }

    public void goToMyTicketPage() {
        this.tabMyTicket.click();
    }

    public void goToChangePasswordPage() {
        this.tabChangePassword.click();
    }

    public void goToRegisterPage() {
        this.tabRegister.click();
    }

    public void goToLoginPage() {
        this.tabLogin.click();
    }

    public void logout() {
        this.tabLogout.click();
    }

    public void disableFooterBanner() {
        this.lblFooter.disableElement();
        this.lblFooterBanner.disableElement();
    }

    public void scrollPage() {
        JavascriptExecutor jse = (JavascriptExecutor) Constant.WEBDRIVER;
        jse.executeScript("window.scrollBy(0,250)");
    }
}
