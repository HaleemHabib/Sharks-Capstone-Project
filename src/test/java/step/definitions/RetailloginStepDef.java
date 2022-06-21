package step.definitions;

import java.util.List;
import java.util.Map;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import net.masterthought.cucumber.Configuration;
import page.objects.RetailLoginPage;
import utilities.Util;

public class RetailloginStepDef extends Base {

	RetailLoginPage retailLoginPage = new RetailLoginPage();
	
	@Given("user is on Retail website")
	public void user_is_on_retail_website() {
		logger.info("User is on Retail website");
	  
	}
	@When("user click on MyAccount")
	public void user_click_on_my_account() {
		retailLoginPage.clickOnMyAccount();
		logger.info("User clicked on my account");
	}
	@When("user click on Login option")
	public void user_click_on_login() {
		retailLoginPage.clickOnLoginButton();
		logger.info("User clicked on login Option");
	}
	@When("user enter userName {string}")
	public void user_enter_user_name(String emailValue) {
	    retailLoginPage.enterEmailValue(emailValue);
	    logger.info("User entered email value");
			
	}
	@When("User enter password {string}")
	public void user_enter_password(String passwordValue) {
		retailLoginPage.enterPasswordValue(passwordValue);
		logger.info("User entered password value");
		
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
		retailLoginPage.clickOnSubmitButton();
		logger.info("User clicked on login button");
	}
	@Then("user should be logged into myAccount dashboard")
	public void user_should_be_logged_into_my_account_dashboard() {
		logger.info("User should be logged into myAccount dashboard");
	    Util.takeScreenShot();
	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailLoginPage.clickOnRegisterLink();
		logger.info("user clicked on register For Affiliate Account");
	
	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> affiliateInfo = dataTable.asMaps(String.class, String.class);
		retailLoginPage.enterCompanyName(affiliateInfo.get(0).get("companyName"));
		retailLoginPage.enterWebsiteName(affiliateInfo.get(0).get("website"));
		retailLoginPage.enterTaxID(affiliateInfo.get(0).get("taxID"));
		retailLoginPage.enterPayeeName(affiliateInfo.get(0).get("chequePayeeName"));
		Util.takeScreenShot();
		}
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
	    retailLoginPage.clickOnAboutUs();
	    logger.info("user clicked on about us check box");
	}

	@Then("User click on continue button")
	public void User_click_on_Continue_button() {
		retailLoginPage.pushOnSubmitButton();
		logger.info("user clicked on continue button");
	}
	
	@Then("user should see a successfull message")
	public void user_should_see_a_successfull_message() {
		retailLoginPage.successMessageVerification();
		logger.info("Success message displayed");
		Util.takeScreenShot();
		
	}
	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retailLoginPage.clickOnEditYourAffiliationInformation();
		logger.info("user clicked on edit your affiliate information");

	}
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	retailLoginPage.selectPaymentMethod("bankTransfer");
	}
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> BankInformation = dataTable.asMaps(String.class, String.class);
		retailLoginPage.enterBankName(BankInformation.get(0).get("bankName"));
		retailLoginPage.enterABAbranchName(BankInformation.get(0).get("abaNumber"));
		retailLoginPage.enterSwiftCoe(BankInformation.get(0).get("swiftCode"));
		retailLoginPage.enterBankAccountName(BankInformation.get(0).get("accountName"));
		retailLoginPage.enterAccountNumber(BankInformation.get(0).get("accountNumber"));
		Util.takeScreenShot();
	}
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailLoginPage.pushOnSubmitButton();
		logger.info("user clicked on continue button");
	}

	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retailLoginPage.editYourPersonnalInformation();
		  
	}
	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
	List<Map<String, String>> PersonnalInformation = dataTable.asMaps(String.class, String.class);
	retailLoginPage.enterFirstNameField(PersonnalInformation.get(0).get("firstname"));
	retailLoginPage.enterLastNameField(PersonnalInformation.get(0).get("lastName"));
	retailLoginPage.enterEmailField(PersonnalInformation.get(0).get("email"));
	retailLoginPage.entertelephoneField(PersonnalInformation.get(0).get("telephone"));
		
	}
	@Then("User should see a message")
	public void user_should_see_a_message() {
		retailLoginPage.actualSuccessMessage();
		logger.info("success MEssage is displayed");
	}

	@Then("User should see a success message {string}")
	public void user_should_see_a_success_message(String string) {
		retailLoginPage.successUpdatedAccountMessage();
		logger.info("Success updated account message displayed");
	}
	
}
