package name.panitz.game.example.simple;
import java.awt.Image;

import javax.sound.sampled.AudioInputStream;
import javax.swing.JFrame;

import name.panitz.game.framework.GameLogic;
import name.panitz.game.framework.swing.SwingGame;

public class PlaySwing{
  public static void startGame(GameLogic<Image,AudioInputStream> game) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(new SwingGame(game));
    f.pack();
    f.setVisible(true);
  }

  public static void main(String[] args){
    startGame(new SimpleGame<>());
  }
}

