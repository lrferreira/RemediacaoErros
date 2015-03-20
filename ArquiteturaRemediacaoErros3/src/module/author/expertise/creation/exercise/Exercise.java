package module.author.expertise.creation.exercise;

import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import module.entity.Path;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class Exercise {

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
	public static mxGraph getGraph() {
		return graph;
	}
	public static void setGraph(mxGraph graph) {
		Exercise.graph = graph;
	}
	public static HashMap getM() {
		return m;
	}
	public static void setM(HashMap m) {
		Exercise.m = m;
	}
	public mxGraphComponent getGraphComponent() {
		return graphComponent;
	}
	public void setGraphComponent(mxGraphComponent graphComponent) {
		this.graphComponent = graphComponent;
	}
	public Path getPath() {
		return path;
	}
	public void setPath(Path path) {
		this.path = path;
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

	
}
