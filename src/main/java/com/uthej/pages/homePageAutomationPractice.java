package com.uthej.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.uthej.base.testbase;

public class homePageAutomationPractice extends testbase {

	@FindBy(xpath ="//*[@class='logo img-responsive']")  
	WebElement logo;
	
	@FindBy(xpath ="/*[@id='homefeatured']/li[4]/div/div[2]/div[1]/span" )
	WebElement searchbuttona;
	

		
	// Initializing the Page Objects:
		public homePageAutomationPractice() {
			PageFactory.initElements(driver, this);
			driver.get(prop.getProperty("url"));
		}
		
		public String verifyHomePageTitle(){
			assert logo.isDisplayed();
			System.out.println("User successfully navigated to the AutomationPractice homepage");
			return driver.getTitle();
		}
		
		public void dressValue() {
			String cost;
			Double finalcost;
			System.out.println("Name ans Cost of the Dresses which cost less than $28");
			for (int i=1;i<8;i++)
			{
				WebElement TxtBoxContent =driver.findElement(By.xpath("//*[@id='homefeatured']/li["+i+"]/div/div[2]/div[1]/span[1]"));
				cost =TxtBoxContent.getText();
				cost =cost.substring(1);
				finalcost = Double.parseDouble(cost);
				if(finalcost<28.00)
				{
					WebElement dressName =driver.findElement(By.xpath("//*[@id='homefeatured']/li["+i+"]/div/div[2]/h5"));
					String DressType = dressName.getText();
					System.out.println(DressType +" : " +"$"+finalcost);
					cost =TxtBoxContent.getText();
				}
				
			}
			
			
		
	
		}
}
