package com.skillupcs.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String positionRole;

    @ManyToOne
    @JoinColumn(name = "map_id", nullable = false)
    private Map map;
}
