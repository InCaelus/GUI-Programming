package ex12_6;

import java.awt.*;
import javax.swing.*;

public class GraphicsFillEx2 extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsFillEx2() {
		setTitle("fillXXX 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(100, 350);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillArc(10, 50, 50, 50, 90, 120);
			g.setColor(Color.YELLOW);
			g.fillArc(10, 50, 50, 50, -30, 120);
			g.setColor(Color.BLUE);
			g.fillArc(10, 50, 50, 50, 210, 120);

		}
	}

	public static void main(String[] args) {
		new GraphicsFillEx2();
	}

}
