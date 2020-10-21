package xyz.shibomb.samplegame.logic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Score {
	Logger logger = Logger.getLogger(Score.class.getName());

	private int hiScore = 0;
	private int score = 0;

	public Score() {
		this.hiScore = 0;
		this.score = 0;
	}

	public int getHiScore() {
		return hiScore;
	}

	public int getScore() {
		return score;
	}

	public void addScore(int addition) {
		logger.log(Level.INFO, "#addScore addition=" + addition);

		this.score += addition;

		logger.log(Level.INFO, "#addScore new score=" + score);
		if (score > hiScore) {
			hiScore = score;
			logger.log(Level.INFO, "#addScore hi-score!!" + hiScore);
		}

	}

	public void resetScore() {
		logger.log(Level.INFO, "#resetScore");
		this.score = 0;
	}

}
