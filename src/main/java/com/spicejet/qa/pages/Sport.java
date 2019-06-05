package com.spicejet.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.qa.Base.TestBase;

public class Sport extends TestBase {
	String Parent=driver.getWindowHandle();
	@FindBy(xpath="//span[contains(text(),'Sports, Books & More')]")
	WebElement Sports;
	
	@FindBy(xpath="//a[contains(text(),'Car & Bike Accessories')]")
	WebElement Car;
	
	@FindBy(xpath="//div[contains(text(),'Flat 30% Off')]")
	WebElement helmet;
	
	@FindBy(xpath="//a[contains(text(),'Royal Enfield OF RVP Stripe Motorbike Helmet')]")
	WebElement Royal;
	
	@FindBy(xpath="//*[@class='_1TJldG']")
	WebElement Medium;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement add;
	public Sport(){
		PageFactory.initElements(driver,this);
	}
	public void royal(){
		Royal.click();
	}
	public void chidwindow() throws Exception{
		Set<String> handle=driver.getWindowHandles();
		Iterator<String>it=handle.iterator();
		System.out.println(it.next());
		for(String child:handle){
			if(!Parent.equals(child)){
				driver.switchTo().window(child);
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
			}
		}
		
	}
	public void addtocart(){
		add.click();
	}
	public void medium(){
		Medium.click();
	}
	public void SportBook(){
		
		Actions action=new Actions(driver);
		action.moveToElement(Sports).build().perform();
	}
	public void carlink(){
		Car.click();
	}
	public void scroll(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
	}
	public void helemetlink(){
		helmet.click();
	}
	public void parent(){
		driver.close();
		driver.switchTo().window(Parent);
		
	}
	
	

}
