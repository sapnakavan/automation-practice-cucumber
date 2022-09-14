package com.automation.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Createaccsteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickonsignin();
    }

    @And("^I click on create new account button$")
    public void iClickOnCreateNewAccountButton() {
        new CreateAccountPage().clickoncreateacc();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String first)  {
        new CreateAccountPage().setFirstname(first);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String last)  {
        new CreateAccountPage().setLastname(last);

    }

    @And("^I enter register password \"([^\"]*)\"$")
    public void iEnterRegisterPassword(String password)  {
        new CreateAccountPage().setPassword(password);

    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String add)  {
        new CreateAccountPage().setAddress(add);

    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city)  {
        new CreateAccountPage().setCity(city);

    }

    @And("^I select state \"([^\"]*)\"$")
    public void iSelectState()  {
        new CreateAccountPage().setState();

    }

    @And("^I enter postal code \"([^\"]*)\"$")
    public void iEnterPostalCode(String po)  {
        new CreateAccountPage().setPostcode(po);

    }

    @And("^I select country \"([^\"]*)\"$")
    public void iSelectCountry()  {
        new CreateAccountPage().setCountry();

    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String num)  {
        new CreateAccountPage().setMobilenuber(num);

    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickonrejisterbutton();
    }

    @And("^I enter email  \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new CreateAccountPage().enterRandomEmailfornewacountcreation();
    }
}