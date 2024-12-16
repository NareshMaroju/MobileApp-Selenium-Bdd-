package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import setup.Driver;

import java.net.MalformedURLException;

public class LoginStep {
     public LoginPage loginpage;

    @Given("^the user is on the mobile login page$")
    public void userOnMobileLoginPage() throws MalformedURLException {
        Driver.setUp();
    loginpage = new LoginPage(Driver.driver);

    }

    @When("^the user enters a valid username$")
            public void userEntersUsername() {
        //driver.findElement(By.xpath("//android.widget.EditText[@content-desc='test-Username']")).sendKeys("standard_user");

        loginpage.enterUsername();
    }

    @And("^the user enters a valid password$")
            public void userEntersPassword() {
        //Driver.getDriver().findElement(By.xpath("//android.widget.EditText[@content-desc='test-Password']")).sendKeys("secret_sauce");
       // driver.findElement(By.xpath("//android.widget.EditText[@content-desc='test-Password']")).sendKeys("secret_sauce");
    loginpage.enterPassword();
    }


    @And("^the user taps on the Login button$")
    public void userTapsOnLoginButton() {
        loginpage.clickLoginButton();
        //driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']")).click();
    }

    @Then("^the user should be redirected to the account overview page$")
    public void userRedirectedToAccountPage() {
        //String expectedPageTitle = "Account Overview";
        //String actualPageTitle = Driver.getDriver().getTitle();
        //assert actualPageTitle.contains(expectedPageTitle);
    }
}




