package FinalProject.PO;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrdersPO {

    private WebDriver driver;

    public MyOrdersPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//*[@id=\"order-item-row-51893\"]/td[1]/strong")
    WebElement productNameText;
    @FindBy(xpath = "//*[@id=\"order-item-row-51893\"]/td[3]/span/span/span")
    WebElement priceText;
    @FindBy(xpath = "//*[@id=\"order-item-row-51893\"]/td[4]/ul/li/span[2]")
    WebElement quantityText;
    @FindBy(xpath = "//*[@id=\"order-item-row-51893\"]/td[5]/span/span/span")
    WebElement subtotalText;
    @FindBy(xpath = "//*[@id=\"order-item-row-51893\"]/td[1]/dl/dd[1]")
    WebElement sizeText;
    @FindBy(xpath = "//*[@id=\"order-item-row-51893\"]/td[1]/dl/dd[2]")
    WebElement colorText;
    @FindBy(xpath = "//*[@id=\"my-orders-table\"]/tfoot/tr[3]/td/strong/span")
    WebElement grandTotalText;

    public void iVerifyProductName(String productName){
        Assert.assertEquals(productName, productNameText.getText());
    }
    public void iVerifyFinalPrice(String price){
        Assert.assertEquals(price, priceText.getText());
    }
    public void iVerifyQuantity(String quantity){
        Assert.assertEquals(quantity, quantityText.getText());
    }
    public void iVerifySubtotal(String subtotal){
        Assert.assertEquals(subtotal, subtotalText.getText());
    }
    public void iVerifySize(String size){
        Assert.assertEquals(size, sizeText.getText());
    }
    public void iVerifyColor(String color){
        Assert.assertEquals(color, colorText.getText());
    }
    public void iVerifyGrandTotal(String grandTotal){
        Assert.assertEquals(grandTotal, grandTotalText.getText());
    }

}
