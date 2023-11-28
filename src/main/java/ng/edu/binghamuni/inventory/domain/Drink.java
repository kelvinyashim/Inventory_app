package ng.edu.binghamuni.inventory.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;


@Entity(name = "drink")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int capacity;
    private int price;
@CreationTimestamp
private Date created_date;

@UpdateTimestamp

private Date updated_date;

    @OneToMany
    private List<Ingredients> ingredients;
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

    public Drink(Long id, Date created_date, Date updated_date, List<Ingredients> ingredients, String name, int capacity, String color, String type, String company, int price) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.color = color;
        this.type = type;
        this.company = company;
        this.price = price;
        this.ingredients = ingredients;
        this.created_date = created_date;
        this.updated_date = updated_date;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
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