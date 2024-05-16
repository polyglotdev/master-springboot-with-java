package com.domhallan.learnspringframework;

public class AppGamingBasic {
  public static void main(String[] args) {
    var superContraGame = new SuperContraGame();
    var marioGame = new MarioGame();
    var pacmanGame = new PacmanGame();

    var marioGameRunner = new GameRunner(marioGame);
    var superContraGameRunner = new GameRunner(superContraGame);
    var pacmanGameRunner = new GameRunner(pacmanGame);

    marioGameRunner.run();
    superContraGameRunner.run();
    pacmanGameRunner.run();
  }
}
