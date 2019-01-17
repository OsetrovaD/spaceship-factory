package com.osetrova.spaceshipfactory.model.spaceship;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SpySpaceship extends NonWarSpaceship {

    private String sensorType;
}
