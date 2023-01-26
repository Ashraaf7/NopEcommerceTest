import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {
        private WebDriver driver ;
        HomePage homePage ;
        RegisterPage registerPage ;
        LoginPage loginPage ;

        @BeforeTest
        public void setup()
        {
            driver = new EdgeDriver();
            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();
            homePage = new HomePage(driver);
        }


        @Test
        public  void RegisterWithValidData()
        {
           registerPage = homePage.ClickOnRegisterButton();
           registerPage.ChooseGender();
           registerPage.EnterFirstName("Ahmed");
           registerPage.EnterLastName("Ashraf");
           registerPage.ChooseDate("4","May","1998");
           registerPage.EnterEmail("test5050@gmail.com");
           registerPage.EntePassword("123456");
           registerPage.EnterConfirmPassword("123456");
           registerPage.ClickOnRegisterButton();
            Assert.assertEquals(registerPage.ShowRegistedMsg(),"Your registration completed");
        }


    /*@Test
    public  void LoginWithValidData()
    {
        loginPage = homePage.ClickOnLoginButton();
    }*/















































        @AfterTest
    public void CloseBrowser()
        {
          //  driver.quit();
        }





































}
