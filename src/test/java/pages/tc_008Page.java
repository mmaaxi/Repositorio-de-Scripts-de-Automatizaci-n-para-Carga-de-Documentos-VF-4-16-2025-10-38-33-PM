package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {
    WebDriver driver;

    By uploadSection = By.id("uploadSection");
    By accessDeniedMessage = By.id("accessDenied");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAsUserWithoutUploadPermissions() {
        // Steps to log in as a user without upload permissions
    }

    public void tryAccessUploadSection() {
        // Attempt to navigate to the upload section
        driver.findElement(uploadSection).click();
    }

    public boolean isAccessDeniedMessageDisplayed() {
        // Verify if the access denied message is displayed
        return driver.findElement(accessDeniedMessage).isDisplayed();
    }
}