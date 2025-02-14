package br.com.JAC.interfc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Font;
import java.awt.Button;
import java.awt.FlowLayout;

public class interfac3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCadastroDePeas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfac3 frame = new interfac3();
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
	public interfac3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 262);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().setLayout(null);
		setContentPane(contentPane);
		
	
		JButton btnNewButton1 = new JButton("Turma");
		btnNewButton1.setBounds(220, 134, 103, 25);
		btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton1);
		
		txtCadastroDePeas = new JTextField();
		txtCadastroDePeas.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtCadastroDePeas.setText("cadastro de peças JAC");
		txtCadastroDePeas.setBounds(180, 10, 219, 40);
		contentPane.add(txtCadastroDePeas);
		txtCadastroDePeas.setColumns(10);
		
		
		JButton btnNewButton_1 = new JButton("Diretor");
		btnNewButton_1.setBounds(333, 134, 111, 25);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Orientador");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(107, 136, 103, 21);
		contentPane.add(btnNewButton);
	}

	public JPanel getContentPane() {
		return contentPane;
	}
}
