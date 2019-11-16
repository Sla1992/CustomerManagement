package com.bharath.location.service;
import com.bharath.location.entities.*;

import java.util.List;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Customer getCustomerById(int idcustomer);

    List<Customer> getAllCustomers();



    Adress saveAdress(Adress adress);

    Adress updateAdress(Adress adress);

    void deleteAdress(Adress adress);

    Adress getAdressnById(int id);

    List<Adress> getAllAdresses();



    City saveCity(City city);

    City updateCity(City city);

    void deleteCity(City city);

    City getCityById(int idcity);

    List<City> getAllCities();



    Contact saveContact(Contact contact);

    Contact updateContact(Contact contact);

    void deleteContact(Contact contact);

    Contact getContactById(int idcontact);

    List<Contact> getAllContacts();



    Country saveCountry(Country country);

    Country updateCountry(Country country);

    void deleteCountry(Country country);

    Country getCountryById(int idcountry);

    List<Country> getAllCountries();
}


