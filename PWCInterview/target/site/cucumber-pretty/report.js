$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ToolsQA_TC01.feature");
formatter.feature({
  "line": 2,
  "name": "Test ToolsQA practise Form",
  "description": "",
  "id": "test-toolsqa-practise-form",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Verify that ToolsQA Practise Form works correctly",
  "description": "",
  "id": "test-toolsqa-practise-form;verify-that-toolsqa-practise-form-works-correctly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@TC_01"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Browser is open and user navigates to ToolQA Practise form site",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User enters the First Name in correct field",
  "rows": [
    {
      "cells": [
        "firstName"
      ],
      "line": 11
    },
    {
      "cells": [
        "John"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters the last Name in correct field",
  "rows": [
    {
      "cells": [
        "lastName"
      ],
      "line": 15
    },
    {
      "cells": [
        "Sen"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters email in correct field",
  "rows": [
    {
      "cells": [
        "email"
      ],
      "line": 19
    },
    {
      "cells": [
        "john.sen@gmail.com"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User selects correct gender",
  "rows": [
    {
      "cells": [
        "gender"
      ],
      "line": 23
    },
    {
      "cells": [
        "male"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User enters ten digit mobile number in correct field",
  "rows": [
    {
      "cells": [
        "mobNo"
      ],
      "line": 27
    },
    {
      "cells": [
        "9100091000"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#And User enters his date of birth"
    },
    {
      "line": 31,
      "value": "#| dateOfBirth |"
    },
    {
      "line": 32,
      "value": "#| 10 July 1990 |"
    }
  ],
  "line": 34,
  "name": "User enters his subject",
  "rows": [
    {
      "cells": [
        "subject"
      ],
      "line": 35
    },
    {
      "cells": [
        "English"
      ],
      "line": 36
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User selects his hobby",
  "rows": [
    {
      "cells": [
        "hobby"
      ],
      "line": 39
    },
    {
      "cells": [
        "Reading"
      ],
      "line": 40
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 42,
      "value": "#And user Uploads his picture"
    },
    {
      "line": 44,
      "value": "#Then user enters his current address"
    },
    {
      "line": 45,
      "value": "#| currentAddress |"
    },
    {
      "line": 46,
      "value": "#| 55 Test Road |"
    },
    {
      "line": 47,
      "value": "#"
    },
    {
      "line": 48,
      "value": "#And User selcts his State"
    },
    {
      "line": 49,
      "value": "#| state |"
    },
    {
      "line": 50,
      "value": "#| Uttar Pradesh |"
    },
    {
      "line": 51,
      "value": "#"
    },
    {
      "line": 52,
      "value": "#And User selcts his City"
    },
    {
      "line": 53,
      "value": "#| city |"
    },
    {
      "line": 54,
      "value": "#| Agra |"
    }
  ],
  "line": 56,
  "name": "User Clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "user is shown confirmation message",
  "rows": [
    {
      "cells": [
        "confirmationMsg"
      ],
      "line": 59
    },
    {
      "cells": [
        "Thanks for submitting the form"
      ],
      "line": 60
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ToolsQAFormSteps.browser_is_open_and_user_navigates_to_ToolQA_Practise_form_site()"
});
formatter.result({
  "duration": 7518558900,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQAFormSteps.user_enters_the_First_Name_in_correct_field(DataTable)"
});
formatter.result({
  "duration": 1398752000,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQAFormSteps.user_enters_the_last_Name_in_correct_field(DataTable)"
});
formatter.result({
  "duration": 1248792300,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQAFormSteps.user_enters_email_in_correct_field(DataTable)"
});
formatter.result({
  "duration": 1419770700,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQAFormSteps.user_selects_correct_gender(DataTable)"
});
formatter.result({
  "duration": 1277128200,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQAFormSteps.user_enters_ten_digit_mobile_number_in_correct_field(DataTable)"
});
formatter.result({
  "duration": 1288241400,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQAFormSteps.user_enters_his_subject(DataTable)"
});
formatter.result({
  "duration": 3520967500,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQAFormSteps.user_selects_his_hobby(DataTable)"
});
formatter.result({
  "duration": 3397872400,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQAFormSteps.user_Clicks_on_submit_button()"
});
formatter.result({
  "duration": 4406562800,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQAFormSteps.user_is_shown_confirmation_message(DataTable)"
});
formatter.result({
  "duration": 2273855600,
  "status": "passed"
});
});