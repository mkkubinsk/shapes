package model;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
public class Square extends Shape {

    private double dimensionA;
    private double dimensionB;

    public Square(UUID id, String color, double dimensionA, double dimensionB) {
        super.setId(id);
        super.setColor(color);
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
    }
}
