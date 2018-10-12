package pageObjects;

import org.openqa.selenium.By;

public class Home extends Base{
	
	public Home () {
		driver.get("http://www.google.com");
	}
	
	private String searchTextbox = "//div[@id='searchform']//input[@title='Search']";
	private String buttonSearch = "btnK";
	
	public void searchText (String text) {
		driver.findElement(By.xpath(searchTextbox)).sendKeys(text);
		takeScreenshoot();
	}
	
	public void clickSearch () {
		driver.findElement(By.name(buttonSearch)).click();
		takeScreenshoot();
	}
	
	
}
