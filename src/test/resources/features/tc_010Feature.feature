Feature: Validar seguridad en la transmisión de documentos

  Scenario: Cargar un documento sobre una conexión segura
    Given estoy en la página de carga de documentos
    When cargo un documento utilizando HTTPS
    Then la transmisión del documento es cifrada y segura
    And no se detectan vulnerabilidades o datos expuestos