package application;

import java.util.Scanner;

import controller.GereCliente;
import controller.GereReserva;
import controller.GereRestaurante;
import model.Cliente;

public class App 
{
	static Scanner sc = new Scanner(System.in);
	
	String nomeCli, nomeRestaurante;
	String moradaCli, moradaRestaurante;
	String emailCli;
	String telefoneCli, contactoRestaurante;
	String especialidade;
	
	
	boolean sair = false;
	boolean saida;
	
	int conta;
	int opcao;
	int opcSair;
	
	int numPessoas;
	int idCli;
	
	
	
	

	public App() 
	{
		GereCliente gestor = new GereCliente();
		GereRestaurante gestor2 = new GereRestaurante();
		GereReserva gestor3 = new GereReserva();
		
		
		do {
			

			// System.out.println(gere.getNome());
			
				System.out.print("Menu:  \n \n");
				System.out.println("1 - Introduzir Clientes");
				System.out.println("2 - Introduzir Restaurantes");
				System.out.println("3 - Listar Clientes: ");
				System.out.println("4 - Listar Restaurantes: ");
				System.out.println("5 - Efectuar Reserva: ");
				System.out.println("6 - Listar Reservas: \n");

				opcao = sc.nextInt();

				switch (opcao) 
				{
				
						case 1:
						{
							System.out.println("Quantos clientes deseja introduzir ? \n");
							conta = sc.nextInt();
							
							for(int i = 0; i < conta; i++)
							{
								System.out.printf("Introduza o nome do cliente: \n" );
								nomeCli = sc.next();
								System.out.println("Introduza a morada do cliente: \n ");
								moradaCli = sc.next();
								System.out.println("Introduza o email do cliente: \n");
								emailCli = sc.next();
								System.out.println("Introduza o telefone do cliente: \n");
								telefoneCli = sc.next();
					
								gestor.addCliente(nomeCli, moradaCli, emailCli, telefoneCli);
								
							}
							
							System.out.println("Deseja introduzir mais clientes? \n 1 - nao 2 - sim \n");
							opcSair = sc.nextInt();
							if (opcSair == 1)
							{
								saida = true;
								sair = false;
								
							}
							else 
							{
								saida = false;
								sair = true;
	
							}
							
							
							break;
						}
				
						case 2:
						{
							
							System.out.println("Quantos restaurantes deseja introduzir ? \n");
							conta = sc.nextInt();
							
							for(int i = 0; i < conta; i++)
							{
								System.out.printf("Introduza o nome do restaurante: \n " );
								nomeRestaurante = sc.next();
								System.out.println("Introduza a morada do restaurante: \n");
								moradaRestaurante = sc.next();
								System.out.println("Introduza o telefone do cliente: \n");
								contactoRestaurante = sc.next();
								System.out.println("Introduza a especialidade do restaurante: \n");
								especialidade = sc.next();
					
								gestor2.addRestaurante(nomeRestaurante, moradaRestaurante, contactoRestaurante, especialidade);
								
							}
							
							System.out.println("Deseja introduzir mais restaurantes? \n 1 - nao 2 - sim \n");
							opcSair = sc.nextInt();
							if (opcSair == 1)
							{
								saida = true;
								sair = false;
								
							}
							else 
							{
								saida = false;
								sair = true;
				
							}
					
							break;
						}
						case 3:
						{
							System.out.println("\n Clientes inseridos: \n");
							for(int i = 0; i < gestor.arClientes.size(); i++)
							{
								
								System.out.println(gestor.getCliente(i).getId());
								System.out.println(gestor.getCliente(i).getNome());
								System.out.println(gestor.getCliente(i).getMorada());
								System.out.println(gestor.getCliente(i).getEmail());
								System.out.println(gestor.getCliente(i).getTelefone());
								
							}
							
							break;
						}
						
						case 4:
						{
							System.out.println("\n Restaurantes inseridos: \n");
							for(int i = 0; i < gestor2.arRestaurante.size(); i++)
							{
								
								System.out.println(gestor2.getRestaurante(i).getId());
								System.out.println(gestor2.getRestaurante(i).getNome());
								System.out.println(gestor2.getRestaurante(i).getMorada());
								System.out.println(gestor2.getRestaurante(i).getContacto());
								System.out.println(gestor2.getRestaurante(i).getEspecialidade());
							
							}
							break;
						}
						//TENTEI
						case 5:
						{
							System.out.println("Vamos fazer uma reserva: \n");
							System.out.println("Indique o numero de pessoas: \n");
							numPessoas = sc.nextInt();
							
							
							System.out.println("Clientes: \n ID | Nome \n");
							for(int i = 0; i < conta; i++)
							{
								System.out.println(gestor.getCliente(i).getId() + " | " + gestor.getCliente(i).getNome());
							}
						
							System.out.println("Introduza o id do cliente que quer fazer a reserva: \n");
							idCli = sc.nextInt();
							for(int i = 0; i < conta; i++)
							{
								if(idCli == gestor.getCliente(i).getId())
								{
									gestor3.addReserva(numPessoas, gestor.arClientes, gestor2.arRestaurante);
									
									System.out.println("Dados Resrva");
									for(int j = 0; i < gestor3.arReserva.size(); j++)
									{
										System.out.println(gestor3.geReservas(j).getNumeroPessoas());
										System.out.println(gestor3.geReservas(j).getArClientes().get(j).getNome());
										System.out.println(gestor3.geReservas(j).getArRestaurante().get(j).getNome());
									}
									
									
								
									
								}
								
							}
							
							
							
							
							
							
							
							
							break;
						}
						
						case 6:
						{
							
							
							break;
						}
						
				
						default:
						{
							
							break;
						}
						
				
				
				}
				
		}while(saida);
		
		
		
		
		
	}

	public static void main(String[] args) 
	{
		new App();
		
		
		
		

	}

}
