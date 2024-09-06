package pakage3.website3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Firefox 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://www.getcalley.com/see-a-demo/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		driver.manage().window().setSize(new Dimension(1920, 1080));
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./firefox-19201080/firefox1920-1080-"+time+".png");
		FileHandler.copy(temp, dest);
		driver.quit();
		screenShot2();
	}
	
	
	public static void screenShot2() throws IOException
	{

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://www.getcalley.com/see-a-demo/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		driver.manage().window().setSize(new Dimension(1366, 768));
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./firefox-19201080/firefox1366-768-"+time+".png");
		FileHandler.copy(temp, dest);
		driver.quit();
		screenshot3();
	}
	
	public static void screenshot3() throws IOException
	{
        
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://www.getcalley.com/see-a-demo/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		driver.manage().window().setSize(new Dimension(1536, 864));
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./firefox-19201080/firefox1536-864-"+time+".png");
		FileHandler.copy(temp, dest);
		driver.quit();	

	}
}
