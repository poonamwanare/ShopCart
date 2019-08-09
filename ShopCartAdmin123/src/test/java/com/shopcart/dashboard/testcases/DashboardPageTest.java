package com.shopcart.dashboard.testcases;

import java.io.FileNotFoundException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.base.TestBase;
import com.shopcart.dashboard.pages.DashboardPage;
import com.shopcart.login.LoginPage;

public class DashboardPageTest extends TestBase{

	public DashboardPageTest() throws FileNotFoundException {
		super();
	}
	
	LoginPage loginpage;
	DashboardPage dashboardpage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		try {
			loginpage = new LoginPage();
			dashboardpage = new DashboardPage();
			dashboardpage = loginpage.Username(prop.getProperty("username"), prop.getProperty("password"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void checkDashboardPageTitleTest() throws FileNotFoundException
	{
		String title = dashboardpage.getDashboardPageTitle();
		Assert.assertEquals(title, "SHOPCART > Administration panel (PrestaShop™)");
		System.out.println(title);
		System.out.println("Successfully checked Dashboard Page title");
	}
	
	@Test(priority=2)
	public void checkDashboardPageLabelTest() throws FileNotFoundException
	{
		String label = dashboardpage.getDashboardPageLabel();
		Assert.assertEquals(label, "Dashboard");
		System.out.println(label);
		System.out.println("We are successfully reached on Dashboard Page");
		dashboardpage.clickDemomodeBtn();
		System.out.println("Demo mode on successfully");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
