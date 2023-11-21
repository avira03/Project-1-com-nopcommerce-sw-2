package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        String expectedResult = "Computers";

        String email = "abc@gmail.com";
        String pass = "123456";
        WebElement login = driver.findElement(By.xpath("//a[text() = 'Log in']"));
        login.click();

        WebElement loginEmail = driver.findElement(By.id("Email"));
        loginEmail.sendKeys(email);

        WebElement loginPass = driver.findElement(By.id("Password"));
        loginPass.sendKeys(pass);


        WebElement loginIn = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginIn.click();


        WebElement menu = driver.findElement(By.xpath("//a[text()='Computers ']"));
        String actualResult = menu.getText();

        Assert.assertEquals("Not redirected to Login page", expectedResult, actualResult);

    }


    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        String expectedResult = "Electronics";

        String email = "abc@gmail.com";
        String pass = "123456";
        WebElement login = driver.findElement(By.xpath("//a[text() = 'Log in']"));
        login.click();

        WebElement loginEmail = driver.findElement(By.id("Email"));
        loginEmail.sendKeys(email);

        WebElement loginPass = driver.findElement(By.id("Password"));
        loginPass.sendKeys(pass);


        WebElement loginIn = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginIn.click();


        WebElement menu = driver.findElement(By.xpath("//a[text()='Electronics ']"));
        String actualResult = menu.getText();

        Assert.assertEquals("Not redirected to Login page", expectedResult, actualResult);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        String expectedResult = "Apparel";

        String email = "abc@gmail.com";
        String pass = "123456";
        WebElement login = driver.findElement(By.xpath("//a[text() = 'Log in'] "));
        login.click();

        WebElement loginEmail = driver.findElement(By.id("Email"));
        loginEmail.sendKeys(email);

        WebElement loginPass = driver.findElement(By.id("Password"));
        loginPass.sendKeys(pass);


        WebElement loginIn = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginIn.click();


        WebElement menu = driver.findElement(By.xpath("//a[text()='Apparel ']"));
        String actualResult = menu.getText();

        Assert.assertEquals("Not redirected to Login page", expectedResult, actualResult);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        String expectedResult = "Digital downloads";

        String email = "abc@gmail.com";
        String pass = "123456";
        WebElement login = driver.findElement(By.xpath("//a[text() = 'Log in'] "));
        login.click();

        WebElement loginEmail = driver.findElement(By.id("Email"));
        loginEmail.sendKeys(email);

        WebElement loginPass = driver.findElement(By.id("Password"));
        loginPass.sendKeys(pass);


        WebElement loginIn = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginIn.click();


        WebElement menu = driver.findElement(By.xpath("//a[text()='Digital downloads '] "));
        String actualResult = menu.getText();

        Assert.assertEquals("Not redirected to Login page", expectedResult, actualResult);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        String expectedResult = "Books";

        String email = "abc@gmail.com";
        String pass = "123456";
        WebElement login = driver.findElement(By.xpath("//a[text() = 'Log in'] "));
        login.click();

        WebElement loginEmail = driver.findElement(By.id("Email"));
        loginEmail.sendKeys(email);

        WebElement loginPass = driver.findElement(By.id("Password"));
        loginPass.sendKeys(pass);


        WebElement loginIn = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginIn.click();


        WebElement menu = driver.findElement(By.xpath("//a[text()='Books '] "));
        String actualResult = menu.getText();

        Assert.assertEquals("Not redirected to Login page", expectedResult, actualResult);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        String expectedResult = "Jewelry";

        String email = "abc@gmail.com";
        String pass = "123456";
        WebElement login = driver.findElement(By.xpath("//a[text() = 'Log in'] "));
        login.click();

        WebElement loginEmail = driver.findElement(By.id("Email"));
        loginEmail.sendKeys(email);

        WebElement loginPass = driver.findElement(By.id("Password"));
        loginPass.sendKeys(pass);


        WebElement loginIn = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginIn.click();


        WebElement menu = driver.findElement(By.xpath("//a[text()='Jewelry '] "));
        String actualResult = menu.getText();

        Assert.assertEquals("Not redirected to Login page", expectedResult, actualResult);
    }

        @Test
        public void userShouldNavigateToGiftCardsPageSuccessfully() {

            String expectedResult = "Gift Cards";

            String email = "abcd@gmail.com";
            String pass = "123456";
            WebElement login = driver.findElement(By.xpath("//a[text() = 'Log in'] "));
            login.click();

            WebElement loginEmail = driver.findElement(By.id("Email"));
            loginEmail.sendKeys(email);

            WebElement loginPass = driver.findElement(By.id("Password"));
            loginPass.sendKeys(pass);


            WebElement loginIn = driver.findElement(By.xpath("//button[text()='Log in']"));
            loginIn.click();


            WebElement menu = driver.findElement(By.xpath("//a[text()='Gift Cards ']"));
            String actualResult = menu.getText();

            Assert.assertEquals("Not redirected to Login page", expectedResult, actualResult);


        }
    }



