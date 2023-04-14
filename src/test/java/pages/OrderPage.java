package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {


    public OrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received'])")
                private WebElement infoAboutOrder;

    @FindBy(xpath = "//a[text()='Java Selenium WebDriver']")
    private WebElement infoAboutProduct;

    public WebElement getInfoAboutProduct() {
        return infoAboutProduct;
    }

    public WebElement getInfoAboutOrder() {
        return infoAboutOrder;
    }
}
