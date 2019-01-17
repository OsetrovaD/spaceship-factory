package com.osetrova.spaceshipfactory.model.requestparameter;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class Parameter {
    String type;
    List<Map<String, String>> parameters;
}
