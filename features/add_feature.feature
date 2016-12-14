Feature: Add

  Scenario Outline: test adding two integers
    Given open firefox and visit "http://seleniumsimplified.com/testpages/calculate.php"
    When I enter <first_num> and <second_num>
    Then I should get <result>
    Examples:
    |   first_num   |   second_num    |   result    |
    |   "1"         |      "2"        |      "3"    |
    |   "-4"        |      "-2"       |      "-6"   |
    |   "3"         |      "-5"       |      "-2"   |

    