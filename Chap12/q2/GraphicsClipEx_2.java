package q2;

import javax.swing.*;
import java.awt.*;

public class GraphicsClipEx_2 extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsClipEx_2() {
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon(
				"C:\\Users\\SAMSUNG Galaxy\\Desktop\\Gui_Programming\\Chap12\\images\\image0.jpg");
		private Image img = icon.getImage();

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(100, 100, 200, 200);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
		}
	}

	public static void main(String[] args) {
		new GraphicsClipEx_2();
	}

}
