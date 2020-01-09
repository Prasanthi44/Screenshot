package test.login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\ScreenShot\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		TakesScreenshot tk=(TakesScreenshot)driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File d=new File("C:\\Users\\Dady\\eclipse-workspace\\ploymorphism\\ScreenShot\\images\\1.png");
		FileUtils.copyFile(s, d);
		
		
		
	}

}
