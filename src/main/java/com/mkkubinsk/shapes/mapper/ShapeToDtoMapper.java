package com.mkkubinsk.shapes.mapper;

import com.mkkubinsk.shapes.model.Shape;
import com.mkkubinsk.shapes.model.dto.ShapeDto;
import org.springframework.stereotype.Component;

@Component
public class ShapeToDtoMapper {

    public ShapeDto convertToDto(Shape shape) {
        return new ShapeDto(
                shape.getId(),
                shape.getColor()
        );
    }

}
