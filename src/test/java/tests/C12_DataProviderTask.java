package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C12_DataProviderTask extends TestBase {

    @Test(dataProvider = "getFormData", dataProviderClass = utilities.DataProviderUtilities.class )
    void dataProviderTask(String ssn,String firstName, String lastName,String job, String username, String email, String password){
        driver.get("https://claruswaysda.github.io/Registration.html");
        driver.findElement(By.id("ssn")).sendKeys(ssn);
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        //gender
        WebElement dd = driver.findElement(By.id("job"));
        new Select(dd).selectByVisibleText(job);
        //pdf
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @Test(dataProvider = "faker", dataProviderClass = utilities.DataProviderUtilities.class )
    void dPTaskFaker2(String ssn,String firstName, String lastName,String job, String username, String email, String password){
        driver.get("https://claruswaysda.github.io/Registration.html");
        driver.findElement(By.id("ssn")).sendKeys(ssn);
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        //gender
        WebElement dd = driver.findElement(By.id("job"));
        new Select(dd).selectByVisibleText(job);
        //pdf
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);

    }

    //excel

    @Test(dataProvider = "excelDP", dataProviderClass = utilities.DataProviderUtilities.class )
        void dPTaskExcel3(String ssn,String firstName, String lastName,String job, String username, String email, String password){
        driver.get("https://claruswaysda.github.io/Registration.html");
        driver.findElement(By.id("ssn")).sendKeys(ssn);
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        //gender
        WebElement dd = driver.findElement(By.id("job"));
        new Select(dd).selectByVisibleText(job);
        //pdf
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);

    }

}
