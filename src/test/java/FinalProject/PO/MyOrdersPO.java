package FinalProject.PO;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyOrdersPO {

    private WebDriver driver;

    public MyOrdersPO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//*[@id=\"my-orders-table\"]/tfoot/tr[3]/td/strong/span")
    WebElement grandTotalText;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/div[2]/div/a[2]")
    WebElement printOrderButton;

    public void iVerifyGrandTotal(String grandTotal){
        Assert.assertEquals(grandTotal, grandTotalText.getText());
    }

    public void iClickPrintOrderButton(){
        clickElement(printOrderButton);
    }


    public void clickElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

}
