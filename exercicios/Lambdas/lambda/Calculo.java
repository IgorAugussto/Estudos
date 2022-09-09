package lambda;

@FunctionalInterface
public interface Calculo {
// Interface funcional são interfaces que tem apenas um método.
// e também é possivle adicionar um método default e um método static

	double executar(double a, double b);
}
