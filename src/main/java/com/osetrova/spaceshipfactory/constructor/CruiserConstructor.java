package com.osetrova.spaceshipfactory.constructor;

import com.osetrova.spaceshipfactory.model.spaceship.Cruiser;
import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;
import com.osetrova.spaceshipfactory.util.MapUtil;

import java.util.List;
import java.util.Map;

public class CruiserConstructor extends WarSpaceshipConstructor {

    private static final String WEAPON_AMOUNT = "weaponAmount";

    @Override
    Spaceship chooseSpaceshipSubtype() {
        return new Cruiser();
    }

    @Override
    void setSubtypeParameters(Spaceship spaceship, List<Map<String, String>> parameters) {
        Cruiser cruiser = (Cruiser) spaceship;
        cruiser.setWeaponAmount(Integer.valueOf(MapUtil.findValueByKey(parameters, WEAPON_AMOUNT)));
    }
}
