package com.spicejet.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.spicejet.qa.Base.TestBase;

public class KidsPage extends TestBase{
	
	
	@FindBy(xpath="//span[contains(text(),'Baby & Kids')]")
	WebElement Baby;
	
	@FindBy(linkText="Sandals")
	WebElement sandle;
	
	@FindBy(xpath="//img[@class='_1e_EAo']")
	WebElement image;
	
	@FindBy(xpath="//div[contains(text(),'6 - 7 Years')]")
	WebElement select;
	
	
	
	@FindBy(xpath="//a[contains(text(),'Boys Velcro Flats')]")
	WebElement sandleclick;
	
	public KidsPage(){
		PageFactory.initElements(driver,this);
	}
	public String titleofpage(){
		return driver.getTitle();
	
	}
	public boolean flipkartimage(){
		return image.isDisplayed();
	}
	public void mousetobaby(){
		Actions action=new Actions(driver);
		action.moveToElement(Baby).build().perform();
		
	}
	public void sandlelink(){
		sandle.click();
		
	}
	public void scrolldown(){
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,1000)");
	}
	public boolean selectage() throws Exception{
		select.click();
		Thread.sleep(5000);
		return select.isSelected();
		
		
	}
	
	public void clickprodut() throws Exception{
		Thread.sleep(2000);
		sandleclick.click();
	}
	
	

}
