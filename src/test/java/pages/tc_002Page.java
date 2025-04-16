package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;
    By cargarDocumentoButton = By.id("cargarDocumentoBtn");
    By errorMessage = By.id("errorMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCargarDocumento() {
        driver.findElement(cargarDocumentoButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        WebElement errorElement = driver.findElement(errorMessage);
        return errorElement.isDisplayed() && errorElement.getText().contains("selección de un archivo");
    }
}