package com.github.cchacin.typesafe.configuration;

public interface DefaultConfiguration {
    default String host() {
        return "localhost";
    }

    default int port() {
        return 5432;
    }

    default String schema() {
        return "public";
    }
}
