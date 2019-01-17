package com.osetrova.spaceshipfactory.constructor;

import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;
import com.osetrova.spaceshipfactory.model.spaceship.Transport;
import com.osetrova.spaceshipfactory.util.MapUtil;

import java.util.List;
import java.util.Map;

public class TransportConstructor extends NonWarSpaceshipConstructor {

    private static final String CARRYING_CAPACITY = "carryingCapacity";

    @Override
    Spaceship chooseSpaceshipSubtype() {
        return new Transport();
    }

    @Override
    void setSubtypeParameters(Spaceship spaceship, List<Map<String, String>> parameters) {
        Transport transport = (Transport) spaceship;
        transport.setCarryingCapacity(Integer.valueOf(MapUtil.findValueByKey(parameters, CARRYING_CAPACITY)));
    }
}
