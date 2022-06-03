package webpages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;
import personalinfo.*;



public class PersonalPage extends BasePage {


  public WebDriverWait webDriverWait;
  public PersonalPage(WebDriver driver) {
    super(driver);
  }

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
  public void assertItAll() {

    WebElement actualFirstName = driver.findElement(By.xpath("//*[contains(@class,'container__col container__col_6')]//input[contains(@value,'John')]"));
    String expectedName = FirstName.JOHN.getFirstName();
    Assert.assertEquals("First Name of user doesn't correct", expectedName, actualFirstName.getAttribute("value"));

    WebElement actualLastName = driver.findElement(By.xpath("//*[contains(@class,'container__col container__col_6')]//input[contains(@value,'Smith')]"));
    String expectedLastName = LastName.SMITH.getLastName();
    Assert.assertEquals("Last Name of user doesn't correct", expectedLastName, actualLastName.getAttribute("value"));

    WebElement actualBloggerName = driver.findElement(By.xpath("//*[contains(@id,'id_blog_name')]"));
    String expectedBloggerName = BloggerName.AMERICANO.getBloggerName();
    Assert.assertEquals("Blogger Name is not correct", expectedBloggerName, actualBloggerName.getAttribute("value"));

    WebElement actualDateOfBirth = driver.findElement(By.xpath("//*[contains(@value,'01.01.2001')]"));
    String expectedDateOfBirth = DateOfBirthday.DATEONE.getDateOfBirthday();
    Assert.assertEquals("Date of Birth is not doesn't correct", expectedDateOfBirth, actualDateOfBirth.getAttribute("value"));

    WebElement scrollElement3 = driver.findElement(By.xpath("//p[contains(text(),'Контактная информация')]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement3);

    WebElement countryActual1 = driver.findElement(By.xpath("//*[contains(@class, 'lk-cv-block__select-scroll_country')]//button[contains(@title,'Россия')]"));
    String countryExpected1 = Country.RUSSIA.getCountry();
    Assert.assertEquals("Country is wrong", countryExpected1, countryActual1.getAttribute("title"));

    WebElement cityActual1 = driver.findElement(By.xpath("//*[contains(@class,'lk-cv-block__select-option')][contains(@title,'Москва')]"));
    String cityExpected1 = City.MOSCOW.getCity();
    Assert.assertEquals("City is wrong", cityExpected1, cityActual1.getAttribute("title"));

    WebElement englishActual1 = driver.findElement(By.xpath("//button[contains(@title,'Начальный уровень (Beginner)')]"));
    String englishExpected1 = Englishlevel.BEGINNER.getEnglishLevel();
    Assert.assertEquals("English level is wrong", englishExpected1, englishActual1.getAttribute("title"));

    WebElement checkYeas1 = driver.findElement(By.xpath("//span[contains(text(),'Да')]"));
    Assert.assertTrue(checkYeas1.isDisplayed());

    WebElement checkRemote1 = driver.findElement(By.xpath("//span[contains(text(),'Удаленно')]"));
    Assert.assertTrue(checkRemote1.isDisplayed());

    WebElement checkFieldEmail = driver.findElement(By.xpath("//input[@id='id_email']"));
    Assert.assertTrue(checkFieldEmail.isDisplayed());

    WebElement clearFieldPhone = driver.findElement(By.xpath("//input[@id='id_phone']"));
    Assert.assertTrue(clearFieldPhone.isDisplayed());

    WebElement scrollElement4 = driver.findElement(By.xpath("//p[contains(text(),'Телефон *')]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement4);

    WebElement okActual1 = driver.findElement(By.xpath("//*[contains(@class,'lk-cv-block__select-scroll')]//button[@title='OK']"));
    String okExcepted1 = Communication.OK.getCommunication();
    Assert.assertEquals("Communication 2 is wrong", okExcepted1, okActual1.getAttribute("title"));

    WebElement americanoActual = driver.findElement(By.xpath("//input[@id='id_contact-0-value']"));
    String americanoExpected = BloggerName.AMERICANO.getBloggerName();
    Assert.assertEquals("Name is wrong or not Americano", americanoExpected, americanoActual.getAttribute("value"));

    WebElement vkActual1 = driver.findElement(By.xpath("//*[contains(@class,'lk-cv-block__select-scroll')]//button[@title='VK']"));
    String vkExpected1 = Communication.VK.getCommunication();
    Assert.assertEquals("Communication is wrong", vkExpected1, vkActual1.getAttribute("title"));

    WebElement JohnActual = driver.findElement(By.xpath("//input[@id='id_contact-1-value']"));
    String JohnExpected = FirstName.JOHN.getFirstName();
    Assert.assertEquals("First name is wrong", JohnExpected, JohnActual.getAttribute("value"));

    WebElement scrollElement2 = driver.findElement(By.xpath("//h3[contains(text(),'Другое')]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement2);

    WebElement genderActual1 = driver.findElement(By.xpath("//select[@id='id_gender']//option[contains(@value,'m')]"));
    String genderExpected1 = Gender.MALE.getGender();
    Assert.assertEquals("Gender is wrong", genderExpected1, genderActual1.getAttribute("value"));

    WebElement companyActual = driver.findElement(By.xpath("//input[@id='id_company']"));
    String companyExpected = Company.EMI.getCompany();
    Assert.assertEquals("Company is wrong", companyExpected, companyActual.getAttribute("value"));

    WebElement positionActual = driver.findElement(By.xpath("//input[@id='id_work']"));
    String positionExpected = Position.POSITIONONE.getPosition();
    Assert.assertEquals("Position is wrong", positionExpected, positionActual.getAttribute("value"));

    WebElement checkAdding1 = driver.findElement(By.xpath("//select[@id='id_experience-0-experience']"));
    Assert.assertTrue(checkAdding1.isDisplayed());

    WebElement checkAdding2 = driver.findElement(By.xpath("//select[@id='id_experience-0-level']"));
    Assert.assertTrue(checkAdding2.isDisplayed());
  }

 }








