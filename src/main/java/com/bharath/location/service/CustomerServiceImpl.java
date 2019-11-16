package com.bharath.location.service;

import com.bharath.location.entities.*;
import com.bharath.location.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;
    @Autowired
    private AdressRepository repository2;
    @Autowired
    private CityRepository repository3;
    @Autowired
    private CountryRepository repository4;
    @Autowired
    private ContactRepository repository5;

    //Customer ----------------------------------
    @Override
    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        repository.delete(customer);
    }

    @Override
    public Customer getCustomerById(int idcustomer) {
        return repository.getOne(idcustomer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    //Adress --------------------------------
    @Override
    public Adress saveAdress(Adress adress) {
        return repository2.save(adress);
    }

    @Override
    public Adress updateAdress(Adress adress) {
        return repository2.save(adress);
    }

    @Override
    public void deleteAdress(Adress adress) {
        repository2.delete(adress);
    }

    @Override
    public Adress getAdressnById(int idadress) {
        return repository2.getOne(idadress);
    }

    @Override
    public List<Adress> getAllAdresses() {
        return repository2.findAll();
    }

    //City ----------------------------------
    @Override
    public City saveCity(City city) {
        return repository3.save(city);
    }

    @Override
    public City updateCity(City city) {
        return repository3.save(city);
    }

    @Override
    public void deleteCity(City city) {
        repository3.delete(city);
    }

    @Override
    public City getCityById(int idcity) {
        return repository3.getOne(idcity);
    }

    @Override
    public List<City> getAllCities() {
        return repository3.findAll();
    }

    //Country ----------------------------------
    @Override
    public Country saveCountry(Country country) {
        return repository4.save(country);
    }

    @Override
    public Country updateCountry(Country country) {
        return repository4.save(country);
    }

    @Override
    public void deleteCountry(Country country) {
        repository4.delete(country);
    }

    @Override
    public Country getCountryById(int idcountry) { return repository4.getOne(idcountry); }

    @Override
    public List<Country> getAllCountries() {
        return repository4.findAll();
    }

    //Contact ----------------------------------
    @Override
    public Contact saveContact(Contact contact) {
        return repository5.save(contact);
    }

    @Override
    public Contact updateContact(Contact contact) {
        return repository5.save(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        repository5.delete(contact);
    }

    @Override
    public Contact getContactById(int idcontact) {
        return repository5.getOne(idcontact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return repository5.findAll();
    }


    public CustomerRepository getRepository(){
        return repository;
    }

    public void setRepository(CustomerRepository repository){
        this.repository = repository;
    }

    public AdressRepository getRepository2(){
        return repository2;
    }

    public void setRepository(AdressRepository repository2){
        this.repository2 = repository2;
    }

    public CityRepository getRepository3() {
        return repository3;
    }

    public void setRepository3(CityRepository repository3) {
        this.repository3 = repository3;
    }

    public CountryRepository getRepository4(){
        return repository4;
    }

    public void setRepository4(CountryRepository repository4) {
        this.repository4 = repository4;
    }

    public ContactRepository getRepository5() {
        return repository5;
    }

    public void setRepository5(ContactRepository repository5) {
        this.repository5 = repository5;
    }
}
