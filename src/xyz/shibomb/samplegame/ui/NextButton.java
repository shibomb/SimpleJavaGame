package xyz.shibomb.samplegame.ui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import xyz.shibomb.samplegame.GameManager;

public class NextButton extends SimpleLabel implements MouseListener {

	private static final long serialVersionUID = 2569865820237261903L;

	private String scene;

	public NextButton(String text, int size, String scene) {
		super(text, size);

		this.scene = scene;

		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		GameManager.getInstance().changeScene(this.scene);
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		setForeground(Color.DARK_GRAY);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		setForeground(Color.GRAY);

	}
}
