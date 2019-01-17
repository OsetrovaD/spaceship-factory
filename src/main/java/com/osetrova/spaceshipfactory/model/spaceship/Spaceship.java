package com.osetrova.spaceshipfactory.model.spaceship;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = WarSpaceship.class, name = "warSpaceship"),
        @JsonSubTypes.Type(value = NonWarSpaceship.class, name = "nonWarSpaceship")
})
@Data
public abstract class Spaceship {

    private Integer fuel;
    private String fuelType;
    private String shipName;
    private Integer armor;
}
