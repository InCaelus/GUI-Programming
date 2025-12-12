package pro12_5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlusMinusImageFrame extends JFrame {
	private MyPanel panel = new MyPanel();

	public PlusMinusImageFrame() {
		setTitle("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
		getContentPane().setFocusable(true);
		getContentPane().requestFocus();
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon(
				"C:\\Users\\SAMSUNG Galaxy\\Desktop\\Gui_Programming\\Chap12\\images\\apple.jpg");
		private Image img = icon.getImage();

		private int width, height;

		public MyPanel() {
			width = img.getWidth(this);
			height = img.getHeight(this);
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyChar() == '+') {
						width = (int) (width * 1.1);
						height = (int) (height * 1.1);
						repaint(); // 다시 그리기 지시
					}
				}
			});
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, width, height, this);
		}

	}

	public static void main(String[] args) {
		new PlusMinusImageFrame();
	}

}
