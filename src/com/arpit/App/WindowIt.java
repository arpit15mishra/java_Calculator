package com.arpit.App;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class WindowIt extends JFrame {

	private JPanel contentPane;
	private String msg;


	public WindowIt(String msg) {
		this.msg = msg;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblWhyYouClicked = new JLabel(msg);
		contentPane.add(lblWhyYouClicked, BorderLayout.CENTER);
	}

}
