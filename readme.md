Here we are using java 8 and spring boot.

I have added test cases in test package int different classes.
1. MinStackTest
2. ValidParenthesesTest

To run test cases on your local.

```
mvn clean test
```

To run test cases of perticular class
```
mvn test -Dtest=MinStackTest
mvn test -Dtest=ValidParenthesesTest
```