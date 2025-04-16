package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {
    WebDriver driver;

    By inputFile = By.id("document-upload");
    By errorMessage = By.id("error-message");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarDocumentoExcesivo() {
        WebElement uploadElement = driver.findElement(inputFile);
        uploadElement.sendKeys("path/to/large/file");
    }

    public void cargarDocumento() {
        WebElement uploadButton = driver.findElement(By.id("upload-button"));
        uploadButton.click();
    }

    public String obtenerMensajeDeError() {
        WebElement errorElement = driver.findElement(errorMessage);
        return errorElement.getText();
    }
}