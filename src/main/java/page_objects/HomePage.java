package page_objects;


import helper.element.Label;
import org.openqa.selenium.By;

public class HomePage extends GeneralPage {
    //Elements
    private final Label lblWelcomeMessage = new Label(By.xpath("//div[@class = 'account']//strong"));

    //Methods
    public String getWelcomeMessage() {
        return this.lblWelcomeMessage.getText();
    }
}
