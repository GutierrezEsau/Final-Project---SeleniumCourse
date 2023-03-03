package FinalProject.steps;

import FinalProject.PO.MyOrdersPO;
import FinalProject.driver.DriverManager;
import io.cucumber.java.en.Then;

public class MyOrdersSteps extends DriverManager {

    MyOrdersPO myOrdersPO = new MyOrdersPO(driver);


    @Then("I verify Grand Total {string}")
    public void iVerifyGrandTotal(String grandTotal) {
        myOrdersPO.iVerifyGrandTotal(grandTotal);
    }

    @Then("I click on Print Order")
    public void iClickOnPrintOrder() {
        myOrdersPO.iClickPrintOrderButton();
    }

}
