package com.skillupcs.backend.controller;

import com.skillupcs.backend.model.Map;
import com.skillupcs.backend.repository.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maps")
public class MapController {

    // Injeta o repositório para acesso aos dados do banco
    @Autowired
    private MapRepository mapRepository;

    @PostMapping
    public ResponseEntity<Map> createMap(@RequestBody Map map){

        // Salva a entidade no banco de dados e retorna 200 OK com o objeto salvo
        Map savedMap = mapRepository.save(map);
        return ResponseEntity.ok().body(savedMap);
    }

    @GetMapping
    public List<Map> getMaps(){
        // Retorna todos os mapas do banco de dados
        return mapRepository.findAll();
    }
}
