package loginPage;


import dashboardPage.dashboardPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import setupMethod.WebDriverController;
//SC01 Login Berhasil
//TC01 Login dengan username dan password sesuai
public class validLogin extends WebDriverController {
    @BeforeClass
    public void setup() throws Exception {
        String browser = "chrome";
        WebDriverController.setup(browser);

        String baseUrl = "https://apg-stagingramo.barransdemo.com/";
        driver.get(baseUrl);

    }
    @Test (priority = 1)
    public void validLogin() throws Exception {

        //Create loginPage Object
        loginPage loginPage = new loginPage(driver);
        dashboardPage dashboardPage = new dashboardPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("ramo@123!@#");
        loginPage.clickLoginBtn();

        Assert.assertEquals("Dashboard","Dashboard");
    }

    @AfterClass
    public void quit() {
        driver.close();
    }

}
