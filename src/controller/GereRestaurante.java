package controller;

import java.util.ArrayList;


import model.Cliente;
import model.Reservas;
import model.Restaurante;


public class GereRestaurante 
{
	
	public ArrayList<Restaurante> arRestaurante;

	public GereRestaurante() 
	{
		
		this.arRestaurante = new ArrayList<Restaurante>();
		
	}
	
	public void addRestaurante(String nome, String morada, String contacto, String especialidade)
	{
		Restaurante r = new Restaurante(nome, morada, contacto, especialidade);
		
		int novoID = arRestaurante.size();
		r.setId(novoID);
		
		arRestaurante.add(r);
	}
	
	public Restaurante getRestaurante(int id)
	{
		
		for (Restaurante r : arRestaurante)
		{
			if(r.getId() == id)
				return r;
		}
		
		return null;
	}
	
	/*public int getTotalPratos(Restaurante r) // TENTEI
	{
		
		
			int totalPratos = 0;
			
				
				for( r : Reservas rv) // Para cada Vacina
				{
					totalPratos += res.getNumeroPessoas();
				}
				totalPratos += totalPratos;
			
			totalPratos += totalPratos;
		
		return totalPratos;
	}*/

}
