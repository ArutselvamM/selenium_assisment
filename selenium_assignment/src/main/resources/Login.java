import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demo.dealsdray.com/");
driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
driver.findElement(By.xpath("//button[text()='Login']")).click();
driver.findElement(By.xpath("//span[text()='Order']")).click();
driver.findElement(By.xpath("//span[text()='Orders']")).click();

driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\aadit\\eclipse-workspace\\selenium_assignment\\documents");
}
}
