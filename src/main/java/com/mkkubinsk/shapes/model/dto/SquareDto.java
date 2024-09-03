package com.mkkubinsk.shapes.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class SquareDto extends ShapeDto{

    private double dimensionA;
    private double dimensionB;

    public SquareDto(UUID id, String color, double dimensionA, double dimensionB) {
        super(id, color);
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
    }
}
