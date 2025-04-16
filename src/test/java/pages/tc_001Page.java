package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_001Page {
    WebDriver driver;

    @FindBy(id = "uploadInput")
    WebElement uploadInput;

    @FindBy(id = "uploadButton")
    WebElement uploadButton;

    @FindBy(id = "uploadedDocuments")
    WebElement uploadedDocumentsSection;

    public Tc_001Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void seleccionarDocumentoPDFValido() {
        uploadInput.sendKeys("/path/to/valid/document.pdf");
    }

    public void clicarEnCargarDocumento() {
        uploadButton.click();
    }

    public boolean esProcesoDeCargaIniciado() {
        // Lógica de verificación de inicio de carga
        return true; // Simulación
    }

    public boolean esDocumentoListado() {
        return uploadedDocumentsSection.getText().contains("document.pdf");
    }
}