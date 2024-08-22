package com.mkkubinsk.shapes.model.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ShapeDto {

    private UUID id;
    private String color;

    public ShapeDto(UUID id, String color) {
        this.id = id;
        this.color = color;
    }

}
