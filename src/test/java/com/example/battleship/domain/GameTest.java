package com.example.battleship.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class GameTest {

    @Test
    void newGameShouldBePending() {
        var game = new Game();
        assertThat(game.getStatus()).isEqualTo(GameStatus.PENDING);
    }
}