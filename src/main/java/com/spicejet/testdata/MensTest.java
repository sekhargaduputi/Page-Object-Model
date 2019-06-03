package com.spicejet.testdata;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.spicejet.qa.Base.TestBase;
import com.spicejet.qa.pages.MensPage;

public class MensTest extends TestBase{
	
	MensPage page;
	
	public MensTest(){
		super();
	}
		@BeforeMethod
		public void setup(){
			 initilazation();
			page=new MensPage();
		}
		
		@Test
		public void close1() throws Exception{
			page.closedata();
			page.men();
			page.clicksweater();
			page.clickproduct();
			page.child();
			System.out.println(page.tittle());
			page.add();
			page.scroll();
			Thread.sleep(2000);
			page.smallsize();
			//page.parent();
			page.login(prop.getProperty("username"), prop.getProperty("pass"));
		}
	
	

}
