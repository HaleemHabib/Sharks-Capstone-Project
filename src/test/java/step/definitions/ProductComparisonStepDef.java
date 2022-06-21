package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.ProductComparisonPage;
import utilities.Util;

public class ProductComparisonStepDef extends Base {
	ProductComparisonPage productComparison = new ProductComparisonPage();
	
	
	
	@Given("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	  productComparison.clickOnMacBookCompareIcon();
	  logger.info("User clicked on copmarison icon on MacBook");
	  
	}
	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		productComparison.clickOnmacBookAirComparisonButton();
		logger.info("User clicked on comparison icon on MacBook Air");
	 
	}
//	@Then ("User should see a message Success: You have added MacBook Air!")
//	public void User_should_see_a_message_Success_you_have_Added_MacBook_Air_to_your_product_comparison() {
//		Assert.assertTrue(productComparison.MacAirsuccessMessageDisplayed());
//		logger.info("MacBook Air successmessage displayed");
		
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		productComparison.productComparisonChartDisplayed();
		logger.info("User clicked on product comparison link");
	
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	   productComparison.productComparisonChartDisplayed();
	   logger.info("Product comparison chart is displayed");
	   Util.takeScreenShot();
	}

}
