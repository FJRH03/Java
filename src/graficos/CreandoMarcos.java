package graficos;

import javax.swing.*;

public class CreandoMarcos {
	
	public static void main(String[] args) {
		miFrame frame = new miFrame();
		frame.setVisible(true); //hacer visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cuando la ventana se cierra, se acaba el programa
		

	}
}


@SuppressWarnings("serial")
class miFrame extends JFrame{
	
	//CONSTRUCTOR
	public miFrame() {
		setSize(500,300);
	}
	
}
