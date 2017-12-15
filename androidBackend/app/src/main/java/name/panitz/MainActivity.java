package name.panitz.game;

import name.panitz.game.framework.android.GameActivity;
import name.panitz.game.klaus.HeartsOfKlaus;

public class MainActivity extends GameActivity {
    public MainActivity() {
        super(new HeartsOfKlaus<>());
    }
}
