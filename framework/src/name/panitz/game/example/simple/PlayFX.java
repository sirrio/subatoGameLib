package name.panitz.game.example.simple;

import name.panitz.game.framework.fx.GameApplication;

public class PlayFX extends GameApplication {
  public PlayFX(){
    super(new SimpleGame<>());
  }
}

