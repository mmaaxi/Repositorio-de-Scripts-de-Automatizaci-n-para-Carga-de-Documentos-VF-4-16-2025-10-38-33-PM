package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class tc_005Page {
    WebDriver driver;

    By loadingIndicator = By.id("loadingIndicator");
    By uploadButton = By.id("uploadButton");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void simulateSlowNetwork() {
        // Code to simulate slow network, e.g., using browser throttling.
    }

    public void attemptDocumentUpload() {
        driver.findElement(uploadButton).click();
    }

    public void verifyLongLoadingIndicator() {
        // Verify that loading indicator is displayed for an extended period
    }

    public void verifySuccessfulUploadWithDelay() {
        // Verify that upload completes successfully, albeit with a delay.
    }
}