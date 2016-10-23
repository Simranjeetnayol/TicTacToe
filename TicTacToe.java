import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class TicTacToe extends JFrame {

	JButton onebtn=new JButton(" ");
	JButton twobtn=new JButton(" ");
	JButton threebtn=new JButton(" ");
	JButton fourbtn=new JButton(" ");
	JButton fivebtn=new JButton(" ");
	JButton sixbtn=new JButton(" ");
	JButton sevenbtn=new JButton(" ");
	JButton eightbtn=new JButton(" ");
	JButton ninebtn=new JButton(" ");
	
	private JPanel contentPane;
	private boolean isXorZero=true;
	
	private boolean isNotBlank(JButton button){
		if(button.getText().trim().length()==0){
			return false;
		}
		else{
			return true;
		}
	}
	
	private boolean rowIsNotBlank(JButton b1, JButton b2, JButton b3){
		if(isNotBlank(b1) && isNotBlank(b2) && isNotBlank(b3)){
			return true;
		}
		else{
			return false;
		}
	}
	
	private boolean rowIsMatch(JButton b1, JButton b2, JButton b3){
		if(rowIsNotBlank(b1,b2,b3)){
			if(b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText())){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
		
	}
	
	private boolean GameOver(){
		if(rowIsMatch(onebtn,twobtn,threebtn)){
			return true;
		}
		else if(rowIsMatch(fourbtn,fivebtn,sixbtn)){
			return true;
		}
		else if(rowIsMatch(sevenbtn,eightbtn,ninebtn)){
			return true;
		}
		else if(rowIsMatch(onebtn,fourbtn,sevenbtn)){
			return true;
		}
		else if(rowIsMatch(twobtn,fivebtn,eightbtn)){
			return true;
		}
		else if(rowIsMatch(threebtn,sixbtn,ninebtn)){
			return true;
		}
		else if(rowIsMatch(onebtn,fivebtn,ninebtn)){
			return true;
		}
		else if(rowIsMatch(threebtn,fivebtn,sevenbtn)){
			return true;
		}
		
			return false;
		
		
		
	}
	
	private void resetGame(){
		onebtn.setText(" ");
		twobtn.setText(" ");
		threebtn.setText(" ");
		fourbtn.setText(" ");
		fivebtn.setText(" ");
		sixbtn.setText(" ");
		sevenbtn.setText(" ");
		eightbtn.setText(" ");
		ninebtn.setText(" ");
	}
	
	private void printIsXorZero(JButton button){
		if(button.getText().trim().length()==0){
			if(isXorZero){
				button.setText("X");
			}
			else{
				button.setText("0");
			}
			isXorZero =!isXorZero;
			if(GameOver()){
				JOptionPane.showMessageDialog(this,"GameOver "+button.getText()+" U Win");
				isXorZero=true;
				resetGame();
				
			}
		}
	}

	public static void main(String[] args) {
		TicTacToe frame= new TicTacToe();
		frame.setVisible(true);
	}

	public TicTacToe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setForeground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		onebtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			printIsXorZero(onebtn);
		}
		});
		onebtn.setBounds(36, 30, 97, 32);
		contentPane.add(onebtn);
		
		
		twobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printIsXorZero(twobtn);
			}
			});
		
		twobtn.setBounds(168, 30, 97, 32);
		contentPane.add(twobtn);
		
		
		threebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printIsXorZero(threebtn);
			}
			});
		
		threebtn.setBounds(298, 30, 97, 32);
		contentPane.add(threebtn);
		
		
		fourbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printIsXorZero(fourbtn);
			}
			});
		
		fourbtn.setBounds(36, 103, 97, 32);
		contentPane.add(fourbtn);
		
		
		fivebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printIsXorZero(fivebtn);
			}
			});
		
		fivebtn.setBounds(168, 103, 97, 32);
		contentPane.add(fivebtn);
		
		
		sixbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printIsXorZero(sixbtn);
			}
			});
		
		sixbtn.setBounds(298, 103, 97, 32);
		contentPane.add(sixbtn);
		
		
		sevenbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printIsXorZero(sevenbtn);
			}
			});
		
		sevenbtn.setBounds(36, 173, 97, 32);
		contentPane.add(sevenbtn);
		
		
		eightbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printIsXorZero(eightbtn);
			}
			});
		
		eightbtn.setBounds(168, 173, 97, 32);
		contentPane.add(eightbtn);
		
		
		ninebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printIsXorZero(ninebtn);
			}
			});
		
		ninebtn.setBounds(298, 173, 97, 32);
		contentPane.add(ninebtn);
	}
}
