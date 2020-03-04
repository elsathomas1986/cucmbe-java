Feature: Book an appointment with docter in KIMS
@gynec
Scenario: Book an appointmnt gynec
Given User is on Book an appointmnet page
When User fills the following details
| 2926014 | elsa thomas | 9995220017 | elsathomas1986@gmail.com |
And select the dept as "Obstetrics and Gynaecology" 
And select the docter as "Dr. Sushama Devi R" and "input_43"
And select the appropriate dates
And click on submit
Then appointment should be sucessfully created for the user

@endo
Scenario: Book an appointmnt gynec
Given User is on Book an appointmnet page
When User fills the following details
| 2926014 | elsa thomas | 9995220017 | elsathomas1986@gmail.com |
And select the dept as "Endocrinology and Diabetes" 
And select the docter as "Dr Rajmohan L" and "input_26"
And select the appropriate dates
And click on submit
Then appointment should be sucessfully created for the user

