package com.bharath.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bharath.location.entities.Customer;

//CRUD Funktionen
//Warum Fahrrad erst bauen wenn es da steht?
//Rohe CRUD Methoden, Service (Eigenschaften(Was will ich Cruden?)
//Ich mache aus meinem Crud meinen LocationService
//Man kriegt Fahrradrahmenwerk und baut nur das Gehäuse

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
