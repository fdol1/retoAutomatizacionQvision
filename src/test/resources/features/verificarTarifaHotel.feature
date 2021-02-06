#Author: l1_fdo@hotmail.com

  @etiquetaPrincipal
  Feature: Verificar la mejor tarifa de hotel
    El usuario
    Quiere verificar cual es la tarifa mas economica
    De la lista de resultados obtenidos

  Background: El usuario ingresa al portal DX Hotels
    Given El usuario ingresa a la pagina de busqueda

    @VerTarifasDeHotel
    Scenario Outline: El usuario quiere conocer la mejor tarifa de hotel
      Given El usuario selecciona su "<lugarDestino>"
      And Ingresa el "<diaLlegada>" y el "<diaSalida>"
      Then Puede ingresar la de "<cantidadHabitaciones>"
      And Seleccionar el "<numeroDeAdultos>" y el "<numeroDeInfantes>"
      Then Podra verificar las tarifas listadas de la busqueda
      Examples:
        | lugarDestino | diaLlegada | diaSalida | cantidadHabitaciones | numeroDeAdultos | numeroDeInfantes |
        | Los Angeles  | 2/10/2021  | 2/15/2021 | 1                    | 2               | 0                |