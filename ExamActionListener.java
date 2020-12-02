import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExamActionListener extends JFrame {

	JButton btnClick, btnClear, btnOtherScreen;
	JLabel label;
	JPanel panel;
	
	ExamActionListener(){
		setSize(300, 200);
		btnClick = new JButton("���� �ּ���!");
		btnClear = new JButton("������");
		btnOtherScreen = new JButton("�ٸ�ȭ������");
		label = new JLabel("��ư�� ������ ���� ����!!");
		
		btnClick.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("��ư�� ���� �����ϴ�!!");
			}
		});
		
		btnOtherScreen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new OtherScreen().setVisible(true);
			}
		});
		
		panel = new JPanel();
		panel.add(label);
		panel.add(btnClick);
		panel.add(btnClear);
		panel.add(btnOtherScreen);
		panel.setBackground(Color.YELLOW);
		
		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("����!");
			}
		});
		
		add(panel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExamActionListener();

	}

}
