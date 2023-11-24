package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

// click on the ' forgot your password' link

        WebElement forgotPasswordLink = driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
        forgotPasswordLink.click();


        // verify the text 'reset password
        String expectedText = "Reset Password";
        // Find the actual text element and get the text from element
        WebElement actualTextElement = driver.findElement(By.xpath("//h6"));
        String actualText = actualTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Not redirected to Login page", expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}

    

