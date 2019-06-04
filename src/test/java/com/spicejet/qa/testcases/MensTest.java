package com.spicejet.qa.testcases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.spicejet.qa.Base.TestBase;
import com.spicejet.qa.pages.LoginPage;
import com.spicejet.qa.pages.MensPage;

public class MensTest extends TestBase{
	
	MensPage page;
	LoginPage logins;
	public MensTest(){
		super();
		
	}
		@BeforeMethod
		public void setup(){
			 initilazation();
			 logins = new LoginPage();
			 page=new MensPage();
		}
		
		@Test
		public void close1() throws Exception{
			logins.login(prop.getProperty("username"), prop.getProperty("pass"));
			Thread.sleep(2000);
			page.men();
			Thread.sleep(2000);
			page.clicksweater();
			Thread.sleep(2000);
			page.clickproduct();
			page.child();
			System.out.println(page.tittle());
			Thread.sleep(1000);
			page.scroll();
			page.smallsize();
		}
	
	

}
