package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {

    WebDriver driver;
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFile(String fileName) {
        // Code to simulate file select
        driver.findElement(By.id("fileInput")).sendKeys("/path/to/" + fileName);
    }

    public void attemptToUploadFile() {
        driver.findElement(uploadButton).click();
    }

    public boolean isFileRejected() {
        // Code to verify if the file is rejected
        return driver.findElement(errorMessage).isDisplayed();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}