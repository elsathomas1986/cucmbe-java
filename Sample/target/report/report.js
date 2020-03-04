$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bookAppt.feature");
formatter.feature({
  "line": 1,
  "name": "Book an appointment with docter in KIMS",
  "description": "",
  "id": "book-an-appointment-with-docter-in-kims",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Book an appointmnt gynec",
  "description": "",
  "id": "book-an-appointment-with-docter-in-kims;book-an-appointmnt-gynec",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@gynec"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on Book an appointmnet page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User fills the following details",
  "rows": [
    {
      "cells": [
        "2926014",
        "elsa thomas",
        "9995220017",
        "elsathomas1986@gmail.com"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "select the dept as \"Obstetrics and Gynaecology\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "select the docter as \"Dr. Sushama Devi R\" and \"input_43\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select the appropriate dates",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "appointment should be sucessfully created for the user",
  "keyword": "Then "
});
formatter.match({
  "location": "bookAnAppt.user_is_on_book_an_appointmnet_page()"
});
formatter.result({
  "duration": 9107583000,
  "status": "passed"
});
formatter.match({
  "location": "bookAnAppt.user_fills_the_following_details(DataTable)"
});
formatter.result({
  "duration": 524901600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Obstetrics and Gynaecology",
      "offset": 20
    }
  ],
  "location": "bookAnAppt.select_the_dept_as(String)"
});
formatter.result({
  "duration": 163860500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dr. Sushama Devi R",
      "offset": 22
    },
    {
      "val": "input_43",
      "offset": 47
    }
  ],
  "location": "bookAnAppt.select_the_docter_as_and(String,String)"
});
formatter.result({
  "duration": 63197400,
  "status": "passed"
});
formatter.match({
  "location": "bookAnAppt.select_the_appropriate_dates()"
});
formatter.result({
  "duration": 393597100,
  "status": "passed"
});
formatter.match({
  "location": "bookAnAppt.click_on_submit()"
});
formatter.result({
  "duration": 11500,
  "status": "passed"
});
formatter.match({
  "location": "bookAnAppt.appointment_should_be_sucessfully_created_for_the_user()"
});
formatter.result({
  "duration": 35200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Book an appointmnt gynec",
  "description": "",
  "id": "book-an-appointment-with-docter-in-kims;book-an-appointmnt-gynec",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@endo"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on Book an appointmnet page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User fills the following details",
  "rows": [
    {
      "cells": [
        "2926014",
        "elsa thomas",
        "9995220017",
        "elsathomas1986@gmail.com"
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "select the dept as \"Endocrinology and Diabetes\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select the docter as \"Dr Rajmohan L\" and \"input_26\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select the appropriate dates",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "appointment should be sucessfully created for the user",
  "keyword": "Then "
});
formatter.match({
  "location": "bookAnAppt.user_is_on_book_an_appointmnet_page()"
});
formatter.result({
  "duration": 6453953800,
  "status": "passed"
});
formatter.match({
  "location": "bookAnAppt.user_fills_the_following_details(DataTable)"
});
formatter.result({
  "duration": 1730812200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Endocrinology and Diabetes",
      "offset": 20
    }
  ],
  "location": "bookAnAppt.select_the_dept_as(String)"
});
formatter.result({
  "duration": 148328500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dr Rajmohan L",
      "offset": 22
    },
    {
      "val": "input_26",
      "offset": 42
    }
  ],
  "location": "bookAnAppt.select_the_docter_as_and(String,String)"
});
formatter.result({
  "duration": 63877900,
  "status": "passed"
});
formatter.match({
  "location": "bookAnAppt.select_the_appropriate_dates()"
});
formatter.result({
  "duration": 402016600,
  "status": "passed"
});
formatter.match({
  "location": "bookAnAppt.click_on_submit()"
});
formatter.result({
  "duration": 15900,
  "status": "passed"
});
formatter.match({
  "location": "bookAnAppt.appointment_should_be_sucessfully_created_for_the_user()"
});
formatter.result({
  "duration": 38200,
  "status": "passed"
});
});