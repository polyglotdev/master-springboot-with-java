package com.domhallan.learnspringframework;

public class SuperContraGame implements GamingConsole {
  public void run() {
    System.out.println("Bill is running");
  }

  public void up() {
    System.out.println("Bill is jumping");
  }

  public void down() {
    System.out.println("Bill is crouching");
  }

  public void left() {
    System.out.println("Bill is moving left");
  }

  public void right() {
    System.out.println("Bill is moving right");
  }

  public void fire() {
    System.out.println("Bill is shooting fireballs");
  }

  public void pause() {
    System.out.println("Bill is paused");
  }

  public void quit() {
    System.out.println("Bill has quit the game");

  }
}
