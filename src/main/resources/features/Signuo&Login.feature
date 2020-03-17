Feature: SignUP & Login 
	In order to Login to a JainBookAgencyPage
    As a e commerce customer 
    I want to Login  and search for Books .
    
Background: 
	Given I have browser with  JainBookAgencyPage 
	
Scenario: ValidSign_upDetails 

	When I enter <validmailId> as 'specter@gmail.com' ,I enter <repeatEmailAddress> as 'specter@gmail.com', I enter <validpassword> as 'specter123' and I enter <Repeat Password> as 'specter123' 
  Then I should create an account successfully. 
	
	
Scenario: inValidSign_upDetails 
	
	When I enter <invalidmailId> as 'chinnisaitangella' ,I enter <repeatEmailAddress> as 'chinnisaitangella@gmail.com', I enter <password> as 'chinni2015' and I enter <Repeat Password> as 'chinni2015' 
	Then I should get a error message
	
#Scenario: ValidLogin
#	
#	When I enter <mailId> as 'chinnisaitangella@gmail.com' ,I enter <validpassword> as 'chinni2015' 
#	Then I should login successfully and  search for books. 
#	
#Scenario: inValid mail Login
#	
#	When I enter <invalidmailId> as 'chinnisaitangella' , I enter <password> as 'chinni2015' 
#	Then I should get a invalid mailId message displayed as "Provided Email Is Not A Valid Email. " 
#	
#Scenario: inValidpassword login
#	
#	When I enter <mailId> as 'chinnisaitangella@gmail.com' , I enter <invalidpassword> as 'chinni' 
#	Then I should get a inValid password  message displayed as "Email/Password Is Invalid " 
#	
#	
#Scenario: connecting Excel 
#	
#	When  I connect Excel and get the values from Ecel. 
#	Then I should get the values from Excel and fill in the specified text boxes. 
	
	
	
	
	