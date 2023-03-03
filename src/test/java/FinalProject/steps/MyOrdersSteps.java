package FinalProject.steps;

import FinalProject.PO.MyOrdersPO;
import FinalProject.driver.DriverManager;
import io.cucumber.java.en.Then;

public class MyOrdersSteps extends DriverManager {

    MyOrdersPO myOrdersPO = new MyOrdersPO(driver);

    @Then("I verify Product {string}")
    public void iVerifyProduct(String product) {
        myOrdersPO.iVerifyProductName(product);
    }

    @Then("I verify Final Price {string}")
    public void iVerifyFinalPrice(String price) {
        myOrdersPO.iVerifyFinalPrice(price);
    }

    @Then("I verify Quantity {string}")
    public void iVerifyQuantity(String quantity) {
        myOrdersPO.iVerifyQuantity(quantity);
    }

    @Then("I verify subtotal {string}")
    public void iVerifySubtotal(String subtotal) {
        myOrdersPO.iVerifySubtotal(subtotal);
    }

    @Then("I verify Size {string}")
    public void iVerifySize(String size) {
        myOrdersPO.iVerifySize(size);
    }

    @Then("I verify Color {string}")
    public void iVerifyColor(String color) {
        myOrdersPO.iVerifyColor(color);
    }

    @Then("I verify Grand Total {string}")
    public void iVerifyGrandTotal(String grandTotal) {
        myOrdersPO.iVerifyGrandTotal(grandTotal);
    }
}
