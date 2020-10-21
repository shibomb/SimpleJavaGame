package xyz.shibomb.samplegame.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class SimpleLabel extends JLabel {

	private static final long serialVersionUID = -7942810081981019232L;

	private String text;
	private int size;

	public SimpleLabel(String text, int size) {
		this.text = text;
		this.size = size;

		init();
	}

	private void init() {
		setVisible(true);
		setText(text);
		setFont(new Font("ＭＳ ゴシック", Font.BOLD, size));
		setForeground(Color.DARK_GRAY);
		setHorizontalAlignment(JLabel.CENTER);
	}
}
