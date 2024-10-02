package Polimofismo;

public class Dentista extends ProfissionalSaude {

	public Dentista (String nome, String especialista, int valorConsulta,String cro) {
		super (nome,especialista, valorConsulta);
	}
	@Override
		public void agendarConsulta() {
		System.out.println("Agendado");
		}
}
