import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfoodTests {

    @Test
    public void validarMensagemDeEmailInvalidoTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        IfoodHomePage homePage = new IfoodHomePage(driver);
        IfoodEntrarPage entrarPage = new IfoodEntrarPage(driver);
        IfoodEntrarEmailPage entrarComEmailPage = new IfoodEntrarEmailPage(driver);

        homePage.getButtonEntrar().click();

        Utils.waitElementBeClickable(driver, "button#email-btn");
        entrarPage.getButtonEntrarComEmail().click();

        Utils.waitElementBeClickable(driver, "input[name=email]");
        entrarComEmailPage.getInputEmail().click();
        entrarComEmailPage.getInputEmail().sendKeys("test");
        entrarComEmailPage.getPDescription().click();
        Assertions.assertFalse(entrarComEmailPage.getButtonContinuar().isEnabled());

        String mensagemValidacao = "E-mail inválido";

        Assertions.assertTrue(entrarComEmailPage.getSpanMessageError().isDisplayed());

    }

    @Test
    public void validarBotaoContinuarComEmailValidoTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        IfoodHomePage homePage = new IfoodHomePage(driver);
        IfoodEntrarPage entrarPage = new IfoodEntrarPage(driver);
        IfoodEntrarEmailPage entrarComEmailPage = new IfoodEntrarEmailPage(driver);

        homePage.getButtonEntrar().click();

        Utils.waitElementBeClickable(driver, "button#email-btn");
        entrarPage.getButtonEntrarComEmail().click();

        Utils.waitElementBeClickable(driver, "input[name=email]");
        entrarComEmailPage.getInputEmail().click();
        entrarComEmailPage.getInputEmail().sendKeys("test@mail.com");
        entrarComEmailPage.getPDescription().click();
        Assertions.assertTrue(entrarComEmailPage.getButtonContinuar().isEnabled());

    }

    @Test
    public void validarMensagemDeNúmeroDeCelularInvalidoTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        IfoodHomePage homePage = new IfoodHomePage(driver);
        IfoodEntrarPage entrarPage = new IfoodEntrarPage(driver);
        IfoodEntrarCelularPage entrarComCelularPage = new IfoodEntrarCelularPage(driver);

        homePage.getButtonEntrar().click();

        Utils.waitElementBeClickable(driver, "button#phone-btn");
        entrarPage.getButtonEntrarComCelular().click();

        Utils.waitElementBeClickable(driver, "input[name=phone]");
        entrarComCelularPage.getInputCelular().click();
        entrarComCelularPage.getInputCelular().sendKeys("1234");
        entrarComCelularPage.getPDescription().click();

        Assertions.assertFalse(entrarComCelularPage.getButtonWhatsApp().isEnabled());

        String mensagemValidacao = "Número de celular inválido";

        Assertions.assertTrue(entrarComCelularPage.getSpanMessageError().isDisplayed());

    }
}
