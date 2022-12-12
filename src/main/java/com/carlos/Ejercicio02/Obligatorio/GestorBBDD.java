package com.carlos.Ejercicio02.Obligatorio;

import java.sql.SQLException;

public class GestorBBDD {
	
	public  String password = "carla2015";
	
	public void Iniciar()  {
		
		Utilidades utilidades = new Utilidades();
		utilidades.Cargar(password);
		//System.out.println("PERSONAS" + "\t" + "EMAIL");
	}

}
