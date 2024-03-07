Feature: fb account creation


Background: Fb launching function
Given Launch the Fb "https://www.facebook.com"
And Click create account

@facebookin
Scenario Outline: Create account
When Enter the firstname values "<Firstname>"
And Enter the secondname values "<Lastname>"
And Enter the mobilenumber values "<Mobilenumber>"
And Enter the password values "<Password>"
And Enter the date values "<Day>"
And Enter the month values "<Month>"
And Enter the year values "<year>"
And Click the gender button and take screenshot "<Firstname>"
Then Click Signup button
And Work on Brokenlinks "https://www.facebook.com"

Examples:

|Firstname|Lastname|Mobilenumber|Password|Day|Month|year|
|Dominick |Dominick| 8899990    |dom@gmao|22 |May  |2000|
#|Imanuvel |Imanuvel| 886579879  |iman@gma|23 |Jan  |1995|
#|suriya   |Suriya  | 97998009   |suri@gma|24 |Aug  |1998|
#|Viswa    |viwa    | 897895467  |viswa@gm|30 |Sep  |1995|