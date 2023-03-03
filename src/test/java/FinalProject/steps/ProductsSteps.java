package FinalProject.steps;

import FinalProject.PO.ProductPO;
import FinalProject.driver.DriverManager;
import io.cucumber.java.en.Then;

public class ProductsSteps extends DriverManager {

    ProductPO productPO = new ProductPO(driver);

    @Then("I click on Men section")
    public void iClickOnMenSection() {
        productPO.clickMenSection();
    }
    @Then("I click on Jackets")
    public void iClickOnJackets() {
        productPO.clickJacketsButton();
    }
    @Then("I sort by Size")
    public void iSortBySize() {
        productPO.sortBySize();
    }
    @Then("I sort by price")
    public void iSortByPrice() {
        productPO.clickPriceButton();
    }
    @Then("I add the first option to the cart")
    public void iAddTheFirstOptionToTheCart() {
        productPO.clickFirstItem();
    }
    @Then("I select the size")
    public void iSelectTheSize() {
        productPO.selectSize();
    }
    @Then("I select the color")
    public void iSelectTheColor() {
        productPO.selectColor();
    }
    @Then("I click on add to cart")
    public void iClickOnAddToCart() {
        productPO.clickAddToCart();
    }
    @Then("I add the quantity {string}")
    public void iaddTheQuantity(String quantity) {
        productPO.addQuantity(quantity);
    }
    @Then("I click on the Cart button")
    public void iClickOnTheCartButton() {
        productPO.clickCartButton();
    }

    @Then("I click on proceed to checkout")
    public void iClickOnProceedToCheckout() {
        productPO.clickProceedToCheckout();
    }
}
