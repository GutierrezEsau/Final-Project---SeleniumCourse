package FinalProject.PO;

import net.serenitybdd.screenplay.waits.Wait;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShippingPO{
    private WebDriver driver;

    public ShippingPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//*[@id=\"customer-email\"]")
    WebElement emailInput;
    @FindBy(xpath = "//*[@id=\"customer-password\"]")
    WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\"customer-email-fieldset\"]/fieldset/div[2]/div[1]/button")
    WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[1]")
    WebElement itemInCart;
    @FindBy(xpath = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/div/div[1]/div[1]/strong")
    WebElement productNameVerification;
    @FindBy(xpath = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/div/div[1]/div[1]/div/span[2]")
    WebElement quantityVerification;
    @FindBy(xpath = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/div/div[1]/div[2]/span/span/span")
    WebElement priceVerification;
    @FindBy(xpath = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/div/div[2]/span")
    WebElement viewDetailsButton;
    @FindBy(xpath = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/div/div[2]/div/dl/dd[1]")
    WebElement sizeVerification;
    @FindBy(xpath = "//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/div/div[2]/div/dl/dd[2]")
    WebElement colorVerification;
    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/div/button")
    WebElement nextButton;

    public void iFillEmailInput(String email){
        fillElement(emailInput, email);
    }
    public void iFIllPasswordInput(String password){
        fillElement(passwordInput, password);
    }

    public void iClickLoginButton(){
        clickElement(loginButton);
    }

    public void iClickOnItemInCart(){
        clickElement(itemInCart);
    }

    public void iVerifyProduct(String product){
        Assert.assertEquals(product, productNameVerification.getText());
    }

    public void iVerifyQuantity(String quantity){
        Assert.assertEquals(quantity, quantityVerification.getText());
    }
    public void iVerifyPrice(String price){
        Assert.assertEquals(price, priceVerification.getText());
    }

    public void iClickViewDetailsButton(){
        clickElement(viewDetailsButton);
    }

    public void iVerifySize(String size){
        Assert.assertEquals(size, sizeVerification.getText());
    }

    public void iVerifyColor(String color){
        Assert.assertEquals(color, colorVerification.getText());
    }

    public void iClickNextButton(){
        clickElement(nextButton);
    }


    public void clickElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void fillElement(WebElement element, String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(password);
    }

}
