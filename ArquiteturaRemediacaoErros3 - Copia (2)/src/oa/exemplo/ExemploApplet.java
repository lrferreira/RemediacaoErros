package oa.exemplo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import jeops.compiler.Main;
import module.creation.rules.RulesFactory;
import module.entity.Action;
import module.entity.Answer;
import module.entity.CorrectAnswer;
import module.entity.Historic;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.RuleToHuman;
import module.entity.Student;
import module.entity.WrongAnswer;
import module.error.sorter.ErrorSorterController;
import module.expression.identifier.ExpressionIdentifierController;
import module.mer.manager.MERManagerController;
import module.merfunction.sorter.MERFunctionSorterController;
import util.Constants;
import util.StringConstants;

public class ExemploApplet extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField txtResp;
	private JButton btnOk;
	private JTextField txtParcela2;
	private JTextField txtParcela1;
	private JLabel label;
	private JLabel lblNewLabel_1;
	private JLabel lblQuantasLaranjasHelena;
	public Historic historico;
	private JLabel lblImg;
	private JTextPane textPane;
	

	/**
	 * Create the applet.
	 */
	public ExemploApplet() {

		historico = new Historic();
		
		historico.setAluno(new Student());
		historico.setEtapa(new Action());
		historico.setNumeroTentativas(1);
		
		//makeRules();
		
		initComponents();
		
	}
	
	private void makeRules() {
		
		int i = 0;

		RulesFactory.createRules(new CorrectAnswer(new String[]{"6", "10","16"}));
		RulesFactory.createRules(new CorrectAnswer(new String[]{"10", "6","16"}));

		// O aprendiz não consegue identificar que Helena possui uma quantidade maior.
		RulesFactory.createRules(
				new WrongAnswer(new String[]{"10","10","16"}, Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno"),
				-1);
		RulesFactory.createRules(
				new WrongAnswer(new String[]{"6","6","16"}, Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno"),
				-1);
		RulesFactory.createRules(
				new WrongAnswer(new String[]{"10","10",""}, Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno"),
				-1);
		RulesFactory.createRules(
				new WrongAnswer(new String[]{"6","6",""}, Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno"),
				-1);

// criar mecanismo neste caso para identificar todas as respostas erradas quando o aluno informa mesmo valor para as parcelas
// criar mecanismo estilo "independente da resposta
		
		
		//A estratégia do aprendiz apresenta a seguinte solução: 10 - 6 = ?
		RulesFactory.createRules(
				new WrongAnswer(new String[]{"10","6","4"}, Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_escolha_operador.png", "Figura procurando mostrar que Helena possui mais laranjas que Pedro"),
				-1);

		
		//O aprendiz ainda não se apropriou da parte conceitual, quando não consegue
		//identificar cada personagem com suas respectivas quantidades.
		RulesFactory.createRules(
				new WrongAnswer(new String[]{"", "", ""}, Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_regra.png", "Figura apresentando a quantidade de laranjas que cada pessoa possui"),
				2);

		
		//O aprendiz não consegue perceber que a quantidade de laranjas de Helena é maior que a de Pedro.
		RulesFactory.createRules(
				new WrongAnswer(new String[]{"10", "6", "6"}, Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "indiretamente_identificavel.png", "Figura destacando que Helena possui mais laranjas que o indicado no cesto"),
				2);

		
		RulesFactory.createRules(
				new WrongAnswer(new String[]{"", "", ""}, Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA), 
				new MERFunction(), 
				new MultipleExternalRepresentation(++i, "interpretacao_equivocada.png", "Figura enumerando as laranjas extras que Helena possui, para o aluno poder identificar a quantidade exata de laranjas que ela possui"),
				2);

		//Caso o erro cometido não esteja contemplado em nenhuma classificação acima, o
		//erro será incluído nesta seção até ser analisada a necessidade de uma nova categoria.
		RulesFactory.createRules(
				new WrongAnswer(new String[]{"1", "1", "1"}, Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL), 
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
		
		txtResp = new JTextField();
		txtResp.setBounds(70, 239, 41, 35);
		panel.add(txtResp);
		txtResp.setColumns(10);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(54, 305, 72, 23);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				Answer respostaAluno = new Answer(
											new String[]{
													txtParcela1.getText(),
													txtParcela2.getText(),
													txtResp.getText()});
				

				historico.setResposta(respostaAluno);
				System.out.println("Resposta do aluno: " + 
									respostaAluno.getAnswers()[0] + " - " +
									respostaAluno.getAnswers()[1] + " - " +
									respostaAluno.getAnswers()[2]);
				System.out.println("Tentativa nº " + historico.getNumeroTentativas());
				

				WrongAnswer respostaErrada = new WrongAnswer();
				CorrectAnswer respostaCerta = new CorrectAnswer();
				
				RuleToHuman ruleToHuman = new RuleToHuman();
				ruleToHuman.setDescription("");
				
				ExpressionIdentifierController.identificaExpressao(historico, ruleToHuman, respostaCerta, respostaErrada);
				
				if (respostaCerta.getAnswers() != null) {
					textPane.setText(ruleToHuman.getDescription());
					System.out.println("Resposta Correta! Fim!");
					//System.exit(1);
				}
				
				else{

					ErrorSorterController.classificarErro(historico, ruleToHuman, respostaErrada);

					
					
					if (respostaErrada.getType() > 0){
						MERFunction funcaoMRE = new MERFunction();
						MERFunctionSorterController.classificarFuncaoMRE(historico, ruleToHuman, respostaErrada, funcaoMRE);
						
						if (funcaoMRE.getType() > 0){
							MultipleExternalRepresentation mer = new MultipleExternalRepresentation();
							MERManagerController.aciona(respostaErrada, ruleToHuman, funcaoMRE, mer);
							String filePath = new File("").getAbsolutePath();
							String imgPath = filePath+File.separator+mer.getImageName();
							imgPath = imgPath.replace("bin", "images");
							System.out.println("Id = " + mer.getId());
							System.out.println(" Descrição = " + mer.getDescricao());
							System.out.println(" Image name: " + mer.getImageName());
							lblImg.setIcon(new ImageIcon(mer.getImageName()));
							lblImg.repaint();

							textPane.setText(ruleToHuman.getDescription());

							System.out.println("Após rodada: nº tentativas: " + historico.getNumeroTentativas());
							
						}
						
					}
					
				}
	
			}
		});
		panel.add(btnOk);
		
		txtParcela2 = new JTextField();
		txtParcela2.setColumns(10);
		txtParcela2.setBounds(70, 161, 41, 35);
		panel.add(txtParcela2);
		
		txtParcela1 = new JTextField();
		txtParcela1.setColumns(10);
		txtParcela1.setBounds(70, 95, 41, 35);
		panel.add(txtParcela1);
		
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
		
		lblImg = new JLabel("");
		lblImg.setIcon(null);
		lblImg.setBounds(172, 76, 260, 266);
		panel.add(lblImg);
		
		textPane = new JTextPane();
		textPane.setBounds(442, 61, 367, 528);
		panel.add(textPane);
	}
}
