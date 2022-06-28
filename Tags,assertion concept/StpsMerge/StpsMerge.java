package StpsMerge;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.Alert;
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

			public class StpsMerge extends BaseClass {
				String text;
//				
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

				@When("Click on first lead")
				public void firstLead() throws InterruptedException
				{
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
					Set<String> windowHandles = driver.getWindowHandles();
					List<String> newWindow=new ArrayList<String>(windowHandles);
					driver.switchTo().window(newWindow.get(1));
					Thread.sleep(2000);
					//		 8. Click on First Resulting Contact
					driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
					driver.switchTo().window(newWindow.get(0));
				}
				@When("click on second lead")
				public void secondLead() throws InterruptedException
				{
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
					Set<String> windowHandles1 = driver.getWindowHandles();
					List<String> newWindow1=new ArrayList<String>(windowHandles1);
					driver.switchTo().window(newWindow1.get(1));
					//    * 10. Click on Second Resulting Contact
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[2]")).click();
					driver.switchTo().window(newWindow1.get(0));
				}
				@When("Click on Merge button")
				public void clickMergbutton()
				{
					driver.findElement(By.xpath("//a[text()='Merge']")).click();
				}
				@Then("Alert box should be displayed")
				public void alertbox()
				{
					Alert alert = driver.switchTo().alert();
					alert.accept();
					String title = driver.getTitle();
					System.out.println(title);

				}

	}



