#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
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
#Sample Feature Definition Template
@tag

Feature: feature

 

 

@tag1

Scenario: landingpage

Given user can lanuch the url

When user can click the subscription button

And user can click the plugin buttton

And user can click the features

And user can click the payment tool

And user can click the what is chargely

And user can click the how does it works

And user can click the is chargely safe to use?

And user can click the do i need webside to use chargely

And user can enter your email address "example@gmail.com"

And user can click the start free trial button

And user can enter your password "************"

And user can enter your business name

And user can click the create an account

 

 

@tag2

 

Scenario: choose plan

 

Given user can click the free plan button

When user can click the signout button

And user can click the privacy policy

Then user can click the terms of use

And user can clcik the chargely logo

 

 

 

@tag3

Scenario: login page

 

Given user can click the login button

When user can enter the email

And user can enter the password

And user can click the Login

And user can click the transcation

And user can click the customer

And user can click the analytics

And user can click the reports

And user can click the settings

And user can click the my site

And user can click the plan

And user can click the create plan

And user can enter the plan name

And user can enter the description

And user can click the add specification

And user can enter the free trail

And user can enter the billing period

And user can select the billing type

And user can select the currency type

And user can enter the princing details

And user can enter the cancel url

And user can enter the redirect url

Then user can click the create plan button

 

@tag4

Scenario: coupon

Given user can click the settings

And user can click the coupon

And user can click the create coupon

And user can enter the coupon name

And user can enter the coupon code

And user can enter the discount

And user can click the discounttype

And user can click the Associatedplan

And user can click the startdate

And user can click the enddate

And user can enter RedemptionLimits

Then user can click the savecoupon

And user can click the settings

 

@tag5

Scenario: invoices

Given user can click invoices

And user can click the create invoices

And user can enter the billto

And user can select a planitem

And user can enter the taxamount

And user enter the discount value

And user can select the discount value

And user can enter the subject

And user can enter the attachments

And user can enter the memo to merchant

And user can enter the logo

And user can enter invoice date

And user can enter Due date

Then user can click ivoicessave

And user can click the settings

 

 

@tag6

Scenario: paymentgateway

Given user can click the settings

And user can click the payment gateway

And user can click the paypal activate button

And user can enter the user

And user can enter the password1

And user can enter the signature

And user can click the saveandcontinue1

And user can click the payment gateway

And user can click the stripe activate button

And user can enter the public key

And user can enter the secert key

And user can click the saveandcontinue2

And user can click the payment gateway

And user can click the braintree activate button

And user can enter the merchant id

And user can enter the publickey

And user can enter the privatekey

And user can click the saveandcontinue3

And user can click the payment gateway

And user can click the adyen activate button

And user can enter themerchant account

And user can enter the api key

And user can enter the client key

And user can click the saveandcontinue4

And user can click the payment gateway

And user can click the payflowpro activate button

And user can enter the userid

And user can enter the passwordid

And user can enter the vendor

And user can enter the partner

And user can enter the saveandcontinue5

And user can click the payment gateway

And user can click the paymentspro activate button

And user can enter the username

And user can enter the signature2

And user can enter the password2

Then user can click the saveandcontinue6

And user can click the settings

 

@tag7

Scenario: paymentpage

Given user can click paymentpage

And user can click the biilingpage apc

And user can click the billingpage ccbd

And user can click the el

And user can upload the unewlogo

And user can enter the url supported website

And user can enter the supportemail

And user can click the savebutton

And user can click the preview button

And user enter the coupon code

And user can clcik the apply coupon code

And user can enter the card number

And user can expriation date

And user can enter the cvv

And user can click the completeorder

And user can click the backbutton

