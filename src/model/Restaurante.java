package model;

public class Restaurante 
{
	
	private String nome,
					morada,
					contacto,
					especialidade;
	
	private int id;
	
	Reservas reserva;
	
	
	
	
	public Restaurante(String nome, String morada, String contacto, String especialidade) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.contacto = contacto;
		this.especialidade = especialidade;
	}
	
	

	public Reservas getReserva() {
		return reserva;
	}



	public void setReserva(Reservas reserva) {
		this.reserva = reserva;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	

}
