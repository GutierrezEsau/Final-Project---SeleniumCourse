package FinalProject.steps;

import FinalProject.PO.WishListPO;
import FinalProject.driver.DriverManager;
import io.cucumber.java.en.Then;

public class WishListSteps extends DriverManager {

    WishListPO wishListPO = new WishListPO(driver);

    @Then("I verify the Product on wishlist {string}")
    public void iVerifyTheProductOnWishlist(String product) {
        wishListPO.iVerifyProductName(product);
    }

    @Then("I verify the Price on wishlist {string}")
    public void iVerifyThePriceOnWishlist(String price) {
        wishListPO.iVerifyPriceTag(price);
    }
}
