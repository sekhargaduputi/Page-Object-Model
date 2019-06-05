package com.spicejet.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.spicejet.qa.Base.TestBase;
import com.spicejet.qa.pages.KidsPage;
import com.spicejet.qa.pages.LoginPage;

public class KidsTest extends TestBase{
	
	KidsPage kid;
	LoginPage login;
	
	public KidsTest(){
		super();
	}
	@BeforeMethod
	public void setup() throws Exception{
		initilazation();
		login=new LoginPage();
		kid=new KidsPage();
		login.login(prop.getProperty("username"),prop.getProperty("pass"));
	}
	
	@Test(priority=1)
		public void title() throws Exception{
		String t=kid.titleofpage();
		Assert.assertEquals(t, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!","Tittle is not matched");
		kid.mousetobaby();
		kid.sandlelink();
		kid.scrolldown();
		Assert.assertTrue(kid.selectage());
		kid.clickprodut();
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
}
	
	
	


