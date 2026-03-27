import  javax.swing.*;
import  java.awt.*;
import  java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{  // This is class for important tehhdd
	JTextField campo;
	double num1,num2 , result;
	String operator;
	
	public  Calculator() {
		setTitle("Calculator");                                   //Design for Size of the screen
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		campo = new JTextField();                                // Design for Write text type of letter  and  fonts
		campo.setFont(new Font("Arial",Font.BOLD,20));
		campo.setHorizontalAlignment(JTextField.RIGHT);
		add(campo,BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4 ,4 ,5,5));           // Design for Buttons  for the calculator
		
		String[] buttons = {
				"7","8","9","/",
				"4","5","6","*",
				"1","2","3","-",
				"0","C","=","+"
				
		};
		for (String text: buttons) {
			JButton btn = new JButton(text);
			btn.setFont(new Font("Times new Roman",Font.BOLD,18));
			btn.addActionListener(this);
			panel.add(btn);
		}
		add(panel,BorderLayout.CENTER);
		
	}
	public void actionPerformed(ActionEvent e) {       //Create different conditions for each operation 
		String comando = e.getActionCommand();
		
		if(comando.matches("[0-9]")) {
			campo.setText(campo.getText()+comando);
		}
		else if(comando.matches("[+\\-*/]")) {
			num1 = Double.parseDouble(campo.getText());
			operator = comando;
			campo.setText("");
		}
		else if (comando.equals("=")) {
			num2 = Double.parseDouble(campo.getText());   // Other Conditions about different conditions
			
			switch (operator) {
			    case "+": result = num1 + num2 ; break;
			    case "-": result = num1 + num2 ; break;
			    case "*": result = num1 + num2 ; break;
			    case "/": result = num1 + num2 ; break;
			
				
			}
			campo.setText(String.valueOf(result));
		}
		else if (comando.equals("C")) {
			campo.setText("");
		}
	}
	public static void main(String[]args) {
		Calculator calc = new Calculator();
		calc.setVisible(true);
		
	}
	
}