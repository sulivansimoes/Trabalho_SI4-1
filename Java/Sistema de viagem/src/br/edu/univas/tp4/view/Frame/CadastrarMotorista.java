package br.edu.univas.tp4.view.Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.edu.univas.tp4.view.Util.Frame;

public class CadastrarMotorista extends JFrame {

	private static final long serialVersionUID = 6310151249155187434L;

	private JFormattedTextField JFormatTextFieldCpf = null;
	
	private JPanel contentPane = null;
	
	public CadastrarMotorista(){
		
		this.setSize(470, 305);
		this.setTitle("Cadastro de Motorista");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	//	setResizable(false);
		addComponents();
	}
	
	
	private void addComponents(){
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.LIGHT_GRAY);
		centerPanel.setPreferredSize(new Dimension(25, 0));
		contentPane.add(centerPanel, BorderLayout.CENTER);
		
		JLabel codVeiculo = new JLabel();
		codVeiculo.setText("Codigo:");
		centerPanel.add(codVeiculo);
				
		JTextField textCod = new JTextField();
		textCod.setColumns(4);
		centerPanel.add(textCod);
		
		JButton f2 = new JButton();
		f2.setText("F2");
		f2.setPreferredSize(new Dimension(26, 20));
		centerPanel.add(f2);
		


		
		JLabel nomeMotorista = new JLabel();
		nomeMotorista.setBorder(new EmptyBorder(10, 0, 0, 0));
		nomeMotorista.setText("                            Nome:");
		centerPanel.add(nomeMotorista);
		
		JLabel cpfMotorista = new JLabel();
		cpfMotorista.setBorder(new EmptyBorder(10, 0, 0, 0));
		cpfMotorista.setText("                                                CPF:");
		centerPanel.add(cpfMotorista);
		
		JTextField textNome = new JTextField();
		textNome.setColumns(24);
		centerPanel.add(textNome);
		
		JFormatTextFieldCpf =  new JFormattedTextField();
		JFormatTextFieldCpf.setColumns(8);
		try {
			MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
			mascaraCpf.setValidCharacters("1234567890");
			mascaraCpf.install(JFormatTextFieldCpf);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		centerPanel.add(JFormatTextFieldCpf);
		
		JLabel rgMotorista = new JLabel();
		rgMotorista.setBorder(new EmptyBorder(10, 0, 0, 0));
		rgMotorista.setText("                RG:");
		centerPanel.add(rgMotorista);
		
		JLabel cnhMotorista = new JLabel();
		cnhMotorista.setBorder(new EmptyBorder(10, 0, 0, 0));
		cnhMotorista.setText("                               CNH:");
		centerPanel.add(cnhMotorista);
		
		JLabel nascMotorista = new JLabel();
		nascMotorista.setBorder(new EmptyBorder(10, 0, 0, 0));
		nascMotorista.setText("                Data Nascimento:");
		centerPanel.add(nascMotorista);
		
		JTextField textRG = new JTextField();
		textRG.setColumns(11);
		centerPanel.add(textRG);
		
		JTextField textCNH = new JTextField();
		textCNH.setColumns(10);
		centerPanel.add(textCNH);
		
		JTextField textNascMotorista = new JTextField();
		textNascMotorista.setColumns(10);
		centerPanel.add(textNascMotorista);
		
		JLabel telefoneMotorista = new JLabel();
		telefoneMotorista.setBorder(new EmptyBorder(10, 0, 0, 0));
		telefoneMotorista.setText("    Telefone:");
		centerPanel.add(telefoneMotorista);
		
		JLabel enderecoMotorista = new JLabel();
		enderecoMotorista.setBorder(new EmptyBorder(10, 0, 0, 0));
		enderecoMotorista.setText("                                     Endereço:"
				+ "                                    ");
		centerPanel.add(enderecoMotorista);
		
		JTextField textTelefone = new JTextField();
		textTelefone.setColumns(9);
		centerPanel.add(textTelefone);
				
		JTextField textEndereco = new JTextField();
		textEndereco.setColumns(23);
		centerPanel.add(textEndereco);
		
		JLabel tipoCnhMotorista = new JLabel();
		tipoCnhMotorista.setText("                     Selecione a categoria da CNH:"
				+ "                      ");
		tipoCnhMotorista.setBorder(new EmptyBorder(10, 0, 0, 0));
		tipoCnhMotorista.setFont(new Font("Dialog", Font.CENTER_BASELINE, 14));
		centerPanel.add(tipoCnhMotorista);
		
		JRadioButton catARadioButton = new JRadioButton("A");
		catARadioButton.setBackground(Color.lightGray);
		catARadioButton.setSelected(false);
	    
	    JRadioButton catBRadioButton = new JRadioButton("B");
	    catBRadioButton.setBackground(Color.lightGray);
	    
	    JRadioButton catCRadioButton = new JRadioButton("C");
	    catCRadioButton.setBackground(Color.lightGray);
	    
	    JRadioButton catDRadioButton = new JRadioButton("D");
	    catDRadioButton.setBackground(Color.lightGray);
	    
	    JRadioButton catERadioButton = new JRadioButton("E");
	    catERadioButton.setBackground(Color.lightGray);

	    ButtonGroup group = new ButtonGroup();
	    group.add(catARadioButton);
	    group.add(catBRadioButton);
	    group.add(catCRadioButton);
	    group.add(catDRadioButton);
	    group.add(catERadioButton);
	    
	    centerPanel.add(catARadioButton);
	    centerPanel.add(catBRadioButton);
	    centerPanel.add(catCRadioButton);
	    centerPanel.add(catDRadioButton);
	    centerPanel.add(catERadioButton);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.DARK_GRAY);
		westPanel.setPreferredSize(new Dimension(80,0));
		westPanel.setBorder(new EmptyBorder(50, 0, 0, 0));
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton incluir = new JButton();
		incluir.setText("Incluir");
		incluir.setPreferredSize(new Dimension(70, 25));
		westPanel.add(incluir);
		
		JButton alterar = new JButton();
		alterar.setText("Alterar");
		alterar.setPreferredSize(new Dimension(70, 25));
		westPanel.add(alterar);
		
		JButton excluir = new JButton();
		excluir.setText("Excluir");
		excluir.setPreferredSize(new Dimension(70, 25));
		westPanel.add(excluir);
		
		JButton gravar = new JButton();
		gravar.setText("Gravar");
		gravar.setPreferredSize(new Dimension(70, 25));
		westPanel.add(gravar);
		
		JButton cancelar = new JButton();
		cancelar.setText("Cancelar");
		cancelar.setPreferredSize(new Dimension(70, 25));
		westPanel.add(cancelar);
		
	}
	
	public static void main(String[] args){
		Frame.setlookAndFeel(Frame.ACRYL);
		CadastrarMotorista tela = new CadastrarMotorista();
		tela.setVisible(true);
	}

}
