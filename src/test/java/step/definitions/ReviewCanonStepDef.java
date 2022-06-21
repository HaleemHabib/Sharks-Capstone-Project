package step.definitions;

import java.util.List;
import java.util.Map;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.ReviewCanonPage;
import utilities.Util;

public class ReviewCanonStepDef extends Base{

	ReviewCanonPage CanonPage = new ReviewCanonPage();
	
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		CanonPage.clickReviewTab();
		logger.info("User clicked on review tab");		
		
	}
	@Then("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> ReviewCanon = dataTable.asMaps(String.class, String.class);
		CanonPage.yourNameInput(ReviewCanon.get(0).get("yourname"));
		CanonPage.yourReviewField(ReviewCanon.get(0).get("yourReview"));
		Util.takeScreenShot();
			
	}
}
