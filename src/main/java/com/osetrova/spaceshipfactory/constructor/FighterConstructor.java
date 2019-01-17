package com.osetrova.spaceshipfactory.constructor;

import com.osetrova.spaceshipfactory.model.spaceship.Fighter;
import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;
import com.osetrova.spaceshipfactory.util.MapUtil;

import java.util.List;
import java.util.Map;

public class FighterConstructor extends WarSpaceshipConstructor {

    private static final String SPEED = "speed";

    @Override
    Spaceship chooseSpaceshipSubtype() {
        return new Fighter();
    }

    @Override
    void setSubtypeParameters(Spaceship spaceship, List<Map<String, String>> parameters) {
        Fighter fighter = (Fighter) spaceship;
        fighter.setSpeed(Integer.valueOf(MapUtil.findValueByKey(parameters, SPEED)));
    }
}
