package com.osetrova.spaceshipfactory.model.spaceship;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonSubTypes({
        @JsonSubTypes.Type(value = Transport.class, name = "transport"),
        @JsonSubTypes.Type(value = SpySpaceship.class, name = "spySpaceship")
})
public abstract class NonWarSpaceship extends Spaceship {

    private String color;
}
