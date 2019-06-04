package com.spicejet.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.spicejet.qa.Base.TestBase;
import com.spicejet.qa.pages.LoginPage;
import com.spicejet.qa.pages.Sport;

public class SportTest extends TestBase {
	
	LoginPage logins;
	Sport sport;
	
	public SportTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initilazation();
		logins = new LoginPage();
		sport =new Sport();
		
	}
	
	@Test
	public void log() throws Exception{
		logins.login(prop.getProperty("username"),prop.getProperty("pass"));
		Thread.sleep(2000);
		sport.SportBook();
		sport.carlink();
		Thread.sleep(1000);
		sport.scroll();
		Thread.sleep(1000);
		sport.helemetlink();
		sport.royal();
		sport.chidwindow();
		Thread.sleep(2000);
		sport.medium();
		sport.addtocart();
	}

}
