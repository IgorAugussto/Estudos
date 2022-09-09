package herança.casaB;

import herança.casaA.Ana;

public class Pedro extends Ana {
	// Os sysout comentados são o que vão dar erro
	
	void testeAcesso() {
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		
		//System.out.println(esposa.segredo);
		//System.out.println(esposa.facoDentroDeCasa); Nesse caso só vai ser transmitido por herança se a classe filha
		//estiver no mesmo pacote que a classe mãe.
		System.out.println(formaDeFalar);// No caso de herança não precisamos instanciar, apenas chamar o atributo
		System.out.println(todosSabem);
	}
}
