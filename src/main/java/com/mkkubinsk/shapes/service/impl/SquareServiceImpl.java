package com.mkkubinsk.shapes.service.impl;

import com.mkkubinsk.shapes.mapper.CommandToShapeMapper;
import com.mkkubinsk.shapes.mapper.CommandToSquareMapper;
import com.mkkubinsk.shapes.model.Shape;
import com.mkkubinsk.shapes.model.Square;
import com.mkkubinsk.shapes.model.command.CreateSquareCommand;
import com.mkkubinsk.shapes.model.command.UpdateShapeCommand;
import com.mkkubinsk.shapes.repository.ShapeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SquareServiceImpl extends ShapeServiceImpl {

    CommandToSquareMapper commandToSquareMapper;

    @Autowired
    public SquareServiceImpl(ShapeRepository shapeRepository,
                             CommandToShapeMapper commandToShapeMapper,
                             CommandToSquareMapper commandToSquareMapper) {
        super(shapeRepository, commandToShapeMapper);
        this.commandToSquareMapper = commandToSquareMapper;
    }

    @Override
    public Square create(CreateSquareCommand createSquareCommand) {
        return shapeRepository.save(commandToSquareMapper.fromCommand(createSquareCommand));
    }

    @Override
    public Shape update(UUID id, CreateSquareCommand createSquareCommand) {
        try {
            Shape shapeToUpdate = shapeRepository.getReferenceById(id);
            shapeToUpdate.setColor(createSquareCommand.getColor());
            return shapeToUpdate;
        } catch (Exception e) {
            return create(createSquareCommand);
        }
    }

    @Override
    public Shape patch(UUID id, UpdateShapeCommand updateShapeCommand) {
        return null;
    }

}
