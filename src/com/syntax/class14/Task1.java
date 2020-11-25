package com.syntax.class14;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Accept username, password and confirm password from a user and check following requirements:
1. Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
2. Password should be minimum 8 characters, if less → message=”Password is too short”.
3. Password cannot contain username if so, → message=”Password cannot contain username”.
4. Password should match confirmed password, if not  → message=“Passwords do not match”.
Only after all requirements met → message “Your username and password has been created”
         */
        String userName;
        String passWord;
        String confirmedPassword;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter username");
        userName=scanner.nextLine();
        System.out.println("Please enter password");
        passWord=scanner.nextLine();
        System.out.println("Confirm password");
        confirmedPassword=scanner.next();

        if(userName.isEmpty()|| passWord.isEmpty()){
            System.out.println("Username and password cannot be empty");
        }else{
            if(passWord.length()<8){
                System.out.println("Password is too short");
            }else{
                if(passWord.contains(userName)){
                    System.out.println("Password cannot contain username");
                }else{
                    if(!passWord.equals(confirmedPassword)){
                        System.out.println("Passwords do not match");
                    }else{
                        System.out.println("Your username and password has been created");
                    }
                }
            }
        }

    }
}
