package FinalProject.PO;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPO {
    private WebDriver driver;

    public CheckOutPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[1]/td/span")
    WebElement subtotalText;
    @FindBy(xpath = "//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[2]/td/span")
    WebElement shippingText;
    @FindBy(xpath = "//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[3]/td/strong/span")
    WebElement orderTotalText;
    @FindBy(xpath = "//*[@id=\"opc-sidebar\"]/div[2]/div/div[1]/div[2]")
    WebElement shipAddress;
    @FindBy(xpath = "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[2]/div/div[2]")
    WebElement billingAddress;
    @FindBy(xpath = "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")
    WebElement placeOrderButton;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]/a")
    WebElement orderNumber;

    public void iVerifySubTotal(String subtotal){
        Assert.assertEquals(subtotal, subtotalText.getText());
    }

    public void iVerifyShipping(String shipping){
        Assert.assertEquals(shipping, shippingText.getText());
    }

    public void iVerifyOrderTotal(String orderTotal){
        Assert.assertEquals(orderTotal, orderTotalText.getText());
    }

    public void iVerifyShippingAndBillingAddress(){
        Assert.assertEquals(shipAddress.getText(), billingAddress.getText());
    }

    public void iClickPlaceOrderButton(){
        clickElement(placeOrderButton);
    }

    public void iClickOnOrderNumber(){
        clickElement(orderNumber);
    }

    public void clickElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
