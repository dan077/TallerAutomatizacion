Feature: Shopping cart - Linio.com.co
  As a user of linio
  i want to add items to my Shopping Cart
  To Buy easily many items.

  Scenario: add items to the car
    Given The user is at web page https://www.linio.com.co
    When The user select the category Hogar
    And The user select the section Colchones y Base Cama
    And The user Select the item Super Mega Combo Azul Queen 160x190 Resortado Marshall
    And The user adds 3 units to the Shopping cart
    And the user go to the Shopping cart
    Then The user see 3 units the item Super Mega Combo Azul Queen 160x190 Resortado Marshall and it's price