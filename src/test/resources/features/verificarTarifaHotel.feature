#Author: l1_fdo@hotmail.com

  @etiquetaPrincipal
  Feature: Verificar la mejor tarifa de hotel
    El usuario
    Quiere verificar cual es la tarifa mas economica
    De la lista de resultados obtenidos

  Background: El usuario ingresa al portal DX Hotels
    Given El "usuario" ingresa a la pagina de busqueda

    @VerTarifasDeHotel
    Scenario: El usuario quiere conocer la mejor tarifa de hotel
      Given El usuario ingresa los datos de viaje y busca los resultados
        | lugarDestino | diaLlegada | diaSalida | numeroDeHabitaciones | numeroDeAdultos | numeroDeInfantes |
        | Los Angeles  | 2/10/2021  | 2/15/2021 | 1                    | 2               | 0                |
      And verifica el precio mas favorable en la lista de resultados



