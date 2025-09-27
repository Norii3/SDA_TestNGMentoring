package utilities;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

public class DataProviderUtilities {


    @DataProvider
    public Object[][] getFormData(){
        return new Object[][]{
                {"123-45-6789", "Norah", "Alshdoukhi", "Tester","nora", "nora@gmail.com", "nora1234"},
                {"123-45-6789", "Sara", "Salem", "Designer","sara", "sara@gmail.com", "sara1234"},
                {"123-45-6789", "Hala", "Ahmed", "Manager","hala", "hala@gmail.com", "hala1234"},
                {"123-45-6789", "Hanan", "Khaled", "Developer","hanan", "hanan@gmail.com", "hanan123"},
                {"123-45-6789", "Marya", "Abdullah", "Other","marya", "marya@gmail.com", "marya123"},
        };
    }

    @DataProvider(name = "faker")
    public Object[][] getFormDataFaker() {
        Faker faker = new Faker();
        return new Object[][]{
                {faker.idNumber().ssnValid(), faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1,6),faker.name().username(), faker.internet().emailAddress(), faker.internet().password(8,10)},
                {faker.idNumber().ssnValid(), faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1,6),faker.name().username(), faker.internet().emailAddress(), faker.internet().password(8,10)},
                {faker.idNumber().ssnValid(), faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1,6),faker.name().username(), faker.internet().emailAddress(), faker.internet().password(8,10)},
                {faker.idNumber().ssnValid(), faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1,6),faker.name().username(), faker.internet().emailAddress(), faker.internet().password(8,10)},
                {faker.idNumber().ssnValid(), faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1,6),faker.name().username(), faker.internet().emailAddress(), faker.internet().password(8,10)}
        };
    }

    //excel
//باقي ملف الاكسل
    @DataProvider(name = "excelDP")
    public Object[][] getUserDataFromExcel() {
        ExcelUtilities eu = new ExcelUtilities("Users.xlsx", "UserData");
        return eu.getExcelDataAsArray();
    }


    @DataProvider
    public Object[][] addRecord(){
        return new Object[][]{
                {"Tom", "25", "UK"},
                {"Sara", "23", "USA"},
                {"John", "49", "Canada"},
                {"Marya", "35", "UK"}
        };
    }

    @DataProvider(name = "fakerRecords")
    public Object[][] addRecordFaker() {
        Faker faker = new Faker();
        return new Object[][]{
                {faker.name().name(), faker.number().numberBetween(18,65), faker.number().numberBetween(1, 6)},
                {faker.name().name(), faker.number().numberBetween(18,65), faker.number().numberBetween(1, 6)},
                {faker.name().name(), faker.number().numberBetween(18,65), faker.number().numberBetween(1,6)},
                {faker.name().name(), faker.number().numberBetween(18,65), faker.number().numberBetween(1,6)}
        };
    }

    @DataProvider(name = "excelRecords")
    public Object[][] addRecordExcel() {
        ExcelUtilities eu = new ExcelUtilities("WebTable.xlsx", "Record");
        return eu.getExcelDataAsArray();
    }

}
