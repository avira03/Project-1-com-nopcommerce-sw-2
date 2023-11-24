package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest {
    static String baseUrl = "https://www.saucedemo.com";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        String username = "standard_user";
        String password = "secret_sauce";
        //enter credentials
        //WebElement userName = driver.findElement(By.id("user-name"));
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys(username);

        WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys(password);

        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

// Verify
        String expectedResult = "Products";
        WebElement prod = driver.findElement(By.xpath("//span[@class='title']"));
        String actualResult = prod.getText();

        //Verify expected and actual text
        Assert.assertEquals("Not redirected to Login page", expectedResult, actualResult);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        String username = "standard_user";
        String password = "secret_sauce";
        //enter credentials
        //WebElement userName = driver.findElement(By.id("user-name"));
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys(username);

        WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys(password);

        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

// Verify
        int expectedProducts = 6;
        //WebElement prod = driver.findElements(By.xpath("//div[@class='inventory_list']"));
        List<WebElement> prodList = driver.findElements(By.xpath("//div[@class='inventory_item']"));

        int actualProducts = prodList.size();

        //Verify expected and actual products
        Assert.assertEquals("Not redirected to Login page", expectedProducts, actualProducts);
    }


    @After
    public void tearDown() {

        closeBrowser();
    }

}
