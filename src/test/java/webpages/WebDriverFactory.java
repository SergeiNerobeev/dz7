package webpages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {

    private WebDriverFactory webDriverFactory;

    public static WebDriver getWebDriver (Browsers browsers){
      switch (browsers) {
        case CHROME:
          WebDriverManager.chromedriver();
          return new ChromeDriver();
        case FIREFOX:
          WebDriverManager.firefoxdriver();
          return new FirefoxDriver();
        case OPERA:
          WebDriverManager.operadriver();
          return new OperaDriver();
        default:
          throw new RuntimeException("Incorrect BrowserName");
      }
    }

  public WebDriverFactory getWebDriverFactory() {
    return webDriverFactory;
  }

  public void setWebDriverFactory(WebDriverFactory webDriverFactory) {
    this.webDriverFactory = webDriverFactory;
  }
}
