package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class step {
	WebDriver driver;

	@Given("user is on demoQA Home Page")
	public void user_is_on_demoQA_Home_Page(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lakhan\\SiA-Digital\\Kiverno\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.demoqa.com");

	}

	@Given("user navigates to textbox page")
	public void user_navigates_to_textbox_page() {
		driver.navigate().to("https://www.demoqa.com/text-box");
	}
	@When("user enters full name and email")
	public void user_enters_full_name_and_email() {
		System.out.println("Done");
	}

}
