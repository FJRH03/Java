package poo;
import javax.swing.JOptionPane;
public class UsoCoche {
	
	public static void main(String[] args) {
	
	Coche Renault = new Coche();
	
	//paso de parametros
	Renault.setColor(JOptionPane.showInputDialog("Introduce color: "));
	System.out.println(Renault.getColor());
	
	Renault.setClimatizador(JOptionPane.showInputDialog("Climatizador: "));//setter
	System.out.println(Renault.getClimatizador());//getter
	
	Renault.setAsientosCuero(JOptionPane.showInputDialog("Asientos cuero: ")); //setter
	System.out.println(Renault.getAsientosCuero()); //getter
	
	//Getter + Setter peso coche
	System.out.println(Renault.setPesoCoche());
	
	//System.out.println(Renault.getDatosCoche());
	System.out.println("\nEl precio final del coche es: "+ Renault.getPrecioCoche());

	
	}

}
