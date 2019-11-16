package com.bharath.location.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcity;
    private String city;
    private int country_fk;

    public int getIdcity() {
        return idcity;
    }

    public void setIdcity(int idcity) {
        this.idcity = idcity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountry_fk() {
        return country_fk;
    }

    public void setCountry_fk(int country_fk) {
        this.country_fk = country_fk;
    }



    @Override
    public String toString() {
        return "city{" +
                "id=" + idcity +
                ", city='" + city + '\'' +
                ", country_fk='" + country_fk + '\'' +
                '}';
    }
}

