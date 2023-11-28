package ng.edu.binghamuni.inventory.api;

import ng.edu.binghamuni.inventory.domain.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ng.edu.binghamuni.inventory.repository.DrinkRepository;
import ng.edu.binghamuni.inventory.services.DrinksService;

import java.util.List;

@Controller
public class DrinkApiController {

    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinksService drinksService;


    @RequestMapping("/drink")
    @GetMapping("/drink")
    public ResponseEntity<List<Drink>> getAllDrink(){

        return ResponseEntity.ok().body(drinksService.getAllDrink());
        //the return type is a Json
    }
    @PostMapping("/drink")
    public ResponseEntity<Drink> createDrink(@RequestBody Drink drink){
        return  ResponseEntity.ok().body(drinksService.saveDrink(drink));
    }


    @PutMapping("/drink/{id}")
    public ResponseEntity<Drink> updateDrink(@PathVariable long id, @RequestBody Drink drink){
        return  ResponseEntity.ok().body(drinksService.updateDrink(drink));
    }

    @DeleteMapping("/drink/{id}")
    public HttpStatus deleteDrink(@PathVariable long id){
        drinksService.deleteDrink(id);
        return  HttpStatus.OK;
    }



}
