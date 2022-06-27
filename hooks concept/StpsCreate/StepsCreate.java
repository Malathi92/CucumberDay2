package StpsCreate;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Cucumberday2.BaseClass;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsCreate extends BaseClass {
//	public ChromeDriver driver;
//	@Given("Open the Chrome browser")
//	public void openBrowser()
//	{
//		WebDriverManager.chromedriver().setup();
//		 driver=new ChromeDriver();
//	
//		driver.manage().window().maximize();
////		driver.manage.timeouts().implicitlywait()
//	}
//	@Given("Load the Url {string}")
//	public void loadUrl(String url)
//	{
//		driver.get(url);
//	}
	@Given("Enter the username {string}")
	public void enterUserName(String uName)
	{
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@Given("Enter the password {string}")
	public void enterPassword(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("Click on Login button")
	public void clickLoginButton()
	{
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	}
	
	@Then("Homepage should be displayed")
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
	
	
	@Given("Enter the companyName {string}")
	public void companyName(String cName)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);	
	}
	@Given("Enter the firstName {string}")
	public void firstName(String fname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);	
	}
	@Given("Enter the lastName {string}")
	public void lastName(String lName)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);	
	}
	@Given("Enter the firstlocalName {string}")
	public void firstNameLocal(String fNameLocal)
	{
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fNameLocal);	
	}
	@Given("Enter the Department {string}")
	public void Dept(String dept)
	{
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dept);
	}
	@Given("Enter the Description {string}")
	public void description(String desc)
	{
		driver.findElement(By.id("createLeadForm_description")).sendKeys(desc);	
	}
	@Given("Enter the emailId {string}")
	public void email(String email)
	{
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);	
	}
	@Then("Click on Dropdown select value")
	public void dropDown() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select obj=new Select(ele);
		Thread.sleep(2000);
		obj.selectByVisibleText("New York");
	}
	@When("Click on submit button")
	public void clickSubmit()
	{
		driver.findElement(By.name("submitButton")).click();
		System.out.println("the title is "+driver.getTitle());
	}
	


	

}
