import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class multiLogIn extends Parameters {

	@BeforeMethod
	public void mySetup() {
		driver.get(Url);
	}

	@Test()
//the best performance 
	public void LoginWithStandardUser() throws InterruptedException {
		LoginFunction(StandardUserName, passWord);
		Thread.sleep(3000);
		

		
//older way to solving
//	public void LoginWithStandardUSer() throws InterruptedException {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(StandardUserName);
//		WebElement passwordInputField = driver.findElement(By.id("password"));
//		passwordInputField.sendKeys(passWord);
//		driver.findElement(By.id("login-button")).click();
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("logout_sidebar_link")).click();

	}

	@Test()
//the best performance 
	public void LoginWithProblemUser() throws InterruptedException {
		LoginFunction(ProblemUserName, passWord);
		Thread.sleep(3000);
		
		
		
//older way to solving
//	public void LoginWithProblemUser() throws InterruptedException {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(ProblemUserName);
//		WebElement passwordInputField = driver.findElement(By.id("password"));
//		passwordInputField.sendKeys(passWord);
//		driver.findElement(By.id("login-button")).click();
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("logout_sidebar_link")).click();
	}

	@Test()
//the best performance 
	public void LoginWithPerformanceUser() throws InterruptedException {
		LoginFunction(PerformanceUserName, passWord);
		Thread.sleep(3000);
		
		
		
		
//older way to solving
//	public void LoginWithPerformanceUser() throws InterruptedException {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(PerformanceUserName);
//		WebElement passwordInputField = driver.findElement(By.id("password"));
//		passwordInputField.sendKeys(passWord);
//		driver.findElement(By.id("login-button")).click();
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("logout_sidebar_link")).click();
//		

	}

	@AfterTest
	public void myPostTesting() {
	}
}

//-----------------------------------------------------------------
//the first solve of proble 
//	@BeforeTest
//	public void mySetup() {
//		driver.get(Url);
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//	}
//
//	@Test()
//	public void LoginWithStandardUSer() {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(StandardUserName);
//		userNameInputField.sendKeys(passWord);
//		driver.findElement()
//	}
//
//	@Test()
//	public void LoginWithProblemUser() {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(ProblemUserName);
//		
//
//	}
//	@Test()
//	public void LoginWithPerformanceUser() {
//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(PerformanceUserName);
//
//	}
//
//	@AfterTest
//	public void myPostTesting() {
//	}
//
//}





























//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.github.dockerjava.api.model.Driver;
//
//public class multiLogIn extends Parameters {
//	
//	
//	
//	@BeforeMethod
//	public void mySetup() {
//		driver.get(Url);
//
//	}
//
//	@Test()
//	
//	public void LoginWithStandardUSer() throws InterruptedException {
//		LoginFunction( StandardUserName, passWord)
//		Thread.sleep(2222);
//		
//
//	}
//
//	@Test()
//	public void LoginWithProblemUser() throws InterruptedException {
//		LoginFunction( ProblemUserName,  passWord);
//		Thread.sleep(2222);
//	}
//	@Test()
//	public void LoginWithPerformanceUser() throws InterruptedException {
//		LoginFunction( PerformanceUserName,  passWord);
//		Thread.sleep(2222);
//
//	}
//
//	@AfterTest
//	public void myPostTesting() {
//	}
//}
//	
//	
//	
//	
//	
//
//
