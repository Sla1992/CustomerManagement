package com.bharath.location.entities;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Country {

    private int id;
    private String country;
    private Date last_update;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", last_update='" + last_update + '\'' +
                '}';
    }
}
