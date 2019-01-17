package com.osetrova.spaceshipfactory.constructor;

import com.osetrova.spaceshipfactory.model.spaceship.NonWarSpaceship;
import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;
import com.osetrova.spaceshipfactory.util.MapUtil;

import java.util.List;
import java.util.Map;

public abstract class NonWarSpaceshipConstructor extends SpaceshipConstructor {

    private static final String COLOR = "color";

    @Override
    void setTypeParameters(Spaceship spaceship, List<Map<String, String>> parameters) {
        NonWarSpaceship nonWarSpaceship = (NonWarSpaceship) spaceship;
        nonWarSpaceship.setColor(MapUtil.findValueByKey(parameters, COLOR));
    }
}
