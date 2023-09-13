package org.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMaven {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://www.instagram.com/");
	WebElement userName = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	userName.sendKeys("goutham");
	
	WebElement passWord = driver.findElement(By.xpath("//input[@aria-label='Password']"));
	passWord.sendKeys("murugan");
	
	WebElement login = driver.findElement(By.xpath("//div[text()='Log in']"));
	login.click();
	
	
	driver.close();
	
	
}
}
