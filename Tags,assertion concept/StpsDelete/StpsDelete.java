package StpsDelete;

 import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

import Cucumberday2.BaseClass;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
		import io.cucumber.java.en.Then;
		import io.cucumber.java.en.When;
		import io.github.bonigarcia.wdm.WebDriverManager;

		public class StpsDelete extends BaseClass {
			
			String text;

			@Given("Enter the valid username {string}")
			public void enterUserName(String uName)
			{
				driver.findElement(By.id("username")).sendKeys(uName);
			}
			@Given("Enter the valid password {string}")
			public void enterPassword(String pwd)
			{
				driver.findElement(By.id("password")).sendKeys(pwd);
			}
			@When("Click on login button")
			public void clickLoginButton()
			{
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			}
			@Then("Home page should be displayed")
			public void verifyHomePage()
			{
				Boolean displayed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
				if(displayed)
				{
					System.out.println("home page is displayed");
				}
				else
				{
					System.out.println("home page is not displayed");
				}
				
			}
			@But("Error message should be displayed")
			public void errormsg()
			{
			System.out.println("invalid credentials couldnt login");
			}
			
			@When("Click on {string} link")
			public void clickButton(String option)
			{
				driver.findElement(By.linkText(option)).click();
			}
			@Then("{string} page should be displayed")
			public void verifyHomePage(String pageName)
			{
		System.out.println("titile is :"+driver.getTitle());
				
			}
			
			@Given("Enter the phone number{string}")
			public void enterPhnNum(String phNum)
			{
				driver.findElement(By.name("phoneNumber")).sendKeys(phNum);
			}
			@When("Click on find leads")
			public void clickFind() throws InterruptedException
			{
				driver.findElement(By.linkText("Find Leads")).click();
				Thread.sleep(2000);
			}
			@Then("Get and print first resulting id")
			public void firstId() throws InterruptedException
			{
				 text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
				System.out.println(text);
				Thread.sleep(2000);
			}
			@When("Click on first id")
			public void clickFirstId()
			{
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
			}
			@When("Click on Delete")
			public void clickDelete()
			{
				driver.findElement(By.linkText("Delete")).click();	
			}
			@When("Click on Find Leads")
			public void clickFindLeads()
			{
				driver.findElement(By.linkText("Find Leads")).click();
			}
			@Then("Pass the deleted id to check")
			public void passcheck()
			{
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text); 
			}
			@When("Click on submit button")
			public void clickSubmit()
			{
				driver.findElement(By.className("x-btn-text")).click();
			}
			@Then("Check the deleted data avilability")
			public void checkAvailability()
			{
				if(driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).isDisplayed())

				{
					System.out.println("no records to display");

				}
				else
				{
					System.out.println("records available");
				}
			}
			


	}



