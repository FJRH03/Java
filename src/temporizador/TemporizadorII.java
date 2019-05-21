package temporizador;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class TemporizadorII {
	
	
	public static void main(String[] args) {
		Reloj mireloj = new Reloj(3000, true);
		mireloj.enMarcha();
		JOptionPane.showMessageDialog(null,"Pulsa aceptar para terminar");
		System.exit(0);
	}

}

class Reloj{
	
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo=intervalo;
		this.sonido=sonido;
	}
	
	//CREACION DE METODO EN MARCHA
	public void enMarcha() {
		ActionListener listener = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo,listener);
		miTemporizador.start();
	}
	
	//CAMPOS DE CLASE
	private int intervalo;
	private boolean sonido;
	
	//CLASE INTERNA
	private class DameLaHora2 implements ActionListener{
		
		public void actionPerformed(ActionEvent evento) {
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 3 segundos: " +ahora);
			if (sonido==true) {
				Toolkit.getDefaultToolkit().beep();
				
			}
		}
		
	}
}

