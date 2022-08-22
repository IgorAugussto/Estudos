package desafios;

public class DataTeste {
	public static void main(String[] args) {
		
		//Nesse primeiro exemplo está pegando como base os dados que eu passei logo abaixo da instância
		Data data1 = new Data();
		data1.dia = 19;
		data1.mes = 12;
		data1.ano = 1982;
		
		Data data2 = new Data();
		data2.dia = 24;
		data2.mes = 11;
		data2.ano = 2013;
		
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		
		//Desafio contrutor, deixar o construtor padrão com valor padrão e outro contrutor recenbendo os parametros corretos
		//No exemplo do construtor, está pegando como base os contrutores do "Desafio construtor"	
		Data d1 = new Data();
		
		Data d2 = new Data(14, 10, 1999);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		
	}
}
