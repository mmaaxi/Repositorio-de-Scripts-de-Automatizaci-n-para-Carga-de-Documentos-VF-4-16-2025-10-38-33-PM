Feature: Validar mensaje de error al intentar cargar documento en formato no permitido

  Scenario: Intentar cargar documento en formato DOCX o JPG
    Given El usuario ha seleccionado un documento en formato DOCX o JPG
    When El usuario intenta cargar el documento
    Then El sistema rechaza el archivo
    And Se muestra mensaje de error: 'Formato de archivo no permitido'