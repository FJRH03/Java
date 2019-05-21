package empleado;

import java.util.Date;
import java.util.GregorianCalendar;

@SuppressWarnings("unused")
public class Empleado implements Trabajadores {

	//CONSTRUCTOR EMPLEADO
	public Empleado(String nombre, double sueldo, int agno, int mes, int dia) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		
		//Construir fecha con las variables de locales del metodo constructor
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		//Asignamos y devolvemos la fecha en formato gregorian
		fechaAlta=calendario.getTime();
	}
	
	//OTRO CONSTRUCTOR
	public Empleado(String nombre) {
		this(nombre,3000,2000,01,01);
	}
	
	//METODO DE LA INTERFAZ TRABAJADORES
	@Override
	public double setBonus(double gratificacion) {
		return Trabajadores.bonus_base+gratificacion;
	}
	
	
	
	//Metodo get Sueldo
	public double getSueldo() {
		return sueldo;
	}
	
	//Metodo get fechaAlta
	public Date getFechaAlta() {
		return fechaAlta;
	}
	
	//Metodo Setter sueldo
	public void setAumento(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	//Metodo get nombre
	public String getNombre() {
		return nombre;
	}
	

	//CAMPOS DE CLASE
	private String nombre;
	private double sueldo;
	private Date fechaAlta;
	


}
