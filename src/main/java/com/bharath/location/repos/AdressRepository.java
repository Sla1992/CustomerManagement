package com.bharath.location.repos;

import com.bharath.location.entities.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adress, Integer> {
}
