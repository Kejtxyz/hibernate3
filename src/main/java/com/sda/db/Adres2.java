package com.sda.db;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
// moze byc wlaczana do innych klas
@Embeddable
public class Adres2 {
    private String locality;
    private String street;
    private String zipCode;
    @Embedded
    private Adres3 adres;
}
