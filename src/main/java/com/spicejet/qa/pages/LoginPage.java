package com.spicejet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.qa.Base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement Email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Pass;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement Login; 
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	WebElement close;
	
	public 	LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateloginpagetitle(){
		 return driver.getTitle();
	}
	public void login(String Em,String pa) throws Exception{
		Email.sendKeys(Em);
		Pass.sendKeys(pa);	
		Thread.sleep(2000);
		Login.click();
	}
	public void closedata(){
		close.click();
	}
	


}
