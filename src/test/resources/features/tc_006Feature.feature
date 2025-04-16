Feature: Validate data integrity after upload

  Scenario: Verify document upload and data integrity
    Given I have a valid document to upload
    When I upload the document
    Then the document should be stored correctly in the database
    And the metadata and content should be accurate and complete