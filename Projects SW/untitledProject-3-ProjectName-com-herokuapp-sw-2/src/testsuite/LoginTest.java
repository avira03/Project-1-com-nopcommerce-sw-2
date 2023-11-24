package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
        static String baseUrl = "http://the-internet.herokuapp.com/login";

        @Before
        public void setUp() {

            openBrowser(baseUrl);
        }
        @Test
        public void userShouldLoginSuccessfullyWithValidCredentials(){
            //Find username filed element and enter "tomsmith" username
            WebElement Username = driver.findElement(By.id("username"));
            Username.sendKeys("tomsmith");
            //Find password filed element and enter “SuperSecretPassword!” password
            WebElement Password = driver.findElement(By.id("password"));
            Password.sendKeys("SuperSecretPassword!");
            //Find Click on button and ‘LOGIN’
            WebElement loginButtonElement = driver.findElement(By.tagName("button"));
            loginButtonElement.click();
            //Verify the text “Secure Area”
            String expectedMessage = "Secure Area";
            WebElement actualTextElement = driver.findElement(By.xpath("//h2"));
            String actualText = actualTextElement.getText();
            Assert.assertEquals("Redirected to Secure Area", expectedMessage, actualText);
        }

        @Test
        public void verifyTheUsernameErrorMessage(){
            //Find username filed element and enter "tomsmith1" username
            WebElement Username = driver.findElement(By.id("username"));
            Username.sendKeys("tomsmith1");
            //Find password filed element and enter “SuperSecretPassword!” password
            WebElement Password = driver.findElement(By.id("password"));
            Password.sendKeys("SuperSecretPassword!");
            //Find Click on button and ‘LOGIN’
            WebElement loginButtonElement = driver.findElement(By.tagName("button"));
            loginButtonElement.click();
            //Verify the error message “Your username is invalid!”
            String expectedMessage = "Your username is invalid!";
            WebElement actualTextElement = driver.findElement(By.id("flash"));
            String actualText = actualTextElement.getText();
            Assert.assertEquals("Invalid username is not matching", expectedMessage, actualText);
        }

        @Test
        public void verifyThePasswordErrorMessage(){
            //Find username filed element and enter "tomsmith" username
            WebElement Username = driver.findElement(By.id("username"));
            Username.sendKeys("tomsmith");
            //Find password filed element and enter “SuperSecretPassword” password
            WebElement Password = driver.findElement(By.id("password"));
            Password.sendKeys("SuperSecretPassword");
            //Find Click on button and ‘LOGIN’
            WebElement loginButtonElement = driver.findElement(By.tagName("button"));
            loginButtonElement.click();
            //Verify the error message “Your password is invalid!”
            String expectedMessage = "Your password is invalid!";
            WebElement actualTextElement = driver.findElement(By.id("flash"));
            String actualText = actualTextElement.getText();
            Assert.assertEquals("Invalid password is not matching", expectedMessage, actualText);

        }
        @After
        public void tearDown(){
            closeBrowser();
        }

    }





