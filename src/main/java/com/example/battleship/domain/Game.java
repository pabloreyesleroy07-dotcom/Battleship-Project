package com.example.battleship.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private GameStatus status;

    public Game() {
        this.status = GameStatus.PENDING;
    }

    public GameStatus getStatus() {
        return status;
    }

    public Long getId() {
        return id;
    }
}