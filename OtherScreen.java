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
		btnClick = new JButton("���� �ּ���!");
		btnClear = new JButton("������");
		btnAnOtherScreen = new JButton("���� ȭ������");
		label = new JLabel("�ι�° ȭ���Դϴ�!");
		
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
	
