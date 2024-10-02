package Polimofismo;

public class ProfissionalSaude {
private String nome;
private String especialista;
private int valorConsulta;

	public ProfissionalSaude(String nome, String especialista, int valorConsulta) {
	super();
	this.nome = nome;
	this.especialista = especialista;
	this.valorConsulta = valorConsulta;
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialista() {
		return especialista;
	}

	public void setEspecialista(String especialista) {
		this.especialista = especialista;
	}

	public int getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(int valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	public void agendarConsulta () {
	System.out.println("Agendado");
}
}
	
