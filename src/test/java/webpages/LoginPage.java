package webpages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import personalinfo.Url;

import java.time.Duration;

public class LoginPage extends BasePage {


  public WebDriverWait webDriverWait;

  public LoginPage(WebDriver driver) {
    super(driver);
  }



  @FindBy(xpath ="//button[contains(@data-modal-id, 'new-log-reg')]" )
    private WebElement newLoginBtn;

  @FindBy(xpath = "//*[contains(@class,'header2__auth-container')]//button[contains(@class,'header2__auth')]")
    private WebElement newLoginBtn2;

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
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://otus.ru/");
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
