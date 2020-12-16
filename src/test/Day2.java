package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("Have a good");
		System.out.println("Hi");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will exe first");
	}
}
