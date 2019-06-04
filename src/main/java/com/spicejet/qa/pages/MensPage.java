package com.spicejet.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.qa.Base.TestBase;

public class MensPage extends TestBase {
	
	String Parent=driver.getWindowHandle();
	
//	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
//	WebElement Email;
//	
//	@FindBy(xpath="//*[@type='password']")
//	WebElement Pass;
//	
//	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
//	WebElement Login; 
//	
//	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
//	WebElement close;
	
	@FindBy(xpath="//span[contains(text(),'Men')]")
	WebElement Men;
	
	@FindBy(xpath="//a[contains(text(),'Sweaters')]")
	WebElement Sweater;
	
	@FindBy(xpath="//a[contains(text(),'Solid Crew Neck Casual Men Black Sweater')]")
	WebElement product;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement add;
	
	@FindBy(xpath="//a[contains(text(),'S')]")
	WebElement small;
	
	
	
	public MensPage(){
		PageFactory.initElements(driver, this);
	}
	public void scroll(){
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView();", add);
	
	}
	public void smallsize(){
		small.click();
	}
	public void addcart(){
		add.click();
	}
	public void men(){
		Actions actions=new Actions(driver);
		actions.moveToElement(Men).build().perform();
	}
	
	public void clicksweater(){
		Sweater.click();
	}
	public void clickproduct(){
		product.click();
		
	}

//	public void closedata(){
//		close.click();
//	}
	public String tittle(){
		return driver.getTitle();
	}
	public void change(){
		//String parent=driver.getWindowHandle();
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it=handle.iterator();
		for(String child:handle){
			
			if(!Parent.equals(child)){
				driver.switchTo().window(child);
				
			}
			
		}
	}
	public void parent(){
		driver.switchTo().window(Parent);
	}
	
//	public void login(String Em,String Ps) throws Exception{
//		
//		Email.sendKeys(Em);
//		//Thread.sleep(2000);
//		Email.sendKeys(Ps);
//		Email.click();
//	}
	public void child(){
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it=handle.iterator();
		
		String parnet1=it.next();
		System.out.println(parnet1);
		
	String childwindow=it.next();
	System.out.println(childwindow);
		
	driver.switchTo().window(childwindow);
		
	}
	

}
