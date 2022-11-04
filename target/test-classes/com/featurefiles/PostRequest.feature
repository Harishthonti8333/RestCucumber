 @post
 Feature: Post request
 
 Scenario: User should be able to add the data into database
 Given user want post the data
 When User add the data by using URI "http://localhost:8080/prescription/medorder"
 Then API returns the response with satatus code as 200
 And new category is created in the system
 
 
 #Scenario: Create new category with cost,name and suggestions
 #Given: wellness care API is up and running
 #When: I submit categories post request with cost,name and suggestions
 #Then: API returns the response with satatus code as 200
 #And: new category is created in the system