package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page page;

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        driver = new ChromeDriver();
        page = new tc_002Page(driver);
        driver.get("URL_DE_LA_PAGINA");
    }

    @When("No selecciona ningún archivo y hace clic en 'Cargar documento'")
    public void no_selecciona_ningún_archivo_y_hace_clic_en_cargar_documento() {
        page.clickCargarDocumento();
    }

    @Then("El sistema muestra un mensaje de error solicitando la selección de un archivo")
    public void el_sistema_muestra_un_mensaje_de_error_solicitando_la_selección_de_un_archivo() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
        driver.quit();
    }
}