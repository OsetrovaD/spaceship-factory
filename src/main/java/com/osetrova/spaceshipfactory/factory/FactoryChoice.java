package com.osetrova.spaceshipfactory.factory;

import org.springframework.stereotype.Component;

@Component
public class FactoryChoice {

    private static final String NON_WAR_SPACESHIP_TYPES = "transport, spySpaceship";
    private static final NonWarSpaceshipFactory NON_WAR_SPACESHIP_FACTORY = new NonWarSpaceshipFactory();
    private static final WarSpaceshipFactory WAR_SPACESHIP_FACTORY = new WarSpaceshipFactory();

    public SpaceshipFactory initFactory(String shipType) {
        SpaceshipFactory factory;
        if (NON_WAR_SPACESHIP_TYPES.contains(shipType)) {
            factory = NON_WAR_SPACESHIP_FACTORY;
        } else {
            factory = WAR_SPACESHIP_FACTORY;
        }

        return factory;
    }
}
