package com.osetrova.spaceshipfactory.controller;

import com.osetrova.spaceshipfactory.model.requestparameter.Parameter;
import com.osetrova.spaceshipfactory.model.spaceship.Spaceship;
import com.osetrova.spaceshipfactory.service.SpaceshipFactoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SpaceshipFactoryController {

    private SpaceshipFactoryService service;

    @PostMapping(value = "/create-spaceship", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Spaceship> create(@RequestBody List<Parameter> parameters) {
        return service.makeSpaceship(parameters);
    }
}
