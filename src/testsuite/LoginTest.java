package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/*2. Create the package ‘testsuite’ and create the following class inside the ‘testsuite’ package.
 1. LoginTest
 */
public class LoginTest extends BaseTest {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setup (){
        openBrowser(baseUrl);
    }
    @Test
    /* 3. Write down the following test into ‘LoginTest’ class
     1. userSholdLoginSuccessfullyWithValid Credentials
      * Enter “standard_user” username * Enter “secret_sauce” password
      * Click on ‘LOGIN’ button * Verify the text “PRODUCTS”
     */
    public void userShouldLoginSuccessfullyWithValidCredentials () {
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginbutton.click();
        WebElement mes = driver.findElement(By.xpath("//span[@class='title']"));
        String actualmes = mes.getText();
        System.out.println(actualmes);
        String expectedmes = "PRODUCTS";
        Assert.assertEquals(expectedmes,actualmes);
    }
    @Test
    /*2. verifyThatSixProductsAreDisplayedOnPage
    * Enter “standard_user” username * Enter “secret_sauce” password
    * Click on ‘LOGIN’ button
    * Verify that six products are displayed on page
     */
    public void verifyThatSixProductAreDisplayedOnPage () {
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginbutton.click();
        //List<WebElement>listIcon = driver.findElements(By.xpath("//span[@class='title']"));
       // int numbersOfItems = listIcon.size();
        //System.out.println(listIcon);
        WebElement mes = driver.findElement(By.xpath("//span[@class='title']"));
        String actualmes = mes.getText();
        System.out.println(actualmes);
        String expectedmes = "PRODUCTS";
        Assert.assertEquals(expectedmes, actualmes);

    }


    @After
    public void teardown (){
        //closeBrowser();
    }
}
