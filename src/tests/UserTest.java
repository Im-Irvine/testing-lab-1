package tests;

import model.User;

public class UserTest {
    public static void main(String[] args) {
//        User testUser = new User(
//                "mike",
//                "my_passwd",
//                "Mike",
//                "Smith",
//                "07771234567"
//        );
//
//        System.out.println(testUser);

        String test_username = "mike";
        String test_password = "my_passwd";
        String test_first_name = "Mike";
        String test_last_name = "Smith";
        String test_mobile_number = "07771234567";

        User testUser = new User(
                test_username,
                test_password,
                test_first_name,
                test_last_name,
                test_mobile_number
        );

        // Using If Statements
        Boolean passed = true;

        if (testUser.getUsername() != test_username) {
            System.out.println("TC1 failed: username did not match");
            passed = false;
        }
        if (testUser.getPassword() != test_password) {
            System.out.println("TC2 failed: password did not match");
            passed = false;
        }

        if (testUser.getFirst_name() != test_first_name) {
            System.out.println("TC3 failed: first name did not match");
            passed = false;
        }

        if (testUser.getLast_name() != test_last_name) {
            System.out.println("TC4 failed: last name did not match");
            passed = false;
        }

        if (testUser.getMobile_number() != test_mobile_number) {
            System.out.println("TC5 failed: mobile number did not match");
            passed = false;
        }

        if (passed) {
            System.out.println("All TC's passed.");
        }

        // Using Assertions
        // @Monty IntelliJ Config Needs Set to Run these -> Edit Configurations -> UserTest -> Build & Run Modify Options -> Add VM options -> Insert -ea in box

        assert testUser.getUsername() == test_username;
        assert testUser.getPassword() == test_password;
        assert testUser.getFirst_name() == test_first_name;
        assert testUser.getLast_name() == test_last_name;
        assert testUser.getMobile_number() == test_mobile_number;

        System.out.println("All Java assertions in the test suit passed (none failed).");

    }
}
