package com.syntax.class21;

public class UserInfo extends UserClass {
    String address;
    UserInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }
    void userDetails() {
        System.out.println("User name is " + super.getName() + " has a phone number of " + super.getMobileNumber() + " and lives in " + address);
    }
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Miguel", "123456789", "Jacksonville, NC");
        userInfo.userDetails();
    }
}

