Feature: Validar funcionalidad de previsualización del documento

  Scenario: Usuario carga y previsualiza un documento
    Given el usuario ha cargado un documento en el sistema
    When el usuario hace clic en 'Previsualizar'
    Then el sistema debe mostrar una vista previa del documento
    And la previsualización debe ser fiel al documento original