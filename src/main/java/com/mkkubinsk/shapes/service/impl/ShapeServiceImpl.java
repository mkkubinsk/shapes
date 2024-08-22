package com.mkkubinsk.shapes.service.impl;

import com.mkkubinsk.shapes.mapper.CommandToShapeMapper;
import com.mkkubinsk.shapes.model.Shape;
import com.mkkubinsk.shapes.model.Square;
import com.mkkubinsk.shapes.model.command.CreateShapeCommand;
import com.mkkubinsk.shapes.model.command.CreateSquareCommand;
import com.mkkubinsk.shapes.model.command.UpdateShapeCommand;
import com.mkkubinsk.shapes.repository.ShapeRepository;
import com.mkkubinsk.shapes.service.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public abstract class ShapeServiceImpl implements ShapeService {

    ShapeRepository shapeRepository;
    CommandToShapeMapper commandToShapeMapper;

    @Autowired
    public ShapeServiceImpl(ShapeRepository shapeRepository, CommandToShapeMapper commandToShapeMapper) {
        this.shapeRepository = shapeRepository;
        this.commandToShapeMapper = commandToShapeMapper;
    }

    @Override
    public List getAll() {
        return shapeRepository.findAll();
    }

    @Override
    public Shape getById(UUID id) {
        return shapeRepository.getReferenceById(id);
    }

    @Override
    public Shape create(CreateShapeCommand createShapeCommand) {
        return shapeRepository.save(commandToShapeMapper.fromCommand(createShapeCommand));
    }

    public abstract Square create(CreateSquareCommand createSquareCommand);

    @Override
    public Shape update(UUID id, CreateShapeCommand createShapeCommand) {
        try {
            Shape shapeToUpdate = shapeRepository.getReferenceById(id);
            shapeToUpdate.setColor(createShapeCommand.getColor());
            return shapeToUpdate;
        } catch (Exception e) {
            return create(createShapeCommand);
        }
    }

    public abstract Shape update(UUID id, CreateSquareCommand createSquareCommand);

    @Override
    public Shape patch(UUID id, UpdateShapeCommand updateShapeCommand) {
        return null;
    }

    @Override
    public void delete(UUID id) {
        shapeRepository.deleteById(id);
    }
}
