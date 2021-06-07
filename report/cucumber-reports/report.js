$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddEmployee.feature");
formatter.feature({
  "line": 2,
  "name": "Adding employee in employee list",
  "description": "",
  "id": "adding-employee-in-employee-list",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddEmployee"
    }
  ]
});
formatter.before({
  "duration": 9244475121,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Add employee with invalid credentials",
  "description": "",
  "id": "adding-employee-in-employee-list;add-employee-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@NegativeAdd"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User in homepage as someone1 using \"Admin\" as username and \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigate to add employee page and click save",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User receive error1 message, first name and last name is required",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 36
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 60
    }
  ],
  "location": "AddEmployeeDefinitions.Login(String,String)"
});
formatter.result({
  "duration": 7577599660,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeeDefinitions.navigate_to_add_employee_page()"
});
formatter.result({
  "duration": 9273508165,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeeDefinitions.ErrorMessage()"
});
formatter.result({
  "duration": 232799550,
  "status": "passed"
});
formatter.after({
  "duration": 2178317920,
  "status": "passed"
});
formatter.before({
  "duration": 6769251156,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Add employee with valid credentials",
  "description": "",
  "id": "adding-employee-in-employee-list;add-employee-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@PostiveAdd"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User login with \"Admin\" as username and \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User go to add employee page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User add \"Firnanda\" as first name, \"Avif\" as middle name and \"Dewantara\" as last name",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User created new employee",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 17
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 41
    }
  ],
  "location": "AddEmployeeDefinitions.Login1(String,String)"
});
formatter.result({
  "duration": 6255854884,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeeDefinitions.navigate_to_add_employee_page1()"
});
formatter.result({
  "duration": 5633603645,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Firnanda",
      "offset": 10
    },
    {
      "val": "Avif",
      "offset": 36
    },
    {
      "val": "Dewantara",
      "offset": 62
    }
  ],
  "location": "AddEmployeeDefinitions.InsertName(String,String,String)"
});
formatter.result({
  "duration": 6842673030,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeeDefinitions.CreatedEmployee()"
});
formatter.result({
  "duration": 6074599976,
  "status": "passed"
});
formatter.after({
  "duration": 1428474373,
  "status": "passed"
});
formatter.uri("features/AddEntitlements.feature");
formatter.feature({
  "line": 2,
  "name": "adding entitlement to employee",
  "description": "",
  "id": "adding-entitlement-to-employee",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddEntitlement"
    }
  ]
});
formatter.before({
  "duration": 6100289652,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Add Entitlement with invalid Employee Entitlement",
  "description": "",
  "id": "adding-entitlement-to-employee;add-entitlement-with-invalid-employee-entitlement",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@NegativeEntitlements"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User signIn with \"Admin\" as username and \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Navigate to Entitlement page \u0026 click save button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User cannot make Entitlement",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 18
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 42
    }
  ],
  "location": "AddEntitlementsDefinitions.Login(String,String)"
});
formatter.result({
  "duration": 6874436169,
  "status": "passed"
});
formatter.match({
  "location": "AddEntitlementsDefinitions.NavToEntitlement()"
});
formatter.result({
  "duration": 6903830568,
  "status": "passed"
});
formatter.match({
  "location": "AddEntitlementsDefinitions.cannotEntitlement()"
});
formatter.result({
  "duration": 217219202,
  "status": "passed"
});
formatter.after({
  "duration": 2061911021,
  "status": "passed"
});
formatter.before({
  "duration": 7299414996,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Add Enititlement with valid Employee Entitlement",
  "description": "",
  "id": "adding-entitlement-to-employee;add-enititlement-with-valid-employee-entitlement",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@PositiveEntitlements"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User log in with \"Admin\" as username and \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User go to Entitlement page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User input \"Firnanda Avif Dewantara\" as Employee, \"123\" as Entitlement, and click save button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User made Entitlement",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 18
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 42
    }
  ],
  "location": "AddEntitlementsDefinitions.Login1(String,String)"
});
formatter.result({
  "duration": 5797646989,
  "status": "passed"
});
formatter.match({
  "location": "AddEntitlementsDefinitions.NavToEntitlement1()"
});
formatter.result({
  "duration": 6008422826,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Firnanda Avif Dewantara",
      "offset": 12
    },
    {
      "val": "123",
      "offset": 51
    }
  ],
  "location": "AddEntitlementsDefinitions.insert(String,String)"
});
formatter.result({
  "duration": 8221119418,
  "status": "passed"
});
formatter.match({
  "location": "AddEntitlementsDefinitions.madeEntitlement()"
});
formatter.result({
  "duration": 3079043361,
  "status": "passed"
});
formatter.after({
  "duration": 1395168930,
  "status": "passed"
});
formatter.uri("features/AddUsers.feature");
formatter.feature({
  "line": 2,
  "name": "adding user in system users",
  "description": "",
  "id": "adding-user-in-system-users",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddUser"
    }
  ]
});
formatter.before({
  "duration": 6723062972,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Register with Invalid credential",
  "description": "",
  "id": "adding-user-in-system-users;register-with-invalid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@NegativeRegister"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User in homepage as someone using \"Admin\" as username and \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigates to add user page and User click save button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User get error message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 35
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 59
    }
  ],
  "location": "AddUsers.Login(String,String)"
});
formatter.result({
  "duration": 6441252812,
  "status": "passed"
});
formatter.match({
  "location": "AddUsers.navigate_to_addpage()"
});
formatter.result({
  "duration": 5307427453,
  "status": "passed"
});
formatter.match({
  "location": "AddUsers.error()"
});
formatter.result({
  "duration": 168231959,
  "status": "passed"
});
formatter.after({
  "duration": 3745986647,
  "status": "passed"
});
formatter.before({
  "duration": 7346786981,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Register with valid credential",
  "description": "",
  "id": "adding-user-in-system-users;register-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@PositiveRegister"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User login homepage as someone using \"Admin\" as username1 and \"s3Kol4HQA!*\" as password1",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User go to add userpage and User click save button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User input \"karyawan New Cilsy\" as employee name, \"avif 102\" as username,\"Avif71*?\" as password and \"Avif71*?\" as confirm password",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user created new account",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 38
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 63
    }
  ],
  "location": "AddUsers.Login1(String,String)"
});
formatter.result({
  "duration": 5722938721,
  "status": "passed"
});
formatter.match({
  "location": "AddUsers.navigate_to_addpage1()"
});
formatter.result({
  "duration": 4741754145,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "karyawan New Cilsy",
      "offset": 12
    },
    {
      "val": "avif 102",
      "offset": 51
    },
    {
      "val": "Avif71*?",
      "offset": 74
    },
    {
      "val": "Avif71*?",
      "offset": 101
    }
  ],
  "location": "AddUsers.insert_credentials(String,String,String,String)"
});
formatter.result({
  "duration": 14736678108,
  "status": "passed"
});
formatter.match({
  "location": "AddUsers.Acc()"
});
formatter.result({
  "duration": 3003565082,
  "status": "passed"
});
formatter.after({
  "duration": 1494511883,
  "status": "passed"
});
formatter.uri("features/AttendanceRecords.feature");
formatter.feature({
  "line": 2,
  "name": "Checking user Attendance Records",
  "description": "",
  "id": "checking-user-attendance-records",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AttendanceRecords"
    }
  ]
});
formatter.before({
  "duration": 6208506838,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Checking Attendance Records with invalid Date",
  "description": "",
  "id": "checking-user-attendance-records;checking-attendance-records-with-invalid-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@InvalidDate"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User with \"Admin\" as username and \"s3Kol4HQA!*\" as password login",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User go to Attendance record page and insert \"12-13-12\" as invalid date",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User receive invalid date error",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 11
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 35
    }
  ],
  "location": "AttendanceRecordsDefinitions.Login(String,String)"
});
formatter.result({
  "duration": 5568578949,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12-13-12",
      "offset": 46
    }
  ],
  "location": "AttendanceRecordsDefinitions.InvalidDate(String)"
});
formatter.result({
  "duration": 5365089444,
  "status": "passed"
});
formatter.match({
  "location": "AttendanceRecordsDefinitions.InvalidDateError()"
});
formatter.result({
  "duration": 1083220577,
  "status": "passed"
});
formatter.after({
  "duration": 4438029705,
  "status": "passed"
});
formatter.before({
  "duration": 6664889730,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Checking Attendance Records with valid date",
  "description": "",
  "id": "checking-user-attendance-records;checking-attendance-records-with-valid-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@ValidDate"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User enter Website \"Admin\" as username and \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User navigate to Attendance record page and insert \"2021-07-07\" as valid date",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User get Attendance report result",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 44
    }
  ],
  "location": "AttendanceRecordsDefinitions.Login1(String,String)"
});
formatter.result({
  "duration": 5770596825,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2021-07-07",
      "offset": 52
    }
  ],
  "location": "AttendanceRecordsDefinitions.ValidDate(String)"
});
formatter.result({
  "duration": 5898784737,
  "status": "passed"
});
formatter.match({
  "location": "AttendanceRecordsDefinitions.ValidDateAssert()"
});
formatter.result({
  "duration": 1116579596,
  "status": "passed"
});
formatter.after({
  "duration": 1985668429,
  "status": "passed"
});
formatter.uri("features/Logout.feature");
formatter.feature({
  "line": 2,
  "name": "User logout",
  "description": "",
  "id": "user-logout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Logout"
    }
  ]
});
formatter.before({
  "duration": 6981822928,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User logout",
  "description": "",
  "id": "user-logout;user-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Logout"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User go to website \"Admin\" as username and \"s3Kol4HQA!*\" as password login1",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User in homepage and click logout button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User logout",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 44
    }
  ],
  "location": "LogoutDefinitions.Login(String,String)"
});
formatter.result({
  "duration": 5975585317,
  "status": "passed"
});
formatter.match({
  "location": "LogoutDefinitions.clickwelcome()"
});
formatter.result({
  "duration": 2069234969,
  "status": "passed"
});
formatter.match({
  "location": "LogoutDefinitions.logout()"
});
formatter.result({
  "duration": 117623188,
  "status": "passed"
});
formatter.after({
  "duration": 3809235356,
  "status": "passed"
});
formatter.uri("features/OrangeHRMLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginPage"
    }
  ]
});
formatter.before({
  "duration": 6198814147,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login with invalid Credential",
  "description": "",
  "id": "login;login-with-invalid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User in loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"Admin1\" as username1 \u0026 \"s3Kol4HQA!\" as password1 and user click login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User receive error message",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMDefinitions.i_am_in_loginpage()"
});
formatter.result({
  "duration": 613928726,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin1",
      "offset": 12
    },
    {
      "val": "s3Kol4HQA!",
      "offset": 36
    }
  ],
  "location": "OrangeHRMDefinitions.input_credential(String,String)"
});
formatter.result({
  "duration": 4330837872,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMDefinitions.error()"
});
formatter.result({
  "duration": 47784064,
  "status": "passed"
});
formatter.after({
  "duration": 1142969180,
  "status": "passed"
});
formatter.before({
  "duration": 8435539561,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login with valid Credential",
  "description": "",
  "id": "login;login-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Positive"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user in new loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User input \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password and user click login button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User redirected to OrangeHRM HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMDefinitions.i_am_in_new_loginpage()"
});
formatter.result({
  "duration": 382110072,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 12
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 34
    }
  ],
  "location": "OrangeHRMDefinitions.input_credential1(String,String)"
});
formatter.result({
  "duration": 7551186137,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMDefinitions.redirect()"
});
formatter.result({
  "duration": 67693235,
  "status": "passed"
});
formatter.after({
  "duration": 2762452708,
  "status": "passed"
});
});