package module.author.expertise.creation.exercise;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import module.author.expertise.creation.exercise.graph.State;
import module.entity.CorrectAnswer;
import module.entity.Goal;
import module.entity.Path;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;

public class AppletExercise extends JApplet {
	protected static mxGraph graph = new mxGraph();
	protected static HashMap m = new HashMap();
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
	public JPanel panel;
	
	public AppletExercise() {
		
		initComponents();
		
		makeStyles();
		
	}
	
	
	private void initComponents() {
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 345, 570);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(20, 30, 315, 97);
		panel.add(textArea);
		
		txt1 = new JTextField();
		txt1.setBounds(111, 148, 30, 30);
		panel.add(txt1);
		txt1.setColumns(10);
		txt1.setName("txt1");
		
		txt0 = new JTextField();
		txt0.setBounds(70, 148, 30, 30);
		panel.add(txt0);
		txt0.setColumns(10);
		txt0.setName("txt0");
		
		txt2 = new JTextField();
		txt2.setBounds(149, 148, 30, 30);
		panel.add(txt2);
		txt2.setColumns(10);
		txt2.setName("txt2");
		
		txt3 = new JTextField();
		txt3.setBounds(70, 189, 30, 30);
		panel.add(txt3);
		txt3.setColumns(10);
		txt3.setName("txt3");
		
		txt4 = new JTextField();
		txt4.setBounds(111, 189, 30, 30);
		panel.add(txt4);
		txt4.setColumns(10);
		txt4.setName("txt4");
		
		txt5 = new JTextField();
		txt5.setBounds(149, 189, 30, 30);
		panel.add(txt5);
		txt5.setColumns(10);
		txt5.setName("txt5");
		
		txt6 = new JTextField();
		txt6.setBounds(71, 236, 30, 30);
		panel.add(txt6);
		txt6.setColumns(10);
		txt6.setName("txt6");
		
		txt7 = new JTextField();
		txt7.setBounds(113, 236, 30, 30);
		panel.add(txt7);
		txt7.setColumns(10);
		txt7.setName("txt7");
		
		txt8 = new JTextField();
		txt8.setBounds(153, 236, 30, 30);
		panel.add(txt8);
		txt8.setColumns(10);
		txt8.setName("txt8");
		
		separator = new JSeparator();
		separator.setBounds(62, 229, 132, 2);
		panel.add(separator);
		
		
		/*
		JInternalFrame frameGraph = new JInternalFrame("New JInternalFrame");
		frameGraph.setBounds(346, 0, 458, 570);
		getContentPane().add(frameGraph);
		frameGraph.setVisible(true);
		*/
		
		graphComponent = new mxGraphComponent(graph);
		graphComponent.getGraphControl().setBorder(new LineBorder(new Color(0, 0, 0), 4));
		graphComponent.setBounds(346, 0, 543, 485);
		graphComponent.setPreferredSize(new Dimension(670, 380));
		getContentPane().add(graphComponent);
        
        botaoDel = new JButton("Deletar");
        botaoDel.setSize(77, 30);
        botaoDel.setLocation(731, 496);
        getContentPane().add(botaoDel);
        botaoDel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				graph.getModel().remove(cell);
				
			}
		});
        
        texto = new JTextField();
        texto.setSize(265, 37);
        texto.setLocation(355, 493);
        getContentPane().add(texto);
        texto.setPreferredSize(new Dimension(420, 21));

        botaoAdd = new JButton("Adicionar");
        botaoAdd.setLocation(644, 496);
        botaoAdd.setSize(77, 30);
        getContentPane().add(botaoAdd);
        botaoAdd.addActionListener(new ActionListener() {
                        
            public void actionPerformed(ActionEvent e) {
        		getGraph().getModel().beginUpdate();
        		Object parent = getGraph().getDefaultParent(); 
        		Object v1 = getGraph().insertVertex(parent, null, texto.getText(), 330, 30, 50, 50, "shape=doubleEllipse;fillColor=green");
        		getM().put(texto.getText(), v1);
        		getGraph().getModel().endUpdate();
        		texto.setText("");
            }
        });

        botaoLigar = new JButton("Ligar");
        botaoLigar.setSize(70, 30);
        botaoLigar.setLocation(818, 496);
        getContentPane().add(botaoLigar);
        botaoLigar.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
        		Object parent = getGraph().getDefaultParent();
        		Object v1 = getM().get(JOptionPane.showInputDialog("Digite o grafo 1:"));
                Object v2 = getM().get(JOptionPane.showInputDialog("Digite o grafo 2:"));
                String nome = JOptionPane.showInputDialog("Digite o nome da linha:");
                getGraph().insertEdge(parent, null, nome, v1, v2);            	
            }
        });

		JButton btnEstadoInicial = new JButton("Estado Inicial");
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
        		getM().put(i, v1);
        		
        		states = new ArrayList<State>();
        		State state = new State(i);
        		state.getMap().put(txt0.getName(), txt0.getText()+"");state.getMap().put(txt1.getName(), txt1.getText()+"");state.getMap().put(txt2.getName(), txt2.getText()+"");
        		state.getMap().put(txt3.getName(), txt3.getText()+"");state.getMap().put(txt4.getName(), txt4.getText()+"");state.getMap().put(txt5.getName(), txt5.getText()+"");
        		state.getMap().put(txt6.getName(), txt6.getText()+"");state.getMap().put(txt7.getName(), txt7.getText()+"");state.getMap().put(txt8.getName(), txt8.getText()+"");
        		states.add(state);
        		
        		getGraph().getModel().endUpdate();
        		btnEstadoInicial.setEnabled(true);				
			}
		});
		btnEstadoInicial.setBounds(205, 152, 130, 23);
		panel.add(btnEstadoInicial);
		
		JButton btnNovoEstado = new JButton("Novo Estado");
		btnNovoEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
        				getGraph().getCellBounds(getM().get(i-1)).getX()+ 300, 30, 100, 160, "MyStyleRectangle");
        		getM().put(i, v2);

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
						getGraph().getCellBounds(getM().get(i-1)).getX() + 150, 30, 100, 100, "MyStyleEllipse");
        		
        		
        		//Object v1 = getM().get(JOptionPane.showInputDialog("Digite o grafo 1:"));
                //Object v2 = getM().get(JOptionPane.showInputDialog("Digite o grafo 2:"));
                //String nome = JOptionPane.showInputDialog("Digite o nome da linha:");
				Object v0 = getM().get(i-1);
				
				getGraph().insertEdge(parent, null, "", v0, v1);
                getGraph().insertEdge(parent, null, "", v1, v2);
			}
		});
		btnNovoEstado.setBounds(205, 189, 130, 23);
		panel.add(btnNovoEstado);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 335, 21);
		panel.add(menuBar);

        graphComponent.getGraphControl().addMouseListener(new MouseAdapter()
		{
		
			public void mouseReleased(MouseEvent e)
			{
				cell = graphComponent.getCellAt(e.getX(), e.getY());		
			}
		});
        
        createComponentMap();
        
		
	}

	private void createComponentMap() {
        componentMap = new HashMap<String,Component>();
        Component[] components = panel.getComponents();
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


	public static HashMap getM() {
		return m;
	}


	public static void setM(HashMap m) {
		AppletExercise.m = m;
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
}
