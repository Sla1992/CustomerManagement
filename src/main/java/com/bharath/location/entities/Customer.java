package com.bharath.location.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Customer {

    @Id
    private int id;
    private String first_name;
    private String last_name;
    private int adress_fk;
    private Date create_date;
    private Date last_update;
    private int contact_fk;

    public int getAdress_fk() {
        return adress_fk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setAdress_fk(int adress_fk) {
        this.adress_fk = adress_fk;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public int getContact_fk() {
        return contact_fk;
    }

    public void setContact_fk(int contact_fk) {
        this.contact_fk = contact_fk;
    }

    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", adress_fk='" + adress_fk + '\'' +
                ", create_date='" + create_date + '\'' +
                ", last_update='" + last_update + '\'' +
                ", contact_fk='" + contact_fk + '\'' +
                '}';
    }
}
