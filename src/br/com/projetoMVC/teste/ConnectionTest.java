package br.com.projetoMVC.teste;

import java.sql.Connection;

import br.com.projetoMVC.util.ConnectionFactory;

public class ConnectionTest {

	public static void main(String[] args) {

		try {
			Connection conn = ConnectionFactory.getConnection();
			
			if (conn != null) {
				System.out.println("Conexão foi estabelecida");
			} else {
				System.out.println("Houve algum problema ao conectar");
			}
			
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
