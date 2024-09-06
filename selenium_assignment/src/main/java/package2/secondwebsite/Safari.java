package package2.secondwebsite;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverInfo;

public class Safari 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://www.getcalley.com/calley-lifetime-offer/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		driver.manage().window().setSize(new Dimension(1920, 1080));
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./safari-19201080/chrome19201080-"+time+".png");
		FileHandler.copy(temp, dest);
		driver.quit();
		chrome2();
	}
	
	public static void chrome2() throws IOException
	{
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://www.getcalley.com/calley-lifetime-offer/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		driver.manage().window().setSize(new Dimension(1366, 768));
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./safari-19201080/safari1366-768-"+time+".png");
		FileHandler.copy(temp, dest);
		driver.quit();
		chrome3();

	}
	
	public static void chrome3() throws IOException
	{
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://www.getcalley.com/calley-lifetime-offer/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		driver.manage().window().setSize(new Dimension(1536, 864));
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./safari-19201080/safari-1536-864-"+time+".png");
		FileHandler.copy(temp, dest);
		driver.quit();
	}
}
