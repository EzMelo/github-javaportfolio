import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ProjectGUI1 extends JFrame {

	private JPanel contentPane; //Global variables
	private JTextField tfInput;
	private JLabel lblConversion; // we want the answer to also be global variable
	private JLabel lblCurrency;
	private JComboBox comboBox;
	private double ZAR = 15.22;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectGUI1 frame = new ProjectGUI1();
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
	public ProjectGUI1() {
		setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		setTitle("Currency Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the amount you want to convert: ");
		lblNewLabel.setBounds(10, 11, 257, 14);
		contentPane.add(lblNewLabel);
		
		tfInput = new JTextField();
		tfInput.setBounds(277, 8, 147, 20);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		lblConversion = new JLabel(""); //JLabel is declaration
		lblConversion.setBounds(10, 131, 414, 14);
		contentPane.add(lblConversion);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = tfInput.getText();
				String cur = (String)comboBox.getSelectedItem();
				
				if (cur.equals("ZAR (Rands)"))
				{
					double zarAmount = Double.parseDouble(text) * ZAR;
					lblConversion.setText("Converting from USD your amount is R" + Math.round(zarAmount * 100.0) / 100.0);
				}
				else 
				{
					double usdAmount = Double.parseDouble(text)/ZAR;
					lblConversion.setText("	Converting from rands your amount is " + Math.round(usdAmount * 100.0) / 100.0 + " dollars");
				}
				
				//lblConversion.setText("Amount is " + text);
			}// put content into welcome level
		});
		btnConvert.setBounds(157, 206, 89, 23);
		contentPane.add(btnConvert);
		
		lblCurrency = new JLabel("Are you converting to USD or to ZAR?");
		lblCurrency.setBounds(10, 49, 257, 14);
		contentPane.add(lblCurrency);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USD (Dollars)", "ZAR (Rands)"}));
		comboBox.setBounds(287, 45, 122, 22);
		contentPane.add(comboBox);
	}
}
