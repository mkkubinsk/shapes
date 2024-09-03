package com.mkkubinsk.shapes.mapper;

import com.mkkubinsk.shapes.model.Shape;
import com.mkkubinsk.shapes.model.command.CreateShapeCommand;
import com.mkkubinsk.shapes.model.command.UpdateShapeCommand;
import org.springframework.stereotype.Component;

@Component
public class CommandToShapeMapper {

    public Shape fromCommand(CreateShapeCommand createShapeCommand) {
        return new Shape(
                createShapeCommand.getColor()
        );
    }

    public Shape fromCommand(UpdateShapeCommand updateShapeCommand) {
        return new Shape(
                updateShapeCommand.getColor()
        );
    }
}
