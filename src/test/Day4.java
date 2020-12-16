package test;

import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void WebloginHomeLoan()
	{
		System.out.println("webLoginCar");
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginCar");
	}

	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("LoginAPICarLoan");
	}
}
