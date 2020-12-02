import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JDesktopPane;
import javax.swing.JTextPane;
import java.awt.Canvas;
import javax.swing.JLayeredPane;
import javax.swing.JSlider;
import java.awt.TextArea;
import javax.swing.JTree;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JInternalFrame;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Choice;
import javax.swing.JOptionPane;
import java.awt.Panel;

public class NewPeopleApply extends JFrame{
	
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	static Connection conn;

	  
	/**
	 * Create the frame.
	 */
	public NewPeopleApply() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 431);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원 가입");
		lblNewLabel.setBounds(322, 10, 205, 38);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 32));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.RED);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(306, 118, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(375, 195, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(306, 198, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("연락처");
		lblNewLabel_4.setBounds(306, 249, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(382, 145, 111, 21);
		contentPane.add(passwordField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(377, 246, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		Button button = new Button("회원 가입");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WBTest.dbConnect();
	            try {
	               WBTest.query("insert", "insert into member values('"+textField_2.getText()+"','"+passwordField.getText()+"','"+textField.getText()+"','"+textField_1.getText()+"')");
	            } catch (Exception e1) {
	               e1.printStackTrace();
	            }
	            System.out.println("새항목 추가완료");
	            WBTest.dbDis();

	            textField_2.setText("");
	            passwordField.setText("");
	            textField.setText("");
	            textField_1.setText("");
	            setVisible(false);
				new MainScreen().setVisible(true);
				JOptionPane.showMessageDialog(null, "회원 가입 되었습니다.");
			}
		});
		button.setBackground(Color.ORANGE);
		button.setForeground(Color.BLUE);
		button.setBounds(622, 198, 76, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel_5 = new JLabel("비밀번호");
		lblNewLabel_5.setBounds(306, 145, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(375, 115, 116, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}	
}
