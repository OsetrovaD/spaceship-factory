package com.osetrova.spaceshipfactory.constructor;

import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;
import com.osetrova.spaceshipfactory.model.spaceship.SpySpaceship;
import com.osetrova.spaceshipfactory.util.MapUtil;

import java.util.List;
import java.util.Map;

public class SpySpaceshipConstructor extends NonWarSpaceshipConstructor {

    private static final String SENSOR_TYPE = "sensorType";

    @Override
    Spaceship chooseSpaceshipSubtype() {
        return new SpySpaceship();
    }

    @Override
    void setSubtypeParameters(Spaceship spaceship, List<Map<String, String>> parameters) {
        SpySpaceship spySpaceship = (SpySpaceship) spaceship;
        spySpaceship.setSensorType(MapUtil.findValueByKey(parameters, SENSOR_TYPE));
    }
}
