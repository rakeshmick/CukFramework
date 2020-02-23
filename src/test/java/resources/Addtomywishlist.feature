
Feature: Add to my wishlist
Scenario: Customer selects a product and adds to wishlist
	Given user is on Home Page
	And user clicks on a product
	And user selects color "pink"
	And user selects size "38"
	And user creates a wishlist
