package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_006Page;

public class tc_006Steps {

    WebDriver driver;
    tc_006Page uploadPage;

    public tc_006Steps() {
        this.driver = Hooks.getDriver();
        uploadPage = PageFactory.initElements(driver, tc_006Page.class);
    }

    @Given("I have a valid document to upload")
    public void iHaveAValidDocumentToUpload() {
        uploadPage.prepareValidDocument();
    }

    @When("I upload the document")
    public void iUploadTheDocument() {
        uploadPage.uploadDocument();
    }

    @Then("the document should be stored correctly in the database")
    public void theDocumentShouldBeStoredCorrectlyInTheDatabase() {
        uploadPage.verifyDocumentStoredInDatabase();
    }

    @Then("the metadata and content should be accurate and complete")
    public void theMetadataAndContentShouldBeAccurateAndComplete() {
        uploadPage.verifyDocumentMetadataAndContent();
    }
}