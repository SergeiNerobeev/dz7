package webpages;

import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

  protected  IServerConfiguration serverConfiguration = ConfigFactory.create(IServerConfiguration.class);
  protected  Logger logger = (Logger) LogManager.getLogger(MainTest.class);
  protected WebDriverWait webDriverWait;
  protected WebDriver driver;

  public BasePage(WebDriver driver) {
    this.driver = driver;
    this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    PageFactory.initElements(driver, this);
  }




}