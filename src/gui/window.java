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
import javax.swing.SpinnerNumberModel;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class window {

	private JFrame frmAlarm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frmAlarm.setVisible(true);
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
		frmAlarm = new JFrame();
		frmAlarm.getContentPane().setForeground(Color.BLACK);
		frmAlarm.setForeground(Color.WHITE);
		frmAlarm.setTitle("Alarm");
		frmAlarm.setBounds(100, 100, 412, 288);
		frmAlarm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlarm.getContentPane().setLayout(null);
		
		JLabel lblWhatTimeWould = new JLabel("What time would you like your alarm?");
		lblWhatTimeWould.setToolTipText("");
		lblWhatTimeWould.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhatTimeWould.setBounds(46, 16, 221, 33);
		frmAlarm.getContentPane().add(lblWhatTimeWould);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(218, 177, 89, 23);
		frmAlarm.getContentPane().add(btnCancel);
		
		JLabel lblWhatColorWould = new JLabel("What color would you like your clock?");
		lblWhatColorWould.setBounds(46, 103, 221, 14);
		frmAlarm.getContentPane().add(lblWhatColorWould);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Orange", "Green", "Blue", "Red", "White", "Pink"}));
		comboBox_1.setMaximumRowCount(6);
		comboBox_1.setBounds(276, 99, 89, 23);
		frmAlarm.getContentPane().add(comboBox_1);
		
		JLabel lblClicknextTo = new JLabel("Click 'Next' to select your music");
		lblClicknextTo.setBounds(126, 150, 208, 14);
		frmAlarm.getContentPane().add(lblClicknextTo);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNext.setBounds(117, 177, 89, 23);
		frmAlarm.getContentPane().add(btnNext);
		
		final JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 23, 1));
		spinner.setBounds(279, 23, 37, 20);
		frmAlarm.getContentPane().add(spinner);
		System.out.println(spinner);
		
		final JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 59, 1));
		spinner_1.setBounds(328, 23, 37, 20);
		frmAlarm.getContentPane().add(spinner_1);
		System.out.println(spinner_1);
		
		JLabel lblmilitaryTimePlease = new JLabel("(Military time please)");
		lblmilitaryTimePlease.setBounds(100, 58, 142, 16);
		frmAlarm.getContentPane().add(lblmilitaryTimePlease);
		
		JButton btnNewButton = new JButton("Set");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int spinNum = (Integer) spinner.getValue();
				int spinNum1 = (Integer) spinner_1.getValue();
				String alarmTime = spinNum + ":" + spinNum1;
				System.out.println("Your alarm is set for " + alarmTime);
			}
		});
		btnNewButton.setBounds(289, 55, 72, 23);
		frmAlarm.getContentPane().add(btnNewButton);
	}
}
