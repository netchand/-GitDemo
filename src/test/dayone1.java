package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class dayone1 {
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("i will exe last");
	}

	@AfterSuite
	public void BFsuite()
	{
		System.out.println("I am no 1 from the last");	
	}
	@Test
	public void Demo()
	{
		System.out.println("Hi");
	Assert.assertTrue(false);
	}

	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}
}
