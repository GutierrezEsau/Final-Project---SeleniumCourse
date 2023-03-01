package FinalProject.steps;

import FinalProject.PO.ProductsPo;
import FinalProject.driver.DriverManager;
import io.cucumber.java.en.Then;

public class ProductSteps extends DriverManager {

    ProductsPo productsPo = new ProductsPo(driver);

    @Then("I click on Sauce Labs Backpack")
    public void iClickOnSauceLabsBackpack() {
        productsPo.clickOnBackPack();
    }

    @Then("I check Sauce Labs Backpack change to {string}")
    public void iCheckSauceLabsBackpackChangeTo(String expectedLabel) {
        productsPo.checkAddtoCartLabel(expectedLabel);
    }

    @Then("I click on Cart button")
    public void iClickOnCartButton() {
        productsPo.clickOnCartButton();
    }
}