package com.bharath.location.entities;

import javax.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcontact;
    private String name;
    private String value;
    @Enumerated(EnumType.STRING)
    private Typea typea;
    @Enumerated(EnumType.STRING)
    private Typeb typeb;

    public int getIdcontact() {
        return idcontact;
    }

    public void setIdcontact(int idcontact) {
        this.idcontact = idcontact;
    }

    public Typea getTypea() {
        return typea;
    }

    public void setTypea(Typea typea) {
        this.typea = typea;
    }

    public Typeb getTypeb() {
        return typeb;
    }

    public void setTypeb(Typeb typeb) {
        this.typeb = typeb;
    }

    public int getCustomer_fk() {
        return customer_fk;
    }

    public void setCustomer_fk(int customer_fk) {
        this.customer_fk = customer_fk;
    }

    private int customer_fk;

    public int getIdContact() {
        return idcontact;
    }

    public void setIdContact(int idcontact) {
        this.idcontact = idcontact;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {

        return "contact{" +
                "id=" + idcontact +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", typea='" + typea + '\'' +
                ", typeb='" + typeb + '\'' +
                '}';
    }
}
