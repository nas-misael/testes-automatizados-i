import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IfoodEntrarPage extends Page{
    public IfoodEntrarPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getButtonEntrarComEmail(){
        return driver.findElement(By.cssSelector("button#email-btn"));
    }

    public WebElement waitButtonEmailClickable(){
        return new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#email-btn")));
    }

    public WebElement getButtonEntrarComCelular(){
        return driver.findElement(By.id("phone-btn"));
    }
}
