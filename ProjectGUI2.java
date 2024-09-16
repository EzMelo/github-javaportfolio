import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProjectGUI2 extends JFrame {
//Check GUI guessing games
	//Loops in GUI
	// As soon as the answer is correct the program ends
	//Button for each event
	private JPanel contentPane;
	private JTextField tfAnswer1;
	private JLabel lblAttempt1; 
	private JLabel lblFinale;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectGUI2 frame = new ProjectGUI2();
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
	public ProjectGUI2() {
		setTitle("GuessGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInstruc1 = new JLabel("The computer has generated a number between 1 and 100.");
		lblInstruc1.setBounds(10, 11, 397, 14);
		contentPane.add(lblInstruc1);
		
		JLabel lblInstruc2 = new JLabel("Try and guess the generated number but you only have 1 attempt.");
		lblInstruc2.setBounds(10, 36, 397, 14);
		contentPane.add(lblInstruc2);
		
		lblAttempt1 = new JLabel("Attempt 1:");
		lblAttempt1.setBounds(10, 79, 79, 14);
		contentPane.add(lblAttempt1);
		
		tfAnswer1 = new JTextField();
		tfAnswer1.setBounds(125, 76, 86, 20);
		contentPane.add(tfAnswer1);
		tfAnswer1.setColumns(10);
		
		lblFinale = new JLabel("");
		lblFinale.setBounds(10, 125, 457, 14);
		contentPane.add(lblFinale);
		
		JButton btnCheck = new JButton("Check Answer");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random randNumber = new Random();
				int answer = randNumber.nextInt(100);
				answer += 1;
				
				String text = tfAnswer1.getText();
				
				//lblFinale2.setText(Integer.toString(answer));
				//for (int i = 1; i <= 3; i++) 
				//{
					//System.out.println("Attempt "+ i +": Enter your guessed number: ");
					//int guess = g.nextInt();
					
					if  (Integer.parseInt(text) == answer) 
					{
						lblFinale.setText("Well done! "+ text +" is the correct answer");
						//break;
					}
					else if (Integer.parseInt(text) > answer) 
					{
						lblFinale.setText("Sorry your guess is higher than the generated number \nThe answer is " + Integer.toString(answer));
					}
					else if (Integer.parseInt(text) < answer) 
					{
						lblFinale.setText("Sorry your guess is lower than the generated number \nThe answer is " + Integer.toString(answer));
					}
				//}
				
				//lblFinale2.setText("
				
				//try for loop with just 1 tf box (Check if it gives you the option to answer again)
				// If not just use if statement 
			}
		});
		btnCheck.setBounds(171, 177, 127, 32);
		contentPane.add(btnCheck);
	}

}
