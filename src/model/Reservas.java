package model;

import java.util.ArrayList;

public class Reservas 
{
	int id;
	int numeroPessoas;
	
	ArrayList<Cliente> arClientes;
	ArrayList<Restaurante> arRestaurante;
	
	
	
	public Reservas(int numeroPessoas, ArrayList<Cliente> arClientes, ArrayList<Restaurante> arRestaurante) {
		super();
		this.numeroPessoas = numeroPessoas;
		this.arClientes = arClientes;
		this.arRestaurante = arRestaurante;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getNumeroPessoas() {
		return numeroPessoas;
	}
	public void setNumeroPessoas(int numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}
	public ArrayList<Cliente> getArClientes() {
		return arClientes;
	}
	public void setArClientes(ArrayList<Cliente> arClientes) {
		this.arClientes = arClientes;
	}
	public ArrayList<Restaurante> getArRestaurante() {
		return arRestaurante;
	}
	public void setArRestaurante(ArrayList<Restaurante> arRestaurante) {
		this.arRestaurante = arRestaurante;
	}
	
	

}


