package loginPage;


import org.testng.annotations.Test;
import setupMethod.WebDriverController;
//Scenario :
//as user i want to login using valid username and password
public class validLogin extends WebDriverController {

    @Test
    public void validLogin() throws Exception {
        String browser = "chrome";
        WebDriverController.setup(browser);

        String baseUrl = "https://apg-stagingramo.barransdemo.com/";
        driver.get(baseUrl);

        //Create loginPage Object
        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("ramo@123!@#");
        loginPage.clickLoginBtn();

        driver.close();

    }
}
