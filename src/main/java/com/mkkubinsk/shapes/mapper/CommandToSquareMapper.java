package com.mkkubinsk.shapes.mapper;

import com.mkkubinsk.shapes.model.Shape;
import com.mkkubinsk.shapes.model.Square;
import com.mkkubinsk.shapes.model.command.CreateShapeCommand;
import com.mkkubinsk.shapes.model.command.CreateSquareCommand;
import com.mkkubinsk.shapes.model.command.UpdateShapeCommand;
import com.mkkubinsk.shapes.model.command.UpdateSquareCommand;
import org.springframework.stereotype.Component;

@Component
public class CommandToSquareMapper {

    public Square fromCommand(CreateSquareCommand createSquareCommand) {
        return new Square(
                createSquareCommand.getColor(),
                createSquareCommand.getDimensionA(),
                createSquareCommand.getDimensionB()
        );
    }

    public Square fromCommand(UpdateSquareCommand updateSquareCommand) {
        return new Square(
                updateSquareCommand.getColor(),
                updateSquareCommand.getDimensionA(),
                updateSquareCommand.getDimensionB()
        );
    }

}
