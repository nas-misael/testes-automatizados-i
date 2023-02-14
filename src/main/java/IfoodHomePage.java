import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IfoodHomePage extends Page{
    private String urlIfoodHomePage = "https://www.ifood.com.br/";

    public IfoodHomePage(WebDriver driver) {
        super(driver);
        driver.get(urlIfoodHomePage);
    }

    public WebElement getButtonEntrar(){
        return driver.findElement(By.cssSelector("button[label=Entrar]"));
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }
}
