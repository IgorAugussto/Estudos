package area_estudoStatic;

public class AreaCirc {
	
	//Uso do "static" nos atributos da classe. Recebendo o raio do construtor.
	double raio;
	static double pi = 3.14;
	
	AreaCirc(double raio) {
		this.raio = raio;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}
	
	//Uso do "static" no método da classe. Recebeno o raio do método.
	static double area(double raio) {
		return pi * Math.pow(raio, 2); 
	}
}
