#Author: DaveW2098@
#Keywords Summary :
#Feature: Landing Page checks.
#Scenario: Business rule through list of steps witgmail.comarguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)


Feature: Landing Page Links


@tag1
Scenario: Check that all ways to redeem points are displayed on the page
Given user is on the landing page
Then the ways to redeem points panel is visible
	And contains the text 'Ways to Redeem Your Points'

@tag2
Scenario Outline: Title of your scenario outline
Given I want to write a step with <name>
When I check for the <value> in step
Then I verify the <status> in step

Examples:
    | name  |value | status |
    | name1 |  5   | success|
    | name2 |  7   | Fail   |
