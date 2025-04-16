package steps;

import pages.tc_009Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_009Steps {
    private tc_009Page page = new tc_009Page();

    @Given("usuario inicia la carga de un documento")
    public void usuarioIniciaLaCargaDeUnDocumento() {
        page.startDocumentUpload();
    }

    @When("la conexión de red es interrumpida")
    public void laConexionDeRedEsInterrumpida() {
        assertTrue(page.simulateNetworkInterruption());
    }

    @Then("el sistema detecta la interrupción y guarda el estado actual")
    public void elSistemaDetectaLaInterrupcionYGuardaElEstadoActual() {
        assertTrue(page.isUploadInterruptedAndStateSaved());
    }

    @When("la conexión de red es restaurada")
    public void laConexionDeRedEsRestaurada() {
        page.restoreNetworkConnection();
    }

    @Then("el sistema reanuda la carga y completa desde el punto interrumpido")
    public void elSistemaReanudaLaCargaYCompletaDesdeElPuntoInterrumpido() {
        assertTrue(page.resumeAndCompleteUploadFromInterruptedPoint());
    }
}