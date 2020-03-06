package com.uthej.testcases;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.uthej.base.testbase;
import com.uthej.pages.homePageAutomationPractice;

public class AutomationPractice extends testbase{

	homePageAutomationPractice Homepageautomationpractice;
	
	@BeforeTest
	public void setUp(){
		initialization();
		Homepageautomationpractice = new homePageAutomationPractice();	
	}
	

	@Test(priority=1)
	public void homepageautomationpractice(){
		String title =  Homepageautomationpractice.verifyHomePageTitle();
		Assert.assertEquals(title,"My Store");
		System.out.println("The Homepage Title is --"+title);
	}
	
	@Test(priority=2)
	public void enterNameSearchBox() throws InterruptedException {

		Homepageautomationpractice.dressValue();
	    
			}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

	
}
