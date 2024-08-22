package com.mkkubinsk.shapes.model;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
public class Square extends Shape {

    private double dimensionA;
    private double dimensionB;

    public Square() {
    }

    public Square(String color, double dimensionA, double dimensionB) {
        super(color);
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
    }
}
