Feature:
       To validate the facebook login page
Scenario:
        To validate valid username and invalid password
 Given To launch the ChromeBrowser and launch the URL
 When To validate the valid username in email field
 And  To validate the invalid password in password field
 And To click the Login button
 Then To Close the Browser
     
     
     
Scenario Outline:
 To verify invalid username and invalid password
 
 Given  To start chrome browser and hit the url
 When   To verify invalid username "<Username>" in email box
 And    To verify invalid password in "<Password>" password box
 And    To press login button
 Then   To close the chrome browser
     
Examples:

  |Username           |Password          |
  |marudhu@gmail.com  |  marudhu14|
  |abc@gmail.com      |  by123  |
  |laptop123@gmail.com| dell|
  |samusnggalaxy@gmail.com|galaxya30|