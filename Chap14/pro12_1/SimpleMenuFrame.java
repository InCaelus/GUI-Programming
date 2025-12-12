package pro12_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleMenuFrame extends JFrame {
	private Container contentPane;

	public SimpleMenuFrame() {
		setTitle("Menu 만들기 예제");
		contentPane = getContentPane();
		contentPane.setBackground(Color.CYAN);

		createMenu(); // 메뉴 생성
		setSize(300, 200);
		setVisible(true);
	}

	private void createMenu() {

		JMenuBar mb = new JMenuBar();

		JMenu lookMenu = new JMenu("보기");

		JMenuItem zoomItem = new JMenuItem("화면 확대");
		JMenuItem outlineItem = new JMenuItem("쪽 윤곽");

		lookMenu.add(zoomItem);
		lookMenu.add(outlineItem);
		lookMenu.addSeparator();

		mb.add(new JMenu("파일"));
		mb.add(new JMenu("편집"));
		mb.add(lookMenu);
		mb.add(new JMenu("입력"));

		setJMenuBar(mb);

	}

	public static void main(String[] args) {
		new SimpleMenuFrame();
	}
}
