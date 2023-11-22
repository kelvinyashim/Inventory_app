package com.example.test.api;

import com.example.test.domain.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import repository.DrinkRepository;
import services.DrinksService;

import java.util.List;

@Controller
public class DrinkApiController {
    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinksService drinksService;


    @RequestMapping("/drinks")
    @GetMapping("/drinks")
    public ResponseEntity<List<Drink>> getAllDrink(){
        return ResponseEntity.ok().body(drinksService.getAllDrink());
    }
}
