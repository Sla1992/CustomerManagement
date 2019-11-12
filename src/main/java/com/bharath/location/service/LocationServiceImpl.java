package com.bharath.location.service;

import com.bharath.location.entities.Customer;
import com.bharath.location.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationRepository repository;

    @Override
    public Customer saveLocation(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer updateLocation(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void deleteLocation(Customer customer) {
        repository.delete(customer);
    }

    @Override
    public Customer getLocationById(int id) {
        return repository.getOne(id);
    }

    @Override
    public List<Customer> getAllLocations() {
        return repository.findAll();
    }

    public LocationRepository getRepository(){
        return repository;
    }

    public void setRepository(LocationRepository repository){
        this.repository = repository;
    }
}
