package com.osetrova.spaceshipfactory.constructor;

import com.osetrova.spaceshipfactory.model.spaceship.DarkStar;
import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;
import com.osetrova.spaceshipfactory.util.MapUtil;

import java.util.List;
import java.util.Map;

public class DarkStarConstructor extends WarSpaceshipConstructor {

    private static final String MAX_SPACESHIP_CAPACITY = "maxSpaceshipCapacity";

    @Override
    Spaceship chooseSpaceshipSubtype() {
        return new DarkStar();
    }

    @Override
    void setSubtypeParameters(Spaceship spaceship, List<Map<String, String>> parameters) {
        DarkStar darkStar = (DarkStar) spaceship;
        darkStar.setMaxSpaceshipCapacity(Integer.valueOf(MapUtil.findValueByKey(parameters, MAX_SPACESHIP_CAPACITY)));
    }
}
