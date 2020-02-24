Feature: Automated End2End Tests
Description: The purpose of this feature is to test End 2 End integration.
 
Scenario: Customer customer add product to cart and verify
	Given user is on Home Page
	When he search for "shoe"
	And choose to buy the first item
	And moves to checkout from mini cart
	And enter personal details on checkout page
	And select same delivery address
	And select payment method as "check" payment
	And place the order