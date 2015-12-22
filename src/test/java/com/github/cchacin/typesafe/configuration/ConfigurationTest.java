package com.github.cchacin.typesafe.configuration;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfigurationTest {

    @Test
    public void testDefaultConfiguration() throws Exception {
        assertThat(ConfigurationFactory.configuration().host()).isEqualTo("localhost");
        assertThat(ConfigurationFactory.configuration().port()).isEqualTo(5432);
        assertThat(ConfigurationFactory.configuration().schema()).isEqualTo("public");
    }

    @Test
    public void testDevConfiguration() throws Exception {
        System.setProperty("MY_ENV", "development");
        assertThat(ConfigurationFactory.configuration().host()).isEqualTo("localhost");
        assertThat(ConfigurationFactory.configuration().port()).isEqualTo(5432);
        assertThat(ConfigurationFactory.configuration().schema()).isEqualTo("public");
    }

    @Test
    public void testProdConfiguration() throws Exception {
        System.setProperty("MY_ENV", "production");
        assertThat(ConfigurationFactory.configuration().host()).isEqualTo("production.com");
        assertThat(ConfigurationFactory.configuration().port()).isEqualTo(5432);
        assertThat(ConfigurationFactory.configuration().schema()).isEqualTo("public");
    }
}
