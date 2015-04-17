package oa.exemplo;

import java.applet.Applet;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class EstudoCasoApplet extends Applet {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	public EstudoCasoApplet() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 487, 428);
		add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setName("txt1");
		textField.setColumns(10);
		textField.setBounds(139, 94, 30, 30);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setName("txt0");
		textField_1.setColumns(10);
		textField_1.setBounds(98, 94, 30, 30);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setName("txt2");
		textField_2.setColumns(10);
		textField_2.setBounds(177, 94, 30, 30);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setName("txt3");
		textField_3.setColumns(10);
		textField_3.setBounds(98, 135, 30, 30);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setName("txt4");
		textField_4.setColumns(10);
		textField_4.setBounds(139, 135, 30, 30);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setName("txt5");
		textField_5.setColumns(10);
		textField_5.setBounds(177, 135, 30, 30);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setName("txt6");
		textField_6.setColumns(10);
		textField_6.setBounds(99, 182, 30, 30);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setName("txt7");
		textField_7.setColumns(10);
		textField_7.setBounds(141, 182, 30, 30);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setName("txt8");
		textField_8.setColumns(10);
		textField_8.setBounds(181, 182, 30, 30);
		panel.add(textField_8);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(60, 176, 200, 2);
		panel.add(separator);
	}
}
