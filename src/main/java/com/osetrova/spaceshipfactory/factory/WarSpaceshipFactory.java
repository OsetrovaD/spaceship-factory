package com.osetrova.spaceshipfactory.factory;

import com.osetrova.spaceshipfactory.constructor.CruiserConstructor;
import com.osetrova.spaceshipfactory.constructor.DarkStarConstructor;
import com.osetrova.spaceshipfactory.constructor.FighterConstructor;
import com.osetrova.spaceshipfactory.constructor.SpaceshipConstructor;
import com.osetrova.spaceshipfactory.model.requestparameter.Parameter;
import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;

import java.util.HashMap;
import java.util.Map;

public class WarSpaceshipFactory implements SpaceshipFactory {

    private static final Map<String, SpaceshipConstructor> SPACESHIP_BUILDERS = new HashMap<>();

    static {
        SPACESHIP_BUILDERS.put("cruiser", new CruiserConstructor());
        SPACESHIP_BUILDERS.put("darkStar", new DarkStarConstructor());
        SPACESHIP_BUILDERS.put("fighter", new FighterConstructor());
    }

    @Override
    public Spaceship createSpaceship(Parameter parameter) {
        return SPACESHIP_BUILDERS.get(parameter.getType()).makeSpaceship(parameter.getParameters());
    }
}
