Feature: To verify User Register page 


Scenario Outline: Verify Register page with correct and incorrect credentials
  Given User Negative Application webpage when flag is  "<flags>"
  Then User write username as "<username>" 
  And User write write password as "<password>"
  And User write First Name as "<FirstName>"
  And User write Last Name as "<LastName>"
  And User write age as "<age>"
  And User write gender as "<gender>"
  And User write Address 1 as "<Address1>"
  And User write Address 2 as "<Address2>"
  And User write City as "<City>"
  And User write State as "<State>"
  And User write Country as "<Country>"
  And User click submit button
  Then User validates success message as "<successMessage>" 
  Examples:
    | flags |username|password    |FirstName|LastName    |age  |gender|Address1          |Address2|City   | State  |Country | successMessage                        |
    | true  |  test  | Test1$2base| Afgan   |Shahguliyev | 32  |male  |13954 Mansarde ave| apt 468|Herndon|Virginia| USA    |your registration successfuly completed|
    | true  |        | Test1$2base| Afgan   |Shahguliyev | 32  |male  |13954 Mansarde ave| apt 468|Herndon|Virginia| USA    |please write correct username          |
    | true  |  test  | Test       | Afgan   |Shahguliyev | 32  |male  |13954 Mansarde ave| apt 468|Herndon|Virginia| USA    |password must contain 8.12 chars, 1 numbers, 1 special characters, cannot start with number|
    | true  |  test  | 1Test      | Afgan   |Shahguliyev | 32  |male  |13954 Mansarde ave| apt 468|Herndon|Virginia| USA    |password must contain 8.12 chars, 1 numbers, 1 special characters, cannot start with number|
    | true  |  test  | Test1$2base|         |Shahguliyev | 32  |male  |13954 Mansarde ave| apt 468|Herndon|Virginia| USA    |please write your First Name| 
    | true  |  test  | Test1$2base| Afgan   |            | 32  |male  |13954 Mansarde ave| apt 468|Herndon|Virginia| USA    |please write your Last  Name|
    | true  |  test  | Test1$2base|         |Shahguliyev | ls  |male  |13954 Mansarde ave| apt 468|Herndon|Virginia| USA    |age must contain only numbers|
    | true  |  test  | Test1$2base|         |Shahguliyev | 999 |male  |13954 Mansarde ave| apt 468|Herndon|Virginia| USA    |your age not acceptable      |
    | true  |  test  | Test1$2base|         |Shahguliyev | 001 |male  |13954 Mansarde ave| apt 468|Herndon|Virginia| USA    |your age not acceptable      |
    | true  |  test  | Test1$2base| Afgan   |Shahguliyev | 32  |123   |13954 Mansarde ave| apt 468|Herndon|Virginia| USA    |gender accept only female or male|
    | true  |  test  | Test1$2base| Afgan   |Shahguliyev | 32  |male  |                  | apt 468|Herndon|Virginia| USA    |please write your address|
    | true  |  test  | Test1$2base| Afgan   |Shahguliyev | 32  |male  |13954 Mansarde ave|        |Herndon|Virginia| USA    |please write your apt, house number|
    | true  |  test  | Test1$2base| Afgan   |Shahguliyev | 32  |male  |13954 Mansarde ave| apt 468|       |Virginia| USA    |please write your city|