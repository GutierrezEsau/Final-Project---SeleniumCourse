package FinalProject.PO;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPO {
    private WebDriver driver;

    public ProductPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//*[@id=\"ui-id-5\"]/span[2]")
    WebElement menSection;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[2]/a")
    WebElement jacketsButton;
    @FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[2]/div[1]")
    WebElement sizeButton;
    @FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[2]/div[2]/div/div/a[4]/div")
    WebElement LButton;
    @FindBy(xpath = "//*[@id=\"sorter\"]")
    WebElement positionDropdown;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]")
    WebElement firstProduct;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[4]/div/div[1]/form/button/span")
    WebElement addToCartFirstProduct;
    @FindBy(xpath = "//*[@id=\"option-label-size-143-item-169\"]")
    WebElement selectSize;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
    WebElement cartButton;
    @FindBy(xpath = "//*[@id=\"option-label-color-93-item-56\"]")
    WebElement selectColor;
    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
    WebElement addToCartButton;
    @FindBy(xpath = "//*[@id=\"qty\"]")
    WebElement quantityBox;
    @FindBy(xpath = "//*[@id=\"top-cart-btn-checkout\"]")
    WebElement proceedToCheckout;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]")
    WebElement secondProduct;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[3]/div/div[2]/a[1]")
    WebElement addToWishList;

    public void clickMenSection(){
        clickElement(menSection);
    }
    public void clickJacketsButton(){
        clickElement(jacketsButton);
    }
    public void sortBySize(){
        sizeButton.click();
        WebDriverWait waitForSize = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        waitForSize.until(ExpectedConditions.visibilityOf(LButton)).click();
    }

    public void clickPriceButton(){
        Select select = new Select(positionDropdown);
        select.selectByVisibleText("Price");
    }

    public void clickFirstItem(){
        Actions actions = new Actions(this.driver);
        actions.moveToElement(firstProduct).moveToElement(addToCartFirstProduct).click().build().perform();
    }

    public void selectSize(){
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(selectSize));
        clickElement(selectSize);
    }
    public void selectColor(){
        clickElement(selectColor);
    }

    public void clickAddToCart(){
        clickElement(addToCartButton);
    }

    public void addQuantity(String quantity){
        quantityBox.clear();
        quantityBox.sendKeys(quantity);
    }

    public void clickCartButton(){
        clickElement(cartButton);
    }

    public void clickProceedToCheckout(){
        clickElement(proceedToCheckout);
    }

    public void setToWishList(){
        Actions actions = new Actions(this.driver);
        actions.moveToElement(secondProduct).moveToElement(addToWishList).click().build().perform();
    }

    public void clickElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

}
