package com.shopcart.catlog.pages;

import java.io.FileNotFoundException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.base.TestBase;

public class CategoriesPage extends TestBase{

	public CategoriesPage() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="icon-AdminCatalog")
	WebElement catlogmenu;
	
	@FindBy(xpath="//*[@id=\"subtab-AdminCategories\"]/a")
	WebElement categoriessubmenu;
	
	@FindBy(xpath="//*[@id=\"tr_2_3_0\"]/td[6]/div/div/button")
	WebElement viewdropdwntogglebtn;
	
	@FindBy(className="edit")
	WebElement clickeditbtn;
	
	@FindBy(id="expand-all-categories-tree")
	WebElement expandallbtn;
	
	@FindBy(xpath="//input[@name='id_parent' and @value='6']")
	WebElement topsradiobtn;
	
	@FindBy(id="collapse-all-categories-tree")
	WebElement collapseallbtn;
	
	@FindBy(xpath=".//*[@id='mce_16']/button")
	WebElement clickonItallic;
	
	public void movetoSubMenuCategories()
	{
		Actions action = new Actions(driver);
		action.moveToElement(catlogmenu).build().perform();
		categoriessubmenu.click();
	}
	
	public void editCategories()
	{
		viewdropdwntogglebtn.click();
		clickeditbtn.click();
		expandallbtn.click();
	}
	
	public boolean radioButtonEnabledorDisabled()
	{
		return topsradiobtn.isEnabled();
	}
	
	public void collapseAllButton()
	{
		collapseallbtn.click();
	}

	public void changeFontInDescriptionFrame()
	{
		//Switch mouse to frame
		driver.switchTo().frame("description_1_ifr");
		System.out.println("Switched to frame");
		
		// the element containing the text
		//WebElement texttoitallic = driver.findElement(By.id("tinymce"));
		////*[@id="description_1"]
		// assuming driver is a well behaving WebDriver
		/*
		 * Actions actions = new Actions(driver); // and some variation of this:
		 * actions.moveToElement(texttoitallic,3,3).click().keyDown(Keys.SHIFT)
		 * .moveToElement(texttoitallic,200,
		 * 0).click().keyUp(Keys.SHIFT).build().perform();
		 * System.out.println("Text Selected");
		 */
		/*
		 * WebElement text1 =
		 * driver.findElement(By.xpath(".//*[@id='tinymce']/p[1]/strong")); WebElement
		 * text2 = driver.findElement(By.xpath(".//*[@id='tinymce']/p[2]")); WebElement
		 * text3 = driver.findElement(By.xpath(".//*[@id='tinymce']/p[3]"));
		 * JavascriptExecutor js = (JavascriptExecutor) driver; js.
		 * executeScript("arguments[0].setAttribute('style', 'background: skyblue;');",
		 * text1); js.
		 * executeScript("arguments[0].setAttribute('style', 'background: skyblue;');",
		 * text2); js.
		 * executeScript("arguments[0].setAttribute('style', 'background: skyblue;');",
		 * text3); // clickonItallic.click();
		 */		 
		 WebElement ele = driver.findElement(By.xpath(".//*[@id='tinymce']/p[1]/strong"));
		 Actions dummy = new Actions(driver);
		 dummy.doubleClick(ele).build().perform();
	}
}
