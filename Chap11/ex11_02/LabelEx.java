package ex11_02;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel textLabel = new JLabel("사랑합니다");

		ImageIcon beauty = new ImageIcon(
				"C:\\Users\\leein\\OneDrive\\바탕 화면\\GUI_Programming\\Chap11\\images\\beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);

		ImageIcon normallcon = new ImageIcon(
				"C:\\Users\\leein\\OneDrive\\바탕 화면\\GUI_Programming\\Chap11\\images\\normalIcon.gif");
		JLabel label = new JLabel("보고 싶으면 전화하세요", normallcon, SwingConstants.CENTER);
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);

		setSize(400, 600);
		setVisible(true);

	}

	public static void main(String[] args) {
		new LabelEx();
	}

}
