package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerLink() {
        int randomNumber = (int) (Math.random() * 1000);
        String email = "test" + randomNumber + "@test123.pl";
        WebElement dashboardLink = new HomePage(driver).openMyAccountPage()
                .registerUserValidData(email, "test@test123.pl").getDashboardLink();


        Assert.assertEquals(dashboardLink.getText(), "Dashboard");


    }

    @Test
    public void registerUserInvalidEmail() {
        String email = "test@test123.pl";
        WebElement getError = new HomePage(driver).openMyAccountPage()
                .registerUserInvalidData(email, "test@test123.pl").getError();
        Assert.assertTrue(getError.getText().contains(" An account is already registered with your email address. Please log in."));



    }
}
