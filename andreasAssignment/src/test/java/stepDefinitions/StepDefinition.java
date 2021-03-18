package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	
	
	
	
	
	@Given("I have logged in at Mailchimp")
	public void i_have_logged_in_at_mailchimp() {
		
		System.out.println("log in");	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kjell\\eclipse\\java-2020-12\\eclipse\\addons\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://login.mailchimp.com/signup/");
	    driver.quit();
	}
	@Given ("I have entered {string}")
	public void i_have_entered(String email) {
		System.out.println("Email" +email);
		
	}
	@Given ("i check for the {int} in step")
	public void i_check_for_the_in_step(int userName) {
		System.out.println("Username" +userName);
		
	}
	@Then ("i verify the success in step")
	public void i_verify_the_success_in_step() {
		System.out.println("Verify");
		
	}
	
}
