package Polimofismo;

public class PrincipalFun {

	public static void main(String[] args) {
		
		Funcionario fun= new Funcionario ("Roberto Carlos","15-1111-1111","rua dos bobos",1,123);
		System.out.println(fun.calcularSalario(10000.00, 1000));
		System.out.println(fun.getNome());
		
		Horista ho= new Horista ("Zacarias","15-2222-2222","rua dos tolos",2,1234);
		System.out.println(ho.calcularSalario(100, 200));
		System.out.println(ho.getNome());

		Jornada jo= new Jornada ("Cácio","15-3333-3333","rua dos tontos ",3,12345);
		System.out.println(jo.calcularSalario(150, 220));
		System.out.println(jo.getNome());
		
		ConsultorPJ consul= new ConsultorPJ ("Mano Brow","15-4444-4444","rua dos mortos ",4,123456);
		System.out.println(consul.calcularSalario(40000, 5000));
		System.out.println(consul.getNome());
		
	}

}
