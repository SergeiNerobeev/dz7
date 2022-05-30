package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage{

  public MainPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//*[contains(@class, 'header2-menu__item-text__username')]")
  private WebElement textUserName;

  @FindBy(xpath = "//*[contains(@class, 'header2-menu__dropdown-text_name')]")
  private WebElement dropDownTextName;

  public void clickTextUserName() {
    WebDriverWait webDriverWait;
    webDriverWait = new WebDriverWait(driver, 3);
    webDriverWait.until(ExpectedConditions.elementToBeClickable(textUserName)).click();
    dropDownTextName.click();
  }

  public PersonalPage clickDropDownTextName() {
    WebDriverWait webDriverWait;
    webDriverWait = new WebDriverWait(driver, 3);
    webDriverWait.until(ExpectedConditions.stalenessOf(dropDownTextName));
    dropDownTextName.click();
    return new PersonalPage(driver);
  }
}
