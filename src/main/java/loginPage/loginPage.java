package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    By userNameTxtBox = By.xpath("//input[@type='text']");
    By passTxtBox = By.xpath("//input[@type='password']");
    By loginBtn = By.xpath("//div[@role='button']");
    By errMesgUser = By.xpath("//div/span[contains(text(), 'Wrong Password or Username')]");
    By errMesgPass = By.xpath("//div/span[contains(text(), 'Wrong Password or Username')]");

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
        setUserNameTxtBox("admin@local");
        setPassTxtBox("ramo@123!@#");
        clickLoginBtn();
    }

    public void errMesgPass() {
    }
}
