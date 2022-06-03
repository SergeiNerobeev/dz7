package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import personalinfo.Url;

import java.time.Duration;

public class LoginPage extends BasePage {

  public WebDriverWait wait;

  public LoginPage(WebDriver driver) {
    super(driver);
  }


  @FindBy(xpath ="//button[contains(@data-modal-id, 'new-log-reg')]" )
    private WebElement newLoginBtn;

  @FindBy(xpath = "//*[contains(@class,'header2__right__container')]//button[contains(@class,'header2__auth')]")
    private WebElement newLoginBtn2;

  @FindBy(xpath = "//*[contains(@class,'header2__auth-container')]//button[contains(@data-modal-id,'new-log-reg')]")
    private WebElement newLoginBtn3;

  @FindBy(xpath = "//input[@type='text'][contains(@class,'email')]")
    private WebElement loginField;

  @FindBy(xpath = "//input[@type='password'][contains(@class,'new-input')]")
    private WebElement passwordField;

  @FindBy(xpath = "//button[contains(text(),'Войти')]")
    private WebElement enterBtn;

  @FindBy(xpath = "//*[contains(@class,'cookies')]//button[contains(@class,'js-cookie-accept')]")
    private WebElement coockie;

  public void openOtusUrl() {
  driver.get(Url.URLOTUS.getUrlOtus());
  }

  public void clickNewLoginBtn() {
    newLoginBtn.click();

  }
  public void clickNewLoginBtn2() {
    newLoginBtn.click();
  }

  public void openAndChecking()  {
//  driver = new FirefoxDriver();
//  WebDriverManager.firefoxdriver().setup();
////    WebDriverManager.chromedriver().setup();
////    driver = new ChromeDriver();
//    driver.get("https://otus.ru/");
//    driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    By container = By.xpath("//*[contains(@class,'header2__auth-container')]//button[contains(@data-modal-id,'new-log-reg')]");

wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.presenceOfElementLocated(container));
    newLoginBtn.click();
  }

  public void inputLogin() {
    loginField.sendKeys(serverConfiguration.login());
  }
  public void inputPassword() {
    passwordField.sendKeys(serverConfiguration.password());
  }

  public MainPage clickEnterBtn() {
    enterBtn.click();
    return new MainPage(driver);
  }
  //ASSERTS
//  public String loginAssert() {
//    String loginExpected = serverConfiguration.login();
//    //driver.findElement(By.xpath("//button[contains(@data-modal-id, 'new-log-reg')]"));
//    WebElement loginButton = driver.findElement(By.xpath("//input[@type='text'][contains(@class,'email')]"));
//    loginButton.sendKeys(serverConfiguration.login());
//    Assert.assertEquals("Login is doesn't correct", loginExpected,loginButton.getAttribute("value"));
//    return loginExpected;
//  }
//  public String passwordAssert() {
//    String emailExpected = serverConfiguration.password();
//    WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password'][contains(@class,'new-input')]"));
//    passwordInput.sendKeys(serverConfiguration.password());
//    Assert.assertEquals("Password doesn't correct", emailExpected,passwordInput.getAttribute("value"));
//    return emailExpected;
//  }
}
