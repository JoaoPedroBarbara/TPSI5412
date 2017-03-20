package controller;

import java.util.ArrayList;

import model.Cliente;

public class GereCliente 
{
	public ArrayList<Cliente> arClientes;
	
	

	public GereCliente() 
	{
		this.arClientes = new ArrayList<Cliente>();
	}
	
	public void addCliente(String nome, String morada, String email, String telefone)
	{
		Cliente c = new Cliente(nome, morada, email, telefone);
		
		int novoID = arClientes.size();
		
		c.setId(novoID);
		
		
		arClientes.add(c);
		
	}
	
	public Cliente getCliente(int id)
	{
		
		for (Cliente c : arClientes)
		{
			if(c.getId() == id)
				return c;
		}
		
		return null;
	}

}
