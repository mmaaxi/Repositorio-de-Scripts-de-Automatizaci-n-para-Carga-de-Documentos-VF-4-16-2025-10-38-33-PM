Feature: Documento de carga - Validaciones
  Para garantizar la carga de documentos eficientes
  Como usuario del sistema
  Necesito recibir un mensaje de error al intentar cargar sin seleccionar un documento

  Scenario: Validar carga sin seleccionar documento
    Given El usuario está en la página de carga de documentos
    When No selecciona ningún archivo y hace clic en 'Cargar documento'
    Then El sistema muestra un mensaje de error solicitando la selección de un archivo