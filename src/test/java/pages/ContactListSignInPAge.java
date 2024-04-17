package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactListSignInPAge {



    public ContactListSignInPAge(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id ="email")
    public WebElement emailField;

    @FindBy(id ="password")
    public WebElement passwordField;

    @FindBy(id ="submit")
    public WebElement submitButton;

    public void enterEmail (String email){
        emailField.sendKeys(email);


    }
    public void enterPassword (String password){
        passwordField.sendKeys(password);


    }
    public void clickSubmit (){
        submitButton.click();



    }}
