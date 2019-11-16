package com.bharath.location.controllers;

import com.bharath.location.entities.*;
import com.bharath.location.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LocationController {

    @Autowired
    CustomerService service;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("country") Country country, ModelMap modelMap) {

        Country countrySaved = service.saveCountry(country);

        String msg = "Customer saved with id :" + countrySaved.getIdCountry();
        modelMap.addAttribute("msg", msg);
        return "createLocation";
    }

    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap){
        List<Customer> customers = service.getAllCustomers();
        modelMap.addAttribute("locations", customers);
        return "displayLocations";
    }

    @RequestMapping("deleteLocations")
    public String deleteLocation(@RequestParam("id") int id,ModelMap modelMap){
        Customer customer = new Customer();
        customer.setIdCustomer(id);
        service.deleteCustomer(customer);
        List<Customer> customers = service.getAllCustomers();
        modelMap.addAttribute("locations", customers);
        return "displayLocations";
    }

    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id") int id, ModelMap modelMap){
        Customer customer = service.getCustomerById(id);
        modelMap.addAttribute("location", customer);
        return "updateLocations";
    }

    @RequestMapping("/updateLoc")
    public String updateLocation(@ModelAttribute("location") Customer customer, ModelMap modelMap){
        service.updateCustomer(customer);
        List<Customer> customers = service.getAllCustomers();
        modelMap.addAttribute("locations", customers);
        return "displayLocations";
    }

}

