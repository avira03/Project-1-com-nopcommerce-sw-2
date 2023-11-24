package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseTest {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        String username = "Admin";
        String pass = "admin123";

        //enter credentials
        WebElement emailField = driver.findElement(By.xpath("//input[@name='username']"));
        emailField.sendKeys(username);

        WebElement passField = driver.findElement(By.xpath("//input[@name='password']"));
        passField.sendKeys(pass);

        // find the login link and click on login link

         WebElement loginlink = driver.findElement(By.xpath("//button[@type='submit']"));
        loginlink.click();

        // check if login was successful
        String expectedText = "Dashboard";
        // Find the actual text element and get the text from element
        WebElement actualTextElement = driver.findElement(By.xpath("//h6"));
        String actualText = actualTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Not redirected to Login page",expectedText, actualText);

    }
    @After
    public void tearDown(){

        closeBrowser();
    }
}



