
import java.awt.*;
import javax.swing.*;

class Formulario extends JFrame{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Formulario() {
		
		//------------------------------Implementacion de ventana----------------------------------------
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("GridBagLayout");
		setVisible(true);
		//------------------------------------------------------------------------------------------------
		
		
		//------------------------------Inicio de codigo----------------------------------------
		
		
		
		//--------------------------------------------------------------------------------------
		
		//-----------------------------------------Complemento de ventana---------------------------------
		
		pack();
		setLocationRelativeTo(null);
		
		//------------------------------------------------------------------------------------------------
		
	}
	
	public void bgcGrid (JComponent c, int x, int y, int w, int h) {
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbl.setConstraints(c, gbc);
		add(c);
		
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
