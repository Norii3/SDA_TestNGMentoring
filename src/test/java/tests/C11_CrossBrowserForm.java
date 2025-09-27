package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.ArrayList;

public class C11_CrossBrowserForm extends TestBase {

    @Test
    @Parameters({"name", "age", "ddepartment"})
    void test1(@Optional("Norah") String name, @Optional("25") String age, @Optional("IT Department") String department){
//        Go to https://claruswaysda.github.io/ActionsForm.html
          driver.get("https://claruswaysda.github.io/ActionsForm.html");

//        Fill form and submit
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("age")).sendKeys(age);
        WebElement dd = driver.findElement(By.id("options"));
        new Select(dd).selectByVisibleText(department);
        driver.findElement(By.xpath("//input[@value='coding']")).click();
        driver.findElement(By.xpath("//input[@value='female']")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        String passcode = driver.switchTo().alert().getText().replaceAll("\\D", "");
        driver.switchTo().alert().accept();
        driver.switchTo().alert().sendKeys(passcode);
        driver.switchTo().alert().accept();
        driver.switchTo().frame("iframeSubmit");
        driver.findElement(By.id("submitButton")).click();



//        Do all actions and assert
        String scondPageHandle = new ArrayList<>(driver.getWindowHandles()).get(1);
        driver.switchTo().window(scondPageHandle);

        WebElement source = driver.findElement(By.id("drag1"));
        WebElement target = driver.findElement(By.id("drop1"));
        WebElement contextClick = driver.findElement(By.id("showSuccessButton"));
        WebElement doubleClick = driver.findElement(By.id("doubleClickButton"));
        WebElement hover = driver.findElement(By.id("hoverButton"));

        Actions actions = new Actions(driver);
        actions
                .dragAndDrop(source, target)
                .contextClick(contextClick)
                .doubleClick(doubleClick)
                .moveToElement(hover)
                .perform();

        assert driver.findElement(By.id("info")).getText().contains("The Selenium WebDriver");

//        Do this test with Chrome, Edge and Firefox


    }
}
