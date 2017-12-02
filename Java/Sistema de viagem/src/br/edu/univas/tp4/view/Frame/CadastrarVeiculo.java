package br.edu.univas.tp4.view.Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.edu.univas.tp4.view.Util.Frame;

public class CadastrarVeiculo extends Frame {

	private static final long serialVersionUID = 2290132802087387747L;
	
	private JPanel contentPane = null;
	
	
	public CadastrarVeiculo(){
		this.setSize(380, 305);
		this.setTitle("Cadastro de Veículo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	//	setResizable(false);
		addComponents();
	}
	
	public void addComponents(){		
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
		
		JLabel vazio = new JLabel();
		vazio.setText("                                                   ");
		centerPanel.add(vazio);
		
		JLabel placaVeiculo = new JLabel();
		placaVeiculo.setBorder(new EmptyBorder(10, 10, 0, 10));
		placaVeiculo.setText("   Placa: ");
		//placaVeiculo.setFont(new Font("Dialog", Font.PLAIN, 14));
		centerPanel.add(placaVeiculo);
		
		JLabel ufVeiculo = new JLabel();
		ufVeiculo.setBorder(new EmptyBorder(10, 10, 0, 10));
		ufVeiculo.setText("                          UF: ");
		centerPanel.add(ufVeiculo);			
				
		JTextField textPlaca = new JTextField();
		textPlaca.setColumns(12);
		centerPanel.add(textPlaca);
		
		JTextField textUF = new JTextField();
		textUF.setColumns(12);
		centerPanel.add(textUF);
		
		JLabel anoVeiculo = new JLabel();
		anoVeiculo.setBorder(new EmptyBorder(10, 0, 0, 10));
		anoVeiculo.setText("  Ano: ");
		centerPanel.add(anoVeiculo);
		
		JLabel marcaVeiculo = new JLabel();
		marcaVeiculo.setBorder(new EmptyBorder(10, 10, 0, 10));
		marcaVeiculo.setText("                              Marca: ");
		centerPanel.add(marcaVeiculo);
		
		JTextField textAno = new JTextField();
		textAno.setColumns(12);
		centerPanel.add(textAno);
		
		JTextField textMarca = new JTextField();
		textMarca.setColumns(12);
		centerPanel.add(textMarca);
				
		JLabel quantPassVeiculo = new JLabel();
		quantPassVeiculo.setBorder(new EmptyBorder(10, 0, 0, 10));
		quantPassVeiculo.setText("                                                         Quantidade de Passageiros: "
				+ "                                                       ");
		centerPanel.add(quantPassVeiculo);
					
		JTextField textPassageiro = new JTextField();
		textPassageiro.setColumns(24);
		centerPanel.add(textPassageiro);
		
		JLabel tipoCombVeiculo = new JLabel();
		tipoCombVeiculo.setBorder(new EmptyBorder(10, 10, 0, 10));
		tipoCombVeiculo.setText("                       Selecione o tipo de combustível: "
				+ "                     ");
		tipoCombVeiculo.setFont(new Font("Dialog", Font.CENTER_BASELINE, 14));
		centerPanel.add(tipoCombVeiculo);
		
		JRadioButton diselRadioButton = new JRadioButton("Disel");
		diselRadioButton.setBackground(Color.lightGray);
		diselRadioButton.setSelected(false);
	    
	    JRadioButton etanolRadioButton = new JRadioButton("Etanol");
	    etanolRadioButton.setBackground(Color.lightGray);
	    
	    JRadioButton gasolinaRadioButton = new JRadioButton("Gasolina");
	    gasolinaRadioButton.setBackground(Color.lightGray);

	    ButtonGroup group = new ButtonGroup();
	    group.add(diselRadioButton);
	    group.add(etanolRadioButton);
	    group.add(gasolinaRadioButton);
	    
	    centerPanel.add(diselRadioButton);
	    centerPanel.add(etanolRadioButton);
	    centerPanel.add(gasolinaRadioButton);
		
//		JLabel labelPeriodOfTheDay = new JLabel();
//		labelPeriodOfTheDay.setText("Selecione um período: ");
//		centerPanel.add(labelPeriodOfTheDay);
		
//		JComboBox<String> courseComboBox = new JComboBox<>();
//		courseComboBox.addItem("1 - Gasolina");
//		courseComboBox.addItem("2 - Etanol");
//		courseComboBox.addItem("3 - Disel");
//		
//		courseComboBox.setPreferredSize(new Dimension(130, 20));		
//		centerPanel.add(courseComboBox);
		
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
	
//	private void cadastraVeiculo(){
//		 int codVeiculo = 
//		 String placa;
//		 String marca;
//		 String uf;
//		 int ano;
//		 int tipoComb;
//		 int quantPassageiro;
//	}
	
	public static void main(String[] args){
		Frame.setlookAndFeel(Frame.ACRYL);
		CadastrarVeiculo tela = new CadastrarVeiculo();
		tela.setVisible(true);
	}

}
