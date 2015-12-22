package com.github.cchacin.typesafe.configuration;

import java.util.HashMap;
import java.util.Map;

public abstract class ConfigurationFactory {

    private static final Map<String, DefaultConfiguration> configurations = new HashMap<>();

    static {
        configurations.put("development", new DevConfiguration());
        configurations.put("production", new ProdConfiguration());
    }

    public static DefaultConfiguration configuration() {
        return configurations.getOrDefault(System.getProperty("MY_ENV"), new DevConfiguration());
    }
}
