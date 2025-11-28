package Pro12_6;

import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {

	public Grid() {
		setTitle("이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new GridPanel());
		setSize(300, 300);
		setVisible(true);
	}

	class GridPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			int w = getWidth();
			int h = getHeight();

			int rows = 10;
			int cols = 10;

			int cellW = w / cols;
			int cellH = h / rows;

			g.setColor(Color.BLACK);

			for (int i = 0; i <= cols; i++) {
				int x = i * cellW;
				g.drawLine(x, 0, x, h);
			}

			for (int i = 0; i <= rows; i++) {
				int y = i * cellH;
				g.drawLine(0, y, w, y);
			}
		}
	}

	public static void main(String[] args) {
		new Grid();
	}
}
