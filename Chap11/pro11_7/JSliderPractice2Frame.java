package pro11_7;

import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;
import javax.swing.event.*;

public class JSliderPractice2Frame extends JFrame {
	private JLabel colorLabel;
	private JSlider[] sl = new JSlider[4];

	public JSliderPractice2Frame() {
		setTitle("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		for (int i = 0; i < sl.length; i++) {
			if (i == 0) {
				sl[i] = new JSlider(JSlider.HORIZONTAL, 1, 100, 40);

				Hashtable<Integer, JLabel> labelTable = new Hashtable<>();
				labelTable.put(1, new JLabel("1"));
				labelTable.put(21, new JLabel("21"));
				labelTable.put(41, new JLabel("41"));
				labelTable.put(61, new JLabel("61"));
				labelTable.put(81, new JLabel("81"));
				labelTable.put(100, new JLabel("100"));
				sl[i].setLabelTable(labelTable);

				sl[i].setPaintLabels(true);
				sl[i].setPaintTicks(true);
				sl[i].setMajorTickSpacing(20);
				sl[i].setMinorTickSpacing(5);
			} else {
				sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
				sl[i].setPaintLabels(true);
				sl[i].setPaintTicks(true);
				sl[i].setPaintTrack(true);
				sl[i].setMajorTickSpacing(50);
				sl[i].setMinorTickSpacing(10);
			}

			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]);
		}

		sl[1].setForeground(Color.RED);
		sl[2].setForeground(Color.GREEN);
		sl[3].setForeground(Color.BLUE);

		colorLabel = new JLabel("Love Java", SwingConstants.CENTER);
		colorLabel.setPreferredSize(new Dimension(300, 150));
		colorLabel.setFont(new Font("Dialog", Font.BOLD, 40));
		c.add(colorLabel);
		setSize(400, 700);
		setVisible(true);
	}

	class MyChangeListener implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {

			// 폰트 크기 적용
			int fontSize = sl[0].getValue();
			colorLabel.setFont(new Font("Dialog", Font.BOLD, fontSize));

			// RGB 적용
			int r = sl[1].getValue();
			int g = sl[2].getValue();
			int b = sl[3].getValue();

			colorLabel.setForeground(new Color(r, g, b));
		}
	}

	public static void main(String[] args) {
		new JSliderPractice2Frame();
	}
}
