package com.carlos.Ejercicio02.Obligatorio;

public class Joke {
	
	private int id;
	private int id_languajes;
	private int id_categories;
	private int id_type;
	private String text1;
	private String text2;
	
	
	public Joke(int id, int id_languajes, int id_categories, int id_type, String text1, String text2) {
		super();
		this.id = id;
		this.id_languajes = id_languajes;
		this.id_categories = id_categories;
		this.id_type = id_type;
		this.text1 = text1;
		this.text2 = text2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_languajes() {
		return id_languajes;
	}
	public void setId_languajes(int id_languajes) {
		this.id_languajes = id_languajes;
	}
	public int getId_categories() {
		return id_categories;
	}
	public void setId_categories(int id_categories) {
		this.id_categories = id_categories;
	}
	public int getId_type() {
		return id_type;
	}
	public void setId_type(int id_type) {
		this.id_type = id_type;
	}
	public String getText1() {
		return text1;
	}
	public void setText1(String text1) {
		this.text1 = text1;
	}
	public String getText2() {
		return text2;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}
	

}
