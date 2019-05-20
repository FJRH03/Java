package empleado;

@SuppressWarnings("unused")
public class Jefatura extends Empleado {

	// Constructor de Empleado
	// Super hace la llamada al constructor padre
	public Jefatura(String nombre, double sueldo, int agno, int mes, int dia) {
		super(nombre, sueldo, agno, mes, dia);

	}

	private double incentivo;

	// Metodo setter Incentivo
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	public double getSueldo() {

		// super.getSueldo() toma el metodo de la clase padre no este

		double sueldoJefe = super.getSueldo();
		return sueldoJefe + incentivo;

	}

}
