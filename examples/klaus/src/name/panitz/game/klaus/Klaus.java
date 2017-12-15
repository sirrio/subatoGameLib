package name.panitz.game.klaus;

import name.panitz.game.framework.FallingImage;
import name.panitz.game.framework.Vertex;

public class Klaus<I> extends FallingImage<I> {

/*	private KeyListener keyListener = new KeyListener() {
		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				left();
				break;
			case KeyEvent.VK_RIGHT:
				right();
				break;
			case KeyEvent.VK_UP:
				jump();
				break;
			case KeyEvent.VK_DOWN:
				stop();
				break;
			}
		}
	};

	@Override public KeyListener getKeyListener() {
		return keyListener;
	}

*/
	
	public Klaus(Vertex corner) {
		super("player.png", corner, new Vertex(0, 0));
	}

}
