package step.definitions;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;
import utilities.Util;

public class DesktopsStepDef extends Base {

	DesktopsPage desktopPage = new DesktopsPage();
	
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
	    logger.info("User is on Retail website");
	}
	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		desktopPage.clickOnDesktopTab();
		logger.info("user clicked on Desktop tab");
	
	}
	@When("User click on Show all desktops")
	public void User_click_on_Show_all_Desktops() {
		desktopPage.clickOnShowAllDesktops();
		logger.info("user clicked on show all Desktops");
	
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
		List<WebElement> items = desktopPage.elements();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("alt") + ":  is present in this page");
		}
	}
	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
	    desktopPage.selectQuantity("1");
	    logger.info("User input 1 into Quantity Field");
		
	}
	@Then("User click add to Cart button")
	public void User_click_add_to_Cart_button() {
		desktopPage.addToCartbutton();
		logger.info("User clicked add to Cart button");
		
	}
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		
		Assert.assertEquals(string.substring(0, 7), desktopPage.successMessageDisplayed().substring(0, 7));;
		logger.info("Success: You have added Canon EOS 5D Camera to your shopping cart!");
	
	}
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPage.clickAddToCartOnCanonEOS5D();
		logger.info("User clicked add to cart on Canon EOS5D item");
	
	}
	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	   desktopPage.clickAddToCartOnCanonEOS5D();
	   logger.info("User clicked Add to cart option on Canon EOS 5D Item");
		
	}
	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
	    desktopPage.selectRedCanon();
	    logger.info("User selected Red Dropdown option on Canon EOS 5D Item");
		
	}
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
	desktopPage.successMessageDisplayed();
	logger.info("Success message is displayed!");

	}
	@Then("User click ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	    desktopPage.addHPLPdesktop();
	    logger.info("User clicked add to cart on HP LP 3065 item");
	    Util.takeScreenShot();
	}
	
}

