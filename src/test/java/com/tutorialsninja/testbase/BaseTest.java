package com.tutorialsninja.testbase;


import com.tutorialsninja.utilities.Utility;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = "Chrome";

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);

    }
    @BeforeMethod
    public void tearDown(){
        closeBrowser();
    }
}
