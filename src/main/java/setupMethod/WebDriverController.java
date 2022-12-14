package setupMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class WebDriverController {

    public static WebDriver driver;

    public static WebDriver setup(String browser) throws Exception
    {
        //Check if parameter passed from TestNG is 'firefox'
        if(browser.equalsIgnoreCase("firefox"))
        {
            //create firefox instance
            System.setProperty("webdriver.gecko.driver", "U:\\path\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        //Check if parameter passed as 'chrome'
        else if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        }

        //Check if parameter passed as 'Edge'
        else if(browser.equalsIgnoreCase("IE"))
        {
            System.setProperty("webdriver.ie.driver","U:\\path\\IEDriverServer.exe");
            InternetExplorerDriver driver;
            driver = new InternetExplorerDriver();
        }

        else
        {
            //If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
