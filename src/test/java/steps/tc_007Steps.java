package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_007Page;

public class tc_007Steps {

    WebDriver driver;
    tc_007Page previewPage;

    public tc_007Steps() {
        this.driver = Hooks.driver;
        previewPage = PageFactory.initElements(driver, tc_007Page.class);
    }

    @Given("el usuario ha cargado un documento en el sistema")
    public void el_usuario_ha_cargado_un_documento_en_el_sistema() {
        previewPage.uploadDocument("ruta_del_documento.docx");
    }

    @When("el usuario hace clic en 'Previsualizar'")
    public void el_usuario_hace_clic_en_previsualizar() {
        previewPage.clickPreviewButton();
    }

    @Then("el sistema debe mostrar una vista previa del documento")
    public void el_sistema_debe_mostrar_una_vista_previa_del_documento() {
        Assert.assertTrue("Vista previa no está visible", previewPage.isPreviewVisible());
    }

    @Then("la previsualización debe ser fiel al documento original")
    public void la_previsualizacion_debe_ser_fiel_al_documento_original() {
        Assert.assertTrue("La previsualización no es fiel al documento original", previewPage.isPreviewAccurate());
    }
}