package br.ufes.inf.designpatterns.behavioral.observer.janelas;

import java.util.Observable;

/**
 * Janela com componentes gráficos.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class Janela extends javax.swing.JFrame {
	/** Modelo único para todos os componentes. */
	private Modelo modelo = new Modelo();

	/** Creates new form Janela */
	public Janela() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 */
	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jComboBox1 = new JComboBoxObserver();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jList1 = new JListObserver();
		jPanel3 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new JTextFieldObserver();
		jPanel4 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jSlider1 = new JSliderObserver();

		// Adiciona os observadores.
		modelo.addObserver(jComboBox1);
		modelo.addObserver(jList1);
		modelo.addObserver(jTextField1);
		modelo.addObserver(jSlider1);

		getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Design Pattenrs - Observer");
		jLabel1.setText("Valor:");
		jPanel1.add(jLabel1);

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jPanel1.add(jComboBox1);

		getContentPane().add(jPanel1);

		jLabel2.setText("Valor:");
		jPanel2.add(jLabel2);

		jList1.setModel(new javax.swing.AbstractListModel() {
			String[] strings = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		jList1.setMaximumSize(new java.awt.Dimension(50, 176));
		jList1.setMinimumSize(new java.awt.Dimension(50, 176));
		jList1.setPreferredSize(new java.awt.Dimension(50, 176));
		jList1.setSelectedIndex(0);
		jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
			public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
				jList1ValueChanged(evt);
			}
		});

		jPanel2.add(jList1);

		getContentPane().add(jPanel2);

		jLabel3.setText("Valor:");
		jPanel3.add(jLabel3);

		jTextField1.setText("0");
		jTextField1.setMinimumSize(new java.awt.Dimension(50, 19));
		jTextField1.setPreferredSize(new java.awt.Dimension(50, 19));
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jPanel3.add(jTextField1);

		getContentPane().add(jPanel3);

		jLabel4.setText("Valor:");
		jPanel4.add(jLabel4);

		jSlider1.setMajorTickSpacing(1);
		jSlider1.setMaximum(10);
		jSlider1.setPaintLabels(true);
		jSlider1.setPaintTicks(true);
		jSlider1.setSnapToTicks(true);
		jSlider1.setValue(0);
		jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				jSlider1StateChanged(evt);
			}
		});

		jPanel4.add(jSlider1);

		getContentPane().add(jPanel4);

		pack();
	}

	private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {
		int valor = jSlider1.getValue();
		modelo.setValor(valor);
		System.out.println("Modelo agora vale " + modelo.getValor());
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			int valor = Integer.parseInt(jTextField1.getText());
			if ((valor < 0) || (valor > 10))
				throw new Exception();
			modelo.setValor(valor);
			System.out.println("Modelo agora vale " + modelo.getValor());
		}
		catch (Exception e) {
			System.out.println("Erro: use valor de 0 a 10!");
		}
	}

	private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {
		int idx = jList1.getSelectedIndex();
		if (idx != -1) {
			Object selected = jList1.getModel().getElementAt(idx);
			int valor = Integer.parseInt(selected.toString());
			modelo.setValor(valor);
			System.out.println("Modelo agora vale " + modelo.getValor());
		}
	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		int valor = Integer.parseInt(jComboBox1.getModel().getSelectedItem().toString());
		modelo.setValor(valor);
		System.out.println("Modelo agora vale " + modelo.getValor());
	}

	// Variables declaration
	private JComboBoxObserver jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private JListObserver jList1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private JSliderObserver jSlider1;
	private JTextFieldObserver jTextField1;
}

/** Combo box com observer. */
class JComboBoxObserver extends javax.swing.JComboBox implements java.util.Observer {
	/** @see java.util.Observer#update(java.util.Observable, java.lang.Object) */
	public void update(Observable observable, Object param) {
		Modelo modelo = (Modelo) observable;
		int valor = modelo.getValor();

		getModel().setSelectedItem(new Integer(valor));
	}
}

/** Lista com observer. */
class JListObserver extends javax.swing.JList implements java.util.Observer {
	/** @see java.util.Observer#update(java.util.Observable, java.lang.Object) */
	public void update(Observable observable, Object param) {
		Modelo modelo = (Modelo) observable;
		int valor = modelo.getValor();
		System.out.println("Alterar para " + valor);

		setSelectedIndex(valor);
	}
}

/** Textfield com observer. */
class JTextFieldObserver extends javax.swing.JTextField implements java.util.Observer {
	/** @see java.util.Observer#update(java.util.Observable, java.lang.Object) */
	public void update(Observable observable, Object param) {
		Modelo modelo = (Modelo) observable;
		int valor = modelo.getValor();
		System.out.println("Alterar para " + valor);

		setText("" + valor);
	}
}

/** Textfield com observer. */
class JSliderObserver extends javax.swing.JSlider implements java.util.Observer {
	/** @see java.util.Observer#update(java.util.Observable, java.lang.Object) */
	public void update(Observable observable, Object param) {
		Modelo modelo = (Modelo) observable;
		int valor = modelo.getValor();
		System.out.println("Alterar para " + valor);

		setValue(valor);
	}
}
