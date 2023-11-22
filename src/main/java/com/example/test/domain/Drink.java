package com.example.test.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;


@Entity(name = "drink")
public class Drink {

    @Id
    private Long id;
    private String name;
    private int capacity;
    private int price;

    @OneToMany
    private List<com.example.test.domain.Ingredients> ingredients;
    public String getColor() {
        return color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String color;

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public Drink(Long id, String name, int capacity, String color, String type, String company, int price) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.color = color;
        this.type = type;
        this.company = company;
        this.price = price;
    }

    public Drink() {

    }

    public void setName(String name) {
        this.name = name;
    }

    private String type;
    private String company;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}