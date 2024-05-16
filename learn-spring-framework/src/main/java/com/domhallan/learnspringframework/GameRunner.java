package com.domhallan.learnspringframework;

public class GameRunner {
  MarioGame game;


  public GameRunner(MarioGame game) {
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
