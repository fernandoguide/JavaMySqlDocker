package view;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import persistencia.UsuarioBD;
import model.Usuario;
/*
 * Classe da tela de cadastro de usu�rios 
 */

public class CadastroUsuario extends JFrame {

	// Instanciacao dos objetos utilizados para manipulacao de dados
	
	// Objeto usr do tipo Usuario para armazenar os dados lidos da tela
	Usuario usr = new Usuario();
	
	// Objeto usrBD do tipo UsuarioBD para persistencia no banco
	UsuarioBD usrBD = new UsuarioBD();
	
	
	/*
	 * Construcao do formulario e dos componentes nele inseridos
	 */
	
	// Declaracao dos componentes swing utilizados no formulario
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel lblNome = null;
	private JLabel lblSenha = null;
	private JTextField txtNome = null;
	private JTextField txtEmail = null;
	private JButton cmdIncluir = null;
	private JButton cmdAlterar = null;
	private JButton cmdExcluir = null;
	private JButton cmdSair = null;
	private JButton cmdConsultar = null;
	private JLabel lblEmail = null;
	private JLabel lblLogin = null;
	private JTextField txtLogin = null;
	private JTextField txtSenha = null;
	private JLabel lblTipo = null;
	private JButton cmdTeste = null;
	private JButton cmdPesquisar = null;
	private JTextField txtCodigo = null;
	private JLabel lblCodigo = null;
	private JComboBox cmbTipo = null;
	
	
	// *** Construtores
	
	// Criacao da tela
	public CadastroUsuario() {
		super();
		initialize();
		setLocationRelativeTo(null);
	}

	// Inicializacao do JContentPane (que eh o formulario propriamente dito)
	private void initialize() {
		this.setSize(364, 342);
		this.setContentPane(getJContentPane());
		this.setTitle("Manutencao de usuarios");
	}

	// Montagem do JContentPane (insercao dos componentes na tela)
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lblCodigo = new JLabel();
			lblCodigo.setBounds(new Rectangle(10, 10, 50, 15));
			lblCodigo.setName("lblCodigo");
			lblCodigo.setText("Codigo:");
			lblTipo = new JLabel();
			lblTipo.setBounds(new Rectangle(10, 130, 45, 15));
			lblTipo.setText("Tipo:");
			lblTipo.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			lblTipo.setName("lblTipo");
			lblLogin = new JLabel();
			lblLogin.setBounds(new Rectangle(10, 170, 45, 15));
			lblLogin.setText("Login:");
			lblLogin.setName("lblLogin");
			lblEmail = new JLabel();
			lblEmail.setBounds(new Rectangle(10, 90, 45, 15));
			lblEmail.setText("Email:");
			lblEmail.setName("lblEmail");
			lblSenha = new JLabel();
			lblSenha.setBounds(new Rectangle(10, 210, 45, 15));
			lblSenha.setName("lblSenha");
			lblSenha.setText("Senha:");
			lblNome = new JLabel();
			lblNome.setBounds(new Rectangle(10, 50, 45, 15));
			lblNome.setName("lblNome");
			lblNome.setText("Nome:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(lblNome, null);
			jContentPane.add(lblSenha, null);
			jContentPane.add(getTxtNome(), null);
			jContentPane.add(getTxtEmail(), null);
			jContentPane.add(getCmdIncluir(), null);
			jContentPane.add(getCmdAlterar(), null);
			jContentPane.add(getCmdExcluir(), null);
			jContentPane.add(getCmdSair(), null);
			jContentPane.add(getCmdConsultar(), null);
			jContentPane.add(lblEmail, null);
			jContentPane.add(lblLogin, null);
			jContentPane.add(getTxtLogin(), null);
			jContentPane.add(getTxtSenha(), null);
			jContentPane.add(lblTipo, null);
			jContentPane.add(getCmdTeste(), null);
			jContentPane.add(getCmdPesquisar(), null);
			jContentPane.add(getTxtCodigo(), null);
			jContentPane.add(lblCodigo, null);
			jContentPane.add(getCmbTipo(), null);
		}
		return jContentPane;
	}

	
	// *** Metodos de criacao e definicoes basicas dos componentes utilizados no formulario
	
	
	// JTextFileds e JComboBox 
	
	// Codigo
	private JTextField getTxtCodigo() {
		if (txtCodigo == null) {
		txtCodigo = new JTextField();
			txtCodigo.setBounds(new Rectangle(70, 10, 100, 22));
			txtCodigo.setName("txtCodigo");
			txtCodigo.setText("");
		}
		return txtCodigo;
	}

	// Nome
	private JTextField getTxtNome() {
		if (txtNome == null) {
			txtNome = new JTextField();
			txtNome.setBounds(new Rectangle(70, 50, 270, 22));
			txtNome.setName("txtNome");
		}
		return txtNome;
	}

	// Email
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setBounds(new Rectangle(70, 90, 270, 22));
			txtEmail.setName("txtEmail");
		}
		return txtEmail;
	}

	// Tipo
	private JComboBox getCmbTipo() {
		if (cmbTipo == null) {
			cmbTipo = new JComboBox();
			cmbTipo.setBounds(new Rectangle(70, 130, 150, 22));
			cmbTipo.setName("cmbTipo");
			cmbTipo.addItem("administrador");
			cmbTipo.addItem("usuario");
		}
		return cmbTipo;
	}	
	
	// Login
	private JTextField getTxtLogin() {
		if (txtLogin == null) {
			txtLogin = new JTextField();
			txtLogin.setBounds(new Rectangle(70, 170, 270, 22));
			txtLogin.setName("txtLogin");
		}
		return txtLogin;
	}

	// Senha
	private JTextField getTxtSenha() {
		if (txtSenha == null) {
			txtSenha = new JTextField();
			txtSenha.setBounds(new Rectangle(70, 210, 270, 22));
			txtSenha.setName("txtSenha");
		}
		return txtSenha;
	}
	
	
	
	// JButtons

	// *** Definicao das prorpiedades dos botoes e chamada dos eventos 
	

	// Pesquisar
	private JButton getCmdPesquisar() {
		if (cmdPesquisar == null) {
			cmdPesquisar = new JButton();
			cmdPesquisar.setBounds(new Rectangle(240, 10, 100, 25));
			cmdPesquisar.setText("Pesquisar");
			cmdPesquisar.setName("Pesquisar");
			cmdPesquisar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				
					// Instancia um objeto usuPesquisa para receber o retorno (um objeto Usuario)
					// do metodo pesquisar de p
					Usuario usrPesquisa = new Usuario();
					
					// Le o codigo do formulario e armazena no obeto u 
					usr.setCodigo(Integer.parseInt(txtCodigo.getText()));
					
					// Passa o objeto usr por parametro para o metodo Pesquisar do objeto usrBD (UsuarioBD)
					// que por sua vez retorna o objeto populado com os dados do usuario pesquisado
					usrPesquisa = usrBD.Pesquisar(usr);
				
					// Carrega o formulario com os dados do usuario pesquisado
					txtNome.setText(usrPesquisa.getNome());
					txtEmail.setText(usrPesquisa.getEmail());
					if (usrPesquisa.getTipo().equals("administrador")){
						cmbTipo.setSelectedIndex(0);
					}else{
						cmbTipo.setSelectedIndex(1);
					}
					txtLogin.setText(usrPesquisa.getLogin());
					txtSenha.setText(usrPesquisa.getSenha());
				}
			});				
		}
		return cmdPesquisar;
	}

	
	// Incluir	
	private JButton getCmdIncluir() {
		if (cmdIncluir == null) {
			cmdIncluir = new JButton();
			cmdIncluir.setBounds(new Rectangle(10, 240, 100, 25));
			cmdIncluir.setName("cmdIncluir");
			cmdIncluir.setText("Incluir");
			cmdIncluir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

					// Le os campos do formulario e carrega o objeto u
					usr.setNome(txtNome.getText());
					usr.setEmail(txtEmail.getText());
					usr.setTipo(cmbTipo.getSelectedItem().toString());
					usr.setLogin(txtLogin.getText());
					usr.setSenha(txtSenha.getText());
					
					// Passa o objeto usr por parametro para o metodo Incluir 
					// do objeto usrBD (usuarioBD)
					usrBD.Incluir(usr);
					
					JOptionPane.showMessageDialog(null, "Inclus�o realizada com sucesso!", 
							              "Confirmação", JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return cmdIncluir;
	}

	
	// Alterar
	private JButton getCmdAlterar() {
		if (cmdAlterar == null) {
			cmdAlterar = new JButton();
			cmdAlterar.setBounds(new Rectangle(125, 240, 100, 25));
			cmdAlterar.setName("cmdAlterar");
			cmdAlterar.setText("Alterar");
			cmdAlterar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

					// Le os campos do formulario e carrega o objeto usr
					// Na alteracao os campos sao preenchidos atraves do botao Pesquisar
					usr.setNome(txtNome.getText());
					usr.setEmail(txtEmail.getText());
					usr.setTipo(cmbTipo.getSelectedItem().toString());
					usr.setLogin(txtLogin.getText());
					usr.setSenha(txtSenha.getText());
					
					// Passa o objeto usr por parametro para o metodo Alterar do 
					// objeto usrBD (usuarioBD)
					usrBD.Alterar(usr);
					
					JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!",
							               "Confirmação", JOptionPane.INFORMATION_MESSAGE);
				}
			});	
		}
		return cmdAlterar;
	}

	// Excluir
	private JButton getCmdExcluir() {
		if (cmdExcluir == null) {
			cmdExcluir = new JButton();
			cmdExcluir.setBounds(new Rectangle(240, 240, 100, 25));
			cmdExcluir.setName("cmdExcluir");
			cmdExcluir.setText("Excluir");
			cmdExcluir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
			
					// Le o codigo do registro a ser excluido no formulario 
					// e carrega o objeto u
					usr.setCodigo(Integer.parseInt(txtCodigo.getText()));
					
					// Passa o objeto usr por parametro para o metodo Excluir do 
					// objeto usrBD (usuarioBD)
					usrBD.Excluir(usr);
						
					JOptionPane.showMessageDialog(null, "Exclus�o realizada com sucesso!", 
							              "Confirmação", JOptionPane.INFORMATION_MESSAGE);
				}
			});	
			
		}
		return cmdExcluir;
	}

	// Consultar
	private JButton getCmdConsultar() {
		if (cmdConsultar == null) {
			cmdConsultar = new JButton();
			cmdConsultar.setBounds(new Rectangle(10, 275, 100, 25));
			cmdConsultar.setText("Consultar");
			cmdConsultar.setName("cmdConsultar");
			cmdConsultar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					// Chama o metodo Consultar do objeto usrBD (UsuarioBD)
					usrBD.Consultar();
				
				}
			});				
		}
		return cmdConsultar;
	}

	// Conexao
	private JButton getCmdTeste() {
		if (cmdTeste == null) {
			cmdTeste = new JButton();
			cmdTeste.setBounds(new Rectangle(125, 275, 100, 25));
			cmdTeste.setText("Conexao");
			cmdTeste.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				
					// Chama o metodo TestaConexao do objeto usrBD e apresenta mensagens de acordo com o retorno
					if(usrBD.testaConexao()){
						JOptionPane.showMessageDialog(null, "Conexao com banco de dados realizada com sucesso!", 
								                                "Confirmação", JOptionPane.INFORMATION_MESSAGE);					
					}else{
						JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados!", "Confirmação", 
								                                                         JOptionPane.ERROR_MESSAGE);						
					}
				}
			});				
		}
		return cmdTeste;
	}

	// Sair
	private JButton getCmdSair() {
		if (cmdSair == null) {
			cmdSair = new JButton();
			cmdSair.setBounds(new Rectangle(240, 275, 100, 25));
			cmdSair.setName("cmdSair");
			cmdSair.setText("Sair");
			cmdSair.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					// Finaliza a aplicacao
					System.exit(0);
				
				}
			});				
		}
		return cmdSair;
	}
	
}
