package pageObjects;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilities.ConfigFileReader;

public class Base {
	
	public static WebDriver driver;
	public static ConfigFileReader configFileReader = new ConfigFileReader();
	
	public static void initiateBrowser() {
		try {
			switch (configFileReader.getStringPropery("Browser")) {
			case "FF":
				System.setProperty("webdriver.gecko.driver", configFileReader.getDriverPath());
				driver = new FirefoxDriver();
				break;
			case "CH":
				System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
				driver = new ChromeDriver();
				break;
			case "IE":
				System.setProperty("webdriver.ie.driver", configFileReader.getDriverPath());
				driver = new InternetExplorerDriver();
				break;
			case "ED":
				System.setProperty("webdriver.edge.driver", configFileReader.getDriverPath());
				driver = new EdgeDriver();
				break;
			default:
				System.setProperty("webdriver.gecko.driver", configFileReader.getDriverPath());
				driver = new FirefoxDriver();
				break;
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(configFileReader.getLongPropery("Wait"), TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(configFileReader.getLongPropery("PageLoadWait"),
					TimeUnit.SECONDS);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void closeBrowser() {
		try {
			driver.close();
			if (driver != null)
				driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Takes a screenshoot of the current browser window.
	 * @author s4215138
	 * @param driver
	 * @param filePath
	 */
	public static void takeScreenshoot() {
		try {
			System.out.println(((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64));
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("src//test//resources//" + System.currentTimeMillis() + ".png"));
		} catch (Exception e) {
			System.out.println("Was not possible to take the screenshoot. " + e.getMessage());
		}
	}
}
