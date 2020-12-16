package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3{
	
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("im in Day3");
		System.out.println("before executing any method in the class");
	}
	@Parameters({"URL","APIKey"})
	@Test
	public void WebloginCarLoan(String url,String key)
	{
		System.out.println("webLoginCar");
		System.out.println(url+""+key);
	}
	@Test(groups= {"Smoke"})
	public void MobileLogincarLoan()
	{
		System.out.println("MobileLoginCar");
	}
	
	@BeforeSuite
	public void BFsuite()
	{
		System.out.println("I am number one");	
	}

	@BeforeMethod
	public void beforevery()
	{
		System.out.println("before every method of day3");	
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("After every method of day3");	
	}
	//one bug is there in the below Test so use enabled 
	@Test(enabled=false)
	public void MobileSignincarLoan()
	{
		System.out.println("MobileSigninCar");
	}
	@Test(dataProvider="getData",timeOut=4000)//in miliseconds wait till 40 secs
	public void MobileSingoutcarLoan(String un,String pwd)
	{
		System.out.println("MobileSignOutCar");
		System.out.println(un+pwd);
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("After executing all method in the class");
	}
	@Test(dependsOnMethods= {"WebloginCarLoan"})
	public void LoginAPICarLoan()
	{
		System.out.println("LoginAPICarLoan");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
	data[0][0]="nc";
	data[0][1]="pwd";
	data[1][0]="th";
	data[1][1]="pwd1";
	data[2][0]="rg";
	data[2][1]="ugh";
		return data;
	}
}
