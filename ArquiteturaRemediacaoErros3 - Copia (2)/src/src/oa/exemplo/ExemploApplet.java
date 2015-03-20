package src.oa.exemplo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import jeops.compiler.Main;
import module.author.GoalsController;
import module.creation.rules.RulesFactory;
import module.entity.Action;
import module.entity.CorrectAnswer;
import module.entity.Goal;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.Path;
import module.entity.Student;
import module.entity.WrongAnswer;
import util.Constants;
import util.StringConstants;

public class ExemploApplet extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField txtResp;
	private JTextField txtParcela2;
	private JTextField txtParcela1;
	private JLabel label;
	private JLabel lblNewLabel_1;
	private JLabel lblQuantasLaranjasHelena;
	private JLabel lblImg = new JLabel("");;
	private JTextPane textPane;
	private JTextField txtOp;
	public Goal goal1, goal2, goal3, goal4, goal5, goal6, goal7, goal8;
	public Student student = new Student("student test");
	public List<Action> actions = new ArrayList<Action>();
	public Action currentAction;
	public Path path1 = new Path(1, "caminho de resposta 1");
	public Path path2 = new Path(2, "caminho de resposta 2");

	

	/**
	 * Create the applet.
	 */
	public ExemploApplet() {

		txtParcela1 = new JTextField();
		txtParcela2 = new JTextField();
		txtResp = new JTextField();
		txtOp = new JTextField();
		
		txtParcela1.setName("txtParcela1");
		txtParcela2.setName("txtParcela2");
		txtResp.setName("txtResp");
		txtOp.setName("txtOp");
		
		currentAction = new Action();
		
		currentAction.setStudent(student);
		currentAction.setAttempt(1);

		goal1 = new Goal(1, path1, false, txtParcela1, new CorrectAnswer("10"), null, null, "meta 1");
		
		goal2 = new Goal(2, path1, false, txtOp, new CorrectAnswer("+"), goal1, null, "meta 2");
		goal1.setSubGoal(goal2);
		
		goal3 = new Goal(3, path1, false, txtParcela2, new CorrectAnswer("6"), goal2, null, "meta 3");
		goal2.setSubGoal(goal3);
		
		goal4 = new Goal(4, path1, false, txtResp, new CorrectAnswer("16"), goal3, null, "meta 4");
		goal3.setSubGoal(goal4);

		goal5 = new Goal(5, path2, false, txtParcela1, new CorrectAnswer("6"), null, null, "meta 1");
		
		goal6 = new Goal(6, path2, false, txtOp, new CorrectAnswer("+"), goal5, null, "meta 2");
		goal5.setSubGoal(goal6);
		
		goal7 = new Goal(7, path2, false, txtParcela2, new CorrectAnswer("10"), goal6, null, "meta 3");
		goal6.setSubGoal(goal7);
		
		goal8 = new Goal(8, path2, false, txtResp, new CorrectAnswer("16"), goal7, null, "meta 4");
		goal7.setSubGoal(goal8);
		
		//makeRules();

		initComponents();
		
		
	}
	
	private void makeRules() {
		
		int i = 0;


		RulesFactory.createRules(goal1);
		RulesFactory.createRules(goal2);
		RulesFactory.createRules(goal3);
		RulesFactory.createRules(goal4);
		RulesFactory.createRules(goal5);
		RulesFactory.createRules(goal6);
		RulesFactory.createRules(goal7);
		RulesFactory.createRules(goal8);

		// O aprendiz não consegue identificar que Helena possui uma quantidade maior.

		RulesFactory.createRules(
				goal1,
				new WrongAnswer("9", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno"),
				-1);
		RulesFactory.createRules(
				goal1,
				new WrongAnswer("16", Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "interpretacao_equivocada.png", "Figura enumerando as laranjas extras que Helena possui, para o aluno poder identificar a quantidade exata de laranjas que ela possui"),
				-1);

		RulesFactory.createRules(
				goal1,
				new WrongAnswer("1", Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "compreensao_aprofundada.png", "Texto exibindo os principais conceitos aritméticos para retomar a base conceitual do aprendiz"),
				-1);

		//A estratégia do aprendiz apresenta a seguinte solução: 10 - 6 = ?
		RulesFactory.createRules(
				goal2,
				new WrongAnswer("-", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_escolha_operador.png", "Figura procurando mostrar que Helena possui mais laranjas que Pedro"),
				-1);

		RulesFactory.createRules(
				goal2,
				new WrongAnswer("", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", ""),
				-1);

		RulesFactory.createRules(
				goal2,
				new WrongAnswer("1", Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "compreensao_aprofundada.png", "Texto exibindo os principais conceitos aritméticos para retomar a base conceitual do aprendiz"),
				-1);
		
		RulesFactory.createRules(
				goal3,
				new WrongAnswer("16", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno"),
				-1);
		
		RulesFactory.createRules(
				goal3,
				new WrongAnswer("4", Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "indiretamente_identificavel.png", ""),
				2);

		RulesFactory.createRules(
				goal3,
				new WrongAnswer("", Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "compreensao_aprofundada.png", "Texto exibindo os principais conceitos aritméticos para retomar a base conceitual do aprendiz"),
				-1);
		
		//A estratégia do aprendiz apresenta a seguinte solução: 10 - 6 = ?
		RulesFactory.createRules(
				goal4,
				new WrongAnswer("4", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_escolha_operador.png", "Figura procurando mostrar que Helena possui mais laranjas que Pedro"),
				-1);

		RulesFactory.createRules(
				goal4,
				new WrongAnswer("10", Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "interpretacao_equivocada.png", "Figura enumerando as laranjas extras que Helena possui, para o aluno poder identificar a quantidade exata de laranjas que ela possui"),
				2);
		
		RulesFactory.createRules(
				goal4,
				new WrongAnswer("6", Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "indiretamente_identificavel.png", "Figura destacando que Helena possui mais laranjas que o indicado no cesto"),
				2);
		
		RulesFactory.createRules(
				goal4,
				new WrongAnswer("", Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "compreensao_aprofundada.png", "Texto exibindo os principais conceitos aritméticos para retomar a base conceitual do aprendiz"),
				-1);

		
		RulesFactory.createRules(
				goal5,
				new WrongAnswer("9", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno"),
				-1);
		RulesFactory.createRules(
				goal5,
				new WrongAnswer("16", Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "interpretacao_equivocada.png", "Figura enumerando as laranjas extras que Helena possui, para o aluno poder identificar a quantidade exata de laranjas que ela possui"),
				-1);

		RulesFactory.createRules(
				goal5,
				new WrongAnswer("1", Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "compreensao_aprofundada.png", "Texto exibindo os principais conceitos aritméticos para retomar a base conceitual do aprendiz"),
				-1);

		//A estratégia do aprendiz apresenta a seguinte solução: 10 - 6 = ?
		RulesFactory.createRules(
				goal6,
				new WrongAnswer("-", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_escolha_operador.png", "Figura procurando mostrar que Helena possui mais laranjas que Pedro"),
				-1);

		RulesFactory.createRules(
				goal6,
				new WrongAnswer("", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", ""),
				-1);

		RulesFactory.createRules(
				goal6,
				new WrongAnswer("1", Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "compreensao_aprofundada.png", "Texto exibindo os principais conceitos aritméticos para retomar a base conceitual do aprendiz"),
				-1);
		
		RulesFactory.createRules(
				goal7,
				new WrongAnswer("16", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno"),
				-1);
		
		RulesFactory.createRules(
				goal7,
				new WrongAnswer("4", Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "indiretamente_identificavel.png", ""),
				2);

		RulesFactory.createRules(
				goal7,
				new WrongAnswer("", Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "compreensao_aprofundada.png", "Texto exibindo os principais conceitos aritméticos para retomar a base conceitual do aprendiz"),
				-1);
		
		//A estratégia do aprendiz apresenta a seguinte solução: 10 - 6 = ?
		RulesFactory.createRules(
				goal8,
				new WrongAnswer("4", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_escolha_operador.png", "Figura procurando mostrar que Helena possui mais laranjas que Pedro"),
				-1);

		RulesFactory.createRules(
				goal8,
				new WrongAnswer("10", Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "interpretacao_equivocada.png", "Figura enumerando as laranjas extras que Helena possui, para o aluno poder identificar a quantidade exata de laranjas que ela possui"),
				2);
		
		RulesFactory.createRules(
				goal8,
				new WrongAnswer("6", Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "indiretamente_identificavel.png", "Figura destacando que Helena possui mais laranjas que o indicado no cesto"),
				2);
		
		RulesFactory.createRules(
				goal8,
				new WrongAnswer("", Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "compreensao_aprofundada.png", "Texto exibindo os principais conceitos aritméticos para retomar a base conceitual do aprendiz"),
				-1);
		
		String filePath = new File("").getAbsolutePath();
        System.out.println (filePath);
        filePath = filePath.replace("\\bin", "\\src");
        //filePath = filePath + "\\src"; 
		Main.main(new String[]{filePath+StringConstants.FILE_EXPRESSION_IDENTIFIER_CORRECT_ANSWER_KB});
		Main.main(new String[]{filePath+StringConstants.FILE_EXPRESSION_IDENTIFIER_WRONG_ANSWER_KB});
		Main.main(new String[]{filePath+StringConstants.FILE_ERROR_SORTER_KB});
		Main.main(new String[]{filePath+StringConstants.FILE_MERFUNCTION_SORTER_KB});
		Main.main(new String[]{filePath+StringConstants.FILE_MER_MANAGER_KB});

		
	}

	private void initComponents() {
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 899, 594);
		getContentPane().add(panel);
		panel.setLayout(null);

		txtParcela1.setColumns(10);
		txtParcela1.setBounds(70, 95, 41, 35);
		txtParcela1.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e)
		      {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER){
		        	currentAction.setAnswer(null);
		        	currentAction.setCorrect(null);
		        	currentAction.setGoal(goal1);
					GoalsController.run(currentAction, textPane, lblImg);
		        }
		      }
		});
		
		panel.add(txtParcela1);
		
		txtParcela2.setEnabled(false);
		txtParcela2.setColumns(10);
		txtParcela2.setBounds(70, 161, 41, 35);
		txtParcela2.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e)
		      {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER){
		        	currentAction.setAnswer(null);
		        	currentAction.setCorrect(null);
		        	currentAction.setGoal(goal3);
					GoalsController.run(currentAction, textPane, lblImg);
		        }
		      }
		});

		panel.add(txtParcela2);

		txtOp.setEnabled(false);
		txtOp.setBounds(23, 136, 27, 20);
		txtOp.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e)
		      {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER){
		        	currentAction.setGoal(goal2);
					currentAction.setStudent(student);
					GoalsController.run(currentAction, textPane, lblImg);
		        }
		      }
		});
		
		panel.add(txtOp);
		txtOp.setColumns(10);

		txtResp.setEnabled(false);
		txtResp.setBounds(70, 239, 41, 35);
		txtResp.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e)
		      {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER){
		        	currentAction.setAnswer(null);
		        	currentAction.setCorrect(null);
		        	currentAction.setGoal(goal4);
					GoalsController.run(currentAction, textPane, lblImg);
		        }
		      }
		});
		
		panel.add(txtResp);
		txtResp.setColumns(10);
		

		
		label = new JLabel("_________________");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 207, 161, 14);
		panel.add(label);
		
		lblNewLabel_1 = new JLabel("Pedro comprou 10 laranjas e Helena comprou 6 laranjas a mais que Pedro.");
		lblNewLabel_1.setBounds(10, 11, 613, 14);
		panel.add(lblNewLabel_1);
		
		lblQuantasLaranjasHelena = new JLabel("Quantas laranjas Helena comprou?");
		lblQuantasLaranjasHelena.setBounds(10, 36, 580, 14);
		panel.add(lblQuantasLaranjasHelena);
		
		
		lblImg.setIcon(null);
		lblImg.setBounds(172, 76, 260, 266);
		panel.add(lblImg);
		
		textPane = new JTextPane();
		//textPane.setEnabled(false);
		textPane.setBounds(494, 36, 367, 528);
		panel.add(textPane);
		
		
	}
}
