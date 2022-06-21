package step.definitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.CurrencyPage;
import utilities.Util;

public class CurrencyStepDef extends Base {

	CurrencyPage currencyPage = new CurrencyPage();
	
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		currencyPage.selectEuroCurrency();
		logger.info("User clicked on currency");
	 
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		currencyPage.selectEuroIcon();
		logger.info("user chosed Euro from dropdown");
	
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		currencyPage.euroIconIsDisplayed();
		logger.info("Euro icon is selected");
	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		currencyPage.clickOnShoppingCartIcon();
		logger.info("user clicked on shopping cart icon");
	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		currencyPage.shoopingCartEmptyMessageDisplayed();
		logger.info("shopping cart empty message displayed");
		Util.takeScreenShot();

	}

}
