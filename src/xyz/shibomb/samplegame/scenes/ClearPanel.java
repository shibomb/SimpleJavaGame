package xyz.shibomb.samplegame.scenes;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

import xyz.shibomb.samplegame.GameManager;
import xyz.shibomb.samplegame.ui.NextButton;
import xyz.shibomb.samplegame.ui.SimpleLabel;

public class ClearPanel extends JPanel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7074581168480273894L;

	private Logger logger = Logger.getLogger(ClearPanel.class.getName());

	public ClearPanel() {
		logger.log(Level.INFO, "#constructor()");

		// logic
		GameManager.getInstance().getScore().addScore(100);

		// next
		add(new NextButton(">> CLICK TO NEXT", 30, "game"));

		// label
		add(new SimpleLabel("おめでとう", 100), BorderLayout.CENTER);
	}
}
