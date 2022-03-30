package org.asi.partsunlimited;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int model;

    private int quantity;

    private String color;

    public Product(String name, int model, int quantity, String color) {
        this.name = name;
        this.model = model;
        this.quantity = quantity;
        this.color = color;

    }

}
