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

public class AgendarViagem extends JFrame{

	private static final long serialVersionUID = 5989131292707356488L;
	
	private JFormattedTextField JFormattedTextFieldData = null;
	private JFormattedTextField JFormattedTextFieldHora = null;
//	private JTextField textCod = null;
//	private JTextField textEndereco = null;
//	private JTextField textQuantPass = null;
//	private JComboBox<String> StatusComboBox = null;
	
	private JPanel contentPane = null;
	
	public AgendarViagem(){
		this.setSize(470, 305);
		this.setTitle("Agendar Viagem");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setResizable(false);
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
		vazio.setText("                                                                         ");
		centerPanel.add(vazio);
		
		JLabel dataSaida = new JLabel();
		dataSaida.setText("Data Saída:");
		dataSaida.setBorder(new EmptyBorder(10, 0, 0, 0));
		centerPanel.add(dataSaida);
		
		JLabel dataRetorno = new JLabel();
		dataRetorno.setBorder(new EmptyBorder(10, 0, 0, 0));
		dataRetorno.setText("Data Retorno:");
		centerPanel.add(dataRetorno);
		
		
		JLabel hrSaida = new JLabel();
		hrSaida.setText("Hora Saída:");
		hrSaida.setBorder(new EmptyBorder(10, 12, 0, 0));
		centerPanel.add(hrSaida);
		
		JLabel hrRetorno = new JLabel();
		hrRetorno.setText("Hora Retorno:");
		hrRetorno.setBorder(new EmptyBorder(10, 12, 0, 0));
		centerPanel.add(hrRetorno);
		
		JFormattedTextFieldData = new JFormattedTextField();
		JFormattedTextFieldData.setColumns(8);
		try {
			MaskFormatter mascaraCpf = new MaskFormatter("##/##/####");
			mascaraCpf.setValidCharacters("1234567890");
			mascaraCpf.install(JFormattedTextFieldData);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	//	JFormattedTextFieldData.setBorder(new EmptyBorder(0,0 , 0, 100));
		centerPanel.add(JFormattedTextFieldData);
		
		JFormattedTextFieldData = new JFormattedTextField();
		JFormattedTextFieldData.setColumns(8);
		try {
			MaskFormatter mascaraCpf = new MaskFormatter("##/##/####");
			mascaraCpf.setValidCharacters("1234567890");
			mascaraCpf.install(JFormattedTextFieldData);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		centerPanel.add(JFormattedTextFieldData);
		
		JFormattedTextFieldHora = new JFormattedTextField();
		JFormattedTextFieldHora.setColumns(7);
		try {
			MaskFormatter mascaraCpf = new MaskFormatter(" ## : ## ");
			mascaraCpf.setValidCharacters("1234567890");
			mascaraCpf.install(JFormattedTextFieldHora);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		centerPanel.add(JFormattedTextFieldHora);
		
		JFormattedTextFieldHora = new JFormattedTextField();
		JFormattedTextFieldHora.setColumns(7);
		try {
			MaskFormatter mascaraCpf = new MaskFormatter(" ## : ## ");
			mascaraCpf.setValidCharacters("1234567890");
			mascaraCpf.install(JFormattedTextFieldHora);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		centerPanel.add(JFormattedTextFieldHora);
		
		JLabel enderecoViagem = new JLabel();
		enderecoViagem.setText("                       Endereço:");
		dataRetorno.setBorder(new EmptyBorder(10, 12, 0, 0));
		centerPanel.add(enderecoViagem);
		
		JLabel valorViagem = new JLabel();
		valorViagem.setText("                                     Valor Total:");
		valorViagem.setBorder(new EmptyBorder(10, 12, 0, 0));
		centerPanel.add(valorViagem);
						
		JTextField textEndereco = new JTextField();
		textEndereco.setColumns(23);
		centerPanel.add(textEndereco);
		
		JTextField textValorViagem = new JTextField();
		textValorViagem.setColumns(8);
		centerPanel.add(textValorViagem);
		
		JLabel quantPassViagem = new JLabel();
		quantPassViagem.setText("Quantidade Passageiro:");
		quantPassViagem.setBorder(new EmptyBorder(10, 0, 0, 20));
		centerPanel.add(quantPassViagem);				
			
		JLabel valorPassagem = new JLabel();
		valorPassagem.setText("          Valor Passagem: ");
		valorPassagem.setBorder(new EmptyBorder(10, 0, 0, 10));
		centerPanel.add(valorPassagem);
		
		JTextField textQuantPass = new JTextField();
		textQuantPass.setColumns(15);
		centerPanel.add(textQuantPass);
		
		JTextField textValorPass = new JTextField();
		textValorPass.setColumns(15);
		centerPanel.add(textValorPass);
		
		JLabel statusViagem = new JLabel();
		statusViagem.setText("                     Selecione o status da viagem:"
				+ "                      ");
		statusViagem.setBorder(new EmptyBorder(10, 0, 0, 0));
		statusViagem.setFont(new Font("Dialog", Font.CENTER_BASELINE, 14));
		centerPanel.add(statusViagem);
	
		
//		JComboBox<String> StatusComboBox = new JComboBox<>();
//		StatusComboBox.addItem("1 - Agendada");
//		StatusComboBox.addItem("2 - Realizada");
//		StatusComboBox.addItem("3 - Cancelada");
//		
//		StatusComboBox.setPreferredSize(new Dimension(115, 20));		
//		centerPanel.add(StatusComboBox);
		
		JRadioButton agendadaRadioButton = new JRadioButton("Agendada");
		agendadaRadioButton.setBackground(Color.lightGray);
		agendadaRadioButton.setSelected(false);
	    
	    JRadioButton canceladaRadioButton = new JRadioButton("Cancelada");
	    canceladaRadioButton.setBackground(Color.lightGray);
	    
	    JRadioButton realizadaRadioButton = new JRadioButton("Realizada");
	    realizadaRadioButton.setBackground(Color.lightGray);
	    
	    ButtonGroup group = new ButtonGroup();
	    group.add(agendadaRadioButton);
	    group.add(canceladaRadioButton);
	    group.add(realizadaRadioButton);
	    
	    centerPanel.add(agendadaRadioButton);
	    centerPanel.add(canceladaRadioButton);
	    centerPanel.add(realizadaRadioButton);
		
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
	
//	private void agendaViagem(){
//		int codViagem = Integer.valueOf(textCod.getText());
//		String endereco = String.valueOf(textEndereco.getText());
//		int quantPassageiro = Integer.valueOf(textQuantPass.getText());
//		String dataSaida = String.valueOf(JFormattedTextFieldData.getText());
//		String dataRetorno;
//		String horaSaida;
//		String horaRetorno;
//		int statusViagem = StatusComboBox;
//		float valorViagem;
//	}
	
	public static void main(String[] args){
		Frame.setlookAndFeel(Frame.ACRYL);
		AgendarViagem tela = new AgendarViagem();
		tela.setVisible(true);
	}

}
