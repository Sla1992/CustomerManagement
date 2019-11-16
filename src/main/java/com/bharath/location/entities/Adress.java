package com.bharath.location.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idadress;
    private String street;
    private String street_number;
    private int postal_code;
    private int city_fk;

    public int getIdadress() {
        return idadress;
    }

    public void setIdadress(int idadress) {
        this.idadress = idadress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet_number() {
        return street_number;
    }

    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public int getCity_fk() {
        return city_fk;
    }

    public void setCity_fk(int city_fk) {
        this.city_fk = city_fk;
    }


    @Override
    public String toString() {
        return "adress{" +
                "id=" + idadress +
                ", street='" + street + '\'' +
                ", street_number='" + street_number + '\'' +
                ", postal_code='" + postal_code + '\'' +
                ", city_fk='" + city_fk + '\'' +
                '}';
    }
}
