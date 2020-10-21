package xyz.shibomb.samplegame.ui;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5319480874899195905L;

	private Logger logger = Logger.getLogger(GameWindow.class.getName());

	/**
	 * コンストラクタ
	 * 
	 * @param title  タイトルです
	 * @param width  ウィンドウの横サイズです
	 * @param height ウィンドウの縦サイズです
	 */
	public GameWindow(String title, int width, int height) {
		super(title);

		logger.log(Level.INFO, "#constructor()");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width, height);
		setLocationRelativeTo(null);
		setResizable(false);

		setBackground(Color.WHITE);
	}

	public void changeScene(JPanel panel) {
		logger.log(Level.INFO, "#changeScene panel=" + panel.toString());

		// すべてのパネルを削除
		getContentPane().removeAll();

		// 指定されたパネルを追加
		add(panel);

		// 再描画
		validate();
		repaint();
		
		panel.requestFocus();
	}
}
