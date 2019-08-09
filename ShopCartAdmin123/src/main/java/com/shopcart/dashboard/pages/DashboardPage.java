package com.shopcart.dashboard.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.base.TestBase;

public class DashboardPage extends TestBase{
	
	public DashboardPage() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);	}

	@FindBy(className = "page-title")
	WebElement dashboardpagelabel;
	
	@FindBy(className = "process-icon-toggle-off")
	WebElement demomodebtnon;
	
	
	public String getDashboardPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getDashboardPageLabel()
	{
		return dashboardpagelabel.getText();
	}
	
	public void clickDemomodeBtn()
	{
		demomodebtnon.click();
	}
	

}
