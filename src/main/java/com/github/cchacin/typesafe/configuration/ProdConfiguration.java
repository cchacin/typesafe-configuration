package com.github.cchacin.typesafe.configuration;

public class ProdConfiguration implements DefaultConfiguration {
    @Override
    public String host() {
        return "production.com";
    }

    // You can override all the configurations defined in DefaultConfiguration interfaces
}
