package loginPage;

import org.junit.Assert;
import org.testng.annotations.Test;
import setupMethod.WebDriverController;

import static org.junit.Assert.assertEquals;

public class invalidLogin extends WebDriverController {

    @Test
    public void invalidLogin() throws Exception {
        String browser = "chrome";
        WebDriverController.setup(browser);

        String baseUrl = "https://apg-stagingramo.barransdemo.com/";
        driver.get(baseUrl);

        //Create loginPage object
        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("a");
        loginPage.setPassTxtBox("a");

        assertEquals("Wrong Password or Username");

        driver.close();

    }

    private static void assertEquals(String wrong_password_or_username) {
    }
}
