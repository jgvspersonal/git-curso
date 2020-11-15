Feature: Automation larebaja
  As A web user
  I want to visit larebaja website
  To buy a product

  @BuyAProduct
  Scenario: Search a product and add to shopping car
    Given I want to visit larebaja website
    When I search an add a product to shopping car
      | product |
      | Vick    |

    Then I shoud see the message on the screen Paga contra entrega.