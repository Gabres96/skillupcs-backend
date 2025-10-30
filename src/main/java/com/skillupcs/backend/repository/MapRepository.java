package com.skillupcs.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillupcs.backend.model.Map;

@Repository
public interface MapRepository extends JpaRepository<Map, Long> {
}
