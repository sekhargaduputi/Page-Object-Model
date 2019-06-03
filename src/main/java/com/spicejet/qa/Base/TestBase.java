package com.spicejet.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.spicejet.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
		public TestBase() {
			try{
		 prop=new Properties();
		FileInputStream file=new FileInputStream("E:\\\\Automation Pratice\\\\Java\\\\SpiceTest\\\\src\\\\main\\\\java\\\\com\\\\spicejet\\\\config\\\\config.properties");
		prop.load(file);
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		public static void initilazation(){
			
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\\\Testing Softwares\\\\Suresh Sir Selinum\\\\New Softwares&Jars\\\\Browser\\\\chromedriver_win 74.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","D:\\Testing Softwares\\Suresh Sir Selinum\\New Softwares&Jars\\Browser\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_Timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.impl_load_Timeout,TimeUnit.SECONDS);
		
		
		
		}
}
