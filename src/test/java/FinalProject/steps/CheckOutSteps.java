package FinalProject.steps;

import FinalProject.PO.CheckOutPO;
import FinalProject.driver.DriverManager;
import io.cucumber.java.en.Then;

public class CheckOutSteps extends DriverManager {

    CheckOutPO checkOutPO = new CheckOutPO(driver);

    @Then("I verify Cart Subtotal {string}")
    public void iVerifyCartSubtotal(String subtotal) {
        checkOutPO.iVerifySubTotal(subtotal);
    }

    @Then("I verify Shipping {string}")
    public void iVerifyShipping(String shipping) {
        checkOutPO.iVerifyShipping(shipping);
    }

    @Then("I verify Order Total {string}")
    public void iVerifyOrderTotal(String orderTotal) {
        checkOutPO.iVerifyOrderTotal(orderTotal);
    }

    @Then("I verify billing address and shipping address are the same")
    public void iVerifyBillingAddressAndShippingAddressAreTheSame() {
        checkOutPO.iVerifyShippingAndBillingAddress();
    }

    @Then("I click on Place Order")
    public void iClickOnPlaceOrder() {
        checkOutPO.iClickPlaceOrderButton();
    }

    @Then("I click on my order number")
    public void iClickOnMyOrderNumber() {
        checkOutPO.iClickOnOrderNumber();
    }

}
