 Feature: I am testing get request wellness care API
 
 Scenario: Get request to fetch details
 Given wellness care API is up and running
 When I hit the API with get request and end point as "http://localhost:8080/prescription/medorder"
 Then API should return all the details
