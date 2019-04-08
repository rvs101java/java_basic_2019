import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class T39TresOpciones {

	public static void main(String[] args) {
		Seleccion s = new Seleccion();
		s.setBounds(0, 0, 350, 230);
		s.setVisible(true);
		
	}
}

class Seleccion extends JFrame implements ChangeListener {

	private static final long serialVersionUID = 1601736183568454763L;

	private JRadioButton radio1, radio2, radio3;
	private ButtonGroup bg;

	public Seleccion() {
		setLayout(null);
		bg = new ButtonGroup();
		
		radio1 = new JRadioButton("640*480");
		radio1.setBounds(10, 20, 100, 30);
		radio1.addChangeListener(this);
		add(radio1);
		bg.add(radio1);

		radio2 = new JRadioButton("800*600");
		radio2.setBounds(10, 70, 100, 30);
		radio2.addChangeListener(this);
		add(radio2);
		bg.add(radio2);

		radio3 = new JRadioButton("1024*768");
		radio3.setBounds(10, 120, 100, 30);
		radio3.addChangeListener(this);
		add(radio3);
		bg.add(radio3);

	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		if (radio1.isSelected()) {
			setSize(640, 480);
		}

		if (radio2.isSelected()) {
			setSize(800, 600);
		}

		if (radio3.isSelected()) {
			setSize(1024, 768);
		}
	}
}
