package FinalProject.PO;

import io.cucumber.java.zh_cn.假如;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class WishListPO {
    private WebDriver driver;

    public WishListPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//*[@class=\"product-item-name\"]/a")
    WebElement productName;
    @FindBy(xpath = "//*[@id=\"product-price-430\"]")
    WebElement priceTag;

    public void iVerifyProductName(String product){
        Assert.assertEquals(product, productName.getText());
    }
    public void iVerifyPriceTag(String price){
        Assert.assertEquals(price, priceTag.getText());
    }
}
