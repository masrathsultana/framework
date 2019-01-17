package seleniumTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hi");
		File pathToBinary = new File("C:\\Users\\Masrath.S\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		System.setProperty("webdriver.gecko.driver","C://Users//Masrath.S//Downloads//geckodriver.exe");       
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://napavalley.dev.leateamapps.com/");
		
	/*	System.setProperty("webdriver.gecko.driver", 
				"C://Users//Masrath.S//Downloads//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://napavalley.dev.leateamapps.com/");
		driver.findElement(By.xpath("//input[@id='vUsername']")).sendKeys("demouser");
		driver.findElement(By.xpath("//input[@id='vPassword']")).sendKeys("Abc@12345");
		driver.findElement(By.xpath("//a[text()='Sign In ']")).click();
	}*/

}
}
