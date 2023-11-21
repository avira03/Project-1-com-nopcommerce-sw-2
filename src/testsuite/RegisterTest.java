package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessful() {
        String expectedResult = "Register";
        WebElement reg = driver.findElement(By.xpath("//a[text()='Register']"));
        reg.click();

        WebElement register = driver.findElement(By.xpath("//h1[text()='Register']"));
        String actualResult = register.getText();

        Assert.assertEquals("Not redirected to Login page", expectedResult, actualResult);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        String expectedText = "Your registration completed";
        WebElement reg = driver.findElement(By.xpath("//a[text()='Register']"));
        reg.click();

        WebElement gender = driver.findElement(By.id("gender-male"));
        gender.click();

        WebElement fName = driver.findElement(By.id("FirstName"));
        fName.sendKeys("John");


        WebElement lName = driver.findElement(By.id("LastName"));
        lName.sendKeys("Smith");

        WebElement date = driver.findElement(By.name("DateOfBirthDay"));
        Select dropdownDate = new Select(date);
        dropdownDate.selectByVisibleText("19");

        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        Select dropdownMonth = new Select(month);
        dropdownMonth.selectByVisibleText("March");

        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        Select dropdownYear = new Select(year);
        dropdownYear.selectByVisibleText("1984");


        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("test_Email@gmail.com");


        WebElement pass = driver.findElement(By.id("Password"));
        pass.sendKeys("Pass123");

        WebElement confirmPass = driver.findElement(By.id("ConfirmPassword"));
        confirmPass.sendKeys("Pass123");

        WebElement regButton = driver.findElement(By.id("register-button"));
        regButton.click();

        WebElement regDone = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
        String actualText = regDone.getText();


        Assert.assertEquals("Not redirected to Login page", expectedText, actualText);
    }

    @After
    public void tearDown() {

        closeBrowser();
    }
}
