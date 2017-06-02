Feature: Login

   Scenario: Forget password
     Given user forget password
     When user click the forget password button
     Then forget password page displayed

#   Scenario: Send reset password email
#     Given user input valid phone number and extension
#     When user click the send email button
#     Then email sent message displayed
