package Polimofismo;

public class ConsultorPJ extends Funcionario{
	
	public ConsultorPJ (String nome, String telefone, String endereco, int id, int matricula) {
		super (nome, telefone, endereco, id, matricula);
	}
	@Override
		public double calcularSalario(double valorTotal, double imposto) {
			return valorTotal-imposto;
		}
}
