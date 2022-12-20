package setupMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class mainDriver {
    public static WebDriver driver;
    public static void instance(){
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    }
}

