package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;

public class ProductComparisonPage extends Base {
	
	public ProductComparisonPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[3]")
	private WebElement MacBookCompareIcon;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement macBookAirComparisonButton;
		
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement MacAirSuccessMessageDisplayed; 
	
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement productCompareButton;
	
	@FindBy(xpath = "//*[@id=\"product-category\"]/div[1]")
	private WebElement successaddedMessageAppeared;
	
	@FindBy(xpath = "//div[@class='col-sm-12']")
	private WebElement productComparisonChart;
	
	public void clickOnMacBookCompareIcon() {
		MacBookCompareIcon.click();
	}
	
	public void clickOnmacBookAirComparisonButton() {
		macBookAirComparisonButton.click();
	}
	
	public void clickOnCompareTotalButton() {
		productCompareButton.click();
		
	}
	public String successAddedMessageAppeared() {
		return successaddedMessageAppeared.getText();
		
	}
	public boolean productComparisonChartDisplayed() {
		if(productComparisonChart.isDisplayed())
			return true;
		else
			return false;
	}
	
	
}
