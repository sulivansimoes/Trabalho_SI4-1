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
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.edu.univas.tp4.view.Util.Frame;

public class CadastrarUsuario  extends JFrame{

	private static final long serialVersionUID = 1987604675648829199L;
	
	private JPanel contentPane = null;
	//Declarações no corpo da classe
	JTextField textCod =  new JTextField();
	JTextField textUsuario = new JTextField();
	JTextField textCPF = new JTextField();
	JTextField textLogin = new JTextField();
	JPasswordField textSenha = new JPasswordField();
	JPasswordField textSenhaComfirma = new JPasswordField();
	JRadioButton admRadioButton = new JRadioButton();
	JRadioButton gerenciaRadioButton = new JRadioButton();
	JRadioButton usuarioRadioButton = new JRadioButton();
	//Fim declarações
	
	public CadastrarUsuario(){		
		this.setSize(470, 305);
		this.setTitle("Cadastro de Usuário");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setResizable(false);
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
		
		textCod.setColumns(4);
		centerPanel.add(textCod);
		
		JButton f2 = new JButton();
		f2.setText("F2");
		f2.setPreferredSize(new Dimension(26, 20));
		centerPanel.add(f2);
		
		JLabel vazio = new JLabel();
		vazio.setText("                                                                         ");
		centerPanel.add(vazio);
		
		JLabel nomeUsuario = new JLabel();
		nomeUsuario.setBorder(new EmptyBorder(10, 0, 0, 0));
		nomeUsuario.setText("Nome do Usuário:  ");
		centerPanel.add(nomeUsuario);
		
		textUsuario.setColumns(33);
		centerPanel.add(textUsuario);
		
		JLabel cpfUsuario = new JLabel();
		cpfUsuario.setBorder(new EmptyBorder(10, 0, 0, 0));
		cpfUsuario.setText("     CPF:");
		centerPanel.add(cpfUsuario);
		
		JLabel loginUsuario = new JLabel();
		loginUsuario.setBorder(new EmptyBorder(10, 0, 0, 0));
		loginUsuario.setText("                                                             Login:  ");
		centerPanel.add(loginUsuario);
						
		textCPF.setColumns(16);
		centerPanel.add(textCPF);
		
		textLogin.setColumns(16);
		centerPanel.add(textLogin);
		
		JLabel senhaUsuario = new JLabel();
		senhaUsuario.setBorder(new EmptyBorder(10, 0, 0, 0));
		senhaUsuario.setText("      Senha:  ");
		centerPanel.add(senhaUsuario);
		
		JLabel senhaConfirmaUsuario = new JLabel();
		senhaConfirmaUsuario.setBorder(new EmptyBorder(10, 0, 0, 0));
		senhaConfirmaUsuario.setText("                                                    Confirmar Senha:  ");
		centerPanel.add(senhaConfirmaUsuario);
		
		textSenha.setColumns(16);
		centerPanel.add(textSenha);
		
		textSenhaComfirma.setColumns(16);
		centerPanel.add(textSenhaComfirma);
		
		JLabel acessoUsuario = new JLabel();
		acessoUsuario.setBorder(new EmptyBorder(10, 0, 0, 0));
		acessoUsuario.setText("                            Selecione o perfil de acesso:"
				+ "                                    ");
		acessoUsuario.setFont(new Font("Dialog", Font.CENTER_BASELINE, 14));
		centerPanel.add(acessoUsuario);
		
		admRarioButton.setText("Administrador");
		admRadioButton.setBackground(Color.lightGray);
		admRadioButton.setSelected(false);
	    
	    gerenciaRadioButton.setText("Gerência");
	    gerenciaRadioButton.setBackground(Color.lightGray);
	    
	    usuarioRadioButton.setText("Usuário");
	    usuarioRadioButton.setBackground(Color.lightGray);
	    
	    ButtonGroup group = new ButtonGroup();
	    group.add(admRadioButton);
	    group.add(gerenciaRadioButton);
	    group.add(usuarioRadioButton);
	    
	    centerPanel.add(admRadioButton);
	    centerPanel.add(gerenciaRadioButton);
	    centerPanel.add(usuarioRadioButton);
		
//		JComboBox<String> courseComboBox = new JComboBox<>();
//		courseComboBox.addItem("Administrador");
//		courseComboBox.addItem("Gerência");
//		courseComboBox.addItem("Usuário");
//		
//		courseComboBox.setPreferredSize(new Dimension(400, 30));		
//		centerPanel.add(courseComboBox);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.DARK_GRAY);
		westPanel.setPreferredSize(new Dimension(80,0));
		westPanel.setBorder(new EmptyBorder(40, 0, 0, 0));
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton incluir = new JButton();
		incluir.setText("Incluir");
		incluir.setPreferredSize(new Dimension(70, 25));
		westPanel.add(incluir);
		
		JButton alterar = new JButton();
		alterar.setText("Alterar");
		alterar.setPreferredSize(new Dimension(70, 25));
	//	alterar.setBorder(new EmptyBorder(0, 0, 0, 0));
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
	
	private void cadastraUsuario(){
		//Extraindo informações dos campos
		int codUsuario = Integer.valueOf(textCod.getText()); //Transformando String em Int
		String nome = textUsuario.getText();
		int cpf = Integer.valueOf(textCPF.getText()) ; //Transformando String em Int
		String senha = new String(textSenha.getPassword()) ; //Transformando password em String
		
		//Montando TO
		CadastrarUsuarioTO usuario = new CadastrarUsuarioTO(codUsuario, nome, cpf, senha);

		//Inserindo usuario no banco de dados - Sem uso de controller.
		CadastrarUsuarioDAO dao = new CadastrarUsuarioDAO();
		dao.insertNewCadastrarUsuario(usuario); //Enviando to para o banco de dados.
	}
	
	public static void main(String[] args){
		Frame.setlookAndFeel(Frame.ACRYL);
		CadastrarUsuario tela = new CadastrarUsuario();
		tela.setVisible(true);
	}
}
