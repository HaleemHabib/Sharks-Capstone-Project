package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;
import io.cucumber.java.en.When;

public class RetailLoginPage extends Base{

	public RetailLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement clickMyAccount;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	private WebElement clickOnLoginButton;
	
	@FindBy(id = "input-email")
	private WebElement inputEmailField;
	
	@FindBy(id = "input-password")
	private WebElement inputPasswordField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement clickOnSubmitButton;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAffiliateAccount;
	
	@FindBy(id = "input-company")
	private WebElement companyNameInput;

	@FindBy(id = "input-website")
	private WebElement websiteInput;
	
	@FindBy(id = "input-tax")
	private WebElement taxID;
	
	@FindBy(xpath = "(//div[@class='radio']/label/input)[1]")
	private WebElement paymentMethodCheque;
	
	@FindBy(id = "input-cheque")
	private WebElement payeeNameInput;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement aboutUsCheckBox;
		
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement pushContinueButton;
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(xpath="//*[@id=\"content\"]/ul[3]/li[1]/a")
	private WebElement EditYourAffiliateInformation;
			
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInformation;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id ="input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement paymentMethodBankTransfer;
	
	@FindBy(id = "input-bank-name")
	private WebElement bankName;
	
	@FindBy(id = "input-bank-branch-number")
	private WebElement abaBranchName;
	
	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCode;
	
	@FindBy(id = "input-bank-account-name")
	private WebElement bankAccountName;
	
	@FindBy(id = "input-bank-account-number")
	private WebElement bankAccountNumber;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement congratulationMessage;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successUpdatedAccountMessage;
			
	public void clickOnMyAccount() {
		clickMyAccount.click();
	}
	public void clickOnLoginButton() {
		clickOnLoginButton.click();
	}
	public void enterEmailValue(String emailValue) {
		inputEmailField.sendKeys(emailValue);
	}
	public void enterPasswordValue(String passwordValue) {
		inputPasswordField.sendKeys(passwordValue);
	}
	public void clickOnSubmitButton() {
		clickOnSubmitButton.click();
	}	
	public void clickOnRegisterLink() {
		registerForAffiliateAccount.click();
	}
	public void enterCompanyName(String companyNameValue) {
		companyNameInput.sendKeys(companyNameValue);
	}	
	public void enterWebsiteName(String webSiteNamevalue) {
	websiteInput.sendKeys(webSiteNamevalue);
	}
	public void enterTaxID(String taxIDValue) {
		taxID.sendKeys(taxIDValue);	
	}
	public void selectPaymentMethod(String PaymentType) {
		if(PaymentType.equalsIgnoreCase("cheque"))
			paymentMethodCheque.click();
		else if (PaymentType.equalsIgnoreCase("paypal"))
			paymentMethodCheque.click();
		else
			paymentMethodBankTransfer.click();	
	}
	public void enterPayeeName(String payeeName) {
		payeeNameInput.sendKeys(payeeName);
	}
	public void clickOnAboutUs() {
		aboutUsCheckBox.click();
	}
	public void pushOnSubmitButton() {
		pushContinueButton.click();
	}
	public boolean successMessageVerification() {
		if(successMessage.isDisplayed())
			return true;
		else return false;
	}
	public void clickOnEditYourAffiliationInformation() {
		EditYourAffiliateInformation.click();
	}		
	public void enterFirstNameField(String firstNameValue) {
		firstNameField.clear();
		firstNameField.sendKeys(firstNameValue);
	}
	public void enterLastNameField(String lastNameValue) {
		lastNameField.clear();
		lastNameField.sendKeys(lastNameValue);
	}
	public void enterEmailField(String emailValue) {
		emailField.clear();
		emailField.sendKeys(emailValue);
	}
	public void entertelephoneField(String telephonFieldValue) {
		telephoneField.clear();
		telephoneField.sendKeys(telephonFieldValue);
	}	
	public void editYourPersonnalInformation() {
			editYourAccountInformation.click();
	}
		
	public String actualSuccessMessage() {
		return congratulationMessage.getText();
		
	}
	public void enterBankName(String bankNameValue) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-bank-name")));
	bankAccountName.sendKeys(bankNameValue);
	}
	public void enterABAbranchName(String abaBranchNameValue) {
		abaBranchName.sendKeys(abaBranchNameValue);
	}
	public void enterSwiftCoe(String swiftCodeValue) {
		swiftCode.sendKeys(swiftCodeValue);
	}
	public void enterBankAccountName(String bankNameValue) {
		bankName.sendKeys(bankNameValue);
	}
	public void enterAccountNumber(String accountNumberValue) {
		bankAccountNumber.sendKeys(accountNumberValue);
	}
	
	public boolean congratulatinmessageDisplayed() {
		if(congratulationMessage.isDisplayed())
			return true;
			else
				return false;
	}
	public String successUpdatedAccountMessage() {
		return successUpdatedAccountMessage();
	}
}