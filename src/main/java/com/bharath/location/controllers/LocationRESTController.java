package com.bharath.location.controllers;

import com.bharath.location.entities.Customer;
import com.bharath.location.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping
    public List<Customer> getLocations(){ //getLocations oder getLocation?
        return  locationRepository.findAll();
    }

    @PostMapping
    public Customer createLocation(@RequestBody Customer customer){
        return locationRepository.save(customer);
    }

    @PutMapping
    public Customer updateLocation(@RequestBody Customer customer){
        return locationRepository.save(customer);
    }

    @DeleteMapping
    public void deleteLocation(@RequestBody Customer customer){
        locationRepository.delete(customer);
    }

    @GetMapping("/{id}")
    public Optional<Customer> getLocation(@PathVariable("id") int id){
        return locationRepository.findById(id);
    }
}
