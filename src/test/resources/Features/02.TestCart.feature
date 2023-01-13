
@tag
Feature: Verify to add to cart
  I want to use this template for my feature file

  Scenario: Add to cart
    When Navigate to dashboard page 
    And Add to cart with product name A to Z
    And Add to cart with product name Z to A
    And Add to cart with product price low to high
    Then Add to cart with product price high to low 

