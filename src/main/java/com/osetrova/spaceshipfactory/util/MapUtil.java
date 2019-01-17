package com.osetrova.spaceshipfactory.util;

import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.Map;

@UtilityClass
public class MapUtil {

    public static <K, V> V findValueByKey(List<Map<K, V>> parameters, K key) {
        Map<K, V> map = parameters.stream()
                .filter(x -> x.containsKey(key))
                .findFirst()
                .orElseThrow(RuntimeException::new);
        return map.get(key);
    }
}
