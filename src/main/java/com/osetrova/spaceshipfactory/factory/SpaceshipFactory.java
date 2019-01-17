package com.osetrova.spaceshipfactory.factory;

import com.osetrova.spaceshipfactory.model.requestparameter.Parameter;
import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;

public interface SpaceshipFactory {

    Spaceship createSpaceship(Parameter parameter);
}
