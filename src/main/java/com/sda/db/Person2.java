package com.sda.db;

import javax.persistence.*;

@Entity
public class Person2 {
    @Id
    @GeneratedValue
    private Long Id;
    private String firstName;
    private String lastName;
    private double salary;
    @Embedded              // ponizej jest obiekt, ktory bedzie tu dolaczony // taki ktory mozna osadzic, mozliwy do/ // stowrzyc tablice z polami dwoch klas
    private Adres2 adres;
}
