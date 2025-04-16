package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.Tc_001Page;
import org.junit.Assert;

public class Tc_001Steps {
    private Tc_001Page page;

    @Given("el usuario selecciona un documento PDF válido")
    public void el_usuario_selecciona_un_documento_PDF_válido() {
        page = new Tc_001Page();
        page.seleccionarDocumentoPDFValido();
    }

    @When("el usuario hace clic en el botón 'Cargar documento'")
    public void el_usuario_hace_clic_en_el_botón_Cargar_documento() {
        page.clicarEnCargarDocumento();
    }

    @Then("el sistema debe iniciar el proceso de carga")
    public void el_sistema_debe_iniciar_el_proceso_de_carga() {
        Assert.assertTrue(page.esProcesoDeCargaIniciado());
    }

    @Then("el documento debe aparecer listado en la sección de documentos cargados")
    public void el_documento_debe_aparecer_listado() {
        Assert.assertTrue(page.esDocumentoListado());
    }
}