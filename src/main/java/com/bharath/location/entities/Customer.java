package com.bharath.location.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idcustomer;
    private String first_name;
    private String last_name;
    private int adress_fk;
    private int contact_fk;

    public int getAdress_fk() {
        return adress_fk;
    }

    public int getIdCustomer() {
        return idcustomer;
    }

    public void setIdCustomer(int idcustomer) {
        this.idcustomer = idcustomer;
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

    public void setAdress_fk(int adress_fk) { this.adress_fk = adress_fk;
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
                "id=" + idcustomer +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", adress_fk='" + adress_fk + '\'' +
                ", contact_fk='" + contact_fk + '\'' +
                '}';
    }
}
