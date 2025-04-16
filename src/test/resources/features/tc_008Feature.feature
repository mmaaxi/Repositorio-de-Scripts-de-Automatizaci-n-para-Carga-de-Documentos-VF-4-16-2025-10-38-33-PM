Feature: Validar acceso y permisos para carga de documentos

  Scenario: Usuario sin permisos intenta acceder a la carga de documentos
    Given el usuario inicia sesión sin permisos de carga
    When intenta acceder a la sección de carga
    Then se muestra un mensaje de acceso denegado