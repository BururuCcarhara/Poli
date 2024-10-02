package Polimofismo;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo ("Thor", "M","Cinza");
		lobo.emitirSom();
		Leão leão = new Leão ("Alex","M","Qualquer");
		leão.emitirSom();
		Tigre tigre= new Tigre ("Tigre de madadascar 3","M","Africano");
		tigre.emitirSom();
		Cachorro cachorro = new Cachorro ("Salsicha","M","Caramelo com Salsicha");
		cachorro.emitirSom();
		Gato gato =new Gato ("Dory","F","Tricolor e persa");
		gato.emitirSom();

	}

}
