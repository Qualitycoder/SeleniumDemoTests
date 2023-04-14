package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OrderPage;

public class CheckOutTest extends BaseTest {

    @Test
    public void buyProduct() {


        OrderPage orderPage = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCard()
                .viewCart().openAddressPage()
                .fillAddressDetails("Michał","Testowy","Polna 15","45-234","Lubinowo","676565454","testowy21@23.pl");

        Assert.assertEquals(orderPage.getInfoAboutOrder().getText(),"Thank you. Your order has been received.");

        Assert.assertTrue(orderPage.getInfoAboutProduct().isDisplayed());
    }
}
