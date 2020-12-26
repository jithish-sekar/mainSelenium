package co.jithu.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	public static void testCorrectLoginPassword() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jithu\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver.get("https://engage.adaptqe.com/login");
	    driver.findElement(By.id("emailSignIn")).sendKeys("jithish@augmo.io");
	    driver.findElement(By.id("passwordSignIn")).sendKeys("jithujithu");
	    Thread.sleep(2000);
	    driver.findElement(By.className("animatedButton")).click();
	    Thread.sleep(3000);
	    String at=driver.getCurrentUrl();
	    String et="https://engage.adaptqe.com/sequences/all";
	    driver.close();
	    if(at.equalsIgnoreCase(et)) {
	    	System.out.println("testCorrectLoginPassword is success");
	    }else {
	    	System.out.println("testCorrectLoginPassword is failure");	
	    }
	}
	
	public static void testWrongLoginWrongPassword() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jithu\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver.get("https://engage.adaptqe.com/login");
	    driver.findElement(By.id("emailSignIn")).sendKeys("jithis@augmo.io");
	    driver.findElement(By.id("passwordSignIn")).sendKeys("jithjith");
	    Thread.sleep(2000);
	    driver.findElement(By.className("animatedButton")).click();
	    Thread.sleep(3000);
	    String at=driver.findElements(By.className("err-msg-text")).get(2).getText();
	    String et="please check your email address or password";
	    driver.close();
	    if(at.equalsIgnoreCase(et)) {
	    	System.out.println("testWrongLoginWrongPassword is success");
	    }else {
	    	System.out.println("testWrongLoginWrongPassword is failure");	
	    }
	}
	
	public static void testWrongLoginCorrectPassword() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jithu\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver.get("https://engage.adaptqe.com/login");
	    driver.findElement(By.id("emailSignIn")).sendKeys("jithis@augmo.io");
	    driver.findElement(By.id("passwordSignIn")).sendKeys("jithujithu");
	    Thread.sleep(2000);
	    driver.findElement(By.className("animatedButton")).click();
	    Thread.sleep(3000);
	    String at=driver.findElements(By.className("err-msg-text")).get(2).getText();
	    String et="please check your email address or password";
	    driver.close();
	    if(at.equalsIgnoreCase(et)){
	    	System.out.println("testWrongLoginCorrectPassword is success");
	    }else {
	    	System.out.println("testWrongLoginCorrectPassword is failure");	
	    }
	}
	

	
	public static void main(String[] args) throws InterruptedException {
		testCorrectLoginPassword();
		testWrongLoginWrongPassword();
		testWrongLoginCorrectPassword();
	}
}
	
