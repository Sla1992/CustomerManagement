package com.bharath.location.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idcountry;
    private String country;

    public int getIdCountry() { return idcountry; }

    public void setIdCountry(int idcountry) {
        this.idcountry = idcountry;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "country{" +
                "id=" + idcountry +
                ", country='" + country + '\'' +
                '}';
    }
}
