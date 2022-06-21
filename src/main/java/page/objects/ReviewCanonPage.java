package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

import io.cucumber.java.en.When;

public class ReviewCanonPage extends Base {

	public ReviewCanonPage() {
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//a[@aria-expanded='false']")
	private WebElement clickReviewTab;
	
	@FindBy(xpath="//input[@id='input-name']")
	private WebElement yourNameField;
	
	@FindBy(xpath="//textarea[@id='input-review']")
	private WebElement yourReviewField; 
	
	@FindBy(xpath="//input[@value='5']")
	private WebElement ratingValueOption;
	
	@FindBy(xpath="//button[@id='button-review']")
	private WebElement reviewContinueButton;
	
	@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]/text()")
	private WebElement reviewSubmittedConfirmation;
	
	public void clickReviewTab() {
	clickReviewTab.click();
	}
	public void yourNameInput(String string) {
		yourNameField.sendKeys("Kamal Ali");
	}
	public void yourReviewField(String string) {
		yourReviewField.sendKeys("Thank you for the website");
	}
	public void ratingValueOption() {
		ratingValueOption.click();
	}
	public void continueButtion () {
		reviewContinueButton.click();
	}
	public String successMessageAppeared() {
		return reviewSubmittedConfirmation.getText();
	}
}
	
