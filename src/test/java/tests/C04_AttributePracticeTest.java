package tests;

import org.testng.annotations.Test;


public class C04_AttributePracticeTest {

//    Task 2: TestNG Annotation Attributes Practice
//    Objective: Implement various TestNG annotation attributes
//    Requirements:
//    Create a class called AttributePracticeTest
//    Create 5 test methods with different priorities (1, 3, 2, 5, 4)
//    Create one test method with enabled = false
//    Create a test method with timeout of 3 seconds that includes Thread.sleep(2000)
//    Create a test method with timeout of 1 second that includes Thread.sleep(2000) (should fail)
//    Add meaningful descriptions to all test methods
//    Create test methods with groups: "smoke", "regression", "api"

    @Test(priority = 1, enabled = false, description = "This is test 01", groups = {"smoke", "api"})
    void test01(){
        System.out.println("Test 01");
    }

    @Test(priority = 3, timeOut = 3000, description = "This is test 02", groups = "regression")
    void test02() throws InterruptedException {
        System.out.println("Test 02");
        Thread.sleep(2000);
    }

    @Test(priority = 2, timeOut = 1000, description = "This is test 03. This will fail", groups = "api")
    void test03() throws InterruptedException {
        System.out.println("Test 03");
        Thread.sleep(2000);
    }


    @Test(priority = 5, description = "This is test 04", groups = "regression")
    void test04(){
        System.out.println("Test 04");
    }

    @Test(priority = 4, description = "This is test 05", groups = "smoke")
    void test05(){
        System.out.println("Test 05");
    }

}
