package com.certificacion.lfpu.questions;

import com.certificacion.lfpu.utils.Constantes;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static com.certificacion.lfpu.userinterfaces.DetalleResultadoHotelPage.TXT_PRECIO_POR_DIA;
import static com.certificacion.lfpu.userinterfaces.DetalleResultadoHotelPage.TXT_PRECIO_TOTAL;

public class VerificarElPrecioTotal implements Question<Boolean> {


	public VerificarElPrecioTotal() {
		super();
	}

	public static VerificarElPrecioTotal conElPrecioCalculado() {
		return new VerificarElPrecioTotal();
	}

	@Override
	public Boolean answeredBy(Actor actor) {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//actor.attemptsTo(
		//		WaitUntil.the(TXT_PRECIO_POR_DIA,isClickable()).forNoMoreThan(5).seconds()
		//);

		List<WebElementFacade> lstPrecioPorDia = TXT_PRECIO_POR_DIA.resolveAllFor(actor);
		List<WebElementFacade> lstPrecioTotal = TXT_PRECIO_TOTAL.resolveAllFor(actor);

		double precioDia = Double.parseDouble(
				lstPrecioPorDia.get(0).getText().trim().substring(1));

		double precioTotal = Double.parseDouble(
				lstPrecioTotal.get(0).getText().trim().substring(1));

		double valorCalculado = (precioDia * Constantes.TOTAL_DIAS);

		return valorCalculado == precioTotal;
	}
}