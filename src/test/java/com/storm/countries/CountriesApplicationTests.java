package com.storm.countries;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

@DataJpaTest
@ActiveProfiles("test")
class CountriesApplicationTests {

    @Test
    void contextLoads() {
        // just test the configs startup successfully
    }
}
