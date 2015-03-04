package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Window extends JFrame{
	//variable 
	private static final String TITLE = "Hibernte";
	private static final String ADD_QUESTIONS = "Añadir preguntas";
	//textfield de las respuestas
	private JFrame frame;
	private JTextField answer1;
	private JTextField answer2;
	private JTextField answer3;
	private JTextField answer4;
	private JTextField addQuestion;
	//boton guardar
	private JButton botonGuardar;



	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setTitle(TITLE);
		frame.setBounds(100, 100, 452, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAadeUnaPregunta = new JLabel("Añade una pregunta");
		lblAadeUnaPregunta.setBounds(56, 16, 150, 16);
		frame.getContentPane().add(lblAadeUnaPregunta);
		
		JComboBox categoria = new JComboBox();
		categoria.setModel(new DefaultComboBoxModel(new String[] {"Geografía", "Matemáticas", "Historia", "Deportes"}));
		categoria.setBounds(307, 51, 119, 27);
		frame.getContentPane().add(categoria);
		
		JLabel lblSeleccionaCategora = new JLabel("Selecciona categoría");
		lblSeleccionaCategora.setBounds(295, 16, 145, 16);
		frame.getContentPane().add(lblSeleccionaCategora);
		
		JLabel lblAadaSusRespuestas = new JLabel("Añada sus respuestas");
		lblAadaSusRespuestas.setBounds(52, 123, 154, 16);
		frame.getContentPane().add(lblAadaSusRespuestas);
		
		answer1 = new JTextField();
		answer1.setBounds(52, 166, 134, 28);
		frame.getContentPane().add(answer1);
		answer1.setColumns(10);
		
		JLabel label = new JLabel("1");
		label.setBounds(37, 172, 14, 16);
		frame.getContentPane().add(label);
		
		answer2 = new JTextField();
		answer2.setBounds(52, 206, 134, 28);
		frame.getContentPane().add(answer2);
		answer2.setColumns(10);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(37, 212, 14, 16);
		frame.getContentPane().add(label_1);
		
		answer3 = new JTextField();
		answer3.setBounds(265, 166, 134, 28);
		frame.getContentPane().add(answer3);
		answer3.setColumns(10);
		
		answer4 = new JTextField();
		answer4.setBounds(265, 206, 134, 28);
		frame.getContentPane().add(answer4);
		answer4.setColumns(10);
		
		JLabel label_2 = new JLabel("3");
		label_2.setBounds(252, 172, 14, 16);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setBounds(252, 212, 14, 16);
		frame.getContentPane().add(label_3);
		
		JButton botonGuardar = new JButton("Guardar");
		botonGuardar.setForeground(new Color(30, 144, 255));
		botonGuardar.setBackground(new Color(30, 144, 255));
		botonGuardar.setBounds(329, 268, 117, 29);
		frame.getContentPane().add(botonGuardar);
		
		addQuestion = new JTextField();
		addQuestion.setBounds(52, 44, 198, 28);
		frame.getContentPane().add(addQuestion);
		addQuestion.setColumns(10);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(185, 168, 28, 23);
		frame.getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(185, 208, 34, 23);
		frame.getContentPane().add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(399, 166, 28, 23);
		frame.getContentPane().add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(398, 206, 28, 23);
		frame.getContentPane().add(checkBox_3);
	}
	
	private JComboBox categoria;
	

	public JComboBox getCategory() {
		return categoria;
	}
	
	public void setCategory(JComboBox categoria) {
		this.categoria = categoria;
	}
	public JTextField getAnswer1() {
		return answer1;
	}

	public void setAnswer1(JTextField answer1) {
		this.answer1 = answer1;
	}

	public JTextField getAnswer2() {
		return answer2;
	}

	public void setAnswer2(JTextField answer2) {
		this.answer2 = answer2;
	}

	public JTextField getAnswer3() {
		return answer3;
	}

	public void setAnswer3(JTextField answer3) {
		this.answer3 = answer3;
	}

	public JTextField getAnswer4() {
		return answer4;
	}

	public void setAnswer4(JTextField answer4) {
		this.answer4 = answer4;
	}

	public JTextField getAddQuestion() {
		return addQuestion;
	}

	public void setAddQuestion(JTextField addQuestion) {
		this.addQuestion = addQuestion;
	}

	public JButton getBotonGuardar() {
		return botonGuardar;
	}

	public void setBotonGuardar(JButton botonGuardar) {
		this.botonGuardar = botonGuardar;
	}
	
	
}
