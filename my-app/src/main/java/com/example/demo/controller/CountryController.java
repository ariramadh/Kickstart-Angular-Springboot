package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "*")
public class CountryController {
	
	@Autowired
	CountryRepository ur;
	
	@GetMapping("ping")
	public String ping() {
		return "API Connected";
	}
	
	@GetMapping("list")
	public List<Country>listVariantsActive(){
		return ur.findAll();
	}
}
