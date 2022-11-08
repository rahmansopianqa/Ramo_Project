package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    By userNameTxtBox = By.name("username");
    By passTxtBox = By.name("password");
    By loginBtn = By.xpath("//button[text() = \"LOGIN\"]");
    By errMesgUser = By.xpath("//div/span[contains(text(), 'Username wajib diisi')]");
    By errMesgPass = By.xpath("//div/span[contains(text(), 'Password wajib diisi')]");

    public void setUserNameTxtBox (String username){
        driver.findElement(userNameTxtBox).sendKeys(username);
    }

    public void setPassTxtBox (String password){
        driver.findElement(passTxtBox).sendKeys(password);
    }

    public void clickLoginBtn (){
        driver.findElement(loginBtn).click();
    }

    public String getEmptyUserMsg () {
        String alertUser = driver.findElement(errMesgUser).getText();
        return alertUser;
    }

    public String getEmptyPassMsg () {
        String alertPass = driver.findElement(errMesgPass).getText();
        return alertPass;
    }

    public void clearUserTxtBox () {
        driver.findElement(userNameTxtBox).sendKeys(Keys.CONTROL,"a");
        driver.findElement(userNameTxtBox).sendKeys(Keys.DELETE);
    }

    public void clearPassTxtBox () {
        driver.findElement(passTxtBox).sendKeys(Keys.CONTROL,"a");
        driver.findElement(passTxtBox).sendKeys(Keys.DELETE);
    }

    public void validLogin () {
        setUserNameTxtBox("admin@myrepublic.co.id");
        setPassTxtBox("P@ssw0rd");
        clickLoginBtn();
    }
}
