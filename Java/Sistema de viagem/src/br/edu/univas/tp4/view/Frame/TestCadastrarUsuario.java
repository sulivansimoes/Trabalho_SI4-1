package br.edu.univas.tp4.view.Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.edu.univas.tp4.view.Util.Frame;

public class TestCadastrarUsuario extends JFrame{

	private static final long serialVersionUID = 9145320011213792372L;
	
	private JPanel contentPanel = null;
	
	public TestCadastrarUsuario(){
		this.setTitle("Test");
		this.setSize(500, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setContentPane();
		addComponents();
	}
	
	private void setContentPane() {
		contentPanel = new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		
		contentPanel.setLayout(gridBagLayout);
		this.setContentPane(contentPanel);
	}
	
	private void addComponents(){
		
//		JPanel panel = new JPanel();
//		panel.setLayout(new BorderLayout());
//		this.setContentPane();
//		
//		JPanel westPanel = new JPanel();
//		westPanel.setBackground(Color.lightGray);
//		westPanel.setPreferredSize(new Dimension(90, 0));
//		westPanel.setBorder(new EmptyBorder(20, 0, 0, 0));
//		contentPanel.add(westPanel, BorderLayout.WEST);
//		
//		JButton incluir = new JButton();
//		incluir.setText("Incluir");
//		incluir.setPreferredSize(new Dimension(70, 25));
//		westPanel.add(incluir);
//		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel nomeUsuario = new JLabel();
		nomeUsuario.setText("Nome do Usuário:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 15);
		contentPanel.add(nomeUsuario, gbc);
		
		JTextField textNome = new JTextField();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(15, 15, 10, 15);
		contentPanel.add(textNome, gbc);
		
		JLabel cpfUsuario = new JLabel();
		cpfUsuario.setText("CPF:");
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 15);
		contentPanel.add(cpfUsuario, gbc);
		
		JTextField textCPF = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(15, 0, 10, 15);
		contentPanel.add(textCPF, gbc);
		
	}
	
	public static void main(String[] args){
		Frame.setlookAndFeel(Frame.ACRYL);
		TestCadastrarUsuario tela = new TestCadastrarUsuario();
		tela.setVisible(true);
	}

}
