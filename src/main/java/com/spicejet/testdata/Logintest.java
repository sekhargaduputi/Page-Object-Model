package com.spicejet.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.spicejet.qa.Base.TestBase;
import com.spicejet.qa.pages.LoginPage;

public class Logintest extends TestBase {
	
	LoginPage logins;
	public Logintest(){
		super();
	}
	@BeforeMethod
	public void setup(){
		initilazation();
		 logins=new LoginPage();
		
	}
	
	@Test
	public void loginpage() throws Exception{
		String tittle=logins.validateloginpagetitle();
		Assert.assertEquals(tittle,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		logins.login(prop.getProperty("username"),prop.getProperty("pass"));
	}
	/*@AfterMethod
	public void teardown(){
		driver.close();
	}*/
	
	

}
