package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddressPage {

    private WebDriver driver;

    public AddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(name = "billing_first_name")
    private WebElement firstnameInput;

    @FindBy(name = "billing_last_name")
    private WebElement lastnameInput;

    @FindBy(name = "billing_address_1")
    private WebElement address1Input;

    @FindBy(name = "billing_postcode")
    private WebElement postcodeInput;

    @FindBy(name = "billing_city")
    private WebElement cityInput;

    @FindBy(name = "billing_phone")
    private WebElement phoneInput;

    @FindBy(name = "billing_email")
    private WebElement emailInput;

    @FindBy(xpath = "(//button[@id='place_order'])")
    private WebElement placeOrderBtn;

    public OrderPage fillAddressDetails(String firstname, String lastname, String address1, String postcode, String city, String phone, String email) {
        firstnameInput.sendKeys(firstname);
        lastnameInput.sendKeys(lastname);
        address1Input.sendKeys(address1);
        postcodeInput.sendKeys(postcode);
        cityInput.sendKeys(city);
        phoneInput.sendKeys(phone);
        emailInput.sendKeys(email);
        placeOrderBtn.click();
        placeOrderBtn.click();
        return new OrderPage(driver);
    }


}


