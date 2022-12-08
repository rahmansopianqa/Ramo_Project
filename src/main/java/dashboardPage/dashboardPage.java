package dashboardPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboardPage {

    WebDriver driver;

    public dashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By titleDashboard = By.xpath("//div[@class='mb-6']");
    
    public void setTitleDashboard(String dashboard) { driver.findElement(titleDashboard).sendKeys(dashboard);
    }

}
