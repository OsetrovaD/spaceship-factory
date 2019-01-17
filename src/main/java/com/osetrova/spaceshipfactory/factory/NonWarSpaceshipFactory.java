package com.osetrova.spaceshipfactory.factory;

import com.osetrova.spaceshipfactory.constructor.SpaceshipConstructor;
import com.osetrova.spaceshipfactory.constructor.SpySpaceshipConstructor;
import com.osetrova.spaceshipfactory.constructor.TransportConstructor;
import com.osetrova.spaceshipfactory.model.requestparameter.Parameter;
import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;

import java.util.HashMap;
import java.util.Map;

public class NonWarSpaceshipFactory implements SpaceshipFactory {

    private static final Map<String, SpaceshipConstructor> SPACESHIP_BUILDERS = new HashMap<>();

    static {
        SPACESHIP_BUILDERS.put("spySpaceship", new SpySpaceshipConstructor());
        SPACESHIP_BUILDERS.put("transport", new TransportConstructor());
    }

    @Override
    public Spaceship createSpaceship(Parameter parameter) {
        return SPACESHIP_BUILDERS.get(parameter.getType()).makeSpaceship(parameter.getParameters());
    }
}
