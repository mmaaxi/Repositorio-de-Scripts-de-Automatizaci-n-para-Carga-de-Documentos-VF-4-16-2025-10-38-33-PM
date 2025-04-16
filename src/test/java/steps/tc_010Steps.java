package steps;

import org.openqa.selenium.WebDriver;
import pages.tc_010Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page page;
    
    @Given("estoy en la página de carga de documentos")
    public void estoy_en_la_página_de_carga_de_documentos() {
        page = new tc_010Page(driver);
        page.navigateToDocumentUploadPage();
    }

    @When("cargo un documento utilizando HTTPS")
    public void cargo_un_documento_utilizando_HTTPS() {
        page.uploadDocumentSecurely();
    }

    @Then("la transmisión del documento es cifrada y segura")
    public void la_transmisión_del_documento_es_cifrada_y_segura() {
        page.verifySecureTransmission();
    }

    @Then("no se detectan vulnerabilidades o datos expuestos")
    public void no_se_detectan_vulnerabilidades_o_datos_expuestos() {
        page.monitorDataTraffic();
    }
}