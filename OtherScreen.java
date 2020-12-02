import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OtherScreen extends JFrame {
	JButton btnClick, btnClear, btnAnOtherScreen;
	JLabel label;
	JPanel panel;
	
	OtherScreen(){
		setSize(300, 200);
		btnClick = new JButton("눌러 주세요!");
		btnClear = new JButton("깨끗이");
		btnAnOtherScreen = new JButton("메인 화면으로");
		label = new JLabel("두번째 화면입니다!");
		
		btnAnOtherScreen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ExamActionListener().setVisible(true);
			}
		});
		
		panel = new JPanel();
		panel.add(label);
		panel.add(btnClick);
		panel.add(btnClear);
		panel.add(btnAnOtherScreen);
		panel.setBackground(Color.BLUE);
		
		add(panel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
	
