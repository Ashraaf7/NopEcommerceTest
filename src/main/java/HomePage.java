import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver ;
    By registerButton = By.xpath("//a[@class='ico-register']");
    By loginButton = By.xpath("//a[@class='ico-login']");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public  RegisterPage ClickOnRegisterButton ()
    {
        driver.findElement(registerButton).click();
        return new RegisterPage(driver);
    }
    public  LoginPage ClickOnLoginButton ()
    {
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }
}










