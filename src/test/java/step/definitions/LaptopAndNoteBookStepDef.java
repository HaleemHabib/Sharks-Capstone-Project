package step.definitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopAndNoteBookPage;
import utilities.Util;

public class LaptopAndNoteBookStepDef extends Base {

	LaptopAndNoteBookPage laptopAndNotebook = new LaptopAndNoteBookPage();


	@When("User click on Laptop & Notebook tab")
	public void user_click_on_laptop_notebook_tab() {
		laptopAndNotebook.clickOnlaptopsAndNotebooks();
		logger.info("user clicked on Laptops and notebooks tab");
	  
	}
	@When("User click on Show all Laptop & Notebook option")
	public void user_click_on_show_all_laptop_notebook_option() {
	laptopAndNotebook.clickOnshowAllLabtopsAndNotebooks();
	logger.info("user clicked on show all laoptop and notebook option");
		
	}
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopAndNotebook.clickOnMacBookItem();
		logger.info("user clicked on MacBook item");
	   
	}
	@Then("User should see a message Success You have added MacBook to your shopping cart!")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		laptopAndNotebook.successAddedMessageDisplayed();
		logger.info("success addedd message is displayed");
	 
	}
	@Then("User should see {int} tem\\(s){double} showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(int num, double price) {
		laptopAndNotebook.itemShowedToTheCart(602.00);
		logger.info("item showed to the cart");

	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
	laptopAndNotebook.clickOnCartption();
	logger.info("user clicked on cart option");
	
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	laptopAndNotebook.clickOnRedXButton();
	logger.info("user clicked on red x button to remove the item");
	 
	}
	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(int number) {
		laptopAndNotebook.emptyCartShowed(0);
		logger.info("item removed and the cart shows empty");
	   Util.takeScreenShot();
	}
	@When("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
	laptopAndNotebook.sonyWishListHeartButton();
	logger.info("User clicked on heart icon on Sony VaIO laptop wish list");
		
	}
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		laptopAndNotebook.createAccountWarningMessageDisplayed();
		logger.info("Create account warning message displayed");
			
	}

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopAndNotebook.clickOnMacbookProItem();
		logger.info("USer clicked on Macbook Pro item");

	}
	@Then("User should see ${double} price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		laptopAndNotebook.MacbookPriceTagIsDisplayed();
		logger.info("Macbook pro price tag is displayed");
	
	}

}
