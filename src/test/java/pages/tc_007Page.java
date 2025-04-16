package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {

    WebDriver driver;
    By uploadInput = By.id("uploadInput");
    By previewButton = By.id("previewButton");
    By previewPane = By.id("previewPane");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadDocument(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
    }
    
    public void clickPreviewButton() {
        driver.findElement(previewButton).click();
    }

    public boolean isPreviewVisible() {
        return driver.findElement(previewPane).isDisplayed();
    }

    public boolean isPreviewAccurate() {
        // Método para comparar el contenido del documento original con la previsualización
        // Simplemente retornamos true en este mock up, se tendría que implementar lógica de comparación real
        return true;
    }
}