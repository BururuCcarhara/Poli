package Polimofismo;

public class Fisioterapia extends ProfissionalSaude{

	public Fisioterapia (String nome, String especialista, int valorConsulta,String crefito) {
		super (nome,especialista, valorConsulta);
	}
	@Override
		public void agendarConsulta() {
		System.out.println("Agendado");
		}
}
