package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LogInTest extends BaseTest {

    @Test
    public void logInTest() {

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .logInValidData("test1@test.pl", "test1@test.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }
}
