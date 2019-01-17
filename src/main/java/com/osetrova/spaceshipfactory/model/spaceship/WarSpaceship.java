package com.osetrova.spaceshipfactory.model.spaceship;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonSubTypes({
        @JsonSubTypes.Type(value = Cruiser.class, name = "cruiser"),
        @JsonSubTypes.Type(value = DarkStar.class, name = "darkStar"),
        @JsonSubTypes.Type(value = Fighter.class, name = "fighter")
})
public abstract class WarSpaceship extends Spaceship {

    private Integer firepower;
}
