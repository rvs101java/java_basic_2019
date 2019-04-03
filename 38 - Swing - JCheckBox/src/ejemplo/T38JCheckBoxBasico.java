package ejemplo;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class T38JCheckBoxBasico {

	public static void main(String[] args) {

		FormularioEtiquetas fe = new FormularioEtiquetas();
		fe.setBounds(0, 0, 400, 500);
		fe.setVisible(true);
		fe.setResizable(false);
	}
}

/**
 * 
 * @author Rad
 *
 */
class FormularioEtiquetas extends JFrame implements ChangeListener {

	private static final long serialVersionUID = 1L;

	private JCheckBox check1, check2, check3;
	private JLabel label1;

	public FormularioEtiquetas() {
		setLayout(null);
		check1 = new JCheckBox("Ingles");
		check1.setBounds(10, 10, 150, 30);
		add(check1);

		check2 = new JCheckBox("Frances");
		check2.setBounds(10, 50, 150, 30);
		check2.addChangeListener(this);
		add(check2);

		check3 = new JCheckBox("Aleman");
		check3.setBounds(10, 90, 150, 30);
		check3.addChangeListener(this);
		add(check3);

		label1 = new JLabel("Mostrar valor");
		label1.setOpaque(true);
		label1.setBounds(10, 40, 150, 30);
		add(label1);

	}

	@Override
	public void stateChanged(ChangeEvent ce) {
		String cad = "";
		if (check1.isSelected() == true) {
			cad = cad + ("Ingles-");
			// JOptionPane.showMessageDialog(null, cad);
		}
		if (check1.isSelected() == true) {
			cad += ("Frances-");
			// JOptionPane.showMessageDialog(null, cad);
		}
		if (check1.isSelected() == true) {
			cad.concat("Aleman-");
			// JOptionPane.showMessageDialog(null, cad);
		}
		setTitle(cad);
	}
}