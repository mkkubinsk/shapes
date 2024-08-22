package com.mkkubinsk.shapes.mapper;

import com.mkkubinsk.shapes.model.Shape;
import com.mkkubinsk.shapes.model.Square;
import com.mkkubinsk.shapes.model.dto.ShapeDto;
import com.mkkubinsk.shapes.model.dto.SquareDto;
import org.springframework.stereotype.Component;

@Component
public class SquareToDtoMapper {

    public SquareDto convertToDto(Square square) {
        return new SquareDto(
                square.getId(),
                square.getColor(),
                square.getDimensionA(),
                square.getDimensionB()
        );
    }

}
