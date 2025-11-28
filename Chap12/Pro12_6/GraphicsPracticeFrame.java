package Pro12_6;

import javax.swing.*;
import java.awt.*;

public class GraphicsPracticeFrame extends JFrame {

	public GraphicsPracticeFrame() {
		setTitle("이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new DiamondPanel());
		setSize(300, 300);
		setVisible(true);
	}

	class DiamondPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			int w = getWidth();
			int h = getHeight();

			int centerX = w / 2;
			int centerY = h / 2;

			int maxSize = Math.min(w, h) / 2 - 10;
			int step = maxSize / 10;

			g.setColor(Color.BLACK);

			for (int i = 0; i < 10; i++) {
				int size = step * (i + 1);

				int[] xPoints = { centerX, centerX + size, centerX, centerX - size };
				int[] yPoints = { centerY - size, centerY, centerY + size, centerY };

				g.drawPolygon(xPoints, yPoints, 4);
			}
		}
	}

	public static void main(String[] args) {
		new GraphicsPracticeFrame();
	}
}
