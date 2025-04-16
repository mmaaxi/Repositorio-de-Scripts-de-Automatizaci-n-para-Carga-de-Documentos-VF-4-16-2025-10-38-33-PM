Feature: Validar recuperación de carga interrumpida

  Scenario: Cargar un documento con interrupción de red y recuperación
    Given usuario inicia la carga de un documento
    When la conexión de red es interrumpida
    Then el sistema detecta la interrupción y guarda el estado actual
    When la conexión de red es restaurada
    Then el sistema reanuda la carga y completa desde el punto interrumpido