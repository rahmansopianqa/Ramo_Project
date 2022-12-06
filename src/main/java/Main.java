import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;


//page_Url = https://apg-stagingramo.barransdemo.com/
public class Main {

    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String baseUrl = "https://apg-stagingramo.barransdemo.com/login";
        driver.get(baseUrl);

        WebElement userNameTxtBox = driver.findElement(By.name("username"));
        WebElement passTxtBox = driver.findElement(By.name("password"));

        userNameTxtBox.sendKeys("admin@local");
        passTxtBox.sendKeys("ramo@123!@#");

        WebElement loginBtn = driver.findElement(By.xpath("//div[@role='button']"));
        loginBtn.click();

        String labelDashboard = driver.findElement(By.xpath("(//p[@class='text-[#2E2E2E] text-xl font-semibold'])[1]")).getText();
        Assert.assertEquals("Dashboard", labelDashboard);

        driver.quit();
    }
}
