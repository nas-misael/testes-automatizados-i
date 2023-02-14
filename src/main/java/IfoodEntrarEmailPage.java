import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IfoodEntrarEmailPage extends Page{
    public IfoodEntrarEmailPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getButtonContinuar(){
        return driver.findElement(By.cssSelector("button[label=Continuar]"));
    }

    public WebElement getInputEmail(){
        return driver.findElement(By.name("email"));
    }

    public WebElement getSpanMessageError(){
        return driver.findElement(By.cssSelector("span[role=alert]"));
    }

    public WebElement getPDescription(){
        return driver.findElement(By.cssSelector("p.sign-in-email__title"));
    }
}
