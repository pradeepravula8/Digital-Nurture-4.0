package com.example.springlearn.controller;

import com.example.springlearn.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountryIndia() {
        Country country = new Country();
        country.setCode("IN");
        country.setName("India");
        return country;
    }
}
