import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private WebDriver driver ;
    By genderMale = By.id("gender-male");
    By genderFemale = By.id("gender-female");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dayDropDown = By.xpath("//select[@name='DateOfBirthDay']");
    By monthDropDown = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearDropDown = By.xpath("//select[@name='DateOfBirthYear']");

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By rePasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    Select select ;
    By registedMsg = By.xpath("//div //div[@class='result']");

    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void  ChooseGender ()
    {
        driver.findElement(genderMale).click();
    }
    public void  EnterFirstName (String f)
    {
        driver.findElement(firstName).sendKeys(f);
    }
    public void  EnterLastName (String f)
    {
        driver.findElement(lastName).sendKeys(f);
    }
    public void ChooseDate(String d , String m , String y)
    {
         select = new Select(driver.findElement(dayDropDown));
            select.selectByVisibleText(d);
        select = new Select(driver.findElement(monthDropDown));
        select.selectByVisibleText(m);
        select = new Select(driver.findElement(yearDropDown));
        select.selectByVisibleText(y);
    }
    public void  EnterEmail (String f)
    {
        driver.findElement(emailField).sendKeys(f);
    }
    public void  EntePassword (String f)
    {
        driver.findElement(passwordField).sendKeys(f);
    }
    public void  EnterConfirmPassword (String f)
    {
        driver.findElement(rePasswordField).sendKeys(f);
    }

    public void  ClickOnRegisterButton ()
    {
        driver.findElement(registerButton).click();
    }
    public String  ShowRegistedMsg ()
    {
      return   driver.findElement(registedMsg).getText();
    }

























}
