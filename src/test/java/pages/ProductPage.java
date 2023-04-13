package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='woocommerce-message']//a")
    private WebElement viewCartBtn;


    @FindBy(name = "add-to-cart")
    private WebElement addToCartBtn;

    public ProductPage addProductToCard() {
        addToCartBtn.click();
        return this;
    }
        public CartPage viewCart() {
            viewCartBtn.click();
            return new CartPage(driver);


    }
}

