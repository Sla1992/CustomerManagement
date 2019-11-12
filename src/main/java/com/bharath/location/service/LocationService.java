package com.bharath.location.service;
import com.bharath.location.entities.Customer;
import java.util.List;

public interface LocationService {

    Customer saveLocation(Customer customer);

    Customer updateLocation(Customer customer);

    void deleteLocation(Customer customer);

    Customer getLocationById(int id);

    List<Customer> getAllLocations();
}
