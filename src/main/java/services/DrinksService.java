package services;

import com.example.test.domain.Drink;

import java.util.List;

public interface DrinksService  {
    Drink saveDrink(Drink drink);
    Drink getDrinkById(long id);
    List<Drink> getAllDrink();
    Drink updateDrink(Drink drink);
     void deleteDrink(long id);



}
