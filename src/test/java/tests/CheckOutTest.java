package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class CheckOutTest extends BaseTest {

    @Test
    public void buyProduct() {


        new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCard()
                .viewCart().openAddressPage().fillAddressDetails("Michał","Testowy","Polna 15","45-234","Lubinowo","676565454","testowy21@23.pl");



    }
}
