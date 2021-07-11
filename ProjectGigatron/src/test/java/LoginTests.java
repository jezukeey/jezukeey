import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ProizvodiPage;
import pages.LoginPage;
import pages.Strings;

import static pages.Strings.VALID_PASSWORD;

public class LoginTests extends BaseTest {
    ;    /**
     * Test - Successful login with valid credentials
     * Steps:
     * 1. Navigate to gigatron site
     * 2. enter valid username
     * 3. enter valid password
     * 4.click login button
     *
     * Expected result:
     * 4.Verify that user is logged in
     */
    @Test
    public void testSuccessfulLogIn() {
        ChromeDriver driver =  openChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmailAddress(Strings.LOGIN_USER).enterPassword(String.VALID_PASSWORD);
        ProizvodiPage loginPage = loginPage.clickSubmitButtonSuccess();
        String currentPageURL = driver.getCurrentUrl();
        Assert.assertTrue("We are not logged in. Expected url : " + Strings.PROIZVODI_SIDE_BAR_URL +
                ". Actual: " + currentPageURL, currentPageURL.contains(Strings.PROIZVODI_SIDE_BAR_URL));
        ProizvodiPage.clickBurgerButton()
                .clickLogout();

        driver.quit();
    }

//    /**
//     * Test - Unsuccessful login with invalid username and valid pass
//     * Steps:
//     * 1. Navigate to sauce lab demo site
//     * 2. enter invalid username
//     * 3. enter valid password
//     * 4. click login button
//     *
//     * Expected result:
//     * 4.Verify that user is not logged in, stays on login page
//     *  Verify that error message is shown
//     */
//    @Test
//    public void testInvalidUsernameAndValidPass() {
//        ChromeDriver driver =  openChromeDriver();
//        try {
//            LoginPage loginPage = new LoginPage(driver);
//            loginPage.enterUserName(Strings.INVALID_USER)
//                    .enterPassword(Strings.VALID_PASSWORD)
//                    .clickSubmitButtonFailure();
//            String currentPageURL = driver.getCurrentUrl();
//            Assert.assertTrue("We are not logged in. Expected url : " + Strings.LOGIN_URL +
//                    ". Actual: " + currentPageURL, currentPageURL.contains(Strings.LOGIN_URL));
//            String currentErrorMessage = loginPage.getErrorMessage();
//            Assert.assertTrue("Wrong error: Expected : " + Strings.LOGIN_ERROR_MESSAGE + ". Actual: "
//                    + currentErrorMessage, currentErrorMessage.equals(Strings.LOGIN_ERROR_MESSAGE));
//            loginPage.clickCloseErrorMessage();
//        } finally {
//            driver.quit();
//        }
//
//
//    }
//}
//
