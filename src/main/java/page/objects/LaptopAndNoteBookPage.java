package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class LaptopAndNoteBookPage extends Base {

	public LaptopAndNoteBookPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a")
	private WebElement laptopsAndNotebooksTab;
	
	@FindBy(xpath = "//a[contains(text(),'Show All L')]")
	private WebElement showAllLabtopsAndNotebooksTab;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[1]/h4/a")
	private WebElement MacBookItem;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successAddedMessage;
	
	@FindBy(id = "cart-total")
	private WebElement itemShowedToTheCart;
	
	@FindBy(id = "cart-total")
	private WebElement clickOnCartOption;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement clickOnRedXButton;
	
	@FindBy(id = "cart-total")
	private WebElement emptyCartShowed;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement sonyWishListButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement createAccountWarningMessage;
	
	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement MacBookProItem;
	
	@FindBy(xpath = "//div[@class='col-sm-4']//child::h2")
	private WebElement MacbookpriceTagIsDisplayed; 
	
	public void clickOnlaptopsAndNotebooks() {
		laptopsAndNotebooksTab.click();
	}
	public void clickOnshowAllLabtopsAndNotebooks() {
		showAllLabtopsAndNotebooksTab.click();
	}
	public void clickOnMacBookItem() {
		MacBookItem.click();
	}
	public void clickAddToCartButton() {
		addToCartButton.click();
	}
	public boolean successAddedMessageDisplayed() {
		if(successAddedMessage.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean itemShowedToTheCart(double price) {
		if(itemShowedToTheCart.isDisplayed())
			return true;
		else
			return false;	
	}
	public void clickOnCartption() {
		clickOnCartOption.click();
	}
	public void clickOnRedXButton() {
		clickOnRedXButton.click();
	}
	public boolean emptyCartShowed(int num) {
		if(successAddedMessage.isDisplayed())
			return true;
		else
			return false;
	}
	public void sonyWishListHeartButton() {
		sonyWishListButton.click();
	}
	public boolean createAccountWarningMessageDisplayed() {
		if(createAccountWarningMessage.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnMacbookProItem() {
		MacBookProItem.click();
	}
	public boolean MacbookPriceTagIsDisplayed() {
		if(MacbookpriceTagIsDisplayed.isDisplayed())
			return true;
		else
			return false;
		
	}
}
