package com.certificacion.lfpu.stepsdefinitions;

import com.certificacion.lfpu.models.DatosBusqueda;
import com.certificacion.lfpu.navegacion.NavegarEn;
import com.certificacion.lfpu.tasks.IngresarDatos;
import com.certificacion.lfpu.tasks.SeleccionaLaTarifa;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VerificarTarifasDeHotel {

    @Before
    public void AsignarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^El \"([^\"]*)\" ingresa a la pagina de busqueda$")
    public void elIngresaALaPaginaDeBusqueda(String actor) {
        theActorCalled(actor).attemptsTo(NavegarEn.DxHotel());
    }

    @Given("^El usuario ingresa los datos de viaje y busca los resultados$")
    public void elUsuarioIngresaLosDatosDeViajeYBuscaLosResultados(List<DatosBusqueda> datosBusquedaList) {
        theActorInTheSpotlight().attemptsTo(IngresarDatos.paraLaBusqueda(datosBusquedaList));

    }

    @Given("^verifica el precio mas favorable en la lista de resultados$")
    public void verificaElPrecioMasFavorableEnLaListaDeResultados() {
        theActorInTheSpotlight().attemptsTo(SeleccionaLaTarifa.masFavorable());
    }


}
