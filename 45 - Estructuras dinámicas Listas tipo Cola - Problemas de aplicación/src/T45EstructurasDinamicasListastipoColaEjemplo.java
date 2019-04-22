import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Desarrollar un programa para la simulación de un cajero automático.
 * 
 * Se cuenta con la siguiente información:
 * 
 * - Llegan clientes a la puerta del cajero cada 2 ó 3 minutos.
 * 
 * - Cada cliente tarda entre 2 y 4 minutos para ser atendido.
 * 
 * Obtener la siguiente información:
 * 
 * 1 - Cantidad de clientes que se atienden en 10 horas.
 * 
 * 2 - Cantidad de clientes que hay en cola después de 10 horas.
 * 
 * 3 - Hora de llegada del primer cliente que no es atendido luego de 10 horas
 * (es decir la persona que está primera en la cola cuando se cumplen 10 horas)
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 15 abr. 2019 - 21:15:41
 */
public class T45EstructurasDinamicasListastipoColaEjemplo {

	public static void main(String[] args) {

		Cajero cajero = new Cajero();
		cajero.setBounds(0, 0, 340, 250);
		cajero.setVisible(true);
	}
}

/**
 * Clase principal
 * 
 */
class Cola {

	/**
	 * Subclase : En cada invocación se genera un nuevo nodo
	 */
	class Nodo {
		int info; // almacena info
		Nodo sig; // almacena posicion del nodo siguiente
	}

	/**
	 * Estos son los nodos del principio y final de la Queue
	 */
	Nodo raiz, fondo;

	/**
	 * Constructor
	 */
	Cola() {
		raiz = null; // nodos no apunta a ningun sitio
		fondo = null; // nodos no apunta a ningun sitio
	}

	/**
	 * Si no existe el nodo devuelve 'true'
	 * 
	 * @return
	 */
	boolean vacia() {
		if (raiz == null)
			return true;
		else
			return false;
	}

	/**
	 * Creamos un nuevo nodo y le asignamos la información a almacenar y la posicion
	 * al siguiente nodo
	 * 
	 * @param info
	 */
	void insertar(int info) {
		Nodo nuevo = new Nodo(); // Se crea un nuevo 'nodo' para añadir a la Cola 'Queue'
		nuevo.info = info; // recibe por parametro el valor
		nuevo.sig = null; // no apunta al siguiente
		if (vacia()) { // si la cola no tiene nodos y esta vacia el nuevo nodo sera apuntado por la
						// raiz y la cola
			raiz = nuevo; // raiz apunta al nuevo nodo
			fondo = nuevo; // fondo apunta al nuevo nodo
		} else {
			// Recuerda que el nodo 'fondo' tiene un ATRIBUTO 'sig' que es un nodo que va
			// almacenando las ref al sig de la Cola
			fondo.sig = nuevo; // fondo invoca a su atributo 'nodo' que almacena la ref del nuevo 'nodo'
			fondo = nuevo; // ahora nodo 'fondo' tiene la ref de 'nuevo'
		}
	}

	/**
	 * 
	 * @return
	 */
	int extraer() {
		if (!vacia()) { // Si no esta vacia
			int informacion = raiz.info; // raiz almacena valor
			if (raiz == fondo) { // No hay ningun nodo que 'raiz' y 'fondo' apunten
				raiz = null;
				fondo = null;
			} else { // Si hay un nodo y 'raiz' apunta a el 'avanza un elemento'
				raiz = raiz.sig;
			}
			return informacion;
		} else
			return Integer.MAX_VALUE;
	}

	/**
	 * 
	 */
	public void imprimir() {
		Nodo reco = raiz; // Nodo 'reco' apunta al 1º nodo de la cola 'raiz'
		System.out.println("Listado de todos los elementos de la cola.");
		while (reco != null) { // hay ref de 'nodos'
			System.out.println(reco.info + " - ");
			reco = reco.sig; // Nodo apunta a la sig. ref
		}
		System.out.println();
	}

	/**
	 * 
	 * @return
	 */
	public int cantidad() {
		int cant = 0;
		Nodo reco = raiz; // Nodo 'reco' almacena una ref al 1º 'nodo'
		while (reco != null) { // hay Nodo con ref.
			cant++; // cuenta un elemento
			reco = reco.sig; // Nodo 'reco' apunta a la sig referencia.
		}
		return cant; // devuelve todos elementos
	}

}

class Cajero extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JLabel l1, l2, l3;
	private JButton boton1;

	/**
	 * Constructor - Crea la interface
	 */
	public Cajero() {
		setLayout(null);
		boton1 = new JButton("Activar Simulacion");
		boton1.setBounds(10, 10, 180, 30);
		add(boton1);
		boton1.addActionListener(this);

		l1 = new JLabel("Atendidos:");
		l1.setBounds(10, 50, 300, 30);
		add(l1);

		l2 = new JLabel("En cola:");
		l2.setBounds(10, 90, 300, 30);
		add(l2);

		l3 = new JLabel("Minutro de llegada:");
		l3.setBounds(10, 130, 400, 30);
		add(l3);
	}

	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			simulacion();
		}
	}

	/**
	 * 0 - cajero libre 1 - cajero ocupado
	 * 
	 */
	private void simulacion() {
		int estado = 0; // '0' cajero libre - '1' cajero ocupado
		int llegada = 2 + (int) (Math.random() * 2); // almacena en que minuto llegará el próximo cliente (debemos
														// generar un valor entre 2 y 3)
		int salida = -1; // almacenará en que minuto terminará el cliente de ser atendido (como al
							// principio el cajero está vacío inicializamos esta variable con -1.
		int cantAtendidas = 0; // cantidad de personas atendidas (cantAtendidas)

		Cola cola = new Cola(); // objeto para almacenar las personas que llegan al cajero y se lo encuentran ocupado

		for (int minuto = 0; minuto < 600; minuto++) { // 600m -> 10 horas
			if (llegada == minuto) { // verificamos si el cajero esta desocupado
				if (estado == 0) { // cajero desocupado
					estado = 1; // cajero ocupado
					salida = minuto + 2 + (int) (Math.random() * 3); // minuto dejará el cajero
				} else {
					cola.insertar(minuto); // cajero ocupado cargamos la persona en la cola ( insertar el minuto que llega )
				}
				llegada = minuto + 2 + (int) (Math.random() * 2); // siguiente minuto hasta que llegara otra persona
			}
			if (salida == minuto) { // cuando sale la otra persona 
				estado = 0; // cajero desocupado
				cantAtendidas++;
				if (!cola.vacia()) { // si la cola no esta vacia extraemos una persona
					cola.extraer();
					estado = 1; // cajero ocupado
					salida = minuto + 2 + (int) (Math.random() * 3); // minuto dejará el cajero 
				}
			}
		}

		l1.setText("Atendidos: " + String.valueOf(cantAtendidas));
		l2.setText("En cola: " + String.valueOf(cola.cantidad()));
		l3.setText("Minuto llegada: " + String.valueOf(cola.extraer()));

		// JOptionPane.showMessageDialog(null, String.valueOf(cantAtendidas),
		// "Atendidos: ",
		// JOptionPane.INFORMATION_MESSAGE);
		// JOptionPane.showMessageDialog(null, String.valueOf(cola.cantidad()), "En
		// Cola: ",
		// JOptionPane.INFORMATION_MESSAGE);
		// JOptionPane.showMessageDialog(null, String.valueOf(cola.extraer()), "Minuto
		// llegada: ",
		// JOptionPane.INFORMATION_MESSAGE);
	}

}
