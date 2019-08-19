Feature: Develop a Hello World java application

	Scenario: Should be able to invoke sayHello greeting method
	Given I have created hello object
	When I invoke the sayHello method in the hello object
	Then I expect the response as "hello BDD"