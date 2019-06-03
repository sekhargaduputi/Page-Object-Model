package com.spicejet.testdata;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.spicejet.qa.Base.TestBase;
import com.spicejet.qa.pages.EletronicPage;

public class ElectronicsTest extends TestBase {
	
	EletronicPage ElePage;
	
	public ElectronicsTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initilazation();
		
		ElePage=new EletronicPage();
		
	}
	@Test
	public void login() throws Exception{
		//ElePage.login(prop.getProperty("username"),prop.getProperty("pass"));
		ElePage.closedata();
		ElePage.mouse();
		ElePage.miclick();
		ElePage.list();
		ElePage.droplist();
		boolean e=ElePage.equals("1000");
		System.out.println(e);
		
		
	
	}
	/*@AfterMethod
	public void teardown(){	
	driver.quit();
		
	}*/
	

}
