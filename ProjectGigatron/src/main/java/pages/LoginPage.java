package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //  Ulogujte se koristeci Vas email i lozinku.
    @FindBy(id = "hd-reg")
    WebElement prijavaDropdownButton;

    // E-mail field
    @FindBy(id = "email")
    WebElement emailField;

    //  Password field
    @FindBy(id = "password")
    WebElement passwordField;

    // Prijava click login button
    @FindBy(id = "btn btn-primary btn-wide")
    WebElement PrijavaButtonField;

    @FindBy(xpath = "//h3[@data-test = 'Doslo je do greske. Korisnik nije pronaden ili je neispravna lozinka.']")
    WebElement errorMessageContainer;

    ChromeDriver driver = null;
    public LoginPage(ChromeDriver driver) {
        driver.get("https://www.gigatron.rs/");
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public LoginPage enterEmailAddress(String emailField, WebElement email) {
        //We can check first if webelement is displayed on a web page
        assert email.isDisplayed();
        email.sendKeys(emailField);
        return this;
    }

    public LoginPage enterPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickSubmitButtonSuccess() {
        PrijavaButtonField.click();
        return new LoginPage(driver);
    }

    public LoginPage enterEmailAddress(String LOGIN_USER) {
    }
//
//    public LoginPage clickSubmitButtonFailure() {
//        loginButton.click();
//        return this;
//    }

//    public String getErrorMessage() {
//        String errorMessage = errorMessageContainer.getText();
//        return errorMessage;
//    }

//    public LoginPage clickCloseErrorMessage() {
//        errorButtonClose.click();
//        return this;
//    }

//    public void enterEmailAddress(String loginUser) {
//    }

