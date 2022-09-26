package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class CalculatorTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest frame = new CalculatorTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorTest() {
		setTitle("나의 계산기 v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.BOLD, 16));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 10, 238, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBounds(12, 57, 52, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBounds(76, 57, 52, 49);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("9");
		btnNewButton_1_1.setBounds(136, 57, 52, 49);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("/");
		btnNewButton_1_1_1.setBounds(196, 57, 52, 49);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setBounds(12, 115, 52, 49);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.setBounds(76, 115, 52, 49);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_2 = new JButton("6");
		btnNewButton_1_1_2.setBounds(136, 115, 52, 49);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("X");
		btnNewButton_1_1_1_1.setBounds(196, 115, 52, 49);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.setBounds(12, 174, 52, 49);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_3 = new JButton("2");
		btnNewButton_1_3.setBounds(76, 174, 52, 49);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_3 = new JButton("3");
		btnNewButton_1_1_3.setBounds(136, 174, 52, 49);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_1_2 = new JButton("-");
		btnNewButton_1_1_1_2.setBounds(196, 174, 52, 49);
		contentPane.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_4 = new JButton("0");
		btnNewButton_4.setBounds(12, 238, 52, 49);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_4 = new JButton("C");
		btnNewButton_1_4.setBounds(76, 238, 52, 49);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_1_4 = new JButton("=");
		btnNewButton_1_1_4.setBounds(136, 238, 52, 49);
		contentPane.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_1_1_3 = new JButton("+");
		btnNewButton_1_1_1_3.setBounds(196, 238, 52, 49);
		contentPane.add(btnNewButton_1_1_1_3);
	}

}
