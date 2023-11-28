package ng.edu.binghamuni.inventory.services;

import ng.edu.binghamuni.inventory.domain.Drink;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DrinksService  {
    Drink saveDrink(Drink drink);
    Drink getDrinkById(long id);
    List<Drink> getAllDrink();
    Drink updateDrink(Drink drink);
     void deleteDrink(long id);



}
