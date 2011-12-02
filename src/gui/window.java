package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTree;

public class window {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 423, 225);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWhatTimeWould = new JLabel("What time would you like your alarm?");
		lblWhatTimeWould.setBounds(46, 42, 178, 14);
		frame.getContentPane().add(lblWhatTimeWould);
		
		textField = new JTextField();
		textField.setBounds(234, 39, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(324, 39, 46, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(211, 154, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblWhatColorWould = new JLabel("What color would you like your alarm?");
		lblWhatColorWould.setBounds(46, 73, 181, 14);
		frame.getContentPane().add(lblWhatColorWould);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(234, 70, 136, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblClicknextTo = new JLabel("Click 'Next' to select your music");
		lblClicknextTo.setBounds(131, 128, 178, 14);
		frame.getContentPane().add(lblClicknextTo);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(112, 154, 89, 23);
		frame.getContentPane().add(btnNext);
	}
}
