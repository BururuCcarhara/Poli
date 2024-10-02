package Polimofismo;

public class PrincipalSaude {

	public static void main(String[] args) {
		
		ProfissionalSaude PS= new ProfissionalSaude("Doutor Ribeiro", "Neuro cirurgião", 20000);
		PS.agendarConsulta();
		System.out.println(PS.getNome());
		
		Medico me= new Medico ("Joaquim", "Enfermeiro", 200, "Autorizado");
		me.agendarConsulta();
		System.out.println(me.getNome());

		Dentista de= new Dentista ("Doutor Oliveira", "Odontologia", 300, "Aprovado");
		de.agendarConsulta();
		System.out.println(de.getNome());
		
		Fisioterapia fisio= new Fisioterapia ("Garibaldo", "Fisioterapia", 55, "Aprovado");
		fisio.agendarConsulta();
		System.out.println(fisio.getNome());

	}

}
