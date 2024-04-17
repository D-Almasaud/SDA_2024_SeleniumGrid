package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactListHomePage;
import pages.ContactListSignInPAge;
import utilities.Driver;


public class ContactListSignInSTD {
    ContactListSignInPAge signInPAge = new ContactListSignInPAge();
    ContactListHomePage homePage = new ContactListHomePage();

    @Given("User visits {string}")
    public void userVisits(String url) {
        Driver.getDriver().get(url);

    }

    @When("User enters email as {string} and password as {string}")
    public void userEntersEmailAsAndPasswordAs(String email, String password) {
        signInPAge.enterEmail(email);
        signInPAge.enterPassword(password);
    }

    @And("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        signInPAge.clickSubmit();
    }

    @Then("verify logout button displayed")
    public void verifyLogoutButtonDisplayed() {
        Assert.assertTrue(homePage.logOutButton.isDisplayed());
    }

    @And("close driver")
    public void closeDriver() {
        Driver.getDriver().close();
    }
}
