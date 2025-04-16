package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {

    tc_003Page page = new tc_003Page();

    @Given("El usuario ha seleccionado un documento en formato DOCX o JPG")
    public void elUsuarioHaSeleccionadoUnDocumentoEnFormatoNoPermitido() {
        page.selectFile("file.docx"); // Simulate selecting a DOCX file
    }

    @When("El usuario intenta cargar el documento")
    public void elUsuarioIntentaCargarElDocumento() {
        page.attemptToUploadFile();
    }

    @Then("El sistema rechaza el archivo")
    public void elSistemaRechazaElArchivo() {
        Assert.assertTrue(page.isFileRejected());
    }

    @Then("Se muestra mensaje de error: 'Formato de archivo no permitido'")
    public void seMuestraMensajeDeErrorFormatoDeArchivoNoPermitido() {
        String expectedErrorMessage = "Formato de archivo no permitido";
        Assert.assertEquals(expectedErrorMessage, page.getErrorMessage());
    }
}