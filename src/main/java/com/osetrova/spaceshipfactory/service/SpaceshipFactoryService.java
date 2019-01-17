package com.osetrova.spaceshipfactory.service;

import com.osetrova.spaceshipfactory.factory.FactoryChoice;
import com.osetrova.spaceshipfactory.factory.SpaceshipFactory;
import com.osetrova.spaceshipfactory.model.requestparameter.Parameter;
import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SpaceshipFactoryService {

    private final FactoryChoice choice;


    public List<Spaceship> makeSpaceship(List<Parameter> objects) {
        List<Spaceship> spaceships = new ArrayList<>();
        for (Parameter object : objects) {
            SpaceshipFactory factory = choice.initFactory(object.getType());
            spaceships.add(factory.createSpaceship(object));
        }

        return spaceships;
    }


}
