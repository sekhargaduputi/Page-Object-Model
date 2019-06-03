package com.spicejet.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.spicejet.qa.Base.TestBase;

public class EletronicPage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Electronics')]")
	WebElement Electronic;
	
	@FindBy(xpath="//a[contains(text(),'Mi')]")
	WebElement Mi;
	
	/*@FindBy(xpath="//select[@class='fPjUPw']/[1]/option")
	WebElement drop;*/
	
	@FindBy(xpath="//select[@class='fPjUPw']")
	WebElement dropd;
	
	
	@FindBy(xpath="//input[@class='_2zrpKA']")
	WebElement Email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Pass;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement Login;  
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	WebElement close;
	
	
	public EletronicPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	public String tittle(){
		
		return driver.getTitle();
	}
	public void closedata(){
		close.click();
	}
	public void login(String Em,String Ps){
		Email.sendKeys(Em);
		Pass.sendKeys(Ps);
		Login.click();
		
	}
	public void loginbitton(){
		Login.click();
	}
	public void mouse(){
		Actions action=new Actions(driver);
		action.moveToElement(Electronic).build().perform();
	}
	public void miclick(){
		Mi.click();
	}
	public void droplist() throws Exception{
		
		Select dropdown= new Select(dropd);
		Thread.sleep(2000);
		 dropdown.selectByIndex(2);
		
	}
	public void list(){
		List<WebElement> s=driver.findElements(By.xpath("//div[@class='_1qKb_B']"));
		for(WebElement g:s){
			System.out.println(g.getText());
		}
		
	}

}
