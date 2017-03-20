package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Reservas;
import model.Restaurante;

public class GereReserva 
{
	public ArrayList<Reservas> arReserva;

	public GereReserva() 
	{
		this.arReserva = new ArrayList<Reservas>();
		
	}
	
	public void addReserva(int numeroPessoas, ArrayList<Cliente> arClientes, ArrayList<Restaurante> arRestaurante)
	{
		Reservas res = new Reservas(numeroPessoas, arClientes, arRestaurante);
	
		arReserva.add(res);
		
	}
	
	public Reservas geReservas(int id)
	{
		
		for (Reservas rv : arReserva)
		{
			if(rv.getId() == id)
				return rv;
		}
		
		return null;
	}

}
