package com.storm.countries.repository;

import com.storm.countries.model.entity.RegionalEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DataJpaTest
@ActiveProfiles("test")
public class RegionalEntityRepositoryTest {
    @Autowired
    RegionalEntityRepository regionalEntityRepository;

    @Autowired
    TestEntityManager entityManager;

    @Test
    void givenNewRegionalEntity_whenSave_thenSuccess() {
        RegionalEntity newRegionalEntity = new RegionalEntity();
        newRegionalEntity.setName("Colorado");
        newRegionalEntity.setCapital("Denver");
        newRegionalEntity.setPopulation(100);
        newRegionalEntity.setArea(200);
        newRegionalEntity.setAltitudeLo(300);
        newRegionalEntity.setAltitudeHi(400);
        RegionalEntity insertedRegionalEntity = regionalEntityRepository.save(newRegionalEntity);

        assertThat(entityManager.find(RegionalEntity.class, insertedRegionalEntity.getId()), equalTo(newRegionalEntity));
    }
}
