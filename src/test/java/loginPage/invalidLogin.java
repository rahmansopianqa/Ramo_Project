package loginPage;

import net.bytebuddy.build.Plugin;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import setupMethod.WebDriverController;

import static org.junit.Assert.assertEquals;


public class invalidLogin extends WebDriverController {
    @BeforeClass
    public void setup() throws Exception {

        String browser = "chrome";
        WebDriverController.setup(browser);

        String baseUrl = "https://apg-stagingramo.barransdemo.com/";
        driver.get(baseUrl);

    }

    //SC02 Login Gagal
    //TC01 Login dengan username salah
    @Test (priority = 2)
    public void invalidLogin1() throws Exception{

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("a");
        loginPage.setPassTxtBox("ffdf3f037a9e11091302a763c2fb2c17");

        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyUserMsg());
        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyPassMsg());
    }


    //TC02 Login dengan password salah
    @Test (priority = 3)
    public void invalidLogin2() throws Exception{

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("ffdf3f037a9e110");

        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyUserMsg());
        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyPassMsg());
    }

    //TC03 Login dengan username valid dan password kurang dari 8 karakter
    @Test (priority = 4)
    public void invalidLogin3() throws Exception{
        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("Ramo@12");

        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyUserMsg());
        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyPassMsg());
    }

    //TC04 Login dengan username valid dan password tidak ada huruf uppercase
    @Test (priority = 5)
    public void invalidLogin4() throws Exception{

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("ramo@123!@#");

        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyUserMsg());
        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyPassMsg());
    }

    //TC05 Login dengan username valid dan password huruf uppercase
    @Test (priority = 6)
    public void invalidLogin5() throws Exception{

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("RAM@123!@#");

        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyUserMsg());
        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyPassMsg());
    }

    //TC06 Login dengan username valid dan password tanpa karakter
    @Test (priority = 7)
    public void invalidLogin6() throws Exception{

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("@123!@#");

        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyUserMsg());
        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyPassMsg());
    }

    //TC07 Login dengan username valid dan password tanpa angka
    @Test (priority = 8)
    public void invalidLogin7() throws Exception{

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("ramo@!@#");

        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyUserMsg());
        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyPassMsg());
    }

    //TC08 Login dengan username valid dan password tanpa uppercase dan karakter
    @Test (priority = 9)
    public void invalidLogin8() throws Exception{

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("@123!@#");

        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyUserMsg());
        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyPassMsg());
    }

    //TC09 Login dengan username valid dan password hanya dengan huruf lowercase
    @Test (priority = 10)
    public void invalidLogin9() throws Exception{

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("ramo");

        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyUserMsg());
        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyPassMsg());
    }

    //TC10 Login dengan username valid dan password tanpa lowercase dan angka
    @Test (priority = 11)
    public void invalidLogin10() throws Exception{

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("RAMO@!@#");

        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyUserMsg());
        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyPassMsg());
    }

    //TC11 Login dengan username valid dan tanpa menginputkan password
    @Test (priority = 12)
    public void invalidLogin11() throws Exception{

        loginPage loginPage = new loginPage(driver);

        loginPage.setUserNameTxtBox("admin@local");
        loginPage.setPassTxtBox("");

        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyUserMsg());
        Assert.assertEquals("Wrong Password or Username", loginPage.getEmptyPassMsg());
    }

    @AfterClass
    public void quit() {
        driver.close();
    }
}
