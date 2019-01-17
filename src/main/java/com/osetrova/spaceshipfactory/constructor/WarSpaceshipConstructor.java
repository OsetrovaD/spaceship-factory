package com.osetrova.spaceshipfactory.constructor;

import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;
import com.osetrova.spaceshipfactory.model.spaceship.WarSpaceship;
import com.osetrova.spaceshipfactory.util.MapUtil;

import java.util.List;
import java.util.Map;

public abstract class WarSpaceshipConstructor extends SpaceshipConstructor {

    private static final String FIREPOWER = "firepower";

    @Override
    void setTypeParameters(Spaceship spaceship, List<Map<String, String>> parameters) {
        WarSpaceship warSpaceship = (WarSpaceship) spaceship;
        warSpaceship.setFirepower(Integer.valueOf(MapUtil.findValueByKey(parameters, FIREPOWER)));
    }
}
