package com.certificacion.lfpu.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/verificarTarifaHotel.feature",
        tags = {"@etiquetaPrincipal"},
        glue ="com.certificacion.lfpu.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class VerificarTarifaHotel {

}