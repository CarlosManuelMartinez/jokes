package com.carlos.Ejercicio02.Obligatorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Utilidades {
	
	
	public void Cargar(String password) {
		System.out.println("PERSONAS" + "\t" + "EMAIL");
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url = "jdbc:postgresql://localhost:5433/jokes";
			String usuario = "postgres";
			Connection con = null;
			try {
				con = DriverManager.getConnection(url, usuario, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String sentenciaSQLString = "SELECT * FROM categories";
			Statement statement = null;
			try {
				statement = con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ResultSet resultados = null;
			try {
				resultados = statement.executeQuery(sentenciaSQLString);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				System.out.println("PERSONAS" + "\t" + "EMAIL");
			try {
				while (resultados.next()) {
					 
					 System.out.println(resultados.getInt(1) + "\t " + resultados.getString(2));
					 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				 try {
					resultados.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			
	
		}
}
