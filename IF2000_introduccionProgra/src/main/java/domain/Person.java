/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author dylan
 */
public class Person {
    //Atributes
    private String name;
    private String lastName;
    private String id;
    private String phone;
    private int age;

    public Person(String name, String lastName, String id, String phone, int age) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person\n"
                + "" + "\nname=" + getName() 
                + "\n, lastName=" + getLastName() 
                + "\n, id=" + getId() 
                + "\n, phone=" + getPhone()
                + "\n, age=" + getAge();
    
    
     }
    }