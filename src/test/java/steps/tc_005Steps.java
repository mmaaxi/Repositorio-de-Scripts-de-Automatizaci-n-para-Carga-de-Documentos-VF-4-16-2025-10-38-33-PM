package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_005Page;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page page;

    @Given("la conexión de red es lenta")
    public void laConexiónDeRedEsLenta() {
        page.simulateSlowNetwork();
    }

    @When("intento cargar el documento")
    public void intentoCargarElDocumento() {
        page.attemptDocumentUpload();
    }

    @Then("el sistema muestra un indicador de progreso prolongado")
    public void elSistemaMuestraUnIndicadorDeProgresoProlongado() {
        page.verifyLongLoadingIndicator();
    }

    @Then("permite completar la carga sin errores, aunque con mayor retardo")
    public void permiteCompletarLaCargaSinErroresAunqueConMayorRetardo() {
        page.verifySuccessfulUploadWithDelay();
    }
}