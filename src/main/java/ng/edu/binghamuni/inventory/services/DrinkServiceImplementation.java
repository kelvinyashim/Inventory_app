package ng.edu.binghamuni.inventory.services;

import ng.edu.binghamuni.inventory.domain.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ng.edu.binghamuni.inventory.repository.DrinkRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DrinkServiceImplementation implements DrinksService {
    @Autowired //This makes sure we don't need to create new instance of DR
    DrinkRepository drinkRepository;
    @Override
    public Drink saveDrink(Drink drink) {
        return drinkRepository.save(drink);
    }

    @Override
    public Drink getDrinkById(long id) {
        Optional<Drink> drink = drinkRepository.findById(id);
        Drink emptyDrink;
        if(drink.isPresent()){
            emptyDrink = drink.get();
            return emptyDrink;
        }else {
            throw new RuntimeException("Drink not found");
        }
    }

    @Override
    public List<Drink> getAllDrink() {
        return drinkRepository.findAll();
    }

    @Override
    public Drink updateDrink(Drink drink) {
        Optional<Drink> optionalDrink = drinkRepository.findById(drink.getId());

        if(optionalDrink.isPresent()){
            Drink updateDrink = new Drink();
            updateDrink.setCapacity(drink.getCapacity());
            updateDrink.setColor(drink.getColor());
            updateDrink.setPrice(drink.getPrice());
            updateDrink.setCompany(drink.getCompany());
            updateDrink.setName(drink.getName());
            updateDrink.setId(drink.getId());//this is how we get the id and update it
            updateDrink.setType(drink.getType());
            updateDrink.setIngredients(drink.getIngredients());

            drinkRepository.save(updateDrink);
            return updateDrink;
        }else {
            throw new RuntimeException("Drink not found");
        }
    }

    @Override
    public  void deleteDrink(long id) {
        drinkRepository.deleteById(id);
    }
}
