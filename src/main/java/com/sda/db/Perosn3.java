package com.sda.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Perosn3 {
    @Id
    @GeneratedValue
    private Long Id;
    private String firstName;
    private String lastName;
    private double salary;
    @OneToOne
    private Adres4 adres;

    public Perosn3(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Perosn3{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", adres=" + adres +
                '}';
    }
}
