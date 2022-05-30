package webpages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;


public class PersonalPage extends BasePage {

  WebDriver driver;
  public WebDriverWait webDriverWait;

  @FindBy(xpath = "//*[contains(@name,'fname_latin')]")
  private WebElement fName;

  @FindBy(xpath = "//*[contains(@name,'lname_latin')]")
  private WebElement lName;

  @FindBy(xpath = "//*[contains(@name,'blog_name')]")
  private WebElement bloggerName;

  @FindBy(xpath = "//*[contains(@name,'date_of_birth')]")
  private WebElement dateOfBirthday;

  @FindBy(xpath = "//p[contains(text(),'Уровень английского *')]")
  private WebElement clickOnLevelEngl;

  public PersonalPage(WebDriver driver) {
    super(driver);
  }

  public void setfName() {
    fName.sendKeys(serverConfiguration.fname());
  }
  public void setlName() {
    lName.sendKeys(serverConfiguration.lname());
  }
  public void setBloggerName() {
    bloggerName.sendKeys(serverConfiguration.bloggername());
  }
  public void setDateOfBirthday() {

  dateOfBirthday.sendKeys(serverConfiguration.dateofbirthday());
  clickOnLevelEngl.click();
  }
  public void scroll() {
    WebElement scrollElement = driver.findElement(By.xpath("//p[contains(text(),'Почта *')]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement);

  }

  @FindBy(xpath = " //*[contains(@class, 'lk-cv-block__line')][.//input[@name='country']]//*[@data-selected-option-class]")
  private WebElement countryField;

  @FindBy(xpath = "//*[contains(@class,'lk-cv-block__select-scroll_country')]//button[contains(@title,'Россия')]")
  private WebElement russia;

  @FindBy(xpath = " //*[contains(@class, 'lk-cv-block__line')][.//input[@name='city']]//*[@data-selected-option-class]")
  private WebElement cityField;

  @FindBy(xpath = "//button[contains(@title,'Москва')]")
  private WebElement cityDropDown;

  @FindBy(xpath = "//*[contains(@class,'lk-cv-block__select-options')]//*[contains(@class,'js-custom-select-options')]//button[contains(@title,'Москва')]")
  private WebElement moscow;

  @FindBy(xpath = "//*[contains(@class, 'lk-cv-block__line')][.//input[@name='english_level']]//*[@data-selected-option-class]")
  private WebElement englishLevelField;

  @FindBy(xpath = "//button[contains(@title,'Начальный уровень (Beginner)')]")
  private WebElement begginer;

  @FindBy(xpath = "//span[contains(text(),'Да')]")
  private WebElement yeas;

  @FindBy(xpath = "//span[contains(text(),'Удаленно')]")
  private WebElement remote;

  public void clickCountryField() {
    countryField.click();
  }

  public void setRussia() {
    russia.click();
  }
//TODO
  public void clickCityField() {
    cityField.click();
  }
  //TODO PW1 для проектной работы
//  public boolean data(LocalDate localDate){
//    String dataSome = "10.09.2012";
//    LocalDate data = LocalDate.parse(dataSome, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//    return data.isBefore(localDate);
//  }

  public void setMoscow() {
    moscow.click();
  }

  public void clickEnglishLevel() {
    englishLevelField.click();
  }

  public void setBegginer() {
    begginer.click();
  }

  public void setYes() {
    yeas.click();
  }

  public void setRemote() {
    remote.click();
  }

  @FindBy(xpath = "//button[contains(@class,'js-change-phone')]")
  private WebElement phoneNumber;

  @FindBy(xpath = "//div[@class='modal__close ic-close js-close-modal']")
  private WebElement closePhNumWindow;

  public void setPhoneNumber() {
    phoneNumber.click();
    closePhNumWindow.click();
  }

  @FindBy(xpath = "//button[contains(text(),'Отправить')]")
  private WebElement blueBtn;


  public void closePhoneNumberWindow() {
    closePhNumWindow.click();
  }

  public void scroll2() {
    WebElement scrollElement2 = driver.findElement(By.xpath("//p[contains(text(),'Почта *')]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement2);
  }

  @FindBy(xpath = "//*[contains(@class,'js-custom-select-presentation')]//span[contains(text(),'Способ связи')]")
  private WebElement addContact01;

  @FindBy(xpath = "//*[contains(@class,'lk-cv-block__select-scroll')]//button[@title='VK']")
  private WebElement addVK;

  @FindBy(xpath = "//input[@id='id_contact-0-value']")
  private WebElement addVKname;

  public void setContact01() {
    addContact01.click();
    addVK.click();
    addVKname.sendKeys(serverConfiguration.fname());
  }

  @FindBy(xpath = "//button[contains(text(),'Добавить')]")
  private WebElement addRow;

  @FindBy(xpath = "//*[contains(@class,'js-custom-select-presentation')]//span[contains(text(),'Способ связи')]")
  private WebElement addContact02;

  @FindBy(xpath = "//*[contains(@data-num,'1')]//*[contains(@class,'js-custom-select-options')]//button[contains(@title,'OK')][text()]")
  private WebElement addOk;

  @FindBy(xpath = "//input[@id='id_contact-1-value']")
  private WebElement addOkName;

  public void setContact02() {
    addRow.click();
    addContact02.click();
    addOk.click();
    addOkName.sendKeys(serverConfiguration.bloggername());
  }

  public void scroll3() {
    WebElement scrollElement3 = driver.findElement(By.xpath("//p[contains(text(),'Телефон *')]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement3);
  }

  @FindBy(xpath = "//select[@id='id_gender']")
  private WebElement gender;

  public void setGender() {
  Select se = new Select(gender);
  se.selectByValue("m");
  }

  @FindBy(xpath = "//input[@id='id_company']")
  private WebElement company;

  public void setCompany() {
    company.sendKeys(serverConfiguration.company());
  }

  @FindBy(xpath = "//input[@id='id_work']")
  private WebElement position;

  public void setPosition() {
    position.sendKeys(serverConfiguration.position());
  }

  @FindBy(xpath = "//a[@title='Добавить']")
  private WebElement addDevExp;

  public void setDevExp() {
    addDevExp.click();
  }

  @FindBy(xpath = "//*[contains(@title,'Сохранить и заполнить позже')]")
  private WebElement saveAndContinue;

  public void clickSaveAndContinue()  {
    saveAndContinue.click();
  }



 }








