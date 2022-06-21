package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopsPage extends Base {

	public DesktopsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Desktops")
	private WebElement desktopTap;
	
	@FindBy(linkText="Show All Desktops")
	private WebElement showAllDesktops;
	
	@FindBy(xpath="(//span[text()='Add to Cart'])[2]")
	private WebElement addToCartOnCanonEOS5D;
		
	@FindBy(id="input-option226")
	private WebElement optionsDropDown5D;
	
	@FindBy(xpath="//input[@name='quantity']")
	private WebElement selectQuantity;

	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement canonDropdown;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addTocartButton;
	
	@FindBy(xpath="//a[text()='HP LP3065']")
	private WebElement addHPLPDesktop;
	
	@FindBy(tagName = "img")
	private List<WebElement> items;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	public String successMessageDisplayed() {
		return successMessage.getText();
		
	}
	public void clickOnDesktopTab() {
		Actions action = new Actions(driver);
		action.moveToElement(desktopTap).build().perform();
	}
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	public void clickAddToCartOnCanonEOS5D() {
		addToCartOnCanonEOS5D.click();
	}
	public void selectQuantity(String quantity) {
		selectQuantity.clear();
		selectQuantity.sendKeys(quantity);
	}
	public void selectRedCanon() {
		Select color = new Select(canonDropdown);
		color.selectByValue("15");
	}
	public void addToCartbutton() {
		addTocartButton.click();
	}
	public List<WebElement> elements() {
		List<WebElement> DesktopsItems = items;
		return DesktopsItems;

	}
	public void addHPLPdesktop() {
		addHPLPDesktop.click();
	}

//	public String successMessageAppeared() {
//		return successMessageAppeared.getText();
}
//}








