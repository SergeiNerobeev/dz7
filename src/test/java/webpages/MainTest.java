package webpages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;


public class MainTest {

  private LoginPage loginPage;
  private MainPage mainPage;
  private PersonalPage personalPage;
  private WebDriver driver;

  @Before
  public void setup(){
    final IServerConfiguration serverConfiguration = ConfigFactory.create(IServerConfiguration.class);
    final Logger logger = (Logger) LogManager.getLogger(MainTest.class);
//    driver = WebDriverFactory.getWebDriver(Browsers.CHROME);
//    WebDriverManager.firefoxdriver().setup();
//    driver = new FirefoxDriver();
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    loginPage = new LoginPage(driver);
    mainPage = new MainPage(driver);
    personalPage = new PersonalPage(driver);
    logger.info("Logs on");
}

    @After
    public void tearDown (){
      if (driver != null)
          driver.quit();
    }

    @Test
    public void loginTest (){

    loginPage.openOtusUrl();
    loginPage.clickNewLoginBtn();
    loginPage.inputLogin();
    loginPage.inputPassword();
    loginPage.clickEnterBtn();

    mainPage.clickTextUserName();

    personalPage.setfName();
    personalPage.setlName();
    personalPage.setBloggerName();
    personalPage.setDateOfBirthday();

    personalPage.clickCountryField();
    personalPage.setRussia();
    personalPage.clickCityField();

    personalPage.setMoscow();
    personalPage.clickEnglishLevel();
    personalPage.setBegginer();
    personalPage.setYes();
    personalPage.setRemote();

    personalPage.setPhoneNumber();
    personalPage.setContact01();
    personalPage.setContact02();
    personalPage.setGender();
    personalPage.setCompany();
    personalPage.setPosition();
    personalPage.setDevExp();
    personalPage.clickSaveAndContinue();
    driver.quit();

    loginPage.openAndChecking();
    loginPage.clickNewLoginBtn();
    loginPage.inputLogin();
    loginPage.inputPassword();
    loginPage.clickEnterBtn();
    }
}


