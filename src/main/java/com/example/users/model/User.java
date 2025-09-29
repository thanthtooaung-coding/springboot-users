package com.example.users.model;

public class User {
    private int id;
    private String fullName;
    private String dateOfBirth;
    private int genderId;
    private String email;
    private String createdAt;
    private String updatedAt;

    public User(int id, String fullName, String dateOfBirth, int genderId, String email, String createdAt, String updatedAt) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.genderId = genderId;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public String getDateOfBirth() { return dateOfBirth; }
    public int getGenderId() { return genderId; }
    public String getEmail() { return email; }
    public String getCreatedAt() { return createdAt; }
    public String getUpdatedAt() { return updatedAt; }
}
