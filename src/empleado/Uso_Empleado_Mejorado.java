 package empleado;

//CODIGO ALTERNATIVO PARA EL EJERCICIO DE MAIN
public class Uso_Empleado_Mejorado {

	public static void main(String[] args) {
		// Creando un arreglo de empleados
		Empleado[] misEmpleados = new Empleado[3];

		// Inicializacion de los objetos del arreglo misEmpleados
		misEmpleados[0] = new Empleado("Francisco Ramirez", 15000, 2019, 06, 17);
		misEmpleados[1] = new Empleado("Martha Gonzalez", 25000, 2016, 12, 10);
		misEmpleados[2] = new Empleado("Hugo Lopez",2000, 2012, 03, 20);

		// subirles el 5% a su sueldo utilizando un bucle for
		for (Empleado e : misEmpleados) {
			e.setSueldo(5);
		}

		// imprime informacion de los empleados
		for (Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() +
					", sueldo: " + e.getSueldo() + ", con fecha de alta: "
					+ e.getFechaAlta());
		}
	}

}
