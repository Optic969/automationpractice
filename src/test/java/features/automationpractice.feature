Feature: AutomationPractice Tests
  Open AutomationPractice, check possibility to add product to cart,delete them, search them, use checkbox

  Scenario: Open AutomationPractice, choose random three items in each category and add to cart, check cart with items,
  delete one items, search deleted items, click on checkbox

    Given open Automationpractice page and add fist product from woman category to cart
    When add second product to cart from dresses category
    When add third product to cart from tshirt category
    When check cart and delete one of products
    When search deleted products
    When click on checkbox

