Feature: Validar carga de documento con formato permitido

  Scenario: Cargar documento PDF válido
    Given el usuario selecciona un documento PDF válido
    When el usuario hace clic en el botón 'Cargar documento'
    Then el sistema debe iniciar el proceso de carga
    And el documento debe aparecer listado en la sección de documentos cargados