package com.osetrova.spaceshipfactory.model.spaceship;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Fighter extends WarSpaceship {

    private Integer speed;
}
