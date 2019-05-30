package ejercicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author rvs101
 * @author raulvelasalas@gmail.com 19 abr. 2019 - 18:47:24
 */
public class T45EstructuraColasSupermercado {

	public static void main(String[] args) {
		Supermercado supermercado = new Supermercado();
		supermercado.setBounds(0, 0, 380, 300);
		supermercado.setVisible(true);
	}
}

/**
 * Clase Principal
 */
class Cola {

	/**
	 * Subclase Principal
	 */
	class Nodo {
		int info;
		Nodo sig;
	}

	/**
	 * Nodo principio y final
	 */
	Nodo raiz, fondo;

	/**
	 * Se crea una nueva cola sin 'nodos'
	 */
	Cola() {
		raiz = null;
		fondo = null;
	}

	/**
	 * 
	 * @return
	 */
	boolean vacia() {
		if (raiz == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param informacion
	 */
	void insertar(int informacion) {
		Nodo nuevo = new Nodo();
		nuevo.info = informacion;
		nuevo.sig = null;
		if (vacia()) {
			raiz = nuevo;
			fondo = nuevo;
		} else {
			fondo.sig = nuevo;
			fondo = nuevo;
		}
	}

	/**
	 * 
	 * @return
	 */
	int extraer() {
		if (!vacia()) {
			int informacion = raiz.info;
			if (raiz == fondo) {
				raiz = null;
				fondo = null;
			} else {
				raiz = raiz.sig;
			}
			return informacion;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	/**
	 * 
	 */
	public void imprimir() {
		Nodo reco = raiz;
		System.out.println("Listado de todos los elementos de la cola");
		while (reco != null) {
			System.out.print(reco.info + " - ");
			reco = reco.sig;
		}
		System.out.println();
	}

	/**
	 * 
	 * @return
	 */
	public int cantidad() {
		int cant = 0;
		Nodo reco = raiz;
		while (reco != null) {
			cant++;
			reco = reco.sig;
		}
		return cant;
	}
}

/**
 * Clase donde se desarrolla toda la actividad
 */
class Supermercado extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton boton1, boton2;
	private JLabel l1, l2, l3;

	/**
	 * Constructor
	 */
	public Supermercado() {
		setLayout(null);
		boton1 = new JButton("Activar simulacion");
		boton1.setBounds(10, 200, 160, 30);
		add(boton1);
		boton1.addActionListener(this);

		l1 = new JLabel("Clientes atendidos por caja:");
		l1.setBounds(10, 50, 400, 30);
		add(l1);

		l2 = new JLabel("Se marchan sin hacer compras:");
		l2.setBounds(10, 90, 400, 30);
		add(l2);

		l3 = new JLabel("Tiempo promedio en cola:");
		l3.setBounds(10, 130, 400, 30);
		add(l3);

		boton2 = new JButton("Salir");
		boton2.setBounds(180, 200, 100, 30);
		add(boton2);
		boton2.addActionListener(this);

	}

	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			simulacion();
		}
		if (e.getSource() == boton2) {
			System.exit(0);
		}
	}

	/**
	 * 
	 */
	public void simulacion() {
		int estado1 = 0, estado2 = 0, estado3 = 0;
		int marchan = 0;
		int llegada = 2 + (int) (Math.random() * 2);
		int salida1 = -1, salida2 = -1, salida3 = -1;
		int cantAte1 = 0, cantAte2 = 0, cantAte3 = 0;
		int tiempoEnCola = 0;
		int cantidadEnCola = 0;

		Cola cola1 = new Cola();
		Cola cola2 = new Cola();
		Cola cola3 = new Cola();

		for (int minuto = 0; minuto < 600; minuto++) {
			if (llegada == minuto) {
				if (estado1 == 0) {
					estado1 = 1;
					salida1 = minuto + 7 + (int) (Math.random() * 5);
				} else {
					if (estado2 == 0) {
						estado2 = 1;
						salida2 = minuto + 7 + (int) (Math.random() * 5);
					} else {
						if (estado3 == 0) {
							estado3 = 1;
							salida3 = minuto + 7 + (int) (Math.random() * 5);
						} else {
							if (cola1.cantidad() == 6 && cola2.cantidad() == 6 && cola3.cantidad() == 6) {
								marchan++;
							} else {
								if (cola1.cantidad() <= cola2.cantidad() && cola1.cantidad() <= cola3.cantidad()) {
									cola1.insertar(minuto);
								} else {
									if (cola2.cantidad() <= cola3.cantidad()) {
										cola2.insertar(minuto);
									} else {
										cola3.insertar(minuto);
									}
								}
							}
						}
					}
				}
				llegada = minuto + 2 + (int) (Math.random() * 2);
			}
			if (salida1 == minuto) {
				cantAte1++;
				estado1 = 0;
				if (!cola1.vacia()) {
					estado1 = 1;
					int m = cola1.extraer();
					salida1 = minuto + 7 + (int) (Math.random() * 5);
					tiempoEnCola = tiempoEnCola + (minuto - m);
					cantidadEnCola++;
				}
			}
			if (salida2 == minuto) {
				cantAte2++;
				estado2 = 0;
				if (!cola2.vacia()) {
					estado2 = 1;
					int m = cola2.extraer();
					salida2 = minuto + 7 + (int) (Math.random() * 5);
					tiempoEnCola = tiempoEnCola + (minuto - m);
					cantidadEnCola++;
				}
			}
			if (salida3 == minuto) {
				cantAte3++;
				estado3 = 0;
				if (!cola3.vacia()) {
					estado3 = 1;
					int m = cola3.extraer();
					salida3 = minuto + 7 + (int) (Math.random() * 5);
					tiempoEnCola = tiempoEnCola + (minuto - m);
					cantidadEnCola++;
				}
			}
		}
		l1.setText("Clientes atendidos por caja: caja1=" + cantAte1 + "  caja2=" + cantAte2 + "  caja3=" + cantAte3);
		l2.setText("Se marchan sin hacer compras: " + marchan);
		if (cantidadEnCola > 0) {
			int tiempoPromedio = tiempoEnCola / cantidadEnCola;
			l3.setText("Tiempo promedio en cola:" + tiempoPromedio);
		} // fin del if
	} // fin de la funcion
} // fin de la clase
