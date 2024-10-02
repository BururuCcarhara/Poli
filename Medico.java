package Polimofismo;

public class Medico extends ProfissionalSaude {

	public Medico (String nome, String especialista, int valorConsulta,String crm) {
		super (nome,especialista, valorConsulta);
	}
	@Override
		public void agendarConsulta() {
			System.out.println("Agendado");
		}
}

