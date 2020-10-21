package xyz.shibomb.samplegame;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

import xyz.shibomb.samplegame.logic.Score;
import xyz.shibomb.samplegame.scenes.ClearPanel;
import xyz.shibomb.samplegame.scenes.GameOverPanel;
import xyz.shibomb.samplegame.scenes.GamePanel;
import xyz.shibomb.samplegame.scenes.TitlePanel;
import xyz.shibomb.samplegame.ui.GameWindow;

public class GameManager {
	private static final GameManager INSTANCE = new GameManager();

	Logger logger = Logger.getLogger(GameManager.class.getName());

	private GameWindow gameWindow;

	private String currentScene = null;
	private Score score = new Score();

	private GameManager() {
		logger.log(Level.INFO, "#GameManager");

		gameWindow = new GameWindow("Sample Game", 800, 600);
	}

	public static GameManager getInstance() {
		return INSTANCE;
	}

	public Score getScore() {
		return score;
	}

	public void start() {
		logger.log(Level.INFO, "#start");

		changeScene("title");
		gameWindow.setVisible(true);
	}

	public void changeScene(String scene) {
		logger.log(Level.INFO, "#changeScene" + " scene=" + scene);

		JPanel panel = null;
		switch (scene) {
		case "title":
			panel = new TitlePanel();
			break;
		case "game":
			panel = new GamePanel();
			break;
		case "gameover":
			panel = new GameOverPanel();
			break;
		case "clear":
			panel = new ClearPanel();
			break;
		}

		try {
			gameWindow.changeScene(panel);
			currentScene = scene;
			logger.log(Level.INFO, "#changeScene" + " scene changed=" + currentScene);

		} catch (Exception e) {
			logger.log(Level.SEVERE, "未定義のシーンです", e);
			throw e;
		}
	}

	/**
	 * メイン
	 * 
	 * @param args 起動時引数です
	 */
	public static void main(String[] args) {
		GameManager.getInstance().start();
	}
}
