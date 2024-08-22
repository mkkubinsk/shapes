package com.mkkubinsk.shapes.service;

import com.mkkubinsk.shapes.model.Shape;
import com.mkkubinsk.shapes.model.Square;
import com.mkkubinsk.shapes.model.command.CreateShapeCommand;
import com.mkkubinsk.shapes.model.command.CreateSquareCommand;
import com.mkkubinsk.shapes.model.command.UpdateShapeCommand;

import java.util.List;
import java.util.UUID;

public interface ShapeService {

    List getAll();

    Shape getById(UUID id);

    Shape create(CreateShapeCommand createShapeCommand);

    Square create(CreateSquareCommand createSquareCommand);

    Shape update(UUID id, CreateShapeCommand createShapeCommand);

    Shape patch(UUID id, UpdateShapeCommand updateShapeCommand);

    void delete(UUID id);

}
