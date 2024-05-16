package com.domhallan.learnspringframework;

public class GameRunner {
  private final GamingConsole game;


  public GameRunner(GamingConsole game) {
    this.game = game;
  }


  public void run() {
    game.run();

    game.up();
    game.down();
    game.left();
    game.right();
  }
}
