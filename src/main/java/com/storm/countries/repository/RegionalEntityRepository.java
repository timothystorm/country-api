package com.storm.countries.repository;

import com.storm.countries.model.entity.RegionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionalEntityRepository extends JpaRepository<RegionalEntity, Long> {
}
