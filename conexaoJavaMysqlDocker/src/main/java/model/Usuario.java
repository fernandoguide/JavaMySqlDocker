package model;

public class Usuario {

	private int codigo;
	private String nome;
	private String email;
	private String tipo;
	private String login;
	private String senha;

	
	public Usuario(){
		this(0,"","","","","");
	}
			
	public Usuario(int codigo, String nome, String email, String tipo, String login, String senha) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.email = tipo;
		this.login = login;
		this.senha = senha;		
	}


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
