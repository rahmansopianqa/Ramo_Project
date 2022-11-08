package loginPage;

import org.junit.Assert;
import setupMethod.WebDriverController;

import static org.junit.Assert.assertEquals;

public class invalidLogin extends WebDriverController {

    public static void main(String[] args) throws Exception {
        String browser = "chrome";
        WebDriverController.setup(browser);

        String baseUrl = "https://apg-stagingramo.barransdemo.com/";
        driver.get(baseUrl);

        //Create loginPage object
        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("a");
        loginPage.setPassTxtBox("a");

        assertEquals("Wrong Password or Username");

    }

    private static void assertEquals(String wrong_password_or_username) {
    }
}
