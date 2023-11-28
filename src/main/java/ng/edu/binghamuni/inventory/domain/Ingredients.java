package ng.edu.binghamuni.inventory.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "ingredient")
public class Ingredients {
    @Id
    private Long id;
    private String name;
    private String nutritional;


    public Ingredients(Long id, String name, String nutritional) {
        this.id = id;
        this.name = name;
        this.nutritional = nutritional;
    }

    public Ingredients() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNutritional() {
        return nutritional;
    }

    public void setNutritional(String nutritional) {
        this.nutritional = nutritional;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }




}
