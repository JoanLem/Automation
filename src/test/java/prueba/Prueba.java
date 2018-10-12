package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prueba {
	
	public static void main (String[] Args) {
		try {
			
		
		System.setProperty("webdriver.gecko.driver", "src/test/resources/SeleniumDrivers/geckodriverx64.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//div[@id='searchform']//input[@title='Search']")).sendKeys("prueba");
		
		System.out.println("sadsd");
		driver.close();
		if (driver != null)
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
