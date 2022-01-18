@Test
Feature: Test ToolsQA practise Form
  

@TC_01
Scenario: Verify that ToolsQA Practise Form works correctly
  
Given Browser is open and user navigates to ToolQA Practise form site

When User enters the First Name in correct field
| firstName |
| John |

And user enters the last Name in correct field
| lastName |
| Sen |

And User enters email in correct field
| email |
| john.sen@gmail.com |   

And User selects correct gender
| gender |
| male |

And User enters ten digit mobile number in correct field
| mobNo |
| 9100091000 |

#And User enters his date of birth
#| dateOfBirth |
#| 10 July 1990 |

And User enters his subject
| subject |
| English |

And User selects his hobby
| hobby |
| Reading |

And user Uploads his picture

Then user enters his current address
| currentAddress |
| 55 Test Road |
#
#And User selcts his State
#| state |
#| Uttar Pradesh |
#
#And User selcts his City
#| city |
#| Agra |

And User Clicks on submit button

Then user is shown confirmation message
| confirmationMsg |
| Thanks for submitting the form |
 
