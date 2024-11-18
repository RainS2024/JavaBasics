package Assignment;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/*
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.Salesforce.pages.home.HomePage;
import com.Salesforce.pages.login.Forgotpassword;
import com.Salesforce.pages.login.LoginPage;
import com.Salesforce.pages.login.NewPg;
import com.Salesforce.utilities.Constants;
import com.Salesforce.utilities.Log4jUtility;
import com.Salesforce.utilities.PropertiesUtilty;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.google.common.io.Files;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinitionSwitchOptions {
	protected static Logger LoginStepDefinition = LogManager.getLogger();
	//public static Logger log;
	//public static Log4jUtility LogObject;
	public static WebDriver driver;
	LoginPage loginpage = new LoginPage(driver);
	HomePage homepage = new HomePage(driver);
	Forgotpassword FP= new Forgotpassword(driver);
	NewPg NP = new NewPg(driver);
	
	
	public static void launchbrowser(String browsername) {
		switch (browsername.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			//ChromeOptions options = new ChromeOptions();
			//options.setHeadless(true);
			//driver = new ChromeDriver(options);
			driver = new ChromeDriver();
			
			LoginStepDefinition.info("Browser instance is created");
			//extentreport.logTestInfo("Browser instance is created");
			driver.manage().window().maximize();
			//log.info("Window is maximized");
			break;
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			LoginStepDefinition.info("Browser instance is created");
			driver.manage().window().maximize();
			LoginStepDefinition.info("Window is maximized");
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			//FirefoxOptions options = new FirefoxOptions();
			//options.setHeadless(true);
			//driver = new FirefoxDriver(options);
			driver = new FirefoxDriver();
			LoginStepDefinition.info("Browser instance is created");
			driver.manage().window().maximize();
			LoginStepDefinition.info("Window is maximized");
			break;
		
			default:
				LoginStepDefinition.info("The Browser is unidentified" + browsername);
		}
		
	}
	
	/*public static void gotourl(String url) throws InterruptedException {
	     
		launchbrowser("chrome");
		String url1 = PropertiesUtilty.ReadingdatafromPropertyfile(Constants.APPLICATION_PROPERTIES, "url");
	    gotourl(url1);
	     
	     LoginStepDefinition.info(url +" was entered");
	   
	}*/
	
	/*public static void gotourl(String salesforce) throws InterruptedException {
	   
		String url1 = PropertiesUtilty.ReadingdatafromPropertyfile(Constants.APPLICATION_PROPERTIES, "url");
		driver.get(url1);
	     
	     LoginStepDefinition.info(salesforce +" was entered");
	   
	}
	
	
	
	
	public static void closeBrowser() {
		driver.close();
		LoginStepDefinition.info("Browser instance closed");
		//extentreport.logTestInfo("Browser instance closed");
		driver=null;
	}

	public static void takescreenshot(String filepath) {
		 TakesScreenshot screencapture = (TakesScreenshot)driver;
	     File src = screencapture.getScreenshotAs(OutputType.FILE);
	     File des = new File(filepath);
	     try {
	    	 Files.copy(src, des);
	    	 LoginStepDefinition.info("Captured the screen");
	     }
	     catch (IOException e){
	    	 e.printStackTrace();
	    	 LoginStepDefinition.info("Went wrong when Capturing the the screen");
	     }
	}
	
	@Before
	public static void BeforeeachScenario() {
		launchbrowser("chrome");
	}
	
	/*@BeforeAll
	public static void setUpBeforeAllScenarios() {
		log=LogObject.getLogger();
	}
	
	@Before
	public static void setUpEachScenario() {
		
		launchbrowser("chrome");
		
	}
	
	@After
	public static void tearDown() {
		closeBrowser();
	}
	
	
	@AfterStep
	public static void after_each_step(Scenario sc) {

		}
	
	
	@Given("User open the {string}")
	public void user_open_the(String chrome) throws InterruptedException {
		launchbrowser("chrome");
		System.out.println("Inside chrome");
	}

	@When("User open {string}")
	public void user_open(String Salesforce) throws InterruptedException {
		driver.get(PropertiesUtilty.ReadingdatafromPropertyfile(Constants.APPLICATION_PROPERTIES, "url"));
	    LoginStepDefinition.info(Salesforce +" was entered");
	   
	}
	
	@When("User on {string}")
	public void user_on(String page) {
		switch(page) {
		case "loginpage":
			loginpage=new LoginPage(driver);
			break;
		case "homepage":
			homepage=new HomePage(driver);
			break;
		case "ForgotPasswordPage":
			FP=new Forgotpassword(driver);
			break;
		case "NewPage":
			NP=new NewPg(driver);
			break;	
		}			
	}

	@When("User Enters {string}")
	public void user_enters(String element) {
		switch(element) {
		case "UserName":
			loginpage.enterUserName(element);
			break;
		case "FPUserName":
			FP.enteruserid();;
			break;	
		case "":
			loginpage.enterPassword(element);
			break;	
		case "Password":
			loginpage.enterPassword(element);
			break;
		case "Wrong UserName":
			loginpage.enterwrongusername();
			break;
		case "Wrong Password":
			loginpage.enterwrongpswrd();
			break;
		}	
	
	}


	@When("User Clicks on {string}")
	public void user_clicks_on(String buttons) {
		switch(buttons) {
		case "Login":
			loginpage.clickLoginButton();
			break;
		case "CheckBox":
			loginpage.waitforvisibilitycheckbx();
			loginpage.clickCheckbox();
			break;
		case "UserMenudropdown":
			homepage.clickDropdown();
			break;
		case "Log out":
			homepage.clickLogOut();
			break;
		case "Forgot password":
			loginpage.clickFrgtpswrd();
			break;
		case "Contiue button":
			FP.clickContinue();
			break;	
		}		
	}
	

	@Then("Verify we can see {string}")
	public void verify_we_can_see(String verification) {
		switch(verification) {
		case "Error Message":
			String Actual =loginpage.getTextFromError();
			String Expected = "Please enter your password.";
			Assert.assertEquals(Actual, Expected);
			closeBrowser();
			break;
		case "Home Page":
			String hmpg = homepage.getText();
			String expected = "Rain Sing";
			Assert.assertEquals(hmpg, expected);
			closeBrowser();
			break;
		case "Login sales force page":
			loginpage.waitforvisibilityloginid();
			loginpage.logindisplayed();
			loginpage.logindassert();
			closeBrowser();
			break;
		case "ForgotPasswordPage":
			String Heading = FP.gettext();
			String banner = "Forgot Your Password";
			SoftAssert sb = new SoftAssert();
			sb.assertEquals(Heading, banner);
			closeBrowser();
			break;
		case "Password reset message":
			String Msg = "Check Your Email";
			String Header = NP.getHeader();
			Assert.assertEquals(Header,Msg);
			closeBrowser();
			break;
		case "Error message":
			String error = loginpage.getTextFromError();
			SoftAssert sb1 = new SoftAssert();
			sb1.assertTrue(loginpage.errmsgElement.isDisplayed());
			String expectedmsg = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
			Assert.assertEquals(error, expectedmsg);
			closeBrowser();
			break;	
		}		 
		
	}
}*/


	
	
	

