Feature: verify to checkout

Scenario: Checkout with full fill  
	When Navigate to dashboard page to checkout 
	And Choose product to checkout
	And Click cart 
	And Click checkout 
	And Fill "hikmah" as firstname "salam" as last name "123" as code 
	And Scroll down data
	And Click continue
	And Click Finish
	Then Appear "Thank You For Your"
