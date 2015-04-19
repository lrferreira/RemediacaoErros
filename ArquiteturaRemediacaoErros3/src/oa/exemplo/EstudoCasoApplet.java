package oa.exemplo;

import java.applet.Applet;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import module.author.GoalsController;
import module.entity.Action;
import module.entity.Answer;
import module.entity.DBConnect;
import module.entity.Exercise;
import module.entity.ExerciseInitialState;
import module.entity.Goal;
import module.entity.Path;
import module.entity.Student;
import util.StringConstants;
import javax.swing.JTextArea;

public class EstudoCasoApplet extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextPane textPane;
	
	private JLabel lblMer;

	private Exercise exercise;
	private Path path;
	
	private HashMap componentMap;
	
	DBConnect dbCon;
	private Goal goal;
	
	private JPanel panel;
	private int i = -1;
	private int attempt = 1;


	private Student student = new Student(1L, "estudante 1");
	private JTextArea textArea;
	
	public EstudoCasoApplet() {
		setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 10, 922, 495);
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
		
		lblMer = new JLabel("");
		lblMer.setBounds(333, 94, 200, 197);
		panel.add(lblMer);
		
		textPane = new JTextPane();
		textPane.setBounds(566, 38, 320, 403);
		panel.add(textPane);
		
		textArea = new JTextArea();
		textArea.setBounds(20, 11, 272, 57);
		panel.add(textArea);
		
		try {
			setDbCon(new DBConnect(StringConstants.FILE_DB));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		createComponentMap();
		
		exercise = dbCon.getExercise(1L);
		path = exercise.getPaths().get(0);
		loadExercise();


		prepareNextGoal();
		addListenerOnTextFields();
		
	}
	
	
	
	public void loadExercise(){
		for (ExerciseInitialState eis: exercise.getInitialState()){
			JTextField f = (JTextField) getComponentByName(eis.getComponent());
			f.setText(eis.getValue());
			
		}
		
		textArea.setText(exercise.getEnunciate());

	}
	
	
	public void prepareNextGoal(){
		if (++i < path.getGoals().size()){
			goal = path.getGoals().get(i);
			attempt = 1;
			
			Component[] components = panel.getComponents();
			for (Component c : components) {
				if (c instanceof JTextField){
					JTextField f = (JTextField) c;
					f.setEnabled(false);
					if (f.getName().equalsIgnoreCase(goal.getComponent())) {
						f.setEnabled(true);
						f.requestFocusInWindow();
					}
				}
				
				
			}
			
		}

	}

	public void addListenerOnTextFields(){
		Component[] components = panel.getComponents();
		for (Component c : components) {
			if (c instanceof JTextField){
				JTextField f = (JTextField) c;
				f.addKeyListener(new KeyAdapter(){
					public void keyPressed(KeyEvent e)
				      {
				        if (e.getKeyCode() == KeyEvent.VK_ENTER){
				        	Action action = new Action();
				        	action.setAnswer(new Answer(f.getText()));
				        	action.setAttempt(attempt);
				        	//action.setCorrect(correct);
				        	action.setDate(new Date());
				        	action.setGoal(goal);
				        	action.setStudent(student);
				        	action.setMer(null);
				        	action.setRegrasAcionadas(null);
				        	action.setRemediation(null);
				        	
							GoalsController.run(action, textPane, lblMer);
							if (action.getCorrect())
								prepareNextGoal();
							
				        }
				      }
				});
			
			}
		
			
		}
	}
	
	private void createComponentMap() {
        componentMap = new HashMap<String,Component>();
        Component[] components = panel.getComponents();
        for (int i=0; i < components.length; i++) {
        	 if (components[i] instanceof JTextField)
                componentMap.put(components[i].getName(), components[i]);
        }
        
}

	public Component getComponentByName(String name) {
        if (componentMap.containsKey(name)) {
                return (Component) componentMap.get(name);
        }
        else return null;
}
	public DBConnect getDbCon() {
		return dbCon;
	}

	public void setDbCon(DBConnect dbCon) {
		this.dbCon = dbCon;
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}
}
