Feature:Qabo Home Page

  Scenario Outline: User On Home Page
    Given User On Home Page
    When Enter The UserName "<username>" And Password "<password>"
    Then Enter The Click Button
    Examples:
      | username  | password      |
      | DEVTEAMVD | RE1234567890$ |