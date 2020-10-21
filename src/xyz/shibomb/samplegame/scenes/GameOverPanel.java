package xyz.shibomb.samplegame.scenes;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

import xyz.shibomb.samplegame.GameManager;
import xyz.shibomb.samplegame.ui.NextButton;
import xyz.shibomb.samplegame.ui.SimpleLabel;

public class GameOverPanel extends JPanel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7074581168480273894L;

	private Logger logger = Logger.getLogger(GameOverPanel.class.getName());

	public GameOverPanel() {
		logger.log(Level.INFO, "#constructor()");

		// next
		add(new NextButton(">> CLICK TO TITLE", 30, "title"));

		// label
		add(new SimpleLabel("ゲームオーバー", 100));
		add(new SimpleLabel("スコア:" + GameManager.getInstance().getScore().getScore(), 50));
		add(new SimpleLabel("ハイスコア:" + GameManager.getInstance().getScore().getHiScore(), 50));
	}
}
