package dashboardPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboardPage {

    WebDriver driver;

    public dashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By titleDashboard = By.xpath("//div[@class='font-bold text-base'][normalize-space()='Dashboard']");
    
    public void setTitleDashboard() { driver.findElement(titleDashboard).isDisplayed();
    }

}
