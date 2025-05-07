package com.storm.countries.controller;

import com.storm.countries.model.entity.RegionalEntity;
import com.storm.countries.service.RegionalEntityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/regionalentities")
public class RegionalEntityController {
    private final RegionalEntityService service;

    RegionalEntityController(RegionalEntityService service) {
        this.service = service;
    }

    @GetMapping
    public List<RegionalEntity> getAll() {
        return service.getAllRegionalEntities();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegionalEntity> getRegionalEntityById(@PathVariable Long id) {
        return service.getRegionalEntityById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public RegionalEntity createRegionalEntity(@RequestBody RegionalEntity regionalEntity) {
        return service.createRegionalEntity(regionalEntity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RegionalEntity> updateRegionalEntity(@PathVariable Long id, @RequestBody RegionalEntity regionalEntity) {
        try {
            RegionalEntity updated = service.updateRegionalEntity(id, regionalEntity);
            return ResponseEntity.ok(updated);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegionalEntityById(@PathVariable Long id) {
        service.deleteRegionalEntityById(id);
        return ResponseEntity.ok().build();
    }
}
