import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;
import pages.Strings;

public class BaseTest {
    ChromeDriver driver = null;


    public ChromeDriver openChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--start-maximized"});
        options.addArguments(new String[]{"--ignore-certificate-errors"});
        options.addArguments(new String[]{"--disable-popup-blocking"});
        options.addArguments(new String[]{"--incognito"});
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        return driver;
    }


    public LoginPage loginToLoginPage(ChromeDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmailAddress(Strings.LOGIN_USER);
        loginPage.enterPassword(Strings.VALID_PASSWORD);
        LoginPage LoginPage = loginPage.clickSubmitButtonSuccess();
        return loginPage;
    }

    public void print(String s) {
        System.out.println(s);
    }

    //Hardcodovani sleep. Tj. on samo ceka 2 sekunde
    public void sleep() {
        try {
            Thread.sleep(2000);

        } catch (Exception e) {
        }
    }

    public void testSuccessfulLogIn() {
        ChromeDriver driver = openChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmailAddress("projectgigatron@gmail.com");
        loginPage.enterPassword("passwordon11");
        LoginPage inventoryPage = loginPage.clickSubmitButtonSuccess();
    }
}

