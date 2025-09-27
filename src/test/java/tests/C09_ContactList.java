package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C09_ContactList extends TestBase {

    /*
        Go to https://thinking-tester-contact-list.herokuapp.com/
        Enter email as "johndoeSDA@yahoo.com" using parameter
        Enter password as "John.123" using parameter
        Create a contact using parameter(Only firstname and lastname)
        Assert the added contact.
        Make the group name "CL" for method and run it via group.
     */

    @Test(groups = {"CL"})
    @Parameters({"email", "password", "firstName", "lastName"})
    void contactListTest(@Optional("johndoeSDA@yahoo.com") String email, @Optional("John.123") String password, @Optional("SDA3045-Norah") String firstName, @Optional("Alshdoukhi")String lastName){
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();

        driver.findElement(By.id("add-contact")).click();
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("submit")).click();

        String addedContact = driver.findElement(By.xpath("//td[contains(text(),'" + firstName + " " + lastName + "')]")).getText();
        String fullName = firstName + " " + lastName;
        Assert.assertEquals(addedContact, fullName );

    }

}