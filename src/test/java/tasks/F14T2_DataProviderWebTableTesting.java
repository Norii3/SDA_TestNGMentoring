package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBase;

public class F14T2_DataProviderWebTableTesting extends TestBase {

    //
    @Test(dataProvider = "addRecord", dataProviderClass = utilities.DataProviderUtilities.class)
    void dPWebTableTesting(String name,String age, String country){
        //go to https://claruswaysda.github.io/addRecordWebTable.html
        driver.get("https://claruswaysda.github.io/addRecordWebTable.html");
        //Add records to the using DataProvider
        driver.findElement(By.id("nameInput")).sendKeys(name);
        driver.findElement(By.id("ageInput")).sendKeys(age);
        WebElement dd = driver.findElement(By.id("countrySelect"));
        new Select(dd).selectByVisibleText(country);

        driver.findElement(By.xpath("//button[.='Add Record']")).click();
    }

    //Faker
    @Test(dataProvider = "fakerRecords", dataProviderClass = utilities.DataProviderUtilities.class)
    void dPWebTableTesting2(String name,String age, String country){
        //go to https://claruswaysda.github.io/addRecordWebTable.html
        driver.get("https://claruswaysda.github.io/addRecordWebTable.html");
        //Add records to the using DataProvider
        driver.findElement(By.id("nameInput")).sendKeys(name);
        driver.findElement(By.id("ageInput")).sendKeys(age);
        WebElement dd = driver.findElement(By.id("countrySelect"));
        new Select(dd).selectByVisibleText(country);

        driver.findElement(By.xpath("//button[.='Add Record']")).click();
    }

    //Excel
    @Test(dataProvider = "excelRecords", dataProviderClass = utilities.DataProviderUtilities.class)
    void dPWebTableTesting3(String name,String age, String country){
        //go to https://claruswaysda.github.io/addRecordWebTable.html
        driver.get("https://claruswaysda.github.io/addRecordWebTable.html");
        //Add records to the using DataProvider
        driver.findElement(By.id("nameInput")).sendKeys(name);
        driver.findElement(By.id("ageInput")).sendKeys(age);
        WebElement dd = driver.findElement(By.id("countrySelect"));
        new Select(dd).selectByVisibleText(country);

        driver.findElement(By.xpath("//button[.='Add Record']")).click();
    }

}
