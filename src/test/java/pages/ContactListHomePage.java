package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactListHomePage {
    public ContactListHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "logout")
    public WebElement logOutButton;

    public void clickLogOut(){
        logOutButton.click();
    }
}
