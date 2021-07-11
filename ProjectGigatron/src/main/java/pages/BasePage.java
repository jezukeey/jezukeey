package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    @FindBy(id = "app-container")
    WebElement appContainerButton;

    @FindBy(id = "burger-button")
    WebElement allProizvodiSideBarLink;

    @FindBy(id = "hd-reg")
    WebElement loginButtonField;

    @FindBy(id = "logout_dropdown_menu_link")
    WebElement logOutDropDownMenuLink;

    ChromeDriver driver = null;

    public BasePage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public BasePage clickBurgerButton() {
        allProizvodiSideBarLink.click();
        return this;
    }

    public ProizvodiPage clickAllItemsFromSideBarMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(allProizvodiSideBarLink));
        allProizvodiSideBarLink.click();
        return new ProizvodiPage(driver);
    }

//    public LoginPage clickLogout() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//        wait.until(ExpectedConditions.visibilityOf(logOutDropDownMenuLink));
//        logOutDropDownMenuLink.click();
//        return new LoginPage(driver);
//    }


}
