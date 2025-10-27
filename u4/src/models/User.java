package models;

public class User {
    private String password;
    private String email;
    private String username;
    private int phoneNumber;

    public void sayHello() {
        System.out.println("Hello! I'm " + username);
    }

}
