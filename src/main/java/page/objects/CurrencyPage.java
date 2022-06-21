package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class CurrencyPage extends Base {
	
	
	public CurrencyPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement currencyDropdown;
	
	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement euroButton;
	
	@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
	private WebElement euroIconDisplayed;
	
	@FindBy(id = "cart-total")
	private WebElement shoppingCartTotal;
	
	@FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty')]")
	private WebElement shoppingCartEmptyMessageDisplayed;
	

	public void selectEuroCurrency() {
		currencyDropdown.click();
	}
	public void selectEuroIcon() {
		euroButton.click();
	}
	
	public void euroIconIsDisplayed() {
		euroIconDisplayed.isDisplayed();
	}
	public void clickOnShoppingCartIcon() {
		shoppingCartTotal.click();
	}	
	public boolean shoopingCartEmptyMessageDisplayed() {
		if(shoppingCartEmptyMessageDisplayed.isDisplayed())
			return true;
			else
				return false;
	}
}