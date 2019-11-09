package com.arpit.App;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.color.ColorSpace;

import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Stack;

import javax.swing.event.CaretListener;

import com.arpit.Util.Tree;

import javax.swing.event.CaretEvent;

public class WindowFile extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_plus;
	private JButton btn_minus;
	private JButton btn_product;
	private JButton btn_divide;
	private JButton btn_backspace;
	private JButton btn_equalto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowFile frame = new WindowFile();
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
	public WindowFile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 307, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				if(textField.getText().toString().length()>12) {
				WindowIt ot = new WindowIt("Dont add more words for god sake!!");
				}
			}
		});

		contentPane.add(textField);
		textField.setColumns(25);
		

		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 3,5,5));
		
		btn_1 = new JButton("1");
		btn_1.setPreferredSize(new Dimension(70,35));
		panel.add(btn_1);
		
		btn_2 = new JButton("2");
		btn_2.setPreferredSize(new Dimension(70,35));
		panel.add(btn_2);
		
		btn_3 = new JButton("3");
		btn_3.setPreferredSize(new Dimension(70,35));
		panel.add(btn_3);
		
		btn_4 = new JButton("4");
		btn_4.setPreferredSize(new Dimension(70,35));
		panel.add(btn_4);
		

		
		btn_5 = new JButton("5");
		btn_5.setPreferredSize(new Dimension(70,35));
		panel.add(btn_5);
		
		btn_6 = new JButton("6");
		btn_6.setPreferredSize(new Dimension(70,35));
		panel.add(btn_6);
		
		btn_7 = new JButton("7");
		btn_7.setPreferredSize(new Dimension(70,35));
		panel.add(btn_7);
		
		btn_8 = new JButton("8");
		btn_8.setPreferredSize(new Dimension(70,35));
		panel.add(btn_8);
		
		btn_9 = new JButton("9");
		btn_9.setPreferredSize(new Dimension(70,35));
		panel.add(btn_9);
		
		btn_plus = new JButton("+");
		btn_plus.setPreferredSize(new Dimension(70,35));
		panel.add(btn_plus);
		
		btn_minus = new JButton("-");
		btn_minus.setPreferredSize(new Dimension(70,35));
		panel.add(btn_minus);
		
		btn_product = new JButton("*");
		btn_product.setPreferredSize(new Dimension(70,35));
		panel.add(btn_product);
		
		btn_divide = new JButton("/");
		btn_divide.setPreferredSize(new Dimension(70,35));
		panel.add(btn_divide);
		
		btn_backspace = new JButton("<-");
		btn_backspace.setPreferredSize(new Dimension(70,35));
		panel.add(btn_backspace);
		
		btn_equalto = new JButton("=");
		btn_equalto.setPreferredSize(new Dimension(70,35));
		panel.add(btn_equalto);
		
		btn_1.addActionListener(this);
		btn_2.addActionListener(this);
		btn_3.addActionListener(this);
		btn_4.addActionListener(this);
		btn_5.addActionListener(this);
		btn_6.addActionListener(this);
		btn_7.addActionListener(this);
		btn_8.addActionListener(this);
		btn_9.addActionListener(this);
		btn_plus.addActionListener(this);
		btn_minus.addActionListener(this);
		btn_product.addActionListener(this);
		btn_divide.addActionListener(this);
		btn_backspace.addActionListener(this);
		btn_equalto.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn_1) {
			String temp = textField.getText().toString()+"1";
			textField.setText(temp);
		}
		if(e.getSource()==btn_2) {
			String temp = textField.getText().toString()+"2";
			textField.setText(temp);
		}
		if(e.getSource()==btn_3) {
			String temp = textField.getText().toString()+"3";
			textField.setText(temp);
		}
		if(e.getSource()==btn_4) {
			String temp = textField.getText().toString()+"4";
			textField.setText(temp);
		}
		if(e.getSource()==btn_5) {
			String temp = textField.getText().toString()+"5";
			textField.setText(temp);
		}
		if(e.getSource()==btn_6) {
			String temp = textField.getText().toString()+"6";
			textField.setText(temp);
		}
		if(e.getSource()==btn_7) {
			String temp = textField.getText().toString()+"7";
			textField.setText(temp);
		}
		if(e.getSource()==btn_8) {
			String temp = textField.getText().toString()+"8";
			textField.setText(temp);
		}
		if(e.getSource()==btn_9) {
			String temp = textField.getText().toString()+"9";
			textField.setText(temp);
		}
		if(e.getSource()==btn_plus) {
			String temp = textField.getText().toString()+"+";
			textField.setText(temp);
		}
		if(e.getSource()==btn_minus) {
			String temp = textField.getText().toString()+"-";
			textField.setText(temp);
		}
		if(e.getSource()==btn_product) {
			String temp = textField.getText().toString()+"*";
			textField.setText(temp);
		}
		if(e.getSource()==btn_divide) {
			String temp = textField.getText().toString()+"/";
			textField.setText(temp);
		}
		if(e.getSource()==btn_backspace) {
			String temp = textField.getText().toString();
			temp = temp.substring(0, temp.length()-1);
			textField.setText(temp);
		}
		if(e.getSource()==btn_equalto) {
			Tree t = new Tree();
			String temp = textField.getText().toString();
			char[] buff = temp.toCharArray();
			if(buff.length!=1||buff.length!=0) {
				int operand1=0;
				int operand2=0;
			for(int i = 0 ; i < buff.length; i++) {

				if(buff[i]>='0'&&buff[i]<='9') {
					operand1 = 10*operand1 + (buff[i]-48);
					
				}
				if(buff[i]=='+'||buff[i]=='-'||buff[i]=='*'||buff[i]=='/') {
					int l = i+1;
					if(l<buff.length) {
					while(buff[l]>='0'&&buff[l]<='9') {
						operand2 = operand2*10 + (buff[l]-48);
						l++;
						if(l>=buff.length) break;
					}
					}
					t.insert(buff[i],operand1,operand2 );
					operand1 = 0;
					operand2=0;
				}
			}
			}
			
			textField.setText(String.valueOf(t.evaluate()));
			
		}
		
		
	}

}
