package pro12_1;

import javax.swing.*;
import java.awt.*;

public class ImageDrawPracticeFrame extends JFrame {

	public ImageDrawPracticeFrame() {
		setTitle("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		panel.setLayout(new FlowLayout());
		setContentPane(panel);

		MyButton b = new MyButton("Hide/Show");

		panel.add(b);

		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private Image img = new ImageIcon(
				"C:\\Users\\SAMSUNG Galaxy\\Desktop\\Gui_Programming\\Chap12\\images\\back.jpg").getImage();

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}

	class MyButton extends JButton {
		MyButton(String s) {
			super(s);
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
		}
	}

	public static void main(String[] args) {
		new ImageDrawPracticeFrame();
	}
}
