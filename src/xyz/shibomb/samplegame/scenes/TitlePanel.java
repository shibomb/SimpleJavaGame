package xyz.shibomb.samplegame.scenes;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

import xyz.shibomb.samplegame.GameManager;
import xyz.shibomb.samplegame.ui.NextButton;
import xyz.shibomb.samplegame.ui.SimpleLabel;

public class TitlePanel extends JPanel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7074581168480273894L;

	private Logger logger = Logger.getLogger(TitlePanel.class.getName());

	public TitlePanel() {
		logger.log(Level.INFO, "#constructor()");

		// logic
		GameManager.getInstance().getScore().resetScore();

		// next
		add(new NextButton(">> CLICK TO START", 30, "game"));

		// label
		add(new SimpleLabel("クリックゲー", 100), BorderLayout.CENTER);
	}
}
