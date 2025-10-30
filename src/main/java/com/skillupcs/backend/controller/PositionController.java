package com.skillupcs.backend.controller;

import com.skillupcs.backend.model.Map;
import com.skillupcs.backend.model.Position;
import com.skillupcs.backend.repository.MapRepository;
import com.skillupcs.backend.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maps/{mapId}/positions")
public class PositionController {

    @Autowired
    private MapRepository mapRepository;

    @Autowired
    private PositionRepository positionRepository;

    @PostMapping
    public ResponseEntity<Position> createPosition(
            @PathVariable Long mapId,
            @RequestBody Position position) {

        // 1. Encontra o mapa pelo ID
        return mapRepository.findById(mapId).map(map -> {
            // 2. Associa o mapa com a posição
            position.setMap(map);

            // 3. Salva a posição
            Position savedPosition = positionRepository.save(position);
            return ResponseEntity.ok(savedPosition);
        }).orElse(ResponseEntity.notFound().build());
    }


    @GetMapping
    public List<Position> getPositionsByMap(@PathVariable Long mapId) {
        // Encontra o mapa. Se não existir, lança uma exceção
        return positionRepository.findByMapId(mapId);
    }
}