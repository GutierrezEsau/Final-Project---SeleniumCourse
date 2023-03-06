package FinalProject.steps;

import FinalProject.PO.ShippingPO;
import FinalProject.driver.DriverManager;
import io.cucumber.java.en.Then;

public class ShippingSteps extends DriverManager {
    ShippingPO shippingPO = new ShippingPO(driver);

    @Then("I fill Email address {string}")
    public void iFillEmailAddress(String email) {
        shippingPO.iFillEmailInput(email);
    }

    @Then("I fill Password {string}")
    public void iFillPassword(String password) {
        shippingPO.iFIllPasswordInput(password);
    }

    @Then("I click Login")
    public void iClickLogin() {
        shippingPO.iClickLoginButton();
    }

    @Then("I click on item in cart")
    public void iClickOnItemInCart() {
        shippingPO.iClickOnItemInCart();
    }

    @Then("I verify the Product {string}")
    public void iVerifyTheProduct(String product) {
        shippingPO.iVerifyProduct(product);
    }

    @Then("I verify the Quantity {string}")
    public void iVerifyTheQuantity(String quantity) {
        shippingPO.iVerifyQuantity(quantity);
    }

    @Then("I verify the Price {string}")
    public void iVerifyThePrice(String price) {
        shippingPO.iVerifyPrice(price);
    }

    @Then("I click on view details")
    public void iClickOnViewDetails() {
        shippingPO.iClickViewDetailsButton();
    }

    @Then("I verify the size {string}")
    public void iVerifyTheSize(String size) {
        shippingPO.iVerifySize(size);
    }

    @Then("I verify the color {string}")
    public void iVerifyTheColor(String color) {
        shippingPO.iVerifyColor(color);
    }

    @Then("I click Next")
    public void iClickNext() {
        shippingPO.iClickNextButton();
    }

    @Then("I fill the Email address {string}")
    public void iFillTheEmailAddress(String email) {
        shippingPO.iFillTheEmailInput(email);
    }

    @Then("I fill the Password {string}")
    public void iFillThePassword(String password) {
        shippingPO.iFIllThePasswordInput(password);
    }

    @Then("I click Sign in")
    public void iClickSignIn() {
        shippingPO.iClickSignInButton();
    }
}
