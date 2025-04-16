Feature: Validar límite de tamaño del documento

  Scenario: El sistema detecta tamaño excesivo del documento
    Given que el usuario ha seleccionado un documento de tamaño excesivo
    When intenta cargar el documento
    Then el sistema muestra un mensaje de error que indica "El archivo excede el tamaño máximo permitido"