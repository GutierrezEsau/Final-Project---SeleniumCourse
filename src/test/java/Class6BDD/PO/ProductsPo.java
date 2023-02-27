package Class6BDD.PO;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPo {
    private WebDriver driver;
    private WebDriverWait wait;

    public ProductsPo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }


    @FindBy(xpath = "//div[contains(text(), 'Sauce Labs Backpack')]")
    WebElement backpackHeaderLabel;
    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerCornerButton;
    @FindBy(id = "inventory_sidebar_link")
    WebElement allItemsSideMenuButton;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    WebElement sauceBackpackButton;

    @FindBy(xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
    WebElement addtocartLabel;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement cartButton;


    public void clickBurgerButton() {
        this.burgerCornerButton.click();
    }

    public void clickAllItems() {
        clickElement(allItemsSideMenuButton);
    }

    public void checkTextFirstItem(String expectedText) {
        Assert.assertEquals(expectedText, backpackHeaderLabel.getText());
    }

    public void clickElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void clickOnBackPack(){ clickElement(sauceBackpackButton);}

    public void checkAddtoCartLabel(String expectedText){
        Assert.assertEquals(expectedText, addtocartLabel.getText());
    }

    public void clickOnCartButton(){clickElement(cartButton);}



}
