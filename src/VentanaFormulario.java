
import java.awt.*;
import javax.swing.*;

class Formulario extends JFrame{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	JLabel txtTheClassic, txtFormOpt, txtIncFoll, txtTextito, txtFantasma,
		txtSetForm, txtEnhaFor, txtEmAd, txtFiNa, txtLaNam, txtCopPast;
	JCheckBox checkATitle, checkIntGro, checkReFi, checkEnEv, checkJS,
			checkInLink, checkInMon;
	JScrollPane scroll, scroll2, scrollMail, scrollName, scrollLaNam,
			scrollCopy;
	JRadioButton rbtnOnReFi, rbtnAllFields;
	JButton btnSubscribe;
	
	
	public Formulario() {
		
		//------------------------------Implementacion de ventana----------------------------------------
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("GridBagLayout");
		setVisible(true);
		//label_nombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		//------------------------------------------------------------------------------------------------
		
		
		//------------------------------Inicio de codigo----------------------------------------
		
		txtTheClassic = new JLabel("<html>The <strong>Classic Form</strong> includes all visible fields for<p>this list</html>");
		bgcGrid(txtTheClassic, 0, 0, 2, 1);
		
		txtFormOpt = new JLabel("<html><i>Form Options</i></html>");
		bgcGrid(txtFormOpt, 0, 2, 2, 1);
		
		//Area de etiqueta
		txtIncFoll = new JLabel("Include the following:");
		bgcGrid(txtIncFoll, 0, 3, 2, 1);
		
		//checkBox
		checkATitle = new JCheckBox("A title for your from");
		bgcGrid(checkATitle, 0, 7, 1, 1);
		
		//Area de comentarios
		scroll = new JScrollPane();
		bgcGrid(scroll, 0, 8, 2, 1);
		
		txtFantasma = new JLabel("   ");
		bgcGrid(txtFantasma, 0, 10, 2, 1);
		//Area Radio
		rbtnOnReFi = new JRadioButton("only required fields");
		bgcGrid(rbtnOnReFi, 0, 12, 2, 1);
		
		rbtnAllFields = new JRadioButton("all fields");
		bgcGrid(rbtnAllFields, 0, 14, 2, 1);
		
		txtTextito = new JLabel("(edit required fields in the form builder)");
		bgcGrid(txtTextito, 0, 16, 2, 1);
		
		txtFantasma = new JLabel("   ");
		bgcGrid(txtFantasma, 0, 18, 2, 1);
		
		//_________CheckBox________________
		checkIntGro = new JCheckBox("interest group fields");
		bgcGrid(checkIntGro, 0, 20, 2, 1);
		
		checkReFi = new JCheckBox("required field indicators");
		bgcGrid(checkReFi, 0, 22, 2, 1);
		//_________CheckBox________________
		
		txtFantasma = new JLabel("   ");
		bgcGrid(txtFantasma, 0, 24, 2, 1);
		
		txtSetForm = new JLabel("Set form width");
		bgcGrid(txtSetForm, 0, 26, 2, 1);
		
		scroll2 = new JScrollPane();
		bgcGrid(scroll2, 0, 28, 2, 1);
		
		//------------------------------------------------
		txtEnhaFor = new JLabel("Enhance your form");
		bgcGrid(txtEnhaFor, 0, 30, 2, 1);
		
		checkEnEv = new JCheckBox("enable evil popup mode");
		bgcGrid(checkEnEv, 0, 32, 2, 1);
		
		checkJS = new JCheckBox("disable all JavaScript");
		bgcGrid(checkJS, 0, 34, 2, 1);
		
		checkInLink = new JCheckBox("include archive link");
		bgcGrid(checkInLink, 0, 36, 2, 1);
		
		checkInMon = new JCheckBox("include MonkeyRewards link");
		bgcGrid(checkInMon, 0, 38, 1, 1);
		//------------------------------------------------
		//Seccion de la derecha
		
		JLabel txtPreview = new JLabel("Preview");
		bgcGrid(txtPreview, 4, 0, 1, 1);
		
		/*------------------------JPanel panelLog = new JPanel();
		panelLog.setBounds(300, 30, 400, 220);
		panelLog.setBorder(BorderFactory.createTitledBorder(""));-----*/
		
		
		
		/*--------------------JScrollPane scroll3 = new JScrollPane();
		scroll3.setBounds(310, 30, 400, 220);
		add(scroll3);--------------*/
		//----------------Email---------
		txtEmAd= new JLabel("Email Address");
		bgcGrid(txtEmAd, 5, 2, 1, 1);
		
		scrollMail = new JScrollPane();
		bgcGrid(scrollMail,5, 3, 3, 1);
		//----------------Email---------
		
		//-------------Firs Name---------
		txtFiNa = new JLabel("First Name");
		bgcGrid(txtFiNa, 5, 6, 3, 1);
		
		scrollName = new JScrollPane();
		bgcGrid(scrollName, 5, 10, 3, 1);
		//-------------Firs Name---------
		
		//-------------last Name---------
		txtLaNam = new JLabel("Last Name");
		bgcGrid(txtLaNam, 5, 13, 3, 1);
		
		scrollLaNam = new JScrollPane();
		bgcGrid(scrollLaNam, 5, 16, 3, 1);
		//-------------last Name---------
		//getContentPane().add(panelLog);
		//   Areas de botones
		btnSubscribe = new JButton("Subscribe");
		bgcGrid(btnSubscribe, 5, 19, 1, 1);
		
		txtCopPast= new JLabel("Copy/paste onto your site");
		bgcGrid(txtCopPast, 4, 24, 1, 1);
		
		
		scrollCopy = new JScrollPane();
		bgcGrid(scrollCopy, 4, 25, 3, 3);
		
		
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
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.fill = GridBagConstraints.VERTICAL;
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
