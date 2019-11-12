package com.bharath.location.controllers;

import com.bharath.location.entities.Customer;
import com.bharath.location.service.LocationService;
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
    LocationService service;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("location") Customer customer, ModelMap modelMap){
        Customer customerSaved = service.saveLocation(customer);
        String msg = "Location saved with id :" + customerSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "createLocation";
    }

    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap){
        List<Customer> customers = service.getAllLocations();
        modelMap.addAttribute("locations", customers);
        return "displayLocations";
    }

    @RequestMapping("deleteLocations")
    public String deleteLocation(@RequestParam("id") int id,ModelMap modelMap){
        Customer customer = new Customer();
        customer.setId(id);
        service.deleteLocation(customer);
        List<Customer> customers = service.getAllLocations();
        modelMap.addAttribute("locations", customers);
        return "displayLocations";
    }

    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id") int id, ModelMap modelMap){
        Customer customer = service.getLocationById(id);
        modelMap.addAttribute("location", customer);
        return "updateLocations";
    }

    @RequestMapping("/updateLoc")
    public String updateLocation(@ModelAttribute("location") Customer customer, ModelMap modelMap){
        service.updateLocation(customer);
        List<Customer> customers = service.getAllLocations();
        modelMap.addAttribute("locations", customers);
        return "displayLocations";
    }

}

