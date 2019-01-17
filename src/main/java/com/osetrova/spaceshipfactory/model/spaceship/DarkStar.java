package com.osetrova.spaceshipfactory.model.spaceship;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DarkStar extends WarSpaceship {

    private Integer maxSpaceshipCapacity;
}
