package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_008Page;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page page;

    public tc_008Steps() {
        // Initialize the driver and page object here
        page = new tc_008Page(driver);
    }

    @Given("el usuario inicia sesión sin permisos de carga")
    public void usuarioSinPermisos() {
        page.loginAsUserWithoutUploadPermissions();
    }

    @When("intenta acceder a la sección de carga")
    public void intentaAccederSeccionCarga() {
        page.tryAccessUploadSection();
    }

    @Then("se muestra un mensaje de acceso denegado")
    public void mensajeAccesoDenegado() {
        Assert.assertTrue(page.isAccessDeniedMessageDisplayed());
    }
}