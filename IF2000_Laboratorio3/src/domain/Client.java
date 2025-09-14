/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author dylan
 */
public class Client {
   
   // Atributos
    private String firstName;
    private String lastName;
    private String id;
    private String phone;
    private int age;
    private String address;

    // Constructor
    public Client(String firstName, String lastName, String id, String phone, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.phone = phone;
        this.age = age;
        this.address = address;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // ToString
    @Override
    public String toString() {
        return "Client:\n" +
                "name=" + firstName + 
                ", lastName=" + lastName + 
                ", id=" + id + 
                ", phone=" + phone + 
                ", age=" + age + 
                ", address=" + address;
    }
}


