package com.storm.countries.service;

import com.storm.countries.model.entity.RegionalEntity;
import com.storm.countries.repository.RegionalEntityRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionalEntityService {
    private final RegionalEntityRepository repository;

    RegionalEntityService(RegionalEntityRepository repository) {
        this.repository = repository;
    }

    public List<RegionalEntity> getAllRegionalEntities() {
        return repository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    public Optional<RegionalEntity> getRegionalEntityById(long id) {
        return repository.findById(id);
    }

    public RegionalEntity createRegionalEntity(RegionalEntity regionalEntity) {
        return repository.save(regionalEntity);
    }

    public RegionalEntity updateRegionalEntity(Long id, RegionalEntity entity) {
        RegionalEntity updatedEntity = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(String.format("Regional Entity not found <%d>", id)));
        updatedEntity.setName(entity.getName());
        updatedEntity.setCapital(entity.getCapital());
        updatedEntity.setPopulation(entity.getPopulation());
        updatedEntity.setArea(entity.getArea());
        updatedEntity.setAltitudeHi(entity.getAltitudeHi());
        updatedEntity.setAltitudeLo(entity.getAltitudeLo());
        return repository.save(updatedEntity);
    }

    public void deleteRegionalEntityById(Long id) {
        repository.deleteById(id);
    }
}
