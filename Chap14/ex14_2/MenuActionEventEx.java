package ex14_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuActionEventEx extends JFrame {
	private JLabel imgLabel = new JLabel();

	public MenuActionEventEx() {
		setTitle("Menu에 Action 리스터 날기 예제");
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(250, 220);
		setVisible(true);
	}

	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = { "Load", "Hide", "Reshow", "Exit" };
		JMenu screenMenu = new JMenu("Screen");

		MenuActionListener listener = new MenuActionListener();
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		mb.add(screenMenu);
		setJMenuBar(mb);
	}

	class MenuActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
			case "Load":
				if (imgLabel.getIcon() != null) {
					return; // 이미 로딩되었으면 리턴
				}
				imgLabel.setIcon(
						new ImageIcon("C:\\Users\\SAMSUNG Galaxy\\Desktop\\Gui_Programming\\Chap14\\images\\img.jpg"));
				break;
			case "Hide":
				imgLabel.setVisible(false);
				break;

			case "Reshow":
				imgLabel.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new MenuActionEventEx();
	}

}
