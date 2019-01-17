package com.osetrova.spaceshipfactory.constructor;

import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;
import com.osetrova.spaceshipfactory.util.MapUtil;

import java.util.List;
import java.util.Map;

public abstract class SpaceshipConstructor {

    private static final String ARMOR = "armor";
    private static final String FUEL = "fuel";
    private static final String FUEL_TYPE = "fuelType";
    private static final String SHIP_NAME = "shipName";

    public Spaceship makeSpaceship(List<Map<String, String>> parameters) {
        Spaceship spaceship = chooseSpaceshipSubtype();
        setDefaultParameters(spaceship, parameters);
        setTypeParameters(spaceship, parameters);
        setSubtypeParameters(spaceship, parameters);

        return spaceship;
    }

    abstract Spaceship chooseSpaceshipSubtype();

    abstract void setTypeParameters(Spaceship spaceship, List<Map<String, String>> parameters);

    abstract void setSubtypeParameters(Spaceship spaceship, List<Map<String, String>> parameters);

    protected void setDefaultParameters(Spaceship spaceship, List<Map<String, String>> parameters) {
        spaceship.setArmor(Integer.valueOf(MapUtil.findValueByKey(parameters, ARMOR)));
        spaceship.setFuel(Integer.valueOf(MapUtil.findValueByKey(parameters, FUEL)));
        spaceship.setFuelType(MapUtil.findValueByKey(parameters, FUEL_TYPE));
        spaceship.setShipName(MapUtil.findValueByKey(parameters, SHIP_NAME));
    }
}
