Feature: Shopping cart - Linio.com.co
  As a user of linio
  i want to add items to my Shopping Cart
  To Buy easily many items.

  Background:
    Given The user is at web page https://www.linio.com.co
    When The user select the category Hogar
    And The user select the section Colchones y Base Cama


  Scenario Outline: add items to the car
    When The user Select the item <itemName>
    And The user adds <numberOfUnits> units to the Shopping cart and he go to the Shopping cart
    Then The user see <numberOfUnits> units the item <itemName> and it's price
    Examples:
      | itemName                                               | numberOfUnits |
      | Super Mega Combo Azul Queen 160x190 Resortado Marshall | 3             |

  Scenario Outline: remove items to the car
    When The user Select the item <itemName>
    And The user adds <numberOfUnits> units to the Shopping cart and he go to the Shopping cart
    And The user remove all units to the Shopping cart
    And The user see the message <message>

    Examples:
      | itemName                                               | numberOfUnits | message                        |
      | Super Mega Combo Azul Queen 160x190 Resortado Marshall | 3             | No hay productos en tu carrito |