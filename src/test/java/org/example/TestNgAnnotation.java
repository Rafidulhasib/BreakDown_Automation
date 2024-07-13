package org.example;

import org.testng.annotations.*;

public class TestNgAnnotation {
    @Test (priority = 0)
        public void testCase2(){
            System.out.println("This is the Normal Test Case 2");
        }
        @Test(priority = 0)
    public void  testCase1(){
        System.out.println("This is the Normal Test Case 1");
        }

        @BeforeMethod
    public void beforeMethod(){
        System.out.println("This will execute before every Method");
        }
        @AfterMethod
    public void afterMethod(){
            System.out.println("This will execute after every Method");
        }

        @BeforeClass
    public void beforeClass(){
        System.out.println("This will execute before the class");
        }

        @AfterClass
    public void afterClass(){
            System.out.println("This will execute after the class");
        }
        @BeforeTest
       public void beforeTest(){
        System.out.println("This will execute before the test");
        }
        @AfterTest
       public void afterTest(){
        System.out.println("This will execute after the test");
     }



}
