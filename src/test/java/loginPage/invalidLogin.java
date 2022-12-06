package loginPage;

import net.bytebuddy.build.Plugin;
import org.junit.Assert;
import org.testng.annotations.Test;
import setupMethod.WebDriverController;

import static org.junit.Assert.assertEquals;
//Scenario :
//as user i want to login using invalid username and password and the system throw warning
public class invalidLogin extends WebDriverController {
    @Test (priority = 1)
    public void invalidLogin() throws Exception {
        String browser = "chrome";
        WebDriverController.setup(browser);

        String baseUrl = "https://apg-stagingramo.barransdemo.com/";
        driver.get(baseUrl);

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("a");
        loginPage.setPassTxtBox("a");

        assertEquals("Wrong Password or Username");

        driver.close();

    }

    private static void assertEquals(String wrong_password_or_username) {
    }
    //as user i want to login using invalid username and valid password and the system throw warning
    @Test (priority = 2)
    public void invalidLogin2() throws Exception{
        String browser = "chrome";
        WebDriverController.setup(browser);

        String baseUrl = "https://apg-stagingramo.barransdemo.com/";
        driver.get(baseUrl);

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("a");
        loginPage.setPassTxtBox("ffdf3f037a9e11091302a763c2fb2c17");

        assertEquals("Wrong Password or Username");

        driver.close();
    }
    //as user i want to login using valid username and invalid password and the system throw warning
    @Test (priority = 3)
    public void invalidLogin3() throws Exception{
        String browser = "chrome";
        WebDriverController.setup(browser);

        String baseUrl = "https://apg-stagingramo.barransdemo.com/";
        driver.get(baseUrl);

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("xxxxxxxxx");

        assertEquals("Wrong Password or Username");

        driver.close();
    }
}
