package controller;

import view.CadastroUsuario;

public class Principal {

	public static void main(String[] args) {

		java.awt.EventQueue.invokeLater(new Runnable(){
			public void run() {
				new CadastroUsuario().setVisible(true);
			}
		});


	}

}
