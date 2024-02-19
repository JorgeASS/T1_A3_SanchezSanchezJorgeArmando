
import java.awt.*;
import javax.swing.*;

class Formulario extends JFrame{
	
	
	public Formulario() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(750, 600);
		setLocationRelativeTo(null);
		setTitle("Formulario");
		setVisible(true);
		
	}
	
	
}

public class VentanaFormulario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Formulario();
			}
		});
		
	}

}
