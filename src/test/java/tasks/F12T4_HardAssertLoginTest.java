package tasks;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class F12T4_HardAssertLoginTest extends TestBase {


    @Test
    void hardAssertionTest(){
        //Navigate to https://claruswaysda.github.io/signIn.html
        driver.get("https://claruswaysda.github.io/signIn.html");
        //Enter username: "admin"
        driver.findElement(By.id("username")).sendKeys("admin");
        //Enter password: "123"
        driver.findElement(By.id("password")).sendKeys("123");
        //Click Submit button
        driver.findElement(By.xpath("//input[@value='Sign In']")).click();

        //Use hard assertions to verify:
        //1-New page URL is "https://claruswaysda.github.io/signIn.html"
        Assert.assertEquals(driver.getCurrentUrl(), "https://claruswaysda.github.io/signIn.html", "URL did not match after login!");

        //2-Page contains text "Employee Table"
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("Employee Table"), "Employee Table text not found on the page!");

    }


}
