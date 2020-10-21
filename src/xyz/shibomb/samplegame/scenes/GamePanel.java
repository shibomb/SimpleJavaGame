package xyz.shibomb.samplegame.scenes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

import xyz.shibomb.samplegame.GameManager;
import xyz.shibomb.samplegame.ui.NextButton;
import xyz.shibomb.samplegame.ui.SimpleLabel;

public class GamePanel extends JPanel implements Runnable, KeyListener {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7074581168480273894L;

	private Logger logger = Logger.getLogger(GamePanel.class.getName());

	Thread t;
	int x = 0;
	int y = 0;
	int r = 0;
	int g = 0;
	int b = 0;

	public GamePanel() {
		logger.log(Level.INFO, "#constructor()");

		// next
		add(new NextButton(">> CLICK TO CLEAR", 30, "clear"));
		add(new NextButton(">> CLICK TO GAME OVER", 30, "gameover"));

		// label
		add(new SimpleLabel("ゲームなう", 100));
		
		// panel setup
		setFocusable(true);
        addKeyListener(this);

		// start thread
		t = new Thread(this);// Thread instance
		t.start();// Thread Start
	}

	public void run() {
		// 無限ループでThreadが終了しないようにする
		while (true) {
			x++;
			y++;
			x = x % 300;
			y = y % 300;

			try {
				Thread.sleep(100);// 100ms毎に実施
			} catch (InterruptedException e) {
			}

			repaint();
		}
	}

	public void paintComponent(Graphics g) {
		// 赤い矩形を描画する
		g.setColor(new Color(this.r, this.g, this.b));
		g.fillRect(x, y, 20, 20);// 引数は(X座標,Y座標,Width,height)
	}

	public void keyPressed(KeyEvent e) {
		logger.log(Level.INFO, "#keyPressed()");
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_R:
			r = (r + 1) % 256;
			break;
		case KeyEvent.VK_G:
			g = (g + 1) % 256;
			break;
		case KeyEvent.VK_B:
			b = (b + 1) % 256;
			break;
		}
		
		GameManager.getInstance().getScore().addScore(1);
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}
}
