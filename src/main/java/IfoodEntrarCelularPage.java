import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IfoodEntrarCelularPage extends Page {
    public IfoodEntrarCelularPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getButtonWhatsApp(){
        return driver.findElement(By.cssSelector("button[label=WhatsApp]"));
    }

    public WebElement getInputCelular(){
        return driver.findElement(By.name("phone"));
    }

    public WebElement getSpanMessageError(){
        return driver.findElement(By.cssSelector("span[role=alert]"));
    }

    public WebElement getPDescription(){
        return driver.findElement(By.cssSelector("p.sign-in-phone__title"));
    }
}
