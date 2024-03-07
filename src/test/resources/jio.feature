Feature: Ajio mens clothing
@Ajio
Scenario: Mens clothing sorts with lowest price

Given Launch Ajio website
And Navigate to men element and click on clothing
When Click on Sortlize button and select the lowest prize
Then Validate the price sorter band on lowest prize
And verify