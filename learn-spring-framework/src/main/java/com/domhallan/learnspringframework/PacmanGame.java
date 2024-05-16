package com.domhallan.learnspringframework;

public class PacmanGame implements GamingConsole {
  @Override
  public void down() {
    System.out.println("Pacman is moving down");
  }

  @Override
  public void fire() {
    System.out.println("Pacman is eating pellets");
  }

  @Override
  public void left() {
    System.out.println("Pacman is moving left");
  }

  @Override
  public void pause() {
    System.out.println("Pacman is paused");
  }

  @Override
  public void quit() {
    System.out.println("Pacman has quit the game");
  }

  @Override
  public void right() {
    System.out.println("Pacman is moving right");
  }

  @Override
  public void run() {
    System.out.println("Pacman is running");
  }

  @Override
  public void up() {
    System.out.println("Pacman is moving up");
  }
}
