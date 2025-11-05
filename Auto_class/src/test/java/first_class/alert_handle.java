package first_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		/*wd.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Thread.sleep(5000);
	
		Thread.sleep(2000);
		a.accept();
		wd.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		Thread.sleep(2000);
		a.dismiss(); */
		wd.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert a=wd.switchTo().alert();
		a.sendKeys("12345");
		a.accept();
		Thread.sleep(2000);
		
		
	}

}
