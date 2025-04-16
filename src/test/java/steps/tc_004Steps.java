package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;

public class tc_004Steps {
    WebDriver driver;
    tc_004Page page;

    public tc_004Steps() {
        driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_004Page.class);
    }

    @Given("que el usuario ha seleccionado un documento de tamaño excesivo")
    public void seleccionarDocumentoDeTamañoExcesivo() {
        page.seleccionarDocumentoExcesivo();
    }

    @When("intenta cargar el documento")
    public void intentarCargarDocumento() {
        page.cargarDocumento();
    }

    @Then("el sistema muestra un mensaje de error que indica {string}")
    public void verificarMensajeDeError(String mensajeEsperado) {
        String mensajeReal = page.obtenerMensajeDeError();
        Assert.assertEquals(mensajeEsperado, mensajeReal);
    }
}