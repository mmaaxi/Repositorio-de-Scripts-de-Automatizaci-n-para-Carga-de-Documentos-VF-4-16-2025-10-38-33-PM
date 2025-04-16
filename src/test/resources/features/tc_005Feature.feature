Feature: Validar carga con conexión de red lenta

  Scenario: Carga de documento con red lenta
    Given la conexión de red es lenta
    When intento cargar el documento
    Then el sistema muestra un indicador de progreso prolongado
    And permite completar la carga sin errores, aunque con mayor retardo