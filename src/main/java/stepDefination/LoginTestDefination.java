package stepDefination;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Assert;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BrokenPage;
import Utilities.ScreenShot;


public class LoginTestDefination extends BaseClass {
	ScreenShot s=new ScreenShot();
	@Given("^user launch browser$")
	public void user_launch_browser() throws Exception {
	 InitialiseBrowser();
	 //System.out.println("Current Url"+ driver.getCurrentUrl());
	 //System.out.println("get page source"+ driver.getPageSource());
	 
	}

	@When("^user launch url$")
	public void user_launch_url() throws Exception {
		LaunchUrl();
	}

	@Then("^enter username and password$")
	public void enter_username_and_password() throws Exception {
		 EnterLoginDetails();
	}

	@Then("^clicks on submit button$")
	public void clicks_on_submit_button() throws Exception  {
		 //driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//button[contains(@type,'sub')]")).click();
		//driver.findElement(By.className("btn btn-primary btn-block btn-flat")).click();--not working
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//BrokenPage p= new BrokenPage();
		//p.BrokenPage();
	
		/*WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text(),'Dashboard'])")));*/
		
		s.TakeScreenshot();
		
	}
		
	
	@Then("^user is able to login successfully$")
	public void user_is_able_to_login_successfully() throws Exception {
		String Actual=driver.getTitle();
		String Expected= "AdminLTE 2 | Dashboard";
		System.out.println("Validation succ");
		Assert.assertEquals(Expected, Actual);
		driver.quit();
	}


	
}
