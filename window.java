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
		frame.setBounds(100, 100, 437, 319);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWhatTimeWould = new JLabel("What time would you like your alarm?");
		lblWhatTimeWould.setBounds(46, 42, 178, 14);
		frame.getContentPane().add(lblWhatTimeWould);
		
		textField = new JTextField();
		textField.setBounds(234, 39, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblWhichDays = new JLabel("Which days?");
		lblWhichDays.setBounds(46, 67, 178, 14);
		frame.getContentPane().add(lblWhichDays);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(324, 39, 46, 20);
		frame.getContentPane().add(comboBox);
		
		JCheckBox chckbxMon = new JCheckBox("Mon");
		chckbxMon.setBounds(46, 88, 97, 23);
		frame.getContentPane().add(chckbxMon);
		
		JCheckBox chckbxTues = new JCheckBox("Tues");
		chckbxTues.setBounds(46, 114, 97, 23);
		frame.getContentPane().add(chckbxTues);
		
		JCheckBox chckbxWed = new JCheckBox("Wed");
		chckbxWed.setBounds(46, 140, 97, 23);
		frame.getContentPane().add(chckbxWed);
		
		JCheckBox chckbxThur = new JCheckBox("Thur");
		chckbxThur.setBounds(46, 164, 97, 23);
		frame.getContentPane().add(chckbxThur);
		
		JCheckBox chckbxFri = new JCheckBox("Fri");
		chckbxFri.setBounds(46, 190, 97, 23);
		frame.getContentPane().add(chckbxFri);
		
		JCheckBox chckbxSat = new JCheckBox("Sat");
		chckbxSat.setBounds(46, 216, 97, 23);
		frame.getContentPane().add(chckbxSat);
		
		JCheckBox chckbxSun = new JCheckBox("Sun");
		chckbxSun.setBounds(46, 244, 97, 23);
		frame.getContentPane().add(chckbxSun);
	}
}
