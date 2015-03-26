package module.author.expertise.creation.exercise;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import module.author.expertise.creation.exercise.graph.State;
import module.author.expertise.creation.sorters.entity.ErrorType;
import module.author.expertise.creation.sorters.entity.ItemSorter;
import module.author.expertise.creation.sorters.entity.Sorter;
import module.author.expertise.creation.sorters.entity.SubErrorType;
import module.entity.CorrectAnswer;
import module.entity.Goal;
import module.entity.MERFunction;
import module.entity.Path;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;

public class AppletExercise extends JApplet {
	
	
	protected static mxGraph graph = new mxGraph();
	protected static HashMap mapEstadosGrafo = new HashMap();
	protected static HashMap mapMetasGrafo = new HashMap();
	protected static HashMap mapMetasRemediacoesGrafo = new HashMap();
	protected static HashMap mapRemediacoesGrafo = new HashMap();
	private mxGraphComponent graphComponent;
	private Path path; 
	private JTextField texto;
	private JButton botaoAdd;
	private JButton botaoDel;
	private JButton botaoLigar;
	private Object cell;
	private JTextArea textArea;
	private JTextField txt1;
	private JTextField txt0;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;
	private JTextField txt8;
	private JSeparator separator;
	private int i;
	private ArrayList<State> states;
	private HashMap componentMap;
	public JPanel panel_exerc;
	
	public JPanel panel_remed;
	private Goal currentGoal;
	private JTextField txtWrongAnswer;
	private JComboBox cmbWrongAnswer;
	private JLabel lblCaminho;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JComboBox cmbErrorType;
	private JLabel label_5;
	private JLabel label_6;
	private Component label_7;
	private JComboBox comboBox_2;
	private JLabel label_8;
	private Component label_9;
	private Component label_10;
	private Component label_11;
	private JComboBox cmbSubErrorType;
	private JLabel label_12;
	private JComboBox cmbSorter;
	private JLabel lblMeta;
	private JLabel label_15;
	private JLabel lblMerFunction;
	private JLabel lblExercicio;
	private JButton button;
	private JComboBox comboBox_5;
	private JLabel label_18;
	private JLabel lblEspecificarResposta;
	
	private ArrayList<Sorter> sorters;
	
	
	
	public AppletExercise() {
		
		initComponents();
		
		makeStyles();
		
	}
	
	
	private void initComponents() {
		getContentPane().setLayout(null);
		
		
		/*
		JInternalFrame frameGraph = new JInternalFrame("New JInternalFrame");
		frameGraph.setBounds(346, 0, 458, 570);
		getContentPane().add(frameGraph);
		frameGraph.setVisible(true);
		*/
		
		final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1200, 650);
		getContentPane().add(tabbedPane);
		
		panel_exerc = new JPanel();
		tabbedPane.addTab("Exerc\u00EDcio", null, panel_exerc, null);
		panel_exerc.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(20, 30, 315, 97);
		panel_exerc.add(textArea);
		
		txt1 = new JTextField();
		txt1.setBounds(111, 148, 30, 30);
		panel_exerc.add(txt1);
		txt1.setColumns(10);
		txt1.setName("txt1");
		
		txt0 = new JTextField();
		txt0.setBounds(70, 148, 30, 30);
		panel_exerc.add(txt0);
		txt0.setColumns(10);
		txt0.setName("txt0");
		
		txt2 = new JTextField();
		txt2.setBounds(149, 148, 30, 30);
		panel_exerc.add(txt2);
		txt2.setColumns(10);
		txt2.setName("txt2");
		
		txt3 = new JTextField();
		txt3.setBounds(70, 189, 30, 30);
		panel_exerc.add(txt3);
		txt3.setColumns(10);
		txt3.setName("txt3");
		
		txt4 = new JTextField();
		txt4.setBounds(111, 189, 30, 30);
		panel_exerc.add(txt4);
		txt4.setColumns(10);
		txt4.setName("txt4");
		
		txt5 = new JTextField();
		txt5.setBounds(149, 189, 30, 30);
		panel_exerc.add(txt5);
		txt5.setColumns(10);
		txt5.setName("txt5");
		
		txt6 = new JTextField();
		txt6.setBounds(71, 236, 30, 30);
		panel_exerc.add(txt6);
		txt6.setColumns(10);
		txt6.setName("txt6");
		
		txt7 = new JTextField();
		txt7.setBounds(113, 236, 30, 30);
		panel_exerc.add(txt7);
		txt7.setColumns(10);
		txt7.setName("txt7");
		
		txt8 = new JTextField();
		txt8.setBounds(153, 236, 30, 30);
		panel_exerc.add(txt8);
		txt8.setColumns(10);
		txt8.setName("txt8");
		
		separator = new JSeparator();
		separator.setBounds(62, 229, 132, 2);
		panel_exerc.add(separator);
		
		final JButton btnEstadoInicial = new JButton("Estado Inicial");
		btnEstadoInicial.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				path = new Path(1, "caminho de resolução nº 1");
				i = 0;
				//Goal goal = new Goal(1, path, false, JComponent component, new CorrectAnswer("6"), null, null, "meta 1");
        		getGraph().getModel().beginUpdate();
        		Object parent = getGraph().getDefaultParent(); 
        		Object v1 = getGraph().insertVertex(parent, null, 
        				"Estado Inicial\n" + "txt0 = " + txt0.getText() + "\n"
        									+ "txt1 = " + txt1.getText() + "\n"
        									+ "txt2 = " + txt2.getText() + "\n"
        									+ "txt3 = " + txt3.getText() + "\n"
        									+ "txt4 = " + txt4.getText() + "\n"
        									+ "txt5 = " + txt5.getText() + "\n"
        									+ "txt6 = " + txt6.getText() + "\n"
        									+ "txt7 = " + txt7.getText() + "\n"
        									+ "txt8 = " + txt8.getText() + "\n", 
        				30, 30, 100, 160, "MyStyleRectangle");
        		getMapEstadosGrafo().put(i, v1);
        		
        		states = new ArrayList<State>();
        		State state = new State(i);
        		state.getMap().put(txt0.getName(), txt0.getText()+"");state.getMap().put(txt1.getName(), txt1.getText()+"");state.getMap().put(txt2.getName(), txt2.getText()+"");
        		state.getMap().put(txt3.getName(), txt3.getText()+"");state.getMap().put(txt4.getName(), txt4.getText()+"");state.getMap().put(txt5.getName(), txt5.getText()+"");
        		state.getMap().put(txt6.getName(), txt6.getText()+"");state.getMap().put(txt7.getName(), txt7.getText()+"");state.getMap().put(txt8.getName(), txt8.getText()+"");
        		states.add(state);
        		
        		getGraph().getModel().endUpdate();
        		btnEstadoInicial.setEnabled(false);				
					}
				});
				btnEstadoInicial.setBounds(205, 152, 130, 23);
				panel_exerc.add(btnEstadoInicial);
				
				JButton btnNovoEstado = new JButton("Novo Estado");
				btnNovoEstado.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
							addEstado();
						}
					});
				btnNovoEstado.setBounds(205, 189, 130, 23);
				panel_exerc.add(btnNovoEstado);
				
				JMenuBar menuBar = new JMenuBar();
				menuBar.setBounds(0, 0, 335, 21);
				panel_exerc.add(menuBar);
				
				graphComponent = new mxGraphComponent(graph){
					@Override
					protected void installDoubleClickHandler()
					{
						graphControl.addMouseListener(new MouseAdapter()
						{
							@Override
							public void mouseReleased(MouseEvent e)
								{
									if (!e.isConsumed() && isEditEvent(e)){
										Object cell = getCellAt(e.getX(), e.getY(), false);
										if (cell != null && getGraph().isCellEditable(cell))
										{
											Object val = graph.getModel().getValue(cell);
											//System.out.println("double-clicked on " + graph.getLabel(cell));
											if (graph.getLabel(cell).startsWith("Meta")){
												System.out.println("double-clicked on " + graph.getLabel(cell));
												addRemediacao(cell);	
											}
											else if (graph.getLabel(cell).startsWith("Remediação")){
												//currentGoal = path.getGoals().get(arg0) 
												
												currentGoal = path.getGoalById((int) getKey(getMapMetasRemediacoesGrafo(), cell));
												tabbedPane.setSelectedIndex(1);
												
												lblExercicio.setText("EXERCÍCIO: " + 1);
												lblCaminho.setText("CAMINHO DE RESOLUÇÃO: " + currentGoal.getPath().getId());
												lblMeta.setText("META:    nº \"" + currentGoal.getId() + "\" -> adicionar no campo \"" +
																currentGoal.getComponent().getName() + "\" o valor \"" + currentGoal.getAnswer().getValue() + "\"");
												
												
												Sorter s = cadSorterTeste();
												cmbSorter.setModel(new DefaultComboBoxModel(new String[] {"-", "" + s.getId() + " - " + s.getDescription()}));
												
											}
												
											}
										}
								}
							});
						}
					};
				graphComponent.setBounds(363, 0, 822, 544);
				panel_exerc.add(graphComponent);
				
				
				graphComponent.getGraphControl().setBorder(new LineBorder(new Color(0, 1, 0), 4));
				graphComponent.setPreferredSize(new Dimension(670, 380));
				
				

/*				
				texto = new JTextField();
				texto.setBounds(370, 587, 100, 25);
				panel_exerc.add(texto);
				texto.setPreferredSize(new Dimension(420, 21));

				botaoDel = new JButton("Deletar");
				botaoDel.setBounds(1055, 588, 130, 23);
				panel_exerc.add(botaoDel);
				        botaoAdd = new JButton("Adicionar");
				        botaoAdd.setBounds(675, 588, 130, 23);
				        panel_exerc.add(botaoAdd);
				        
				                botaoLigar = new JButton("Ligar");
				                botaoLigar.setBounds(534, 588, 130, 23);
				                panel_exerc.add(botaoLigar);
				                botaoLigar.addActionListener(new ActionListener() {
				                    
				                    public void actionPerformed(ActionEvent e) {
				                		Object parent = getGraph().getDefaultParent();
				                		Object v1 = getMapEstadosGrafo().get(JOptionPane.showInputDialog("Digite o grafo 1:"));
				                        Object v2 = getMapEstadosGrafo().get(JOptionPane.showInputDialog("Digite o grafo 2:"));
				                        String nome = JOptionPane.showInputDialog("Digite o nome da linha:");
				                        getGraph().insertEdge(parent, null, nome, v1, v2);            	
				                    }
				                });
				        botaoAdd.addActionListener(new ActionListener() {
				                        
				            public void actionPerformed(ActionEvent e) {
				        		getGraph().getModel().beginUpdate();
				        		Object parent = getGraph().getDefaultParent(); 
				        		Object v1 = getGraph().insertVertex(parent, null, texto.getText(), 330, 30, 50, 50, "shape=doubleEllipse;fillColor=green");
				        		getMapEstadosGrafo().put(texto.getText(), v1);
				        		getGraph().getModel().endUpdate();
				        		texto.setText("");
				            }
				        });
				botaoDel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				graph.getModel().remove(cell);
				
			}
		});
*/				
					graphComponent.getGraphControl().addMouseListener(new MouseAdapter()
						{
						
							public void mouseReleased(MouseEvent e)
							{
								cell = graphComponent.getCellAt(e.getX(), e.getY());		
							}
						});
				   
					
// Panel REMEDIAÇÃO
				                panel_remed = new JPanel();
				                tabbedPane.addTab("Remedia\u00E7\u00E3o", null, panel_remed, null);
				                panel_remed.setLayout(null);
				                
				                cmbWrongAnswer = new JComboBox();
				                cmbWrongAnswer.setModel(new DefaultComboBoxModel(new String[] {"Estudante informou uma resposta espec\u00EDfica", "Estudante cometeu um erro (n\u00E3o importa a resposta)"}));
				                cmbWrongAnswer.setToolTipText("");
				                cmbWrongAnswer.setBounds(10, 196, 272, 20);
				                panel_remed.add(cmbWrongAnswer);
				                
				                lblCaminho = new JLabel("CAMINHO DE RESOLU\u00C7\u00C3O:");
				                lblCaminho.setBounds(10, 73, 179, 14);
				                panel_remed.add(lblCaminho);
				                
				                label_2 = new JLabel("ADICIONAR REMEDIA\u00C7\u00C3O DE ERRO");
				                label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
				                label_2.setBounds(10, 10, 272, 14);
				                panel_remed.add(label_2);
				                
				                label_3 = new JLabel("Se");
				                label_3.setBounds(10, 171, 46, 14);
				                panel_remed.add(label_3);
				                
				                label_4 = new JLabel("Ent\u00E3o");
				                label_4.setBounds(10, 237, 46, 14);
				                panel_remed.add(label_4);
				                
				                cmbErrorType = new JComboBox();
				                cmbErrorType.setModel(new DefaultComboBoxModel(new String[] {"Interpreta\u00E7\u00E3o Equivocada", "Diretamente Identific\u00E1vel", "Indiretamente Identific\u00E1vel", "Solu\u00E7\u00E3o N\u00E3o Categoriz\u00E1vel"}));
				                cmbErrorType.setBounds(241, 262, 221, 20);
				                panel_remed.add(cmbErrorType);
				                
				                label_5 = new JLabel("E");
				                label_5.setBounds(10, 367, 46, 14);
				                panel_remed.add(label_5);
				                
				                label_6 = new JLabel("Especificar MRE:");
				                label_6.setBounds(544, 26, 146, 14);
				                panel_remed.add(label_6);
				                
				                label_7 = new JLabel("Crit\u00E9rio para Remedia\u00E7\u00E3o");
				                label_7.setBounds(10, 446, 146, 14);
				                panel_remed.add(label_7);
				                
				                comboBox_2 = new JComboBox();
				                comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"MER espec\u00EDfica para o erro", "Persist\u00EAncia no erro", "Alternar entre MRES", "Complexidade", "Sucessos anteriores com a MRE"}));
				                comboBox_2.setSelectedIndex(1);
				                comboBox_2.setBounds(241, 443, 221, 20);
				                panel_remed.add(comboBox_2);
				                
				                label_8 = new JLabel("Classifique o Tipo de Erro como");
				                label_8.setBounds(10, 265, 228, 14);
				                panel_remed.add(label_8);
				                
				                label_9 = new JLabel("Com este tipo de erro");
				                label_9.setBounds(10, 395, 228, 14);
				                panel_remed.add(label_9);
				                
				                label_10 = new JLabel("E");
				                label_10.setBounds(10, 301, 46, 14);
				                panel_remed.add(label_10);
				                
				                label_11 = new JLabel("Classifique o Subtipo de Erro como");
				                label_11.setBounds(10, 326, 212, 14);
				                panel_remed.add(label_11);
				                
				                cmbSubErrorType = new JComboBox();
				                cmbSubErrorType.setModel(new DefaultComboBoxModel(new String[] {"-", "Defici\u00EAncia no Dom\u00EDnio", "Defici\u00EAncia na Regra", "Defici\u00EAncia na Escolha do Operador"}));
				                cmbSubErrorType.setBounds(241, 323, 221, 20);
				                panel_remed.add(cmbSubErrorType);
				                
				                label_12 = new JLabel("Classificador de Erro:");
				                label_12.setBounds(10, 137, 146, 14);
				                panel_remed.add(label_12);
				                
				                cmbSorter = new JComboBox();
				                cmbSorter.setBounds(166, 134, 254, 20);
				                panel_remed.add(cmbSorter);
				                
				                lblMeta = new JLabel("META:    n\u00BA 1 -> adicionar no campo \"txt8\" o valor \"6\"");
				                lblMeta.setBounds(10, 98, 392, 14);
				                panel_remed.add(lblMeta);
				                
				                label_15 = new JLabel("o Tipo de Fun\u00E7\u00E3o da MRE ser\u00E1");
				                label_15.setBounds(10, 409, 179, 14);
				                panel_remed.add(label_15);
				                
				                lblMerFunction = new JLabel("Pap\u00E9is Complementares");
				                lblMerFunction.setBounds(245, 409, 146, 14);
				                panel_remed.add(lblMerFunction);
				                
				                lblExercicio = new JLabel("EXERC\u00CDCIO: 1");
				                lblExercicio.setBounds(10, 48, 112, 14);
				                panel_remed.add(lblExercicio);
				                
				                button = new JButton("Salvar Remedia\u00E7\u00E3o");
				                button.setBounds(474, 482, 179, 23);
				                panel_remed.add(button);
				                
				                comboBox_5 = new JComboBox();
				                comboBox_5.setBounds(544, 45, 331, 20);
				                panel_remed.add(comboBox_5);
				                
				                label_18 = new JLabel("Visualiza\u00E7\u00E3o");
				                label_18.setBounds(544, 88, 95, 14);
				                panel_remed.add(label_18);
				                
				                lblEspecificarResposta = new JLabel("Especificar resposta");
				                lblEspecificarResposta.setBounds(316, 168, 146, 20);
				                panel_remed.add(lblEspecificarResposta);
				                
				                txtWrongAnswer = new JTextField();
				                txtWrongAnswer.setBounds(316, 196, 86, 20);
				                panel_remed.add(txtWrongAnswer);
				                txtWrongAnswer.setColumns(10);
        
        createComponentMap();
        
		
	}

	private void createComponentMap() {
        componentMap = new HashMap<String,Component>();
        Component[] components = panel_exerc.getComponents();
        for (int i=0; i < components.length; i++) {
                componentMap.put(components[i].getName(), components[i]);
        }
}

public Component getComponentByName(String name) {
        if (componentMap.containsKey(name)) {
                return (Component) componentMap.get(name);
        }
        else return null;
}

	public void makeStyles(){

	    mxStylesheet stylesheet = graphComponent.getGraph().getStylesheet();

	    Hashtable style = new Hashtable<String, Object>();
	    style.put(mxConstants.STYLE_SHAPE,          mxConstants.SHAPE_ELLIPSE);
	    style.put(mxConstants.STYLE_VERTICAL_ALIGN, mxConstants.ALIGN_MIDDLE);
	    //style.put(mxConstants.STYLE_FONTFAMILY,     editorFont);
	    style.put(mxConstants.STYLE_FILLCOLOR,      "#7CFC00");
	    style.put(mxConstants.STYLE_FONTCOLOR,      "#000000");

	    stylesheet.putCellStyle("MyStyleEllipse", style);

	    style = new Hashtable<String, Object>();
	    style.put(mxConstants.STYLE_SHAPE,          mxConstants.SHAPE_ELLIPSE);
	    style.put(mxConstants.STYLE_VERTICAL_ALIGN, mxConstants.ALIGN_MIDDLE);
	    //style.put(mxConstants.STYLE_FONTFAMILY,     editorFont);
	    style.put(mxConstants.STYLE_FILLCOLOR,      "#FF1919");
	    style.put(mxConstants.STYLE_FONTCOLOR,      "#000000");

	    stylesheet.putCellStyle("MyStyleEllipseRem", style);
	    
	    style = new Hashtable<String, Object>();
	    style.put(mxConstants.STYLE_SHAPE,          mxConstants.SHAPE_RECTANGLE);
	    style.put(mxConstants.STYLE_ROUNDED,        true);
	    style.put(mxConstants.STYLE_VERTICAL_ALIGN, mxConstants.ALIGN_MIDDLE);
	    //style.put(mxConstants.STYLE_FONTFAMILY,     editorFont);
	    style.put(mxConstants.STYLE_FILLCOLOR,      "#B0C4DE");
	    style.put(mxConstants.STYLE_FONTCOLOR,      "#000000");

	    stylesheet.putCellStyle("MyStyleRectangle", style);
	    
	    Map<String, Object> edgeStyle = new HashMap<String, Object>();
		//edgeStyle.put(mxConstants.STYLE_EDGE, mxConstants.EDGESTYLE_ORTHOGONAL);
		edgeStyle.put(mxConstants.STYLE_SHAPE,    mxConstants.SHAPE_CONNECTOR);
		edgeStyle.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_CLASSIC);
		edgeStyle.put(mxConstants.STYLE_STROKECOLOR, "#000000");
		edgeStyle.put(mxConstants.STYLE_FONTCOLOR, "#000000");
		edgeStyle.put(mxConstants.STYLE_LABEL_BACKGROUNDCOLOR, "#ffffff");
	
		//stylesheet = new mxStylesheet();
		stylesheet.setDefaultEdgeStyle(edgeStyle);
		graph.setStylesheet(stylesheet);

	}
	
	public void addEstado(){
		Object parent = getGraph().getDefaultParent();
		i++;
		//criar nodo para estado
		Object v2 = getGraph().insertVertex(parent, null, 
				"Estado " + i + "\n" 
									+ "txt0 = " + txt0.getText() + "\n"
									+ "txt1 = " + txt1.getText() + "\n"
									+ "txt2 = " + txt2.getText() + "\n"
									+ "txt3 = " + txt3.getText() + "\n"
									+ "txt4 = " + txt4.getText() + "\n"
									+ "txt5 = " + txt5.getText() + "\n"
									+ "txt6 = " + txt6.getText() + "\n"
									+ "txt7 = " + txt7.getText() + "\n"
									+ "txt8 = " + txt8.getText() + "\n", 
				getGraph().getCellBounds(getMapEstadosGrafo().get(i-1)).getX()+ 300, 30, 100, 160, "MyStyleRectangle");
		getMapEstadosGrafo().put(i, v2);

		State state = new State(i);
		state.getMap().put(txt0.getName(), txt0.getText()+"");state.getMap().put(txt1.getName(), txt1.getText()+"");state.getMap().put(txt2.getName(), txt2.getText()+"");
		state.getMap().put(txt3.getName(), txt3.getText()+"");state.getMap().put(txt4.getName(), txt4.getText()+"");state.getMap().put(txt5.getName(), txt5.getText()+"");
		state.getMap().put(txt6.getName(), txt6.getText()+"");state.getMap().put(txt7.getName(), txt7.getText()+"");state.getMap().put(txt8.getName(), txt8.getText()+"");
		states.add(state);
		State statePrior = states.get(i-1);
		JTextField textGoal = null;
		int j = 0;
		for (j=0;j<state.getMap().size();j++){
			System.out.println(state.getMap().get("txt"+j) + "= " + state.getMap().get("txt"+j) + " - "
					+ statePrior.getMap().get("txt"+j) + "= " + statePrior.getMap().get("txt"+j));
			if (!state.getMap().get("txt"+j).equals(statePrior.getMap().get("txt"+j))){
				textGoal = (JTextField) getComponentByName("txt"+j);
				break;
			}
		}
		
		// criar nodo para meta
		Goal goalLast = null;
		if (path.getGoals().size() > 0)
			goalLast = path.getGoals().get(path.getGoals().size()-1);
		Goal goalAt = new Goal(i, path, false, textGoal, new CorrectAnswer(textGoal.getText()), goalLast, null, "meta " + i);
		path.getGoals().add(goalAt);
		Object v1 = getGraph().insertVertex(parent, null, 
				"Meta nº " + goalAt.getId() + ":\n inserir o valor " + goalAt.getAnswer().getValue() +
				"\nno campo " + goalAt.getComponent().getName(), 
				getGraph().getCellBounds(getMapEstadosGrafo().get(i-1)).getX() + 150, 30, 100, 100, "MyStyleEllipse");
		
		getMapMetasGrafo().put(i,v1);
		//Object v1 = getMapEstadosGrafo().get(JOptionPane.showInputDialog("Digite o grafo 1:"));
        //Object v2 = getMapEstadosGrafo().get(JOptionPane.showInputDialog("Digite o grafo 2:"));
        //String nome = JOptionPane.showInputDialog("Digite o nome da linha:");
		Object v0 = getMapEstadosGrafo().get(i-1);
		
		getGraph().insertEdge(parent, null, "", v0, v1);
        getGraph().insertEdge(parent, null, "", v1, v2);

	}

	public void addRemediacao(Object cell){
		Object parent = getGraph().getDefaultParent();
		int i = (int) getKey(getMapMetasGrafo(), cell);
		int j = (int) getMapRemediacoesGrafo().size() + 1;
		Goal goal = path.getGoals().get(i-1);
		//WrongAnswer wrongAnswer = new WrongAnswer();
		//wrongAnswer.setValue(JOptionPane.showInputDialog("Digite o possível valor de erro do estudante:"));
		Object v2 = getGraph().insertVertex(parent, null, "Remediação nº " + j + " \npara a meta nº " + goal.getId() + ":\n " + 
					"campo " + goal.getComponent().getName(), 
				getGraph().getCellBounds(cell).getX(), 
				getGraph().getCellBounds(cell).getY() + getGraph().getCellBounds(cell).getHeight()+ 100,
				120, 140, "MyStyleEllipseRem");
		
	    Map<String, Object> edgeStyle = new HashMap<String, Object>();
		//edgeStyle.put(mxConstants.STYLE_EDGE, mxConstants.EDGESTYLE_ORTHOGONAL);
		edgeStyle.put(mxConstants.STYLE_SHAPE,    mxConstants.SHAPE_CONNECTOR);
		edgeStyle.put(mxConstants.STYLE_STARTARROW, mxConstants.ARROW_CLASSIC);
		edgeStyle.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_CLASSIC);
		edgeStyle.put(mxConstants.STYLE_STROKECOLOR, "#FF0000");
		edgeStyle.put(mxConstants.STYLE_FONTCOLOR, "#000000");
		edgeStyle.put(mxConstants.STYLE_LABEL_BACKGROUNDCOLOR, "#ffffff");
	
		graph.getStylesheet().setDefaultEdgeStyle(edgeStyle);
		

		getGraph().insertEdge(parent, null, "", cell, v2);
        
		getMapMetasRemediacoesGrafo().put(i, v2);
		getMapRemediacoesGrafo().put(j, v2);
		
	}
	
	public Sorter cadSorterTeste(){
		//cad classificadores
		sorters = new ArrayList<Sorter>();
		Sorter s = new Sorter(1L, "Classificador teste1", new ArrayList<ItemSorter>());
		
		ErrorType et = new ErrorType(1L, "Tipo Erro teste1", new ArrayList<SubErrorType>());
		SubErrorType set1 = new SubErrorType(1L, "Subtipo Erro testea", et);
		SubErrorType set2 = new SubErrorType(2L, "Subtipo Erro testeb", et);
		et.getSubErrorTypes().add(set1);
		et.getSubErrorTypes().add(set2);
		
		MERFunction mf = new MERFunction(1);
		
		ItemSorter is = new ItemSorter(1L, et, mf, "erro informado 1", "proposta de remediação 1");
		s.getItensSorter().add(is);

		et = new ErrorType(2L, "Tipo Erro teste2", new ArrayList<SubErrorType>());
		set1 = new SubErrorType(3L, "Subtipo Erro testea", et);
		et.getSubErrorTypes().add(set1);
		mf = new MERFunction(2);
		is = new ItemSorter(2L, et, mf, "erro informado 2", "proposta de remediação 2");
		
		s.getItensSorter().add(is);
		
		return s;
	}
	
	private Object getKey(HashMap m, Object value){
	    for(Object key : m.keySet()){
	        if(m.get(key).equals(value)){
	            return key; //return the first found
	        }
	    }
	    return null;
	}

	public mxGraph getGraph() {
		return graph;
	}


	public void setGraph(mxGraph graph) {
		this.graph = graph;
	}


	public mxGraphComponent getGraphComponent() {
		return graphComponent;
	}


	public void setGraphComponent(mxGraphComponent graphComponent) {
		this.graphComponent = graphComponent;
	}


	public JTextField getTexto() {
		return texto;
	}


	public void setTexto(JTextField texto) {
		this.texto = texto;
	}


	public JButton getBotaoAdd() {
		return botaoAdd;
	}


	public void setBotaoAdd(JButton botaoAdd) {
		this.botaoAdd = botaoAdd;
	}


	public JButton getBotaoDel() {
		return botaoDel;
	}


	public void setBotaoDel(JButton botaoDel) {
		this.botaoDel = botaoDel;
	}


	public JButton getBotaoLigar() {
		return botaoLigar;
	}


	public void setBotaoLigar(JButton botaoLigar) {
		this.botaoLigar = botaoLigar;
	}


	public Object getCell() {
		return cell;
	}


	public void setCell(Object cell) {
		this.cell = cell;
	}


	public JTextArea getTextArea() {
		return textArea;
	}


	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}


	public JTextField getTxt1() {
		return txt1;
	}


	public void setTxt1(JTextField txt1) {
		this.txt1 = txt1;
	}


	public JTextField getTxt0() {
		return txt0;
	}


	public void setTxt0(JTextField txt0) {
		this.txt0 = txt0;
	}


	public JTextField getTxt2() {
		return txt2;
	}


	public void setTxt2(JTextField txt2) {
		this.txt2 = txt2;
	}


	public JTextField getTxt3() {
		return txt3;
	}


	public void setTxt3(JTextField txt3) {
		this.txt3 = txt3;
	}


	public JTextField getTxt4() {
		return txt4;
	}


	public void setTxt4(JTextField txt4) {
		this.txt4 = txt4;
	}


	public JTextField getTxt5() {
		return txt5;
	}


	public void setTxt5(JTextField txt5) {
		this.txt5 = txt5;
	}


	public JTextField getTxt6() {
		return txt6;
	}


	public void setTxt6(JTextField txt6) {
		this.txt6 = txt6;
	}


	public JTextField getTxt7() {
		return txt7;
	}


	public void setTxt7(JTextField txt7) {
		this.txt7 = txt7;
	}


	public JTextField getTxt8() {
		return txt8;
	}


	public void setTxt8(JTextField txt8) {
		this.txt8 = txt8;
	}


	public JSeparator getSeparator() {
		return separator;
	}


	public void setSeparator(JSeparator separator) {
		this.separator = separator;
	}


	public Path getPath() {
		return path;
	}


	public void setPath(Path path) {
		this.path = path;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public static HashMap getMapEstadosGrafo() {
		return mapEstadosGrafo;
	}


	public static void setMapEstadosGrafo(HashMap mapEstadosGrafo) {
		AppletExercise.mapEstadosGrafo = mapEstadosGrafo;
	}


	public static HashMap getMapMetasGrafo() {
		return mapMetasGrafo;
	}


	public static void setMapMetasGrafo(HashMap mapMetasGrafo) {
		AppletExercise.mapMetasGrafo = mapMetasGrafo;
	}


	public Goal getCurrentGoal() {
		return currentGoal;
	}


	public void setCurrentGoal(Goal currentGoal) {
		this.currentGoal = currentGoal;
	}


	public static HashMap getMapMetasRemediacoesGrafo() {
		return mapMetasRemediacoesGrafo;
	}


	public static void setMapMetasRemediacoesGrafo(HashMap mapMetasRemediacoesGrafo) {
		AppletExercise.mapMetasRemediacoesGrafo = mapMetasRemediacoesGrafo;
	}


	public static HashMap getMapRemediacoesGrafo() {
		return mapRemediacoesGrafo;
	}


	public static void setMapRemediacoesGrafo(HashMap mapRemediacoesGrafo) {
		AppletExercise.mapRemediacoesGrafo = mapRemediacoesGrafo;
	}


	public ArrayList<Sorter> getSorters() {
		return sorters;
	}


	public void setSorters(ArrayList<Sorter> sorters) {
		this.sorters = sorters;
	}
}
